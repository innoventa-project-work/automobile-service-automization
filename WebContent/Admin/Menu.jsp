<aside class="aside">
         <!-- START Sidebar (left)-->
         <nav class="sidebar">
            <ul class="nav">
               <!-- START Menu-->
               <li class="nav-heading">Main Menu</li>
               <li>
                  <a href="Index.jsp" title="Dashboard" data-toggle="" class="has-submenu">
                     <em class="fa fa-dot-circle-o"></em>
                     <!--  <div class="label label-primary pull-right">10</div> -->
                     <span class="item-text">Dashboard</span>
                  </a>
                  <!-- START SubMenu item-->
                  
                  <!-- END SubMenu item-->
               </li>
               <li>
                  <a href="#" title="AMC" data-toggle="collapse-next" class="has-submenu">
                     <em class="fa fa-user"></em>
                     <span class="item-text">Manage Users</span>
                  </a>
                  <!-- START SubMenu item-->
                  <ul class="nav collapse ">
                     <li>
                        <a href="ViewLoginDetails.jsp" title="View User Login Details" data-toggle="" class="no-submenu">
                           <span class="item-text">View User Login Details</span>
                        </a>
                     </li>
                     <li>
                        <a href="ViewUserInfo.jsp" title="View User Information" data-toggle="" class="no-submenu">
                           <span class="item-text">View User Information</span>
                        </a>
                     </li>
                  </ul>
                  <!-- END SubMenu item-->
               </li>
               <li>
                  <a href="#" title="AMC" data-toggle="collapse-next" class="has-submenu">
                     <em class="fa fa-calendar-o"></em>
                     <span class="item-text">Manage AMC</span>
                  </a>
                  <!-- START SubMenu item-->
                  <ul class="nav collapse ">
                     <li>
                        <a href="AddAmc.jsp" title="Add AMC" data-toggle="" class="no-submenu">
                           <span class="item-text">Add AMC</span>
                        </a>
                     </li>
                     <li>
                        <a href="<%=request.getContextPath()%>/AmcController?flag=searchAmc" title="View AMC" data-toggle="" class="no-submenu">
                           <span class="item-text">View AMC</span>
                        </a>
                     </li>
                  </ul>
                  <!-- END SubMenu item-->
               </li>
            <!--    <li class="nav-heading">More</li>  -->
               <li>
                  <a href="#" title="AMC" data-toggle="collapse-next" class="has-submenu">
                     <em class="fa fa-steam-square"></em>
                     <span class="item-text">Manage Services</span>
                  </a>
                  <!-- START SubMenu item-->
                  <ul class="nav collapse ">
                     <li>
                        <a href="<%=request.getContextPath()%>/serviceController?flag=searchCategory" title="Add Services" data-toggle="" class="no-submenu">
                           <span class="item-text">Add Services</span>
                        </a>
                     </li>
                     <li>
                        <a href="<%=request.getContextPath()%>/serviceController?flag=searchServices" title="View Services" data-toggle="" class="no-submenu">
                           <span class="item-text">View Services</span>
                        </a>
                     </li>
                  </ul>
                  <!-- END SubMenu item-->
               </li>
           
               <li>
                  <a href="ManageServiceBills.jsp" title="Manage Service Bills" data-toggle="collapse-next" class="no-submenu">
                     <em class="fa fa-cogs"></em>
                     <span class="item-text">Manage Service Bills</span>
                  </a>
                </li>
                
               <li>
                  <a href="#" title="Pickup" data-toggle="collapse-next" class="has-submenu">
                     <em class="fa fa-car"></em>
                     <span class="item-text">Manage Pickup</span>
                  </a>
                  <!-- START SubMenu item-->
                  <ul class="nav collapse ">
                     <li>
                        <a href="<%=request.getContextPath()%>/pickupController?flag=insertPickup" title="Add Pickup" data-toggle="" class="no-submenu">
                           <span class="item-text">Add Pickup/Drop</span>
                        </a>
                     </li>
                     <li>
                        <a href="<%=request.getContextPath()%>/pickupController?flag=searchPickup" title="Search Pickup" data-toggle="" class="no-submenu">
                           <span class="item-text">View Pickup/Drop</span>
                        </a>
                     </li>
                  </ul>
                  <!-- END SubMenu item-->
               </li>
                
                  <li>
                  <a href="#" title="Manage Category" data-toggle="collapse-next" class="has-submenu">
                     <em class="fa fa-pencil-square-o"></em>
                     <span class="item-text">Manage Category</span>
                  </a>
                  <!-- START SubMenu item-->
                  <ul class="nav collapse ">
                     <li>
                        <a href="AddVehCat.jsp" title="Add Vehicle Category" data-toggle="" class="no-submenu">
                           <span class="item-text">Add Vehicle Category</span>
                        </a>
                     </li>
                     <li>
                        <a href="<%=request.getContextPath()%>/VehicleCategoryController?flag=searchVehCategory" title="View Vehicle Category" data-toggle="" class="no-submenu">
                           <span class="item-text">View Vehicle Category</span>
                        </a>
                     </li>
                  </ul>
                  <!-- END SubMenu item-->
               </li>
               
               <li>
                  <a href="#" title="AMC" data-toggle="collapse-next" class="has-submenu">
                     <em class="fa fa-sitemap"></em>
                     <span class="item-text">Manage Company</span>
                  </a>
                  <!-- START SubMenu item-->
                  <ul class="nav collapse ">
                     <li>
                        <a href="<%=request.getContextPath()%>/companyController?flag=searchCategory" title="Add Vehicle Company" data-toggle="" class="no-submenu">
                           <span class="item-text">Add Vehicle Company</span>
                        </a>
                     </li>
                     <li>
                        <a href="<%=request.getContextPath()%>/companyController?flag=searchCompany" title="View Vehicle Company" data-toggle="" class="no-submenu">
                           <span class="item-text">View Vehicle Company</span>
                        </a>
                     </li>
                  </ul>
                  <!-- END SubMenu item-->
               </li>
               <li>
                  <a href="#" title="AMC" data-toggle="collapse-next" class="has-submenu">
                     <em class="fa fa-sitemap"></em>
                     <span class="item-text">Manage Model</span>
                  </a>
                  <!-- START SubMenu item-->
                  <ul class="nav collapse ">
                     <li>
                        <a href="<%=request.getContextPath()%>/modelController?flag=searchCompany" title="Add Vehicle model" data-toggle="" class="no-submenu">
                           <span class="item-text">Add Vehicle Model</span>
                        </a>
                     </li>
                     <li>
                        <a href="<%=request.getContextPath()%>/modelController?flag=searchModel" title="View Vehicle Model" data-toggle="" class="no-submenu">
                           <span class="item-text">View Vehicle Model</span>
                        </a>
                     </li>
                  </ul>
                  <!-- END SubMenu item-->
               </li>
               <li>
                  <a href="Country" title="Country" data-toggle="collapse-next" class="has-submenu">
                     <em class="fa fa-globe"></em>
                    <!--  <div class="label label-primary pull-right">new</div>  -->
                     <span class="item-text">Manage Country</span>
                  </a>
                  <!-- START SubMenu item-->
                  <ul class="nav collapse ">
                     <li>
                        <a href="AddCountry.jsp" title="Add Country" data-toggle="" class="no-submenu">
                           <span class="item-text">Add Country</span>
                        </a>
                     </li>
                     <li>
                        <a href="<%=request.getContextPath()%>/CountryController?flag=searchCountry" title="View Country" data-toggle="" class="no-submenu">
                           <span class="item-text">View Country</span>
                        </a>
                     </li>
                  </ul>
                  <!-- END SubMenu item-->
               </li>
				<li>
                  <a href="#" title="State" data-toggle="collapse-next" class="has-submenu">
                     <em class="fa fa-map-marker"></em>
                    <!--  <div class="label label-primary pull-right">new</div>  -->
                     <span class="item-text">Manage State</span>
                  </a>
                  <!-- START SubMenu item-->
                  <ul class="nav collapse ">
                     <li>
                        <a href="<%=request.getContextPath()%>/StateController?flag=searchCountry" title="Add State" data-toggle="" class="no-submenu">
                           <span class="item-text">Add State</span>
                        </a>
                     </li>
                     <li>
                        <a href="<%=request.getContextPath()%>/StateController?flag=searchState" title="View State" data-toggle="" class="no-submenu">
                           <span class="item-text">View State</span>
                        </a>
                     </li>
                  </ul>
                  <!-- END SubMenu item-->
               </li>               
               <li>
                  <a href="#" title="City" data-toggle="collapse-next" class="has-submenu">
                     <em class="fa fa-globe"></em>
                    <!--  <div class="label label-primary pull-right">new</div>  -->
                     <span class="item-text">Manage City</span>
                  </a>
                  <!-- START SubMenu item-->
                  <ul class="nav collapse ">
                     <li>
                        <a href="<%=request.getContextPath()%>/cityController?flag=searchCountry" title="Add City" data-toggle="" class="no-submenu">
                           <span class="item-text">Add City</span>
                        </a>
                     </li>
                     <li>
                        <a href="<%=request.getContextPath()%>/cityController?flag=searchCity" title="View City" data-toggle="" class="no-submenu">
                           <span class="item-text">View City</span>
                        </a>
                     </li>
                  </ul>
                  <!-- END SubMenu item-->
               </li>
               <li>
                  <a href="#" title="Area" data-toggle="collapse-next" class="has-submenu">
                     <em class="fa fa-map-marker"></em>
                    <!--  <div class="label label-primary pull-right">new</div>  -->
                     <span class="item-text">Manage Area</span>
                  </a>
                  <!-- START SubMenu item-->
                  <ul class="nav collapse ">
                     <li>
                        <a href="<%=request.getContextPath()%>/areaController?flag=searchCountry" title="Add Area" data-toggle="" class="no-submenu">
                           <span class="item-text">Add Area</span>
                        </a>
                     </li>
                     <li>
                        <a href="<%=request.getContextPath()%>/areaController?flag=searchArea" title="View Area" data-toggle="" class="no-submenu">
                           <span class="item-text">View Area</span>
                        </a>
                     </li>
                     
                  </ul>
                  <!-- END SubMenu item-->
               </li>
               
