<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="addEmploye">
  <label for="empId">empId:</label><br>
  <input type="text" id="empId" name="empId"><br>
  <label for="name">name:</label><br>
  <input type="text" id="name" name="name"><br>
  <label for="department">department:</label><br>
  <input type="text" id="department" name="department"><br>
  <input type="submit"><br>
</form>

<form action="getEmploye">
  <label for="empId">empId:</label><br>
  <input type="text" id="empId" name="empId"><br>  
  <input type="submit"><br>
</form>

</body>
</html>