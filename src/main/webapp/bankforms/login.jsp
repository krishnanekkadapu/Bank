<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:aqua;">

<div align="center" style="margin-top:150px">

<s:form action="logincheck">
<s:actionmessage/>
<s:textfield name="username" label="username"></s:textfield> 
<s:password name="password" label="password"></s:password>
<s:submit name="submit" value="submit"></s:submit>
</s:form>
</div>


</body>
</html>