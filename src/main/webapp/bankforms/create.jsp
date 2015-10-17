<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
function created() {
	var x = document.getElementsByName(typeofacc);
	window.alert(x+ "account created successfully");
}
</script>
</head>
<body>
<s:form action="createaccount" onsubmit="created()">
 <s:textfield name="name" label="Name"></s:textfield>
 <s:textfield name="dob"   format="dd/MM/yyyy" label="DOB"></s:textfield>
 <s:textarea name="address" label="Address"></s:textarea>
 <s:textfield name="email" label="Email"></s:textfield>
 <s:select list="%{#application.listvalues}" name="typeofacc" label="Type of account"> </s:select>
 <s:textfield name="accnumber" label="Account no"></s:textfield>
 <s:submit value="Create Account"></s:submit>
</s:form>
</body>
</html>