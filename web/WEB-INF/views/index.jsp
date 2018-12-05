<%--
  Created by IntelliJ IDEA.
  User: hongngoc
  Date: 12/5/18
  Time: 9:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Convert Currency</title>
  </head>
  <body>
  <h1>Convert Currency</h1>
  <form method="post" action="convert">
    RATE: <input type="text" name="rate" id="rate"/><br>
    USD: <input type="text" name="usd" id="usd"/><br>

    <button type="submit">Convert</button>
  </form>

  <h3>VND: ${vnd}</h3>

  </body>
</html>
