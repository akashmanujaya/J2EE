<%-- 
    Document   : postQuestion
    Created on : Mar 11, 2019, 12:52:15 PM
    Author     : Navigator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
  <link href="resources/studentdashboard/css/nucleo-icons.css" rel="stylesheet" />
  <link href="resources/studentdashboard/css/bootstrap.min.css" rel="stylesheet" />
  <link href="resources/studentdashboard/css/black-dashboard.css?v=1.0.0" rel="stylesheet" />
  <link href="resources/studentdashboard/demo/demo.css" rel="stylesheet" />
  
</head>

<body class=" ">
  <div class="wrapper ">
    <div class="sidebar">
      <!--
        Tip 1: You can change the color of the sidebar using: data-color="blue | green | orange | red | yellow"
    -->
      <div class="sidebar-wrapper">
        <div class="logo">
          <a href="" class="simple-text logo-mini">
            Hi
          </a>
          <a href="" class="simple-text logo-normal">
            HAPPY USER
          </a>
        </div>
        <ul class="nav">
          <li>
            <a href="studentDashboard.jsp">
              <i class="tim-icons icon-compass-05"></i>
              <p>Dashboard</p>
            </a>
          </li>
          <li>
            <a href="studentProfile.jsp">
              <i class="tim-icons icon-single-02"></i>
              <p>User Profile</p>
            </a>
          </li>
          <li class="active">
            <a href="postQuestion.jsp">
              <i class="tim-icons icon-pencil"></i>
              <p>Post Question</p>
            </a>
          </li>
           <li>
            <a href="searcjJob.jsp">
              <i class="tim-icons icon-coins"></i>
              <p>Search Job</p>
            </a>
          </li>
          <li>
          <li>
            <a href="">
              <i class="tim-icons icon-bell-55"></i>
              <p>Notifications</p>
            </a>
          </li>
          <li>
            <a href="">
              <i class="tim-icons icon-email-85"></i>
              <p>Send Email</p>
            </a>
          </li>
          <li>
            <a href="upcomingEvents.jsp">
              <i class="tim-icons icon-calendar-60"></i>
              <p>Upcoming Event</p>
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
                    <img src="resources/studentdashboard/img/anime3.png">
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
            <div class="modal-footer">
            </div>
          </div>
        </div>
      </div>
      <!-- End Navbar -->
      <div class="content">
        <div class="row">
            <div class="box-panel">

              <h2>Post Your Question</h2>
              <p>Something went wrong? Don't worry we are here to help you.Place your Questions here. You will find the best solution within few minitues</p>
              <hr>
              <!-- form login -->
              <form class="margin-top-40" action="questionPost" method="post" enctype='multipart/form-data'>
                <div class="form-group">
                  <label>Question Title</label>
                  <input type="text" placeholder="Place your title here" class="form-control" name="title">
                </div>
                <div class="form-group">
                  <label>Category</label>
                  <select class="questions-category form-control" tabindex="-1" aria-hidden="" name="category">
                    <option value="IT">IT</option>
                    <option value="Business">Business</option>
                    <option value="Engineering">Engineering</option>
                    <option value="Art">Art</option>
                    <option value="Other">Other</option>
                </div>
                <div class="form-group">
                 
                    <textarea cols="12" rows="12" placeholder="Instruction to post a question.
                              *Please choose related tags which regard to your question
                              *Clearly explain your question below.
                              *each tag should separate with a comma.
                              *If you want to upload a pic please upload a clear pic of code snipset
                              *Maximmum size of the pic should be less than 16MB "  name="tag" class="form-control" disabled="" ></textarea>
                </div>
                  <div class="form-group">
                  <label>Tags</label>
                  <input type="text" placeholder="Place your tags here" class="form-control" name="keywords">
                </div>
                <div class="form-group">
                  <label>Question Detials</label>
                  <textarea cols="12" rows="12" placeholder="Post Your Question Details Here....." name="message" class="form-control"></textarea>
                </div>
                 <div class="form-group">
                  <label>Image</label>
                  <input class="input--style-4" type="file" name="image">
                </div> 
                <button class="btn btn-primary pull-right" value="submit">Post </button>
               <!-- <button class="btn btn-primary pull-right" value="reset">Reset</button>-->
               


              </form>
              <!-- form login -->

            </div>
          
          </div>
        </div>
      </div>
      
    <!--   Core JS Files   -->
    <script src="resources/studentdashboard/js/core/jquery.min.js"></script>
    <script src="resources/studentdashboard/js/core/popper.min.js"></script>
    <script src="resources/studentdashboard/js/core/bootstrap.min.js"></script>
    <script src="resources/studentdashboard/js/plugins/perfect-scrollbar.jquery.min.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
    <script src="resources/studentdashboard/js/plugins/chartjs.min.js"></script>
    <script src="resources/studentdashboard/js/plugins/bootstrap-notify.js"></script>
    <script src="resources/studentdashboard/js/black-dashboard.min.js?v=1.0.0" type="text/javascript"></script>
    <script src="resources/studentdashboard/demo/demo.js"></script>
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
