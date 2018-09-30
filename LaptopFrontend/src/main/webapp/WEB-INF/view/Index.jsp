<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     
<%@include file="Header.jsp" %>
<%@include file="Carousel.jsp" %>
  <style>
  
    body {
     background: url('resources/images/apple5.jpg') fixed;
    background-size: cover;}
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }

  </style>
	

<br><br>

<div class="container">    
  <div class="row">
    <div class="col-sm-4" height="70pt">
      <div class="panel panel-primary">
        <div class="panel-heading">hp</div>
        <div class="panel-body"><img src="resources/images/hp1.png" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">click to buy</div>
      </div>
    </div>
    <div class="col-sm-4" height="70pt"> 
      <div class="panel panel-danger">
        <div class="panel-heading">Samsung</div>
        <div class="panel-body"><img src="resources/images/samsung1.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">click to buy</div>
      </div>
    </div>
    <div class="col-sm-4" height="70pt"> 
      <div class="panel panel-success">
        <div class="panel-heading">Apple</div>
        <div class="panel-body"><img src="resources/images/apple4.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">click to buy</div>
      </div>
    </div>
  </div>
</div><br>

<div class="container">    
  <div class="row">
    <div class="col-sm-6">
      <div class="panel panel-primary">
       <div class="panel-heading">20 percent off on all deals</div>
        <div class="panel-body"><img src="resources/images/apple2.jpg" class="img-responsive" style="width:100%" "height:90pt" alt="Image"></div>
        <div class="panel-footer">click to buy</div>
      </div>
    </div>
    <div class="col-sm-6"> 
      <div class="panel panel-primary">
        <div class="panel-heading">BLACK Friday deal </div>
        <div class="panel-body"><img src="resources/images/samsung2.jpg" class="img-responsive" style="width:100%" "height:80pt" alt="Image"></div>
        <div class="panel-footer">click to buy</div>
      </div>
    </div>
    <div class="col-sm-3"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Gaming Laptop</div>
        <div class="panel-body"><img src="resources/images/both1.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">click to buy</div>
      </div>
          </div>
          <div class="col-sm-3"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Budget Laptop</div>
        <div class="panel-body"><img src="resources/images/retinamacbookpro.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">click to buy</div>
      </div>
          </div>
          <div class="col-sm-3"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Mini Laptop</div>
        <div class="panel-body"><img src="resources/images/hp3.png" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">click to buy</div>
      </div>
          </div>
          <div class="col-sm-3"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Premium Laptops</div>
        <div class="panel-body"><img src="resources/images/hp2.png" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">click to buy</div>
      </div>
          </div>
  </div>
</div>
<br><br>
<footer class="container-fluid text-center">
  <p>Online Store Copyright</p>  
  <form class="form-inline">Get deals:
    <input type="email" class="form-control" size="50" placeholder="Email Address">
    <button type="button" class="btn btn-danger">Sign Up</button>
  </form>
</footer>

</body>
</html>