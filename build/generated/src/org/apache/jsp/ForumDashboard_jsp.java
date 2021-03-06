package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.logging.Logger;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.Level;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Connection.Connector;

public final class ForumDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"resources/studentdashboard/img/apple-icon.png\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"resources/studentdashboard/img/favicon.png\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("    <title>\n");
      out.write("     EDU Desk\n");
      out.write("    </title>\n");
      out.write("    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"https://use.fontawesome.com/releases/v5.0.6/css/all.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"resources/Company/Dashboard/assets/css/nucleo-icons.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"resources/Company/Dashboard/assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"resources/Company/Dashboard/assets/css/black-dashboard.css?v=1.0.0\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"resources/Company/Dashboard/assets/demo/demo.css\" rel=\"stylesheet\" />\n");
      out.write("  \n");
      out.write("  \n");
      out.write("    <style>\n");
      out.write("            /* unvisited link */\n");
      out.write("        a:link {\n");
      out.write("          color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* visited link */\n");
      out.write("        a:visited {\n");
      out.write("          color: #ffffff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* mouse over link */\n");
      out.write("        a:hover {\n");
      out.write("          font-weight: bold;\n");
      out.write("          text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* selected link */\n");
      out.write("        a:active {\n");
      out.write("          color: blue;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\" \">\n");
      out.write("    <div class=\"wrapper \">\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("            <div class=\"sidebar-wrapper\">\n");
      out.write("                <div class=\"logo\">         \n");
      out.write("                    <a href=\"CompanyDashboard.jsp\" class=\"simple-text logo-normal\">\n");
      out.write("                    Menu\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"CompanyDashboard.jsp\">\n");
      out.write("                            <i class=\"tim-icons icon-chart-pie-36\"></i>\n");
      out.write("                            <p>Dashboard</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"ForumDashboard.jsp\">\n");
      out.write("                            <i class=\"tim-icons icon-notes\"></i>\n");
      out.write("                            <p>Forum</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"./map.html\">\n");
      out.write("                            <i class=\"tim-icons icon-camera-18\"></i>\n");
      out.write("                            <p>Event Management</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"./notifications.html\">\n");
      out.write("                            <i class=\"tim-icons icon-bell-55\"></i>\n");
      out.write("                            <p>Notifications</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"./tables.html\">\n");
      out.write("                            <i class=\"tim-icons icon-calendar-60\"></i>\n");
      out.write("                            <p>Calender</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"CompanyProfile.jsp\">\n");
      out.write("                            <i class=\"tim-icons icon-single-02\"></i>\n");
      out.write("                            <p>User Profile</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-panel\">\n");
      out.write("      <!-- Navbar -->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-absolute navbar-transparent   \">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-wrapper\">\n");
      out.write("                        <div class=\"navbar-toggle d-inline\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggler\">\n");
      out.write("                            <span class=\"navbar-toggler-bar bar1\"></span>\n");
      out.write("                            <span class=\"navbar-toggler-bar bar2\"></span>\n");
      out.write("                            <span class=\"navbar-toggler-bar bar3\"></span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#pablo\">Dashboard</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navigation\">\n");
      out.write("                        <ul class=\"navbar-nav ml-auto \">\n");
      out.write("                            <li class=\"dropdown nav-item\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\">\n");
      out.write("                                <div class=\"photo\">\n");
      out.write("                                    <img src=\"resources/Company/Dashboard/assets/img/anime3.png\">\n");
      out.write("                                </div>\n");
      out.write("                                <b class=\"caret d-none d-lg-block d-xl-block\"></b>\n");
      out.write("                                <p class=\"d-lg-none\">\n");
      out.write("                                    Log out\n");
      out.write("                                </p>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu dropdown-navbar\">\n");
      out.write("                                    <li class=\"nav-link\">\n");
      out.write("                                        <a href=\"#\" class=\"nav-item dropdown-item\">Profile</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                                    <li class=\"nav-link\">\n");
      out.write("                                        <a href=\"#\" class=\"nav-item dropdown-item\">Log out</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"separator d-lg-none\"></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"modal fade\" id=\"searchModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"searchModal\" aria-hidden=\"true\">\n");
      out.write("                <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"inlineFormInputGroup\" placeholder=\"SEARCH\">\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                <i class=\"tim-icons icon-simple-remove\"></i>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("      <!-- End Navbar -->\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"box-panel\">\n");
      out.write("                        <h2>Post Your Answers</h2>\n");
      out.write("                        <hr>\n");
      out.write("                        <table align=\"center\" cellpadding=\"10\" cellspacing=\"10\" border=\"0\" style=\"width:100%;\">\n");
      out.write("              \n");
      out.write("                            ");

                                 java.sql.Connection connection = null;

                                try
                                    {
                                        connection = Connector.ConnectDb();
                                        PreparedStatement pst = connection.prepareStatement(" SELECT * FROM question order by id desc");
                                        ResultSet rs = pst.executeQuery();
                                        while(rs.next())
                                    {
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td style=\"border-bottom: 3px dotted #2ae6f7;padding-top: 25px; width: 900px\"><ul><li><a href=\"CompanyForum.jsp?id=");
      out.print(rs.getString("id"));
      out.write("\" >");
      out.print( rs.getString("title") );
      out.write("</a></li></ul></td>\n");
      out.write("                                <td> <i>posted by : </i></td>\n");
      out.write("                            </tr>\n");
      out.write("                              ");
 
                                    }

                                    }  
                                catch (Exception e) 
                                    {
                                        e.printStackTrace();
                                    }
                              
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("    <!--   Core JS Files   -->\n");
      out.write("    <script src=\"resources/Company/Dashboard/assets/js/core/jquery.min.js\"></script>\n");
      out.write("    <script src=\"resources/Company/Dashboard/assets/js/core/popper.min.js\"></script>\n");
      out.write("    <script src=\"resources/Company/Dashboard/assets/js/core/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"resources/Company/Dashboard/assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("    <script src=\"resources/Company/Dashboard/assets/js/plugins/chartjs.min.js\"></script>\n");
      out.write("    <script src=\"resources/Company/Dashboard/assets/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("    <script src=\"resources/Company/Dashboard/assets/js/black-dashboard.min.js?v=1.0.0\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"resources/Company/Dashboard/assets/demo/demo.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function() {\n");
      out.write("            $().ready(function() {\n");
      out.write("                $sidebar = $('.sidebar');\n");
      out.write("                $navbar = $('.navbar');\n");
      out.write("\n");
      out.write("                $full_page = $('.full-page');\n");
      out.write("\n");
      out.write("          $sidebar_responsive = $('body > .navbar-collapse');\n");
      out.write("          sidebar_mini_active = true;\n");
      out.write("          white_color = false;\n");
      out.write("\n");
      out.write("          window_width = $(window).width();\n");
      out.write("\n");
      out.write("          fixed_plugin_open = $('.sidebar .sidebar-wrapper .nav li.active a p').html();\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          $('.fixed-plugin a').click(function(event) {\n");
      out.write("            // Alex if we click on switch, stop propagation of the event, so the dropdown will not be hide, otherwise we set the  section active\n");
      out.write("            if ($(this).hasClass('switch-trigger')) {\n");
      out.write("              if (event.stopPropagation) {\n");
      out.write("                event.stopPropagation();\n");
      out.write("              } else if (window.event) {\n");
      out.write("                window.event.cancelBubble = true;\n");
      out.write("              }\n");
      out.write("            }\n");
      out.write("          });\n");
      out.write("\n");
      out.write("          $('.fixed-plugin .background-color span').click(function() {\n");
      out.write("            $(this).siblings().removeClass('active');\n");
      out.write("            $(this).addClass('active');\n");
      out.write("\n");
      out.write("            var new_color = $(this).data('color');\n");
      out.write("\n");
      out.write("            if ($sidebar.length != 0) {\n");
      out.write("              $sidebar.attr('data-color', new_color);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if ($navbar.length != 0) {\n");
      out.write("              $navbar.attr('data-color', new_color);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if ($full_page.length != 0) {\n");
      out.write("              $full_page.attr('filter-color', new_color);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if ($sidebar_responsive.length != 0) {\n");
      out.write("              $sidebar_responsive.attr('data-color', new_color);\n");
      out.write("            }\n");
      out.write("          });\n");
      out.write("\n");
      out.write("          $('.switch-sidebar-mini input').on(\"switchChange.bootstrapSwitch\", function() {\n");
      out.write("            var $btn = $(this);\n");
      out.write("\n");
      out.write("            if (sidebar_mini_active == true) {\n");
      out.write("              $('body').removeClass('sidebar-mini');\n");
      out.write("              sidebar_mini_active = false;\n");
      out.write("              blackDashboard.showSidebarMessage('Sidebar mini deactivated...');\n");
      out.write("            } else {\n");
      out.write("              $('body').addClass('sidebar-mini');\n");
      out.write("              sidebar_mini_active = true;\n");
      out.write("              blackDashboard.showSidebarMessage('Sidebar mini activated...');\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // we simulate the window Resize so the charts will get updated in realtime.\n");
      out.write("            var simulateWindowResize = setInterval(function() {\n");
      out.write("              window.dispatchEvent(new Event('resize'));\n");
      out.write("            }, 180);\n");
      out.write("\n");
      out.write("            // we stop the simulation of Window Resize after the animations are completed\n");
      out.write("            setTimeout(function() {\n");
      out.write("              clearInterval(simulateWindowResize);\n");
      out.write("            }, 1000);\n");
      out.write("          });\n");
      out.write("\n");
      out.write("          $('.switch-change-color input').on(\"switchChange.bootstrapSwitch\", function() {\n");
      out.write("            var $btn = $(this);\n");
      out.write("\n");
      out.write("            if (white_color == true) {\n");
      out.write("\n");
      out.write("              $('body').addClass('change-background');\n");
      out.write("              setTimeout(function() {\n");
      out.write("                $('body').removeClass('change-background');\n");
      out.write("                $('body').removeClass('white-content');\n");
      out.write("              }, 900);\n");
      out.write("              white_color = false;\n");
      out.write("            } else {\n");
      out.write("\n");
      out.write("              $('body').addClass('change-background');\n");
      out.write("              setTimeout(function() {\n");
      out.write("                $('body').removeClass('change-background');\n");
      out.write("                $('body').addClass('white-content');\n");
      out.write("              }, 900);\n");
      out.write("\n");
      out.write("              white_color = true;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("          });\n");
      out.write("\n");
      out.write("          $('.light-badge').click(function() {\n");
      out.write("            $('body').addClass('white-content');\n");
      out.write("          });\n");
      out.write("\n");
      out.write("          $('.dark-badge').click(function() {\n");
      out.write("            $('body').removeClass('white-content');\n");
      out.write("          });\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("      $(document).ready(function() {\n");
      out.write("        // Javascript method's body can be found in assets/js/demos.js\n");
      out.write("        demo.initDashboardPageCharts();\n");
      out.write("\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
