<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
asdasd
${student.firstName}
${student.lastName}
${student.country}

${student.favourateLanguage}

Operating System:
<ul>
<c:forEach var="os" items="${student.os}" >
${os}
</c:forEach>
</ul>
${student.freePasses}

${student.postalCode}
</body>
</html>