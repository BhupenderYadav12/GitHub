<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@include file="Header.jsp" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Laptop market</title>
</head>
<body>

	<div class="container">
			<div class="row main">
				<div class="panel-heading">
	               <div class="panel-title text-center">
	               		<h1 class="title"></h1>
	               		<hr />
	               	</div>
	            </div> 
				<div class="main-login main-center">
			<spring:form class="form-horizontal" method="post" action="addCustomer" modelAttribute="customer">
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Your Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"></i></span>
							<spring:input type="text" class="form-control" path="userName" id="customerName"  placeholder="Enter your Name"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Your Email</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa"></i></span>
									<spring:input type="text" class="form-control" path="emailId" id="emailId"  placeholder="Enter your Email"/>
								</div>
							</div>
						</div>

						

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg"></i></span>
									<spring:input type="password" class="form-control" path="password" id="password"  placeholder="Enter your Password"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">contactNo</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg"></i></span>
									<spring:input type="contactNo" class="form-control" path="mobileNo" id="contactNo"  placeholder="contactNo"/>
								</div>
							</div>
						</div>
							<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">Date of Birth</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg"></i></span>
									<spring:input type="contactNo" class="form-control" path="dob" id="dob"  placeholder="dob"/>
								</div>
							</div>
						</div>
							<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">Address</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg"></i></span>
									<spring:input type="contactNo" class="form-control" path="address" id="address"  placeholder="address"/>
								</div>
							</div>
						</div>

						
							<button type="submit" class="btn btn-primary">Register</button>
						

					</spring:form>
				</div>
			</div>
		</div>

		
	</body>
</html>

