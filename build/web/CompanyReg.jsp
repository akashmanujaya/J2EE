<%-- 
    Document   : CompanyReg
    Created on : Mar 6, 2019, 10:20:32 AM
    Author     : Akash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">
    <title>New Member?</title>
    <link href="resources/Company/CompanyReg/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="resources/Company/CompanyReg/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">    
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    <link href="resources/Company/CompanyReg/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="resources/Company/CompanyReg/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">
    <link href="resources/Company/CompanyReg/css/main.css" rel="stylesheet" media="all">
    <link rel="shortcut icon" href="resources/CompanyReg/favicon.ico">
    <link rel="stylesheet" type="text/css" href="resources/Company/CompanyReg/css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="resources/Company/CompanyReg/css/demo.css" />
    <link rel="stylesheet" type="text/css" href="resources/Company/CompanyReg/css/component.css" />
</head>
<body>
    <div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
                    <h2 class="title">Registration Form</h2>
                    <form method="POST" action="CompanyReg" enctype='multipart/form-data'>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Company Name</label>
                                    <input class="input--style-4" type="text" name="company_name">
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Established Date</label>
                                    <div class="input-group-icon">
                                        <input class="input--style-4 js-datepicker" type="text" name="est_year">
                                        <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Address</label>
                                    <input class="input--style-4" type="text" name="address">
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Email</label>
                                    <input class="input--style-4" type="text" name="email">
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Phone Number</label>
                                    <input class="input--style-4" type="text" name="phone">
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Password</label>
                                    <input class="input--style-4" type="Password" name="password">
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Repeat Password</label>
                                    <input class="input--style-4" type="Password" name="repeatPassword">
                                </div>
                            </div>
                            
                        </div>
                        <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Upload Company Photo</label>
                                    <div class="box">
                                        <input type="file" name="photo" id="file-1" class="inputfile inputfile-1" data-multiple-caption="{count} files selected" multiple  />
                                    </div>
                                </div>
                            </div>
                        <div class="p-t-15">
                            <button class="btn btn--radius-2 btn--blue" type="submit">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <script src="resources/Company/CompanyReg/vendor/jquery/jquery.min.js"></script>
    <script src="resources/Company/CompanyReg/vendor/select2/select2.min.js"></script>
    <script src="resources/Company/CompanyReg/vendor/datepicker/moment.min.js"></script>
    <script src="resources/Company/CompanyReg/vendor/datepicker/daterangepicker.js"></script>
    <script src="resources/Company/CompanyReg/js/global.js"></script>
</body>
</html>
