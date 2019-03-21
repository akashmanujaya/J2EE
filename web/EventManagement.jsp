<%-- 
    Document   : EventManagement
    Created on : Mar 21, 2019, 10:46:18 AM
    Author     : Akash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- 
    Document   : ForumDashboard
    Created on : Mar 19, 2019, 11:06:15 PM
    Author     : Akash
--%>

<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Connection.Connector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href="resources/studentdashboard/img/apple-icon.png">
    <link rel="icon" type="image/png" href="resources/studentdashboard/img/favicon.png">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>
     EDU Desk
    </title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
    <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800" rel="stylesheet" />
    <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
    <link href="resources/Company/Dashboard/assets/css/nucleo-icons.css" rel="stylesheet" />
    <link href="resources/Company/Dashboard/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link href="resources/Company/Dashboard/assets/css/black-dashboard.css?v=1.0.0" rel="stylesheet" />
    <link href="resources/Company/Dashboard/assets/demo/demo.css" rel="stylesheet" />
  
  
    <style>
            /* unvisited link */
        a:link {
          color: white;
        }

        /* visited link */
        a:visited {
          color: #ffffff;
        }

        /* mouse over link */
        a:hover {
          font-weight: bold;
          text-decoration: none;
        }

        /* selected link */
        a:active {
          color: blue;
        }
    </style>
  
</head>

