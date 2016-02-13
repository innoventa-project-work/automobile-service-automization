<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
   <title>Wintermin - Bootstrap Admin Theme</title>
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
      <jsp:include page="Header.jsp"></jsp:include>
      <!-- END Top Navbar-->
      <!-- START aside-->
      <jsp:include page="Menu.jsp"></jsp:include>
      <!-- End aside-->
      <!-- START aside-->
      <aside class="offsidebar">
         <!-- START Off Sidebar (right)-->
         <nav>
            <ul class="nav">
               <!-- START user info-->
               <li>
                  <div class="item">
                     <div class="p-lg">
                        <div class="text-center">
                           <p>
                              <img src="img/02.jpg" alt="Image" class="img-circle img-thumbnail thumb64">
                           </p>
                           <p>
                              <strong>Arnold</strong>
                           </p>
                        </div>
                     </div>
                  </div>
               </li>
               <!-- END user info-->
               <li class="p">
                  <div class="form-group has-feedback">
                     <input type="text" placeholder="Search contacts.." class="form-control">
                     <em class="fa fa-search form-control-feedback text-muted"></em>
                  </div>
               </li>
               <!-- START list title-->
               <li class="p">
                  <small class="text-muted">ONLINE</small>
               </li>
               <!-- END list title-->
               <li>
                  <!-- START User status-->
                  <a href="#" class="media p mt0">
                     <span class="pull-right">
                        <span class="point point-success point-lg"></span>
                     </span>
                     <span class="pull-left">
                        <!-- Contact avatar-->
                        <img src="img/05.jpg" alt="Image" class="media-object img-circle thumb48">
                     </span>
                     <!-- Contact info-->
                     <span class="media-body">
                        <span class="media-heading">
                           <strong>Laura Sam</strong>
                           <br>
                           <small class="text-muted">lau39</small>
                        </span>
                     </span>
                  </a>
                  <!-- END User status-->
                  <!-- START User status-->
                  <a href="#" class="media p mt0">
                     <span class="pull-right">
                        <span class="point point-success point-lg"></span>
                     </span>
                     <span class="pull-left">
                        <!-- Contact avatar-->
                        <img src="img/06.jpg" alt="Image" class="media-object img-circle thumb48">
                     </span>
                     <!-- Contact info-->
                     <span class="media-body">
                        <span class="media-heading">
                           <strong>Beverley Pierce</strong>
                           <br>
                           <small class="text-muted">be40210</small>
                        </span>
                     </span>
                  </a>
                  <!-- END User status-->
                  <!-- START User status-->
                  <a href="#" class="media p mt0">
                     <span class="pull-right">
                        <span class="point point-danger point-lg"></span>
                     </span>
                     <span class="pull-left">
                        <!-- Contact avatar-->
                        <img src="img/07.jpg" alt="Image" class="media-object img-circle thumb48">
                     </span>
                     <!-- Contact info-->
                     <span class="media-body">
                        <span class="media-heading">
                           <strong>Mika Long</strong>
                           <br>
                           <small class="text-muted">longlong</small>
                        </span>
                     </span>
                  </a>
                  <!-- END User status-->
                  <!-- START User status-->
                  <a href="#" class="media p mt0">
                     <span class="pull-right">
                        <span class="point point-warning point-lg"></span>
                     </span>
                     <span class="pull-left">
                        <!-- Contact avatar-->
                        <img src="img/08.jpg" alt="Image" class="media-object img-circle thumb48">
                     </span>
                     <!-- Contact info-->
                     <span class="media-body">
                        <span class="media-heading">
                           <strong>Danielle Berry</strong>
                           <br>
                           <small class="text-muted">hunter49</small>
                        </span>
                     </span>
                  </a>
                  <!-- END User status-->
               </li>
               <!-- START list title-->
               <li class="p">
                  <small class="text-muted">OFFLINE</small>
               </li>
               <!-- END list title-->
               <li>
                  <!-- START User status-->
                  <a href="#" class="media p mt0">
                     <span class="pull-right">
                        <span class="point point-lg"></span>
                     </span>
                     <span class="pull-left">
                        <!-- Contact avatar-->
                        <img src="img/09.jpg" alt="Image" class="media-object img-circle thumb48">
                     </span>
                     <!-- Contact info-->
                     <span class="media-body">
                        <span class="media-heading">
                           <strong>Martin Cooper</strong>
                           <br>
                           <small class="text-muted">maryo</small>
                        </span>
                     </span>
                  </a>
                  <!-- END User status-->
                  <!-- START User status-->
                  <a href="#" class="media p mt0">
                     <span class="pull-right">
                        <span class="point point-lg"></span>
                     </span>
                     <span class="pull-left">
                        <!-- Contact avatar-->
                        <img src="img/10.jpg" alt="Image" class="media-object img-circle thumb48">
                     </span>
                     <!-- Contact info-->
                     <span class="media-body">
                        <span class="media-heading">
                           <strong>Daniel Curtis</strong>
                           <br>
                           <small class="text-muted">danni</small>
                        </span>
                     </span>
                  </a>
                  <!-- END User status-->
               </li>
               <li>
                  <!-- Optional link to list more users-->
                  <a href="#" title="See more contacts" class="p">
                     <strong>
                        <small class="text-muted">&hellip;</small>
                     </strong>
                  </a>
               </li>
            </ul>
         </nav>
         <!-- END Off Sidebar (right)-->
      </aside>
      <!-- END aside-->
      <!-- START Main section-->
      <section>
         <!-- START Page content-->
         <div class="main-content">
            <h3>Form Elements
               <br>
               <small>Standard and custom elements for any form</small>
            </h3>
            <!-- START panel-->
            <div class="panel panel-default">
               <div class="panel-heading">Inline form</div>
               <div class="panel-body">
                  <form role="form" class="form-inline">
                     <div class="form-group">
                        <label for="input-email" class="sr-only">Email address</label>
                        <input id="input-email" type="email" placeholder="Type your email" class="form-control">
                     </div>
                     <div class="form-group">
                        <label for="input-password" class="sr-only">Password</label>
                        <input id="input-password" type="password" placeholder="Type your password" class="form-control">
                     </div>
                     <div class="checkbox c-checkbox">
                        <label>
                           <input type="checkbox">
                           <span class="fa fa-check"></span>Remember</label>
                     </div>
                     <button type="submit" class="btn btn-default">Sign in</button>
                  </form>
               </div>
            </div>
            <!-- END panel-->
            <!-- START row-->
            <div class="row">
               <div class="col-sm-6">
                  <!-- START panel-->
                  <div class="panel panel-default">
                     <div class="panel-heading">Stacked form</div>
                     <div class="panel-body">
                        <form role="form">
                           <div class="form-group">
                              <label>Email address</label>
                              <input type="email" placeholder="Enter email" class="form-control">
                           </div>
                           <div class="form-group">
                              <label>Password</label>
                              <input type="password" placeholder="Password" class="form-control">
                           </div>
                           <div class="checkbox c-checkbox">
                              <label>
                                 <input type="checkbox" checked="">
                                 <span class="fa fa-times"></span>Check me out</label>
                           </div>
                           <button type="submit" class="btn btn-sm btn-default">Submit</button>
                        </form>
                     </div>
                  </div>
                  <!-- END panel-->
               </div>
               <div class="col-sm-6">
                  <!-- START panel-->
                  <div class="panel panel-default">
                     <div class="panel-heading">Horizontal form</div>
                     <div class="panel-body">
                        <form class="form-horizontal">
                           <div class="form-group">
                              <label class="col-lg-2 control-label">Email</label>
                              <div class="col-lg-10">
                                 <input type="email" placeholder="Email" class="form-control">
                              </div>
                           </div>
                           <div class="form-group">
                              <label class="col-lg-2 control-label">Password</label>
                              <div class="col-lg-10">
                                 <input type="password" placeholder="Password" class="form-control">
                              </div>
                           </div>
                           <div class="form-group">
                              <div class="col-lg-offset-2 col-lg-10">
                                 <div class="checkbox c-checkbox">
                                    <label>
                                       <input type="checkbox" checked="">
                                       <span class="fa fa-check"></span>Remember me</label>
                                 </div>
                              </div>
                           </div>
                           <div class="form-group">
                              <div class="col-lg-offset-2 col-lg-10">
                                 <button type="submit" class="btn btn-sm btn-default">Sign in</button>
                              </div>
                           </div>
                        </form>
                     </div>
                  </div>
                  <!-- END panel-->
               </div>
            </div>
            <!-- END row-->
            <!-- START panel-->
            <div class="panel panel-default">
               <div class="panel-heading">Form elements</div>
               <div class="panel-body">
                  <form method="get" action="/" class="form-horizontal">
                     <fieldset>
                        <legend>Classic inputs</legend>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Rounded Corners</label>
                           <div class="col-sm-10">
                              <input type="text" class="form-control form-control-rounded">
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">With help</label>
                           <div class="col-sm-10">
                              <input type="text" class="form-control">
                              <span class="help-block m-b-none">A block of help text that breaks onto a new line and may extend beyond one line.</span>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label for="input-id-1" class="col-sm-2 control-label">Label focus</label>
                           <div class="col-sm-10">
                              <input id="input-id-1" type="text" class="form-control">
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Password</label>
                           <div class="col-sm-10">
                              <input type="password" name="password" class="form-control">
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Placeholder</label>
                           <div class="col-sm-10">
                              <input type="text" placeholder="placeholder" class="form-control">
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-lg-2 control-label">Disabled</label>
                           <div class="col-lg-10">
                              <input type="text" placeholder="Disabled input here..." disabled="" class="form-control">
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-lg-2 control-label">Static control</label>
                           <div class="col-lg-10">
                              <p class="form-control-static">email@example.com</p>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Checkboxes and radios</label>
                           <div class="col-sm-10">
                              <div class="checkbox">
                                 <label>
                                    <input type="checkbox" value="">Option one is this and that—be sure to include why it's great</label>
                              </div>
                              <div class="radio">
                                 <label>
                                    <input id="optionsRadios1" type="radio" name="optionsRadios" value="option1" checked="">Option one is this and that—be sure to include why it's great</label>
                              </div>
                              <div class="radio">
                                 <label>
                                    <input id="optionsRadios2" type="radio" name="optionsRadios" value="option2">Option two can be something else and selecting it will deselect option one</label>
                              </div>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Inline checkboxes</label>
                           <div class="col-sm-10">
                              <label class="checkbox checkbox-inline">
                                 <input id="inlineCheckbox1" type="checkbox" value="option1">a</label>
                              <label class="checkbox-inline">
                                 <input id="inlineCheckbox2" type="checkbox" value="option2">b</label>
                              <label class="checkbox-inline">
                                 <input id="inlineCheckbox3" type="checkbox" value="option3">c</label>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset class="last-child">
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Select</label>
                           <div class="col-sm-10">
                              <select name="account" class="form-control m-b">
                                 <option>Option 1</option>
                                 <option>Option 2</option>
                                 <option>Option 3</option>
                                 <option>Option 4</option>
                              </select>
                              <br>
                              <div class="row">
                                 <div class="col-lg-4">
                                    <select multiple="" class="form-control">
                                       <option>Option 1</option>
                                       <option>Option 2</option>
                                       <option>Option 3</option>
                                       <option>Option 4</option>
                                    </select>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <legend>Input variants</legend>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Custom Checkboxes &amp; radios</label>
                           <div class="col-sm-10">
                              <div class="checkbox c-checkbox">
                                 <label>
                                    <input type="checkbox" value="">
                                    <span class="fa fa-check"></span>Option one</label>
                              </div>
                              <div class="checkbox c-checkbox">
                                 <label>
                                    <input type="checkbox" checked="" value="">
                                    <span class="fa fa-check"></span>Option two checked</label>
                              </div>
                              <div class="checkbox c-checkbox">
                                 <label>
                                    <input type="checkbox" checked="" disabled="" value="">
                                    <span class="fa fa-check"></span>Option three checked and disabled</label>
                              </div>
                              <div class="checkbox c-checkbox">
                                 <label>
                                    <input type="checkbox" disabled="" value="">
                                    <span class="fa fa-check"></span>Option four disabled</label>
                              </div>
                              <div class="radio c-radio">
                                 <label>
                                    <input type="radio" name="a" value="option1">
                                    <span class="fa fa-circle"></span>Option one</label>
                              </div>
                              <div class="radio c-radio">
                                 <label>
                                    <input type="radio" name="a" value="option2" checked="">
                                    <span class="fa fa-circle"></span>Option two checked</label>
                              </div>
                              <div class="radio c-radio">
                                 <label>
                                    <input type="radio" value="option2" checked="" disabled="">
                                    <span class="fa fa-circle"></span>Option three checked and disabled</label>
                              </div>
                              <div class="radio c-radio">
                                 <label>
                                    <input type="radio" name="a" disabled="">
                                    <span class="fa fa-circle"></span>Option four disabled</label>
                              </div>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Inline checkboxes</label>
                           <div class="col-sm-10">
                              <label class="checkbox-inline c-checkbox">
                                 <input id="inlineCheckbox10" type="checkbox" value="option1">
                                 <span class="fa fa-check"></span>a</label>
                              <label class="checkbox-inline c-checkbox">
                                 <input id="inlineCheckbox20" type="checkbox" value="option2">
                                 <span class="fa fa-check"></span>b</label>
                              <label class="checkbox-inline c-checkbox">
                                 <input id="inlineCheckbox30" type="checkbox" value="option3">
                                 <span class="fa fa-check"></span>c</label>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Rounded</label>
                           <div class="col-sm-10">
                              <label class="checkbox c-checkbox c-checkbox-rounded">
                                 <input id="roundedcheckbox10" type="checkbox" checked>
                                 <span class="fa fa-check"></span>Lorem</label>
                              <label class="checkbox c-checkbox c-checkbox-rounded">
                                 <input id="roundedcheckbox20" type="checkbox">
                                 <span class="fa fa-check"></span>Ipsum</label>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Inline radios</label>
                           <div class="col-sm-10">
                              <label class="radio-inline c-radio">
                                 <input id="inlineradio1" type="radio" name="i-radio" value="option1" checked>
                                 <span class="fa fa-circle"></span>a</label>
                              <label class="radio-inline c-radio">
                                 <input id="inlineradio2" type="radio" name="i-radio" value="option2">
                                 <span class="fa fa-circle"></span>b</label>
                              <label class="radio-inline c-radio">
                                 <input id="inlineradio3" type="radio" name="i-radio" value="option3">
                                 <span class="fa fa-circle"></span>c</label>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Custom icons</label>
                           <div class="col-sm-10">
                              <label class="radio-inline c-radio">
                                 <input id="inlineradio10" type="radio" name="i-radio" value="option1" checked>
                                 <span class="fa fa-check"></span>a</label>
                              <label class="radio-inline c-radio">
                                 <input id="inlineradio20" type="radio" name="i-radio" value="option2" checked>
                                 <span class="fa fa-user"></span>b</label>
                              <label class="radio-inline c-radio">
                                 <input id="inlineradio30" type="radio" name="i-radio" value="option3" checked>
                                 <span class="fa fa-tint"></span>c</label>
                              <br>
                              <label class="checkbox-inline c-checkbox">
                                 <input id="inlinecheckbox10" type="checkbox" value="option1" checked>
                                 <span class="fa fa-star"></span>a</label>
                              <label class="checkbox-inline c-checkbox">
                                 <input id="inlinecheckbox20" type="checkbox" value="option2" checked>
                                 <span class="fa fa-heart"></span>b</label>
                              <label class="checkbox-inline c-checkbox">
                                 <input id="inlinecheckbox30" type="checkbox" value="option3" checked>
                                 <span class="fa fa-bell"></span>c</label>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group has-success">
                           <label class="col-sm-2 control-label">Input with success</label>
                           <div class="col-sm-10">
                              <input type="text" class="form-control">
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group has-warning">
                           <label class="col-sm-2 control-label">Input with warning</label>
                           <div class="col-sm-10">
                              <input type="text" class="form-control">
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group has-error">
                           <label class="col-sm-2 control-label">Input with error</label>
                           <div class="col-sm-10">
                              <input type="text" class="form-control">
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Control sizing</label>
                           <div class="col-sm-10">
                              <input type="text" placeholder=".input-lg" class="form-control input-lg m-b">
                              <br>
                              <input type="text" placeholder="Default input" class="form-control m-b">
                              <br>
                              <input type="text" placeholder=".input-sm" class="form-control input-sm">
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Column sizing</label>
                           <div class="col-sm-10">
                              <div class="row">
                                 <div class="col-md-2">
                                    <input type="text" placeholder=".col-md-2" class="form-control">
                                 </div>
                                 <div class="col-md-3">
                                    <input type="text" placeholder=".col-md-3" class="form-control">
                                 </div>
                                 <div class="col-md-4">
                                    <input type="text" placeholder=".col-md-4" class="form-control">
                                 </div>
                              </div>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Input groups</label>
                           <div class="col-sm-10">
                              <div class="input-group m-b">
                                 <span class="input-group-addon">@</span>
                                 <input type="text" placeholder="Username" class="form-control">
                              </div>
                              <br>
                              <div class="input-group m-b">
                                 <input type="text" class="form-control">
                                 <span class="input-group-addon">.00</span>
                              </div>
                              <br>
                              <div class="input-group m-b">
                                 <span class="input-group-addon">$</span>
                                 <input type="text" class="form-control">
                                 <span class="input-group-addon">.00</span>
                              </div>
                              <br>
                              <div class="input-group m-b">
                                 <span class="input-group-addon">
                                    <input type="checkbox">
                                 </span>
                                 <input type="text" class="form-control">
                              </div>
                              <br>
                              <div class="input-group">
                                 <span class="input-group-addon">
                                    <input type="radio">
                                 </span>
                                 <input type="text" class="form-control">
                              </div>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Button addons</label>
                           <div class="col-sm-10">
                              <div class="input-group m-b">
                                 <span class="input-group-btn">
                                    <button type="button" class="btn btn-default">Go!</button>
                                 </span>
                                 <input type="text" class="form-control">
                              </div>
                              <br>
                              <div class="input-group">
                                 <input type="text" class="form-control">
                                 <span class="input-group-btn">
                                    <button type="button" class="btn btn-default">Go!</button>
                                 </span>
                              </div>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">With dropdowns</label>
                           <div class="col-sm-10">
                              <div class="input-group m-b">
                                 <div class="input-group-btn">
                                    <button type="button" data-toggle="dropdown" class="btn btn-default dropdown-toggle">Action
                                       <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu">
                                       <li><a href="#">Action</a>
                                       </li>
                                       <li><a href="#">Another action</a>
                                       </li>
                                       <li><a href="#">Something else here</a>
                                       </li>
                                       <li class="divider"></li>
                                       <li><a href="#">Separated link</a>
                                       </li>
                                    </ul>
                                 </div>
                                 <input type="text" class="form-control">
                              </div>
                              <br>
                              <div class="input-group">
                                 <input type="text" class="form-control">
                                 <div class="input-group-btn">
                                    <button type="button" data-toggle="dropdown" class="btn btn-default dropdown-toggle">Action
                                       <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu pull-right">
                                       <li><a href="#">Action</a>
                                       </li>
                                       <li><a href="#">Another action</a>
                                       </li>
                                       <li><a href="#">Something else here</a>
                                       </li>
                                       <li class="divider"></li>
                                       <li><a href="#">Separated link</a>
                                       </li>
                                    </ul>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <div class="form-group">
                           <label class="col-sm-2 control-label">Segmented</label>
                           <div class="col-sm-10">
                              <div class="input-group m-b">
                                 <div class="input-group-btn">
                                    <button type="button" tabindex="-1" class="btn btn-default">Action</button>
                                    <button type="button" data-toggle="dropdown" class="btn btn-default dropdown-toggle">
                                       <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu">
                                       <li><a href="#">Action</a>
                                       </li>
                                       <li><a href="#">Another action</a>
                                       </li>
                                       <li><a href="#">Something else here</a>
                                       </li>
                                       <li class="divider"></li>
                                       <li><a href="#">Separated link</a>
                                       </li>
                                    </ul>
                                 </div>
                                 <input type="text" class="form-control">
                              </div>
                              <br>
                              <div class="input-group">
                                 <input type="text" class="form-control">
                                 <div class="input-group-btn">
                                    <button type="button" tabindex="-1" class="btn btn-default">Action</button>
                                    <button type="button" data-toggle="dropdown" class="btn btn-default dropdown-toggle">
                                       <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu pull-right">
                                       <li><a href="#">Action</a>
                                       </li>
                                       <li><a href="#">Another action</a>
                                       </li>
                                       <li><a href="#">Something else here</a>
                                       </li>
                                       <li class="divider"></li>
                                       <li><a href="#">Separated link</a>
                                       </li>
                                    </ul>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </fieldset>
                  </form>
               </div>
            </div>
            <!-- END panel-->
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
   <!-- END Page Custom Script-->
   <!-- App Main-->
   <script src="js/app.js"></script>
   <!-- END Scripts-->
</body>

</html>