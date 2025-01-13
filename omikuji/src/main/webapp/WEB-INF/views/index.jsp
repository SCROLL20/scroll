<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <title>Omikuji Form</title>
</head>
<body>
	<h1>Welcome to Omikuji!</h1>
	   <a href="/omikuji/show">Show Omikuji</a>
    <h1>Omikuji Fortune Teller</h1>
    <form action="/submitForm" method="post">
        <label>Number of years:</label>
        <input type="number" name="number" required><br>
        
        <label>City:</label>
        <input type="text" name="city" required><br>
        
        <label>Roommate's Name:</label>
        <input type="text" name="person" required><br>
        
        <label>Favorite Hobby:</label>
        <input type="text" name="hobby" required><br>
        
        <label>Living Thing:</label>
        <input type="text" name="livingThing" required><br>
        
        <label>Message:</label>
        <input type="text" name="message" required><br>
        
        <button type="submit">Submit</button>
    </form>
</body>
</html>

