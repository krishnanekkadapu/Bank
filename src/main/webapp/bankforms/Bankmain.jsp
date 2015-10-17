<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3 align="center">Banking System</h3> <br>
<s:url action="create" id="create" namespace="/bankforms"></s:url>
<s:a href="%{create}">Create Account</s:a> <br>
<s:a href="transaction.jsp">Transcation</s:a> <br>
<s:a href="display.jsp">Display bank statement</s:a> <br>
<s:a href="authorize.jsp">Authorize credit card </s:a> <br>
</body>
</html>