<!--                START Theme color options
               <li>
                  <a href="#" title="Color options" data-toggle="collapse-next" class="has-submenu">
                     <em class="fa fa-tint"></em>
                     <span class="item-text">Themes</span>
                  </a>
                  START SubMenu item
                  <ul class="nav collapse">
                     <li>
                        <a href="#" title="Option 1" data-toggle="load-css" data-uri="app/css/wintermin-theme-a.css" class="no-submenu">
                           <span class="item-text">Color option 1</span>
                        </a>
                     </li>
                     <li>
                        <a href="#" title="Option 2" data-toggle="load-css" data-uri="app/css/wintermin-theme-b.css" class="no-submenu">
                           <span class="item-text">Color option 2</span>
                        </a>
                     </li>
                     <li>
                        <a href="#" title="Option 3" data-toggle="load-css" data-uri="app/css/wintermin-theme-c.css" class="no-submenu">
                           <span class="item-text">Color option 3</span>
                        </a>
                     </li>
                     <li>
                        <a href="#" title="Option 4" data-toggle="load-css" data-uri="app/css/wintermin-theme-d.css" class="no-submenu">
                           <span class="item-text">Color option 4</span>
                        </a>
                     </li>
                     <li>
                        <a href="#" title="Default" data-toggle="load-css" data-uri="#" class="no-submenu">
                           <span class="item-text">Default</span>
                        </a>
                     </li>
                  </ul>
                  END SubMenu item
               </li>
               END Theme color options
               <li>
                  <ul class="nav-labels">
                     <li class="nav-heading">Labels</li>
                     <li class="nav-labels-item">
                        <span class="point point-lg point-success point-outline"></span><a href="#">Label A</a>
                     </li>
                     <li class="nav-labels-item">
                        <span class="point point-lg point-danger point-outline"></span><a href="#">Label B</a>
                     </li>
                     <li class="nav-labels-item">
                        <span class="point point-lg point-info point-outline"></span><a href="#">Label C</a>
                     </li>
                     <li class="nav-labels-item">
                        <span class="point point-lg point-warning point-outline"></span><a href="#">Label D</a>
                     </li>
                  </ul>
               </li> -->
               <!-- END Menu-->
            </ul>
         </nav>
         <!-- END Sidebar (left)-->
      </aside>