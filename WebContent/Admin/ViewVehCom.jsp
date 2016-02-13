<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" class="no-ie">
<!--<![endif]-->

<head>
<base href="${pageContext.request.contextPath}/Admin/">
   <!-- Meta-->
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0">
   <meta name="description" content="">
   <meta name="keywords" content="">
   <meta name="author" content="">
   <title>View Vehicles Company</title>
   <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
   <!--[if lt IE 9]><script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script><script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script><![endif]-->
   <!-- Bootstrap CSS-->
   <link rel="stylesheet" href="css/bootstrap.css">
   <!-- Vendor CSS-->
   <link rel="stylesheet" href="css/font-awesome.min.css">
   <link rel="stylesheet" href="css/animate+animo.css">
   <link rel="stylesheet" href="css/csspinner.min.css">
   <!-- START Page Custom CSS-->
   <!-- END Page Custom CSS-->
   <!-- App CSS-->
   <link rel="stylesheet" href="css/app.css">
   <!-- Modernizr JS Script-->
   <script src="js/modernizr.js" type="application/javascript"></script>
   <!-- FastClick for mobiles-->
   <script src="js/fastclick.js" type="application/javascript"></script>
</head>

<body>
   <!-- START Main wrapper-->
   <div class="wrapper">
      <!-- START Top Navbar-->
      <!-- START Top Navbar-->
      <jsp:include page="Header.jsp"></jsp:include>
      <!-- END Top Navbar-->
      <!-- START aside-->
      <jsp:include page="Menu.jsp"></jsp:include>
      <!-- End aside-->
      <!-- START aside-->
      <jsp:include page="RightSidebar.jsp"></jsp:include>
      <!-- END aside-->
      <!-- START Main section-->
      <section>
         <!-- START Page content-->
         <div class="main-content">
            <h3>View Vehicles Company
               <br>
<!--                <small>Details About Feedbacks.</small> -->
            </h3>
            <!-- START DATATABLE 1 -->
            <div class="row">
               <div class="col-lg-12">
                  <div class="panel panel-default">
               <!--       <div class="panel-heading">Data Tables |
                        <small>Zero Configuration</small>
                     </div>  -->
                     <div class="panel-body">
                        <table id="datatable1" class="table table-striped table-hover">
                           <thead>
                              <tr>
                                 <th>No.</th>
                                 <th  class="sort-alpha">Company Name</th>
                                 <th>Company Description</th>
                                 <th>Category Of Company</th>
                                 <th>Action</th>
                                 
                              </tr>
                           </thead>
                            <tbody>
              
              <c:forEach items="${sessionScope.companyList}" var="i">
			<tr>
				<td>${i.comid}</td>
				<td>${i.companyName}</td>
				<td>${i.companyDescription}</td>
				<td>${i.vc.category}</td>
				<td>
				<div class="btn-group mb-sm"><button class="btn btn-inverse dropdown-toggle" data-toggle="dropdown" type="button" >Action<span class="caret"></span></button>
				<ul class="dropdown-menu" role="menu">
				<li><a href="<%=request.getContextPath()%>/companyController?flag=editCompany&companyId=${i.comid}">Edit</a></li>
				<li><a href="">DELETE</a></li>
				</ul>
				</div>
				</td>
				
			</tr>
			
			
		</c:forEach>
              <c:remove var="companyList" scope="session" />
              
              </tbody>
                        </table>
                     </div>
                  </div>
               </div>
            </div>
            <!-- END DATATABLE 1 -->            
         </div>
         <!-- END Page content-->
         <!-- START Page footer-->
         <footer>&copy; 2014 - Wintermin</footer>
         <!-- END Page Footer-->
      </section>
      <!-- END Main section-->
   </div>
   <!-- END Main wrapper-->
   <!-- START Scripts-->
   <!-- Main vendor Scripts-->
   <script src="js/jquery.min.js"></script>
   <script src="js/bootstrap.min.js"></script>
   <!-- Plugins-->
   <script src="js/chosen.jquery.min.js"></script>
   <script src="js/bootstrap-slider.js"></script>
   <script src="js/bootstrap-filestyle.min.js"></script>
   <!-- Animo-->
   <script src="js/animo.min.js"></script>
   <!-- Sparklines-->
   <script src="js/jquery.sparkline.min.js"></script>
   <!-- Slimscroll-->
   <script src="js/jquery.slimscroll.min.js"></script>
   <!-- Store + JSON-->
   <script src="js/store+json2.min.js"></script>
   <!-- Classyloader-->
   <script src="js/jquery.classyloader.min.js"></script>
   <!-- START Page Custom Script-->
   <!-- Data Table Scripts-->
   <script src="js/jquery.dataTables.min.js"></script>
   <script src="js/dataTables.bootstrap.js"></script>
   <script src="js/dataTables.bootstrapPagination.js"></script>
   <script src="js/dataTables.colVis.min.js"></script>
   <!-- END Page Custom Script-->
   <!-- App Main-->
   <script src="js/app.js"></script>
   <!-- END Scripts-->
</body>
</html>