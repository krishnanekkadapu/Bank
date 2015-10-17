<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Perform Debit or Credit Operation</h3>
<s:textfield name="accountno" label="Account number"></s:textfield>
<s:textfield name="amount" label="Amount"></s:textfield>
<s:submit value="debit" action="debit"></s:submit>
<s:submit value="credit" action="credit"></s:submit>
</body>
</html>