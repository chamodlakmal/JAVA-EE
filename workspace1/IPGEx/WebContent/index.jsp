<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="https://sandbox.payhere.lk/pay/checkout">
		<input type="hidden" name="merchant_id" value="1211598">
		<input type="hidden" name="return_url" value="http://localhost:8080/IPGEx/response.jsp">
		<input type="hidden" name="cancel_url" value="http://localhost:8080/IPGEx/cancel.jsp">
		<input type="hidden" name="notify_url" value="http://localhost:8080/IPGEx/notify.jsp">
		<br><br>Item Details<br>
		<input type="text" name="order_id" value="1234">
		<input type="text" name="items" value="Door bell wireless"><br>
		<input type="text" name="currency" value="LKR">
		<input type="text" name="amount" value="1000">
		<br><br>Customer Details<br>
		<input type="text" name="first_name" value="Saman">
		<input type="text" name="last_name" value="Perera"><br>
		<input type="text" name="email" value="saman@gmail.com">
		<input type="text" name="phone" value="0771234567"><br>
		<input type="text" name="address" value="No.1 ,galle Road">
		<input type="text" name="city" value="Colombo">
		<input type="hidden" name="country" value="Sri Lanka"><br><br>
		<input type="submit" name="submit" value="Buy Now">
	</form>

</body>
</html>