<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Calculator (JSP)</title>
</head>
<body>


<form id="calculator" action="cc" method="get">
    <p>
        <input type="text" name="x">
        <input type="text" name="sign">
        <input type="text" name="y">
        <input type="submit" value="calc">
    </p>
    <p>Result: <span id="result">${result}</span></p>
</form>


</body>
</html>



