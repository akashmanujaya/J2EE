package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CompanyReg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"Colorlib Templates\">\n");
      out.write("    <meta name=\"author\" content=\"Colorlib\">\n");
      out.write("    <meta name=\"keywords\" content=\"Colorlib Templates\">\n");
      out.write("    <title>New Member?</title>\n");
      out.write("    <link href=\"resources/Company/CompanyReg/vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"resources/Company/CompanyReg/vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">    \n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"resources/Company/CompanyReg/vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"resources/Company/CompanyReg/vendor/datepicker/daterangepicker.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"resources/Company/CompanyReg/css/main.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"resources/CompanyReg/favicon.ico\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/Company/CompanyReg/css/normalize.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/Company/CompanyReg/css/demo.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/Company/CompanyReg/css/component.css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins\">\n");
      out.write("        <div class=\"wrapper wrapper--w680\">\n");
      out.write("            <div class=\"card card-4\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h2 class=\"title\">Registration Form</h2>\n");
      out.write("                    <form method=\"POST\" action=\"CompanyReg\" enctype='multipart/form-data'>\n");
      out.write("                        <div class=\"row row-space\">\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <label class=\"label\">Company Name</label>\n");
      out.write("                                    <input class=\"input--style-4\" type=\"text\" name=\"company_name\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row row-space\">\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <label class=\"label\">Established Date</label>\n");
      out.write("                                    <div class=\"input-group-icon\">\n");
      out.write("                                        <input class=\"input--style-4 js-datepicker\" type=\"text\" name=\"est_year\">\n");
      out.write("                                        <i class=\"zmdi zmdi-calendar-note input-icon js-btn-calendar\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row row-space\">\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <label class=\"label\">Address</label>\n");
      out.write("                                    <input class=\"input--style-4\" type=\"text\" name=\"address\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <label class=\"label\">Email</label>\n");
      out.write("                                    <input class=\"input--style-4\" type=\"text\" name=\"email\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <label class=\"label\">Phone Number</label>\n");
      out.write("                                    <input class=\"input--style-4\" type=\"text\" name=\"phone\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <label class=\"label\">Password</label>\n");
      out.write("                                    <input class=\"input--style-4\" type=\"Password\" name=\"password\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <label class=\"label\">Repeat Password</label>\n");
      out.write("                                    <input class=\"input--style-4\" type=\"Password\" name=\"repeatPassword\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <label class=\"label\">Upload Company Photo</label>\n");
      out.write("                                    <div class=\"box\">\n");
      out.write("                                        <input type=\"file\" name=\"photo\" id=\"file-1\" class=\"inputfile inputfile-1\" data-multiple-caption=\"{count} files selected\" multiple  />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        <div class=\"p-t-15\">\n");
      out.write("                            <button class=\"btn btn--radius-2 btn--blue\" type=\"submit\">Submit</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"resources/Company/CompanyReg/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"resources/Company/CompanyReg/vendor/select2/select2.min.js\"></script>\n");
      out.write("    <script src=\"resources/Company/CompanyReg/vendor/datepicker/moment.min.js\"></script>\n");
      out.write("    <script src=\"resources/Company/CompanyReg/vendor/datepicker/daterangepicker.js\"></script>\n");
      out.write("    <script src=\"resources/Company/CompanyReg/js/global.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
