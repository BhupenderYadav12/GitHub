<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@include file="Header.jsp" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body background="D:/project/LaptopFrontend/src/main/webapp/resources/images/macbook-default-image-201604.jpg">
<div class="container">
<h1 align="center">Add Category</h1><hr>
<spring:form action="${pageContext.request.contextPath}/addCategory" modelAttribute="cat" method="POST">
<div>
<c:if test="${not empty cat.categoryName}">

CategoryId<spring:input type="text" path="categoryId" readonly="true" disabled="true"/>
<spring:hidden path="categoryId"/>
</c:if>
</div>
<div class="form-group">
<label for="cateoryName">Category name</label>
<spring:input type="text" class="form-control" id="cName" path="categoryName"/>
</div>
<div class="form-group">
<label for ="categoryDescription">Category Description</label>
<spring:input type="text" class="form-control" id="cdesc" path="categoryDescription"/><br>
</div>

<c:if test="${empty cat.categoryName}"><input type="submit" value="add"/></c:if>
<c:if test="${not empty cat.categoryName}"><input type="submit" value="update"/></c:if>
<input type="submit" value="submit"/>
</spring:form>
</div>


<c:if test="${not empty categoryList}">

<table border="1">
<tr><td>categoryId</td>
<td>categoryName</td>
<td>categoryDescription</td>
<td>edit</td>
<td>delete</td>
</tr>
<c:forEach items="${categoryList}" var="cate">
<tr>
<td>${cate.categoryId}</td>
<td>${cate.categoryName}</td>
<td>${cate.categoryDescription}</td>

<td><a href="editCategory/${cate.categoryId }">Edit</a></td>

<td><a href="deleteCategory/${cate.categoryId }">Delete</a></td>
</tr>


</c:forEach>
</table>

</c:if>


</body>
</html>