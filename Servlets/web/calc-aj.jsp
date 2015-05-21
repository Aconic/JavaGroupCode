<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<jsp:useBean id='obj' class='appcalc.CalcServlet' scope='request'>--%>
<html>
<head>
    <title>Calculator (JSP)</title>
</head>
<body>

<div align="center">
    <label> Use '.' for decimal</label>
        <p>
            <input type="text" size="6" name="x" id="x">
            <select name="sign" id="sign">
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="*">*</option>
                <option value="/">/</option>
            </select>
            <input type="text" size="6" name="y" id="y">
            <input type="submit" value="calc" onclick="actionSend()">
        </p>
</div>

<div align="center" id="res">
</div>


<script>
    var xmlhttp=null;

    function actionSend() {
        var x = document.getElementById('x').value;
        var y = document.getElementById('y').value;
        var sign = document.getElementById('sign').value;
       if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
            xmlhttp = new XMLHttpRequest();
        }
        else {// code for IE6, IE5
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        var values = "?x="+x+ "&y="+ y + "&sign="+ sign;
        alert(values);
        xmlhttp.onreadystatechange = respond;
        xmlhttp.open("POST", "http://localhost:8080/cs", true);
        xmlhttp.setRequestHeader("Content-type", "text/html");
        xmlhttp.send(values);
    }

    function respond() {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            document.getElementById('res').innerHTML = xmlhttp.responseText;
        }
    }
</script>
</body>
</html>



