
package Company;

import Connection.Connector;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import static jdk.nashorn.internal.objects.NativeFunction.function;
import org.mindrot.jbcrypt.BCrypt;
@MultipartConfig(maxFileSize = 16177215) 
public class CompanyReg extends HttpServlet {
    
    Connection connection = null;
    private static final String SAVE_DIR ="images";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CompanyReg</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CompanyReg at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String savePath = "F:\\JAVA EE Final\\Java Final\\web\\images" + File.separator +SAVE_DIR;
        File fileSaveDir = new File(savePath);
        
        String company_name = request.getParameter("company_name");
        String company_email = request.getParameter("email");
        String est_date = request.getParameter("est_year");
        String company_address = request.getParameter("address");
        String company_pasword = request.getParameter("password");
        String confirmPass = request.getParameter("repeatPassword");
        String company_contactno = request.getParameter("phone");
        Part part = request.getPart("photo");
        String filename = extractFileName(part);
        
        String hashPass = BCrypt.hashpw(company_pasword, BCrypt.gensalt(12));
        String hashRePass = BCrypt.hashpw(confirmPass, BCrypt.gensalt(12));

        try 
        {
            connection = Connector.ConnectDb();
            PreparedStatement pst = connection.prepareStatement(" insert into company (Name,Email,Est_date,Address,Password,ConfirmPass,ContactNo,Photo) values(?,?,?,?,?,?,?,?)");
                        pst.setString(1, company_name);
                        pst.setString(2, company_email);
                        pst.setString(3, est_date);
                        pst.setString(4, company_address);
                        pst.setString(5, hashPass);
                        pst.setString(6, hashRePass);
                        pst.setString(7, company_contactno);
                        String filePath = savePath + File.separator+ filename;
                        
                        pst.setString(8, filePath);
                        
                        copyFile(filename,part.getContentType(),part.getInputStream());
                        
//            if (inputStream != null)
//            {
//                pst.setBlob(7, inputStream);
//            }
            
            int rs=pst.executeUpdate();
            
            if(company_pasword.equals(confirmPass))
            {
               if(rs>0)
                    {
                        PrintWriter out=response.getWriter();
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('Registration Successfull!.. Please Login to Continue');");
                        out.println("location='CompanyLogin.jsp';");
                        out.println("</script>");
                    } 
            }
            else
            {
               
                PrintWriter out=response.getWriter();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Password and RepeatPassword should be same');");
                out.println("location='CompanyReg.jsp';");
                out.println("</script>");
            }
            
           
        }
        
        catch (IOException | SQLException e)
        {
            PrintWriter out = response.getWriter();
            out.print(e);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @param fileName
     * @param fileType
     * @param in
     */
    
    
    public void copyFile(String fileName,String fileType, InputStream in) {

       try {


       //relativeWebPath is the path to the folder you created in your web directory
            File file = new File("F:\\JAVA EE Final\\Java Final\\web\\images"+"\\"+fileName);




          try ( // write the inputStream to a FileOutputStream
                  OutputStream out = new FileOutputStream(new File("F:\\JAVA EE Final\\Java Final\\web\\images" + "\\"+file.getName()))) {
              int read = 0;
              byte[] bytes = new byte[1024];

              while ((read = in.read(bytes)) != -1) {
                  out.write(bytes, 0, read);
              }

              in.close();
              out.flush();

          }


    } catch (IOException e) {
        System.out.println(e);
    }
}
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String extractFileName(Part part) {
         
        String contenDisp = part.getHeader("content-disposition");
        String [] items = contenDisp.split(";");
        for (String s : items)
        {
            if (s.trim().startsWith("filename"))
            {
                return s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }
        return "";
        
    }

//    private File getUniqueFilename(File file) {
//      
//        String baseName = FilenameUtils.getBaseName( file.getName() );
//        String extension = FilenameUtils.getExtension( file.getName() );
//        int counter = 1;
//        while(file.exists())
//        {
//            file = new File( file.getParent(), baseName + "-" + (counter++) + "." + extension );
//        }
//        return file;
//    }

}
