 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${pageContext.request.contextPath}/User/">
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimal-ui">
		<title>Autozone User registration</title>
		<link href="img/favicon.png" type="image/x-icon" rel="shortcut icon">
		<link href="css/master.css" rel="stylesheet">
		<link href="css/iview.css" rel="stylesheet">
		<link href="css/style.css" rel="stylesheet">
		<link href="css/bootstrap.css" rel="stylesheet">
		<link href="css/select2.css" rel="stylesheet">
		<script src="js/jquery-1.11.1.min.js"></script>
		<script type="text/javascript">
			/* var email = document.getElementById("email");
			email.addEventListener("keyup", function (event) {
			  if (email.validity.typeMismatch) {
			    email.setCustomValidity("Please enter an valid email!");
			  } else {
			    email.setCustomValidity("");
			  }
			}); */
		</script>
		<script type="text/javascript">
			
			function validation()
			{	
				var pass=document.getElementById("pass").value;
		        var cpass=document.getElementById("cpass").value;
		        if (cpass != pass) {
		        	document.getElementById("cpassLabel").innerHTML="password does not match" 
		        		$(document).ready(function() {
							 $('#register').attr('disabled', 'disabled');
				        });
		            return false;
		        }
		        else
		        {
		        	document.getElementById("cpassLabel").innerHTML=" "
			        $('#register').removeAttr('disabled');	
		        }
		        
		    }
			
			/* function kaik()
			{
				document.getElementById("cpassLabel");
				document.getElementById("emailid");
				if(cpassLabel.innerHTML == "password does not match" && emailid.innerHTML == "Already registered")
					{
						$(document).ready(function() {
							 $('#register').attr('disabled', 'disabled');
				        });
					}
				else
					{
						$('#register').removeAttr('disabled');	
					}
			}
			 */
			function loadEmail() 
		  	{
				var email=document.getElementById("email").value;
				var xmlhttp1 = new XMLHttpRequest();
				removeAllEmail();
				
				xmlhttp1.onreadystatechange = function()
				{
					if (xmlhttp1.readyState == 4 && xmlhttp1.status==200)
					{
						var jsonArray = JSON.parse(xmlhttp1.responseText);
						if(jsonArray.length > 0)
						{
							/* alert(JSON.stringify(jsonArray)); */
							document.getElementById("emailid").innerHTML = "Already registered";
							$(document).ready(function() {
								 $('#register').attr('disabled', 'disabled');
					        });
						}
						else
						{
							/* alert(JSON.stringify(jsonArray)); */
							document.getElementById("emailid").innerHTML = "Available";
							document.getElementById("emailid").color = "green";
							$('#register').removeAttr('disabled');
						}
					}
						
				}	
				xmlhttp1.open("get","${pageContext.request.contextPath}/regController?flag=loadEmail&email="+email, true)
				xmlhttp1.send();
				/* jQuery(".chosen-select1").chosen({'width':'100%','white-space':'nowrap'}); */
				/* Holds the status of the XMLHttpRequest. Changes from 0 to 4:
					0: request not initialized
					1: server connection established
					2: request received
					3: processing request
					4: request finished and response is ready */
			}
			function removeAllEmail()
			{
				document.getElementById("emailid").innerHTML = "";
			}
		   	function loadCity() 
		  	{
				var stateId=document.getElementById("stateId");	
				var xmlhttp1 = new XMLHttpRequest();
				
				removeAllCity();
				
				xmlhttp1.onreadystatechange = function()
				{
					if (xmlhttp1.readyState == 4) 
					{
						var jsonArray = JSON.parse(xmlhttp1.responseText);
						//alert(JSON.stringify(jsonArray));
						for(i=0; i<jsonArray.length ; i++)
						{
							var createOption=document.createElement("option");
							createOption.value=jsonArray[i].cityId;
							createOption.text=jsonArray[i].cityName;
							document.regForm.cityName.options.add(createOption);
						}
					}
					
				}	
				xmlhttp1.open("get","${pageContext.request.contextPath}/areaController?flag=loadCity&stateId="+stateId.value, true)
				xmlhttp1.send();
				/* jQuery(".chosen-select1").chosen({'width':'100%','white-space':'nowrap'}); */
				/* Holds the status of the XMLHttpRequest. Changes from 0 to 4:
					0: request not initialized
					1: server connection established
					2: request received
					3: processing request
					4: request finished and response is ready */
			}
		   
		   function removeAllCity() {
		  		var removeCity=document.regForm.cityName.options.length;
				for(i=removeCity ; i>0 ; i-- )
				{
					document.regForm.cityName.remove(i);
				}
			}
		   
		   function loadState() 
		   	{
				var countryId=document.getElementById("countryId");	
				var xmlhttp = new XMLHttpRequest();
				
				removeAllState();
				
				xmlhttp.onreadystatechange = function()
				{
					if (xmlhttp.readyState == 4) 
					{
						var jsonArray = JSON.parse(xmlhttp.responseText);
						//alert(JSON.stringify(jsonArray));
						for(var i=0; i<jsonArray.length ; i++)
						{
							var createOption=document.createElement("option");
							
							createOption.value=jsonArray[i].stateId;
							createOption.text=jsonArray[i].stateName;
							document.regForm.stateId.options.add(createOption);
						}
					}
				}
				
				xmlhttp.open("get","${pageContext.request.contextPath}/areaController?flag=loadState&countryId="+countryId.value, true)
				xmlhttp.send();
				/* jQuery(".chosen-select1").chosen({'width':'100%','white-space':'nowrap'}); */
				/* Holds the status of the XMLHttpRequest. Changes from 0 to 4:
					0: request not initialized
					1: server connection established
					2: request received
					3: processing request
					4: request finished and response is ready */
			}
		   
		   	function removeAllState() {
		   		var removeState=document.regForm.stateId.options.length;
				for(i=removeState ; i>0 ; i-- )
				{
					document.regForm.stateId.remove(i);
				}
			}
   </script>
