<%@ page import="ru.store.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Books</title>
  </head>
  <body>

    <ul>
      <c:forEach items="${bookList}" var="book">
         <li>Id: ${book.id}, Name: ${book.name}</li>
      </c:forEach>
    </ul>

  </body>
</html>
