<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" class="no-ie">
<!--<![endif]-->
<head>
<base href="${pageContext.request.contextPath}/User/">
	<!-- Menu css & js  -->
	<link href="img/favicon.png" type="image/x-icon" rel="shortcut icon">
		<link href="css/master.css" rel="stylesheet">
		<link href="css/iview.css" rel="stylesheet">
		<link href="css/style.css" rel="stylesheet">
		<link href="css/bootstrap.css" rel="stylesheet">
		<link href="css/select2.css" rel="stylesheet">
		<script src="js/jquery-1.11.1.min.js"></script>
   <!-- End Menu css & js  -->
   <!-- Meta-->
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0">
   <meta name="description" content="">
   <meta name="keywords" content="">
   <meta name="author" content="">
   <title>Wintermin - Bootstrap Admin Theme</title>
   <!-- Bootstrap CSS-->
   <link rel="stylesheet" href="css/bootstrap.css">
   <!-- Vendor CSS-->
   <link rel="stylesheet" href="css/font-awesome.min.css">
   <link rel="stylesheet" href="css/animate+animo.css">
   <!-- App CSS-->
   <link rel="stylesheet" href="css/app.css">
   <link rel="stylesheet" href="css/common.css">
   <!-- Modernizr JS Script-->
   <script src="js/modernizr.js" type="application/javascript"></script>
   <!-- FastClick for mobiles-->
   <script src="js/fastclick.js" type="application/javascript"></script>
</head>

<body>
   <!-- START wrapper-->
   <div class="wrapper">
   <jsp:include page="Menu.jsp"></jsp:include>
					<div class="block-title__inner section-bg section-bg_second">	
						<div class="bg-inner">
														   <div class="row row-table page-wrapper">
							      <div class="col-lg-3 col-md-6 col-sm-8 col-xs-12 align-middle">
							         <!-- START panel-->
							         <div data-toggle="play-animation" data-play="fadeIn" data-offset="0" class="panel panel-dark panel-flat">
							            <div class="panel-heading text-center">
							               <a href="#">
							                  <img src="img/logo.png" alt="Image" class="block-center img-rounded">
							               </a>
							               <p class="text-center mt-lg">
							                  <strong>SIGN IN TO CONTINUE.</strong>
							               </p>
							            </div>
							            <div class="panel-body">
							               <form method="post" action="<%=request.getContextPath()%>/loginController" role="form" class="mb-lg">
							<!--                   <div class="text-right mb-sm"><a href="#" class="text-muted">Need to Signup?</a> -->
							<!--                   </div> -->
							                  <div class="form-group has-feedback">
							                     <input id="exampleInputEmail1" type="email" name="loginEmail" placeholder="Enter email" class="form-control">
							                     <span class="fa fa-envelope form-control-feedback text-muted"></span>
							                  </div>
							                  <div class="form-group has-feedback">
							                     <input id="exampleInputPassword1" type="password" name="loginPassword" placeholder="Password" class="form-control" required="required">
							                     <span class="fa fa-lock form-control-feedback text-muted"></span>
							                  </div>
							                  <div class="clearfix">
							                     <div class="checkbox c-checkbox pull-left mt0">
							                        <label>
							                           <input type="checkbox" value="">
							                           <span class="fa fa-check"></span>Remember Me</label>
							                     </div>
							                     <div class="pull-right"><a href="#" class="text-muted">Forgot your password?</a>
							                     </div>
							                  </div>
							                  <input type="submit" class="btn btn-block btn-success" value="Login">
							                  <input type="hidden" name="flag" value="matchUser">
							               </form>
							            </div>
							         </div>
							         <!-- END panel-->
							      </div>
							   </div>
						</div>
					</div><!-- end block-title__inner --><!-- end block-title -->

</div>
   <!-- END wrapper-->
   <!-- START Scripts-->
   <!-- Main vendor Scripts-->
   <script src="js/jquery.min.js"></script>
   <script src="js/bootstrap.min.js"></script>
   <!-- Animo-->
   <script src="js/animo.min.js"></script>
   <!-- Custom script for pages-->
   <script src="js/pages.js"></script>
   <!-- END Scripts-->
</body>
</html>