<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Calculator</h1>
 <!--<select name="city" onchange="document.getElementById('locale').submit()">
        <option value="Asia/Ho_Chi_Minh" selected>Select a city</option>-->
<div>
    <form action="/calculator" id="calculator" method="get">
        <input type="number" name="number_A">
        <input type="number" name="number_B">

        <select name="operation" onchange="document.getElementById('calculator').submit()">
            <option selected>Select operation</option>
            <option value="add">Add</option>
            <option value="subtract">Subtract</option>
            <option value="multiply">Multiply</option>
            <option value="divide">Divide</option>
        </select>
    </form>
</div>

<br>
<p>The result is: <span>${result}</span> </p>
</body>
</html>