</head>
<body>
<!-- START Main wrapper-->
   <div class="wrapper">
	<jsp:include page="Menu.jsp"></jsp:include>
	<div class="block-title">
					<div class="block-title__inner section-bg section-bg_second">
						<div class="bg-inner">
							<h1 class="ui-title-page">User Registration</h1>
						</div><!-- end bg-inner -->
					</div><!-- end block-title__inner -->
				</div><!-- end block-title -->
	<div class="container">
					<div class="row">
						<div class="col-md-9">			
	<section>
         <!-- START Page content-->
         <div class="main-content">
            <!-- START panel-->
            <div class="panel panel-default">
               <div class="panel-body">
                  <form method="post" name="regForm" action="<%=request.getContextPath()%>/regController" class="form-horizontal">
                  <br>
                    <fieldset>
	                    <div class="form-group">
	                    	<label class="col-sm-3 control-label">First Name <span class="text-danger">*</span></label>
	                    		<div class="col-sm-8">
	                      			<input type="text" name="firstName" class="form-control" placeholder="Enter your First name..." required />
	                    		</div> 
	                  	</div>
                    </fieldset>
                  
                    <fieldset>
                     	<div class="form-group">
                    		<label class="col-sm-3 control-label">Last Name <span class="text-danger">*</span></label>
                    			<div class="col-sm-8">
                      				<input type="text" name="lastName" class="form-control" placeholder="Enter your Last name..." required />
                    			</div> 
                  			</div>  
                    </fieldset>                    
                    <fieldset>
                     	<div class="form-group">
                    	<label class="col-sm-3 control-label">Email <span class="text-danger">*</span></label>
                    		<div class="col-sm-8">
                      			<input type="email" name="email" id="email" class="form-control" onchange="validation(),loadEmail()" placeholder="Email" />
                    			<label class="text-danger" id="emailid"></label>
                    			<%-- <c:forEach var="i" items="${sessionScope.emailList}">
                    				<input type="hidden" id="emailList" value="${i.email}">
                    			</c:forEach> --%>
                    		</div>
                  		</div>   
                    </fieldset>
                    	
                    <fieldset>
                     	<div class="form-group">
                    		<label class="col-sm-3 control-label">Password<span class="text-danger">*</span></label>
                    			<div class="col-sm-8">
                      				<input type="password"  name="password" id="pass" data-minlength="6" class="form-control" placeholder="Enter your Password..." required />
                    			</div> 
                  		</div>
                    </fieldset>
                    
                    <fieldset>
                     	<div class="form-group">
                    		<label class="col-sm-3 control-label">Confirm Password<span class="text-danger">*</span></label>
                    		<div class="col-sm-8">
                      			<input type="password" class="form-control" id="cpass" onchange="validation()"  placeholder="Confirm" required>
                      			<label class="text-danger" id="cpassLabel"></label>
                    		</div> 
                  		</div>
                    </fieldset> 
                    	
                    <fieldset>
                     	<div class="form-group">
                    		<label class="col-sm-3 control-label">Date Of Birth<span class="text-danger">*</span></label>
                    		<div class="col-sm-8">
                      			<input type="text" name="dob" class="form-control" placeholder="dd/mm/yyyy" pattern="\d{1,2}/\d{1,2}/\d{4}" required />
                    		</div> 
 								
 						</div>
                    </fieldset>
                            
                    <fieldset>
                    	<div class="form-group">
                    		<label class="col-sm-3 control-label">Gender<span class="text-danger">*</span></label>
							<span class="text-danger"></span>
							<div class="col-sm-8">
								<label class="rdiobox">
									<input id="gender" type="radio" required="" value="male" name="gender" aria-required="true">
									<span>Male</span>
								</label>
								<label class="rdiobox">
									<input id="gender" type="radio" value="female" name="gender">
									<span>Female</span>
								</label>
								<label class="error" for="platform"></label>
							</div>
						</div>
                    </fieldset>
                        <br><br>
                       
                   	<fieldset>
                        <div class="form-group-sm">
                        	<label class="col-sm-3 control-label">Select Country</label>
							<div class="col-sm-5">
                        		<select class="form-control" name="countryName" onchange="loadState()" id="countryId" required>
                        			<option value="">Select Country</option>
                        			<c:forEach items="${sessionScope.countryList }" var="i">
                        				<option class="default" value="${i.cid}">${i.countryname}</option>
                        			</c:forEach>
                       			</select>
                     		</div>
                      	</div>
                     </fieldset>
                     <br><br>
                     <fieldset>
                        <div class="form-group-sm">
                        	<label class="col-sm-3 control-label">Select State</label>
							<div class="col-sm-5">
                        		<select class="form-control m-b" name="stateId" onchange="loadCity()" id="stateId" required>
                        			<option value=""> Select State</option>
                        		</select>
                     		</div>
                      	</div>
                     </fieldset>
                     <br><br>
                     <fieldset>
                        <div class="form-group-sm">
                        	<label class="col-sm-3 control-label">Select City</label>
							<div class="col-sm-5">
                        		<select class="form-control m-b" name="cityName" id="cityName" required>
                        			<option value=""> Select City</option>
                        		</select>
                     		</div>
                      	</div>
                     </fieldset>
                    <br><br>
                    <fieldset>
                    	<div class="form-group">
                    		<label class="col-sm-3 control-label">Address<span class="text-danger">*</span></label>
                    		<div class="col-sm-8">
                      			<textarea rows="3" class="form-control" name="address" placeholder="Type your Address..." required></textarea>
                    		</div>
                  		</div> 
                    </fieldset>           
                    
                    <fieldset>
                    		<div class="form-group">
                    			<label class="col-sm-3 control-label">Contact number<span class="text-danger">*</span></label>
                    				<div class="col-sm-8">
                      					<input type="text" name="contactNumber" class="form-control" placeholder="contact number" required />
                    				</div> 
                  			</div> 
                    </fieldset>
                     
                     <fieldset>
                        <div class="form-group">
                           <div class="col-sm-6 col-sm-offset-3">
                              <input  type="submit" class="btn btn-primary" id="register" value="Register" disabled="disabled"/>
                              <input  type="hidden" name="flag" value="addUser"/> 
                              <input  type="reset" class="btn btn-default" value="Cancel"/>
                           </div>
                        </div>
                     </fieldset>
                     
                  </form>
               </div>
            </div>
            <!-- END panel-->
         </div>
         <!-- END Page content-->
      </section>
      </div>
      </div>
      </div>
      <!-- END Main section-->
       </div>
   <!-- END Main wrapper-->
</body>
</html>