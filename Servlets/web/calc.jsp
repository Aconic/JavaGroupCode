<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<jsp:useBean id='obj' class='appcalc.CalcServlet' scope='request'>--%>
<html>
<head>
    <title>Calculator (JSP)</title>
</head>
<body>

<div align="center">
    <label> Use '.' for decimal</label>
    <form action="cs" method="post" style="background-color: palegreen">
        <p>
            <input type="text" size="6" name="x">
            <select name="sign">
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="*">*</option>
                <option value="/">/</option>
            </select>
            <input type="text" size="6" name="y">
            <input type="submit" value="calc">
        </p>
    </form>
</div>

<div align="center">
    <p><b>Result: <span id="res"><%= request.getAttribute("result")%></span></b></p>

</div>

</body>
</html>



