

<%-- 
    Document   : newjsp
    Created on : Feb 28, 2019, 11:14:37 AM
    Author     : Akash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>EDU Desk</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">

  <!-- Favicons -->
  <link href="resources/Index/img/favicon.png" rel="icon">
  <link href="resources/Index/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="resources/Index/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="resources/Index/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="resources/Index/lib/animate/animate.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="resources/Index/css/style.css" rel="stylesheet">

  <!-- =======================================================
    Theme Name: Regna
    Theme URL: https://bootstrapmade.com/regna-bootstrap-onepage-template/
    Author: BootstrapMade.com
    License: https://bootstrapmade.com/license/
  ======================================================= -->
</head>

<body>

  <!--==========================
  Header
  ============================-->
  <header id="header">
    <div class="container">

      <div id="logo" class="pull-left">
        <a href="#hero"><img src="resources/Index/img/logo.png" alt="" title="" /></a>
        <!-- Uncomment below if you prefer to use a text logo -->
        <!--<h1><a href="#hero">Regna</a></h1>-->
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="#hero">Home</a></li>
          <li><a href="#about">About Us</a></li>
          <li><a href="#services">Services</a></li>
          <li><a href="#portfolio">Blog</a></li>
          <li><a href="#team">Up coming Events</a></li>
          <li class="menu-has-children"><a href="">Drop Down</a>
            <ul>
              <li><a href="#">Drop Down 1</a></li>
              <li class="menu-has-children"><a href="#">Drop Down 2</a>
                <ul>
                  <li><a href="#">Deep Drop Down 1</a></li>
                  <li><a href="#">Deecominp Drop Down 2</a></li>
                  <li><a href="#">Deep Drop Down 3</a></li>
                  <li><a href="#">Deep Drop Down 4</a></li>
                  <li><a href="#">Deep Drop Down 5</a></li>
                </ul>
              </li>
              <li><a href="#">Drop Down 3</a></li>
              <li><a href="#">Drop Down 4</a></li>
              <li><a href="#">Drop Down 5</a></li>
            </ul>
          </li>
          <li><a href="#contact">Contact Us</a></li>
           <li class="menu-has-children"><a href="">Login</a>
            <ul>
              <li><a href="studentlogin.jsp">Student</a></li>
              <li><a href="#">University</a></li>
              <li><a href="CompanyLogin.jsp">Company</a></li>
            </ul>
          </li>
        </ul>
      </nav>
    </div>
  </header><!-- #header -->

  <!--==========================
    Hero Section
  ============================-->
  <section id="hero">
    <div class="hero-container">
      <h1>WE CREATE THE TREND</h1>
      <h2>Your Bright Future is Our Mission</h2>
      <a href="#about" class="btn-get-started">Get Started</a>
    </div>
  </section><!-- #hero -->

  <main id="main">

    <!--==========================
      About Us Section
    ============================-->
    <section id="about">
      <div class="container">
        <div class="row about-container">

          <div class="col-lg-6 content order-lg-1 order-2">
            <h2 class="title">Few Words About Us</h2>
            <p>
              The EDU Desk is a privately held company based on Colombo, Sri Lanka. The company is owned by the Ovatic IT family who founded in 2015 and
              engaged in development of University student's skills through linking the Industry Experts, Students and Universities together and
              today provides one single platform for your all Educational & Skill aspects.
            </p>

            <div class="icon-box wow fadeInUp">
              <div class="icon"><!--<i class="fa fa-shopping-bag">--></i>
                 <i class="fa fa-quora" aria-hidden="true"></i></div>
              <h4 class="title"><a href="">SOLVE YOUR PROBLEMS</a></h4>
              <p class="description">Where Students learn,Share and Build Careers</p>
            </div>

            <div class="icon-box wow fadeInUp" data-wow-delay="0.2s">
              <div class="icon"><i class="fa fa-photo"></i></div>
              <h4 class="title"><a href="">ONLINE FORUM</a></h4>
              <p class="description">Place where your success begins.</p>
            </div>

            <div class="icon-box wow fadeInUp" data-wow-delay="0.4s">
              <div class="icon"><i class="fa fa-bar-chart"></i></div>
              <h4 class="title"><a href="">FIND YOUR DREAM JOB</a></h4>
              <p class="description">Keep in touch with people you know, share ideas, and build your career.</p>
            </div>

          </div>

          <div class="col-lg-6 background order-lg-2 order-1 wow fadeInRight"></div>
        </div>

      </div>
    </section><!-- #about -->

    <!--==========================
      Facts Section
    ============================-->
    <section id="facts">
      <div class="container wow fadeIn">
        <div class="section-header">
          <h3 class="section-title">Facts</h3>
          <p class="section-description">We provide Service since 2015 with proud!!!</p>
        </div>
        <div class="row counters">
            <div class="col-lg-3 col-6 text-center">
               <span data-toggle="counter-up">10500</span>
                    <p>Users</p>
  	</div>
            <div class="col-lg-3 col-6 text-center">
               <span data-toggle="counter-up">150</span>
                    <p>Universities</p>
  	    </div>
            <div class="col-lg-3 col-6 text-center">
                <span data-toggle="counter-up">1,463</span>
                    <p>Companies</p>
  	    </div>
            <div class="col-lg-3 col-6 text-center">
              <span data-toggle="counter-up" >99 </span>
                <!--<<span data-toggle="counter-up" data-from="0" data-to="100" data-speed="5000" data-refresh-interval="50">99</span>-->
                    <p>Users satisfaction</p>
  	    </div>
        </div>
     </div>
    </section><!-- #facts -->

    <!--==========================
      Services Section
    ============================-->
    <section id="services">
      <div class="container wow fadeIn">
        <div class="section-header">
          <h3 class="section-title">Services</h3>
          <p class="section-description">Just beyond a traditional company</p>
        </div>
        <div class="row">
          <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.2s">
            <div class="box">
              <div class="icon"><a href=""><i class="fa fa-quora"></i></a></div>
              <h4 class="title"><a href="">Q & A</a></h4>
              <p class="description">Learn, Share and Build your Code</p>
            </div>
          </div>
          <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.4s">
            <div class="box">
              <div class="icon"><a href=""><i class="fa fa-bar-chart"></i></a></div>
              <h4 class="title"><a href="">JOBS</a></h4>
              <p class="description">Find your dream job</p>
            </div>
          </div>
          <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.6s">
            <div class="box">
              <div class="icon"><a href=""><i class="fa fa-paper-plane"></i></a></div>
              <h4 class="title"><a href="">Project Proposal</a></h4>
              <p class="description">Place where researchers collaborate</p>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.2s">
            <div class="box">
              <div class="icon"><a href=""><i class="fa fa-photo"></i></a></div>
              <h4 class="title"><a href="">Upload CV</a></h4>
              <p class="description">Place where your career begins</p>
            </div>
          </div>
          <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.4s">
            <div class="box">
              <div class="icon"><a href=""><i class="fa fa-road"></i></a></div>
              <h4 class="title"><a href="">Guild</a></h4>
              <p class="description">Pointing you toward a global career</p>
            </div>
          </div>
          <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.6s">
            <div class="box">
              <div class="icon"><a href=""><i class="fa fa-shopping-bag"></i></a></div>
              <h4 class="title"><a href="">Event Management</a></h4>
              <p class="description">Place where your success begins</p>
            </div>
          </div>
        </div>

      </div>
    </section><!-- #services -->

    <!--==========================
    Call To Action Section
    ============================-->
    <section id="call-to-action">
      <div class="container wow fadeIn">
        <div class="row">
          <div class="col-lg-9 text-center text-lg-left">
            <h3 class="cta-title">Call To Action</h3>
            <p class="cta-text"> Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
          </div>
          <div class="col-lg-3 cta-btn-container text-center">
            <a class="cta-btn align-middle" href="#">Call To Action</a>
          </div>
        </div>

      </div>
    </section><!-- #call-to-action -->

    <!--==========================
      Portfolio Section
    ============================-->
    <section id="portfolio">
      <div class="container wow fadeInUp">
        <div class="section-header">
          <h3 class="section-title">BLOG</h3>
          <p class="section-description">The foremost source for everything beyond tradition</p>
        </div>
        <div class="row">

          <div class="col-lg-12">
            <ul id="portfolio-flters">
              <li data-filter=".filter-app, .filter-card, .filter-logo, .filter-web" class="filter-active">All</li>
              <li data-filter=".filter-app">Web</li>
              <li data-filter=".filter-card">Business</li>
              <li data-filter=".filter-logo">Leadership</li>
              <li data-filter=".filter-web">Design</li>
            </ul>
          </div>
        </div>

        <div class="row" id="portfolio-wrapper">
          <div class="col-lg-3 col-md-6 portfolio-item filter-app">
            <a href="">
              <img src="resources/Index/img/portfolio/app1.jpeg" alt="">
              <div class="details">
                <h4>PHP</h4>
                <span>How upload a image using PHP</span>
              </div>
            </a>
          </div>

          <div class="col-lg-3 col-md-6 portfolio-item filter-web">
            <a href="">
              <img src="resources/Index/img/portfolio/web2.jpg" alt="">
              <div class="details">
                <h4>Website Design</h4>
                <span>Website Design using Photoshop</span>
              </div>
            </a>
          </div>

          <div class="col-lg-3 col-md-6 portfolio-item filter-app">
            <a href="">
              <img src="resources/Index/img/portfolio/app3.jpeg" alt="">
              <div class="details">
                <h4>HTML</h4>
                <span>HTML Parallax Effect</span>
              </div>
            </a>
          </div>

          <div class="col-lg-3 col-md-6 portfolio-item filter-card">
            <a href="">
              <img src="resources/Index/img/portfolio/card1.jpg" alt="">
              <div class="details">
                <h4>Statics</h4>
                <span>Qualitative Analysis</span>
              </div>
            </a>
          </div>

          <div class="col-lg-3 col-md-6 portfolio-item filter-card">
            <a href="">
              <img src="resources/Index/img/portfolio/card2.jpg" alt="">
              <div class="details">
                <h4>HR management</h4>
                <span>Quick response better service</span>
              </div>
            </a>
          </div>

          <div class="col-lg-3 col-md-6 portfolio-item filter-web">
            <a href="">
              <img src="resources/Index/img/portfolio/web3.jpg" alt="">
              <div class="details">
                <h4>Design Principles</h4>
                <span>Basic design principles for better outcome </span>
              </div>
            </a>
          </div>

          <div class="col-lg-3 col-md-6 portfolio-item filter-card">
            <a href="">
              <img src="resources/Index/img/portfolio/card3.jpg" alt="">
              <div class="details">
                <h4>Case Management</h4>
                <span>Managing critical Business aspects</span>
              </div>
            </a>
          </div>

          <div class="col-lg-3 col-md-6 portfolio-item filter-app">
            <a href="">
              <img src="resources/Index/img/portfolio/app2.jpeg" alt="">
              <div class="details">
                <h4>PHP</h4>
                <span>Using Arrays in PHP</span>
              </div>
            </a>
          </div>

          <div class="col-lg-3 col-md-6 portfolio-item filter-logo">
            <a href="">
              <img src="resources/Index/img/portfolio/logo1.jpeg" alt="">
              <div class="details">
                <h4>Leadership</h4>
                <span>How to become a leader</span>
              </div>
            </a>
          </div>

          <div class="col-lg-3 col-md-6 portfolio-item filter-logo">
            <a href="">
              <img src="resources/Index/img/portfolio/logo3.jpeg" alt="">
              <div class="details">
                <h4>Leadership</h4>
                <span>Qualities of a good leader</span>
              </div>
            </a>
          </div>

          <div class="col-lg-3 col-md-6 portfolio-item filter-web">
            <a href="">
              <img src="resources/Index/img/portfolio/web1.jpg" alt="">
              <div class="details">
                <h4>Note framework</h4>
                <span>Design with Note framework</span>
              </div>
            </a>
          </div>

          <div class="col-lg-3 col-md-6 portfolio-item filter-logo">
            <a href="">
              <img src="resources/Index/img/portfolio/logo2.jpg" alt="">
              <div class="details">
                <h4>Leadership</h4>
                <span>Think like a leader</span>
              </div>
            </a>
          </div>

        </div>

      </div>
    </section><!-- #portfolio -->

    <!--==========================
      Team Section
    ============================-->
    <section id="team">
      <div class="container wow fadeInUp">
        <div class="section-header">
          <h3 class="section-title">Up-coming events</h3>
          <p class="section-description">Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque</p>
        </div>
        <div class="row">
          <div class="col-lg-3 col-md-6">
            <div class="member">
              <div class="pic"><img src="resources/Index/img/team-1.jpg" alt=""></div>
              <h4>Walter White</h4>
              <span>Chief Executive Officer</span>
              <div class="social">
                <a href=""><i class="fa fa-twitter"></i></a>
                <a href=""><i class="fa fa-facebook"></i></a>
                <a href=""><i class="fa fa-google-plus"></i></a>
                <a href=""><i class="fa fa-linkedin"></i></a>
              </div>
            </div>
          </div>

          <div class="col-lg-3 col-md-6">
            <div class="member">
              <div class="pic"><img src="resources/Index/img/team-2.jpg" alt=""></div>
              <h4>Sarah Jhinson</h4>
              <span>Product Manager</span>
              <div class="social">
                <a href=""><i class="fa fa-twitter"></i></a>
                <a href=""><i class="fa fa-facebook"></i></a>
                <a href=""><i class="fa fa-google-plus"></i></a>
                <a href=""><i class="fa fa-linkedin"></i></a>
              </div>
            </div>
          </div>

          <div class="col-lg-3 col-md-6">
            <div class="member">
              <div class="pic"><img src="resources/Index/img/team-3.jpg" alt=""></div>
              <h4>William Anderson</h4>
              <span>CTO</span>
              <div class="social">
                <a href=""><i class="fa fa-twitter"></i></a>
                <a href=""><i class="fa fa-facebook"></i></a>
                <a href=""><i class="fa fa-google-plus"></i></a>
                <a href=""><i class="fa fa-linkedin"></i></a>
              </div>
            </div>
          </div>

          <div class="col-lg-3 col-md-6">
            <div class="member">
              <div class="pic"><img src="resources/Index/img/team-4.jpg" alt=""></div>
              <h4>Amanda Jepson</h4>
              <span>Accountant</span>
              <div class="social">
                <a href=""><i class="fa fa-twitter"></i></a>
                <a href=""><i class="fa fa-facebook"></i></a>
                <a href=""><i class="fa fa-google-plus"></i></a>
                <a href=""><i class="fa fa-linkedin"></i></a>
              </div>
            </div>
          </div>
        </div>

      </div>
    </section><!-- #team -->

    <!--==========================
      Contact Section
    ============================-->
    <section id="contact">
      <div class="container wow fadeInUp">
        <div class="section-header">
          <h3 class="section-title">Contact</h3>
          <p class="section-description">Get in touch with Ovatic IT Solutions</p>
        </div>
      </div>

      <div id="google-map" data-latitude="40.713732" data-longitude="-74.0092704"></div>

      <div class="container wow fadeInUp">
        <div class="row justify-content-center">

          <div class="col-lg-3 col-md-4">

            <div class="info">
              <div>
                <i class="fa fa-map-marker"></i>
                <p>No 35, Cross Street<br>Colombo<br>SriLanka</p>
              </div>

              <div>
                <i class="fa fa-envelope"></i>
                <p>info@ovatic.com</p>
              </div>

              <div>
                <i class="fa fa-phone"></i>
                <p>+94 1127895212</p>
              </div>
            </div>

            <div class="social-links">
              <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
              <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
              <a href="#" class="instagram"><i class="fa fa-instagram"></i></a>
              <a href="#" class="google-plus"><i class="fa fa-google-plus"></i></a>
              <a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
            </div>

          </div>

          <div class="col-lg-5 col-md-8">
            <div class="form">
              <div id="sendmessage">Your message has been sent. Thank you!</div>
              <div id="errormessage"></div>
              <form action="" method="post" role="form" class="contactForm">
                <div class="form-group">
                  <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" data-rule="email" data-msg="Please enter a valid email" />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <input type="text" class="form-control" name="subject" id="subject" placeholder="Subject" data-rule="minlen:4" data-msg="Please enter at least 8 chars of subject" />
                  <div class="validation"></div>
                </div>
                <div class="form-group">
                  <textarea class="form-control" name="message" rows="5" data-rule="required" data-msg="Please write something for us" placeholder="Message"></textarea>
                  <div class="validation"></div>
                </div>
                <div class="text-center"><button type="submit">Send Message</button></div>
              </form>
            </div>
          </div>

        </div>

      </div>
    </section><!-- #contact -->

  </main>

  <!--==========================
    Footer
  ============================-->
  <footer id="footer">
    <div class="footer-top">
      <div class="container">

      </div>
    </div>

    <div class="container">
      <div class="copyright">
          &copy; Copyright 2019 <br><strong> made with <i class="fa fa-heart" aria-hidden="true"></i> by Ovatic IT Solutions</strong>. <br>All Rights Reserved.</br>
      </div>
      <div class="credits">
   
      </div>
    </div>
  </footer><!-- #footer -->

  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

  <!-- JavaScript Libraries -->
  <script src="resources/Index/lib/jquery/jquery.min.js"></script>
  <script src="resources/Index/lib/jquery/jquery-migrate.min.js"></script>
  <script src="resources/Index/lib/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="resources/Index/lib/easing/easing.min.js"></script>
  <script src="resources/Index/lib/wow/wow.min.js"></script>
  <script src="https://maps.googleapis.com/maps/api/js?language=en&key=AIzaSyA-AB-9XZd-iQby-bNLYPFyb0pR2Qw3orw&callback=initMap"></script>

  <script src="resources/Index/lib/waypoints/waypoints.min.js"></script>
  <script src="resources/Index/lib/counterup/counterup.min.js"></script>
  <script src="resources/Index/lib/superfish/hoverIntent.js"></script>
  <script src="resources/Index/lib/superfish/superfish.min.js"></script>

  <!-- Contact Form JavaScript File -->
  <script src="resources/Index/contactform/contactform.js"></script>

  <!-- Template Main Javascript File -->
  <script src="resources/Index/js/main.js"></script>

</body>
</html>