<body class=" ">
    <div class="wrapper ">
        <div class="sidebar">
            <div class="sidebar-wrapper">
                <div class="logo">         
                    <a href="CompanyDashboard.jsp" class="simple-text logo-normal">
                    Menu
                    </a>
                </div>
                <ul class="nav">
                    <li>
                        <a href="CompanyDashboard.jsp">
                            <i class="tim-icons icon-chart-pie-36"></i>
                            <p>Dashboard</p>
                        </a>
                    </li>
                    <li>
                        <a href="ForumDashboard.jsp">
                            <i class="tim-icons icon-notes"></i>
                            <p>Forum</p>
                        </a>
                    </li>
                    <li>
                        <a href="./map.html">
                            <i class="tim-icons icon-camera-18"></i>
                            <p>Event Management</p>
                        </a>
                    </li>
                    <li>
                        <a href="./notifications.html">
                            <i class="tim-icons icon-bell-55"></i>
                            <p>Notifications</p>
                        </a>
                    </li>
                    <li>
                        <a href="./tables.html">
                            <i class="tim-icons icon-calendar-60"></i>
                            <p>Calender</p>
                        </a>
                    </li>
                    <li>
                        <a href="CompanyProfile.jsp">
                            <i class="tim-icons icon-single-02"></i>
                            <p>User Profile</p>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="main-panel">
      <!-- Navbar -->
            <nav class="navbar navbar-expand-lg navbar-absolute navbar-transparent   ">
                <div class="container-fluid">
                    <div class="navbar-wrapper">
                        <div class="navbar-toggle d-inline">
                            <button type="button" class="navbar-toggler">
                            <span class="navbar-toggler-bar bar1"></span>
                            <span class="navbar-toggler-bar bar2"></span>
                            <span class="navbar-toggler-bar bar3"></span>
                            </button>
                        </div>
                        <a class="navbar-brand" href="#pablo">Dashboard</a>
                    </div>
                    <div class="collapse navbar-collapse" id="navigation">
                        <ul class="navbar-nav ml-auto ">
                            <li class="dropdown nav-item">
                                <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
                                <div class="photo">
                                    <img src="resources/Company/Dashboard/assets/img/anime3.png">
                                </div>
                                <b class="caret d-none d-lg-block d-xl-block"></b>
                                <p class="d-lg-none">
                                    Log out
                                </p>
                                </a>
                                <ul class="dropdown-menu dropdown-navbar">
                                    <li class="nav-link">
                                        <a href="#" class="nav-item dropdown-item">Profile</a>
                                    </li>
                                    <div class="dropdown-divider"></div>
                                    <li class="nav-link">
                                        <a href="#" class="nav-item dropdown-item">Log out</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="separator d-lg-none"></li>
                        </ul>
                    </div>
                </div>
            </nav>
            <div class="modal fade" id="searchModal" tabindex="-1" role="dialog" aria-labelledby="searchModal" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <input type="text" class="form-control" id="inlineFormInputGroup" placeholder="SEARCH">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <i class="tim-icons icon-simple-remove"></i>
                            </button>
                        </div>
                        <div class="modal-footer"></div>
                    </div>
                </div>
            </div>
      <!-- End Navbar -->
            <div class="content">
                <div class="row">
                    <div class="box-panel">
                        <h2>Post Your Answers</h2>
                        <hr>
                        <table align="center" cellpadding="10" cellspacing="10" border="0" style="width:100%;">
              
                            <%
                                 java.sql.Connection connection = null;

                                try
                                    {
                                        connection = Connector.ConnectDb();
                                        PreparedStatement pst = connection.prepareStatement(" SELECT * FROM question order by id desc");
                                        ResultSet rs = pst.executeQuery();
                                        while(rs.next())
                                    {
                            %>

                            <tr>

                                <td style="border-bottom: 3px dotted #2ae6f7;padding-top: 25px; width: 1000px"><ul><li><a href="CompanyForum.jsp?id=<%=rs.getString("id")%>" ><%= rs.getString("title") %></a></li></ul></td>
                                <td> <i>posted by : </i></td>
                            </tr>
                              <% 
                                    }

                                    }  
                                catch (Exception e) 
                                    {
                                        e.printStackTrace();
                                    }
                              %>
                        </table>
                    </div>
                </div>
            </div>
        </div>
      
    <!--   Core JS Files   -->
    <script src="resources/Company/Dashboard/assets/js/core/jquery.min.js"></script>
    <script src="resources/Company/Dashboard/assets/js/core/popper.min.js"></script>
    <script src="resources/Company/Dashboard/assets/js/core/bootstrap.min.js"></script>
    <script src="resources/Company/Dashboard/assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
    <script src="resources/Company/Dashboard/assets/js/plugins/chartjs.min.js"></script>
    <script src="resources/Company/Dashboard/assets/js/plugins/bootstrap-notify.js"></script>
    <script src="resources/Company/Dashboard/assets/js/black-dashboard.min.js?v=1.0.0" type="text/javascript"></script>
    <script src="resources/Company/Dashboard/assets/demo/demo.js"></script>
    <script>
        $(document).ready(function() {
            $().ready(function() {
                $sidebar = $('.sidebar');
                $navbar = $('.navbar');

                $full_page = $('.full-page');

          $sidebar_responsive = $('body > .navbar-collapse');
          sidebar_mini_active = true;
          white_color = false;

          window_width = $(window).width();

          fixed_plugin_open = $('.sidebar .sidebar-wrapper .nav li.active a p').html();



          $('.fixed-plugin a').click(function(event) {
            // Alex if we click on switch, stop propagation of the event, so the dropdown will not be hide, otherwise we set the  section active
            if ($(this).hasClass('switch-trigger')) {
              if (event.stopPropagation) {
                event.stopPropagation();
              } else if (window.event) {
                window.event.cancelBubble = true;
              }
            }
          });

          $('.fixed-plugin .background-color span').click(function() {
            $(this).siblings().removeClass('active');
            $(this).addClass('active');

            var new_color = $(this).data('color');

            if ($sidebar.length != 0) {
              $sidebar.attr('data-color', new_color);
            }

            if ($navbar.length != 0) {
              $navbar.attr('data-color', new_color);
            }

            if ($full_page.length != 0) {
              $full_page.attr('filter-color', new_color);
            }

            if ($sidebar_responsive.length != 0) {
              $sidebar_responsive.attr('data-color', new_color);
            }
          });

          $('.switch-sidebar-mini input').on("switchChange.bootstrapSwitch", function() {
            var $btn = $(this);

            if (sidebar_mini_active == true) {
              $('body').removeClass('sidebar-mini');
              sidebar_mini_active = false;
              blackDashboard.showSidebarMessage('Sidebar mini deactivated...');
            } else {
              $('body').addClass('sidebar-mini');
              sidebar_mini_active = true;
              blackDashboard.showSidebarMessage('Sidebar mini activated...');
            }

            // we simulate the window Resize so the charts will get updated in realtime.
            var simulateWindowResize = setInterval(function() {
              window.dispatchEvent(new Event('resize'));
            }, 180);

            // we stop the simulation of Window Resize after the animations are completed
            setTimeout(function() {
              clearInterval(simulateWindowResize);
            }, 1000);
          });

          $('.switch-change-color input').on("switchChange.bootstrapSwitch", function() {
            var $btn = $(this);

            if (white_color == true) {

              $('body').addClass('change-background');
              setTimeout(function() {
                $('body').removeClass('change-background');
                $('body').removeClass('white-content');
              }, 900);
              white_color = false;
            } else {

              $('body').addClass('change-background');
              setTimeout(function() {
                $('body').removeClass('change-background');
                $('body').addClass('white-content');
              }, 900);

              white_color = true;
            }


          });

          $('.light-badge').click(function() {
            $('body').addClass('white-content');
          });

          $('.dark-badge').click(function() {
            $('body').removeClass('white-content');
          });
        });
      });
    </script>
    <script>
      $(document).ready(function() {
        // Javascript method's body can be found in assets/js/demos.js
        demo.initDashboardPageCharts();

      });
    </script>
</body>

</html>