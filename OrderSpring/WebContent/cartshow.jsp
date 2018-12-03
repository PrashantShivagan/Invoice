<%@page import="org.hibernate.jpa.criteria.expression.function.AggregationFunction.SUM"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix = "b" uri = "http://www.springframework.org/tags/form" %>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:form action = "removeItem" method = "post" modelAttribute="rem">
<table border="2">
<tr>
	<td>
	Product Id

	</td>
	
	<td>
	Product Name
	</td>
	
	<td>
	Product Price
	</td>
	
	<td>
		Quantity	
	</td>
	
	<td>
	Modify
	</td>
	
</tr>

<a:forEach var="product" items="${data}" varStatus="status">
<tr>

<td><a:out value="${product.product_id}"/></td>
<td><a:out value="${product.product_name}"/>	</td>
<td><a:out value="${product.product_price}"/>	</td>
<td><select name=quantity>
	<option value=1>1</option>
	<option value=2>2</option>
	<option value=3>3</option>
	<option value=4>4</option>
	<option value=5>5</option>
	</select>
</td>
<td>

<a href ="<a:url value='/removeItem/${data[status.index].product_id}' />">Remove</a></td>
</tr>

</a:forEach>

<tr>
<td><input type="submit" value="Confirm Order"></td>
</tr>


</table>
</c:form>
<b:form action = "orderpage" method = "post" modelAttribute="order">
</b:form>
</body>
</html>