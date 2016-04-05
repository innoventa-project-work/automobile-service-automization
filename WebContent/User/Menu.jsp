
	<div id="wrapper"> 
    
    <!-- HEADER -->
    <div class="header">
      <div class="top-header">
        <div class="container">
          <div class="row">
            <div class="col-xs-12">
              <div class="header-contacts"> <span class="header-contacts__item"><i class="icon fa fa-phone"></i>+ 987 654 3210</span> <a class="header-contacts__item" href="mailto:autoz@zone.com"><i class="icon fa fa-envelope"></i>autoz (at) zone.com</a> </div>
              <ul class="social-links list-inline">
                <li><a class="icon fa fa-facebook" href="javascript:void(0);"></a></li>
                <li><a class="icon fa fa-twitter" href="javascript:void(0);"></a></li>
                <li><a class="icon fa fa-youtube-play" href="javascript:void(0);"></a></li>
                <li><a class="icon fa fa-instagram" href="javascript:void(0);"></a></li>
                <li><a class="icon fa fa-google-plus" href="javascript:void(0);"></a></li>
              </ul>
            </div>
            <!-- end col --> 
          </div>
          <!-- end row --> 
        </div>
        <!-- end container --> 
      </div>
      <!-- end top-header -->
      
      <div class="header__inner">
        <div class="container">
          <div class="row">
            <div class="col-md-12 col-xs-12"> <a href="index.jsp" class="logo"> <img class="logo__img img-responsive" src="img/logo.png" height="50" width="111" alt="Logo"> </a>
              <div class="navbar yamm">
                <div class="navbar-header hidden-md hidden-lg hidden-sm">
                  <button type="button" data-toggle="collapse" data-target="#navbar-collapse-1" class="navbar-toggle"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                  <a href="javascript:void(0);" class="navbar-brand"></a> </div>
                <div id="navbar-collapse-1" class="navbar-collapse collapse">
                  <ul class="nav navbar-nav">
                    <li><a href="index.jsp">HOME</a></li>
                    <li><a href="service.jsp">VEHICLE LISTINGS</a> </li>
                    <li><a href="$">CAR DETAILS</a></li>
                    <li class="dropdown" ><a href="#">NEWS</a>
                      <ul role="menu" class="dropdown-menu">
                        <li> <a href="#">DROPDOWN</a> </li>
                        <li> <a href="#">DROPDOWN</a> </li>
                      </ul>
                    </li>
                    <li><a href="<%=request.getContextPath()%>/User/login.jsp">Login</a></li>
                    <li><a href="<%=request.getContextPath()%>/regController?flag=searchCountry">REGISTRATION</a></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- end container --> 
      </div>
      <!-- end header__inner --> 
    </div>
    <!-- end header -->
    </div>
   		<!-- end wrapper -->