/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

import Connection.Connector;
import com.chilkatsoft.CkCrypt2;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Akash
 */
public class CompanyLogin extends HttpServlet {
    
    Connection connection = null;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CompanyLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CompanyLogin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("pass");
        
        try
        {
            connection = Connector.ConnectDb();
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM Company WHERE Email= '"+email+"'");

            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                if (BCrypt.checkpw(password, rs.getString("Password")))
                {
                    if(request.getParameter("remember_me") != null)
                        {
                            String remember = request.getParameter("remember_me");
                            Cookie cemail = new Cookie("cookuser", email.trim());
                            Cookie cPassword = new Cookie("cookpass", password.trim());
                            Cookie cRemember = new Cookie("cookrem", remember.trim());

                            cemail.setMaxAge(60 * 60 * 24 * 15);//15 days
                            cPassword.setMaxAge(60 * 60 * 24 * 15);
                            cRemember.setMaxAge(60 * 60 * 24 * 15);

                            response.addCookie(cemail);
                            response.addCookie(cPassword);
                            response.addCookie(cRemember);

                        }
                    HttpSession httpSession = request.getSession();
                    httpSession.setAttribute("sessuser", email.trim());
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("CompanyDashboard.jsp");
                    requestDispatcher.forward(request, response);
                }
                else
                {
                    PrintWriter out=response.getWriter();
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Invalid Credentials');");
                    out.println("location='CompanyLogin.jsp';");
                    out.println("</script>");
                }
            }
        }
        
        catch (SQLException | ServletException e)
        {
            PrintWriter out=response.getWriter();
            out.println("Error : " + e);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
