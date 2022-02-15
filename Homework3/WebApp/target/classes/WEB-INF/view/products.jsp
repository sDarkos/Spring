<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>

<body>
<h1>Welcome page</h1>

<ul>
    <c:forEach var="item" items="${products}">
        <li>ID: ${item.id}, Title: ${item.title}, Cost: ${item.cost}</li>
    </c:forEach>
</ul>

</body>
</html>