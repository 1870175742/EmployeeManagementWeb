<%@page import="com.wwwxy.employeemanagement.dao.SalaryDao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Integer id = Integer.parseInt(request.getParameter("id")); 
		SalaryDao ld = new SalaryDao();
		int row = ld.delete(id);
		if(row==1){
			out.print("执行成功！");
			//执行成功，重定向更新3秒回“deletelogin.jsp”
			response.setHeader("refresh", "3;URL=deletesalary.jsp");
		}else{
			out.print("执行失败！");
			//执行失败，重定向更新3秒回“deletelogin.jsp”
			response.setHeader("refresh", "3;URL=deletesalary.jsp");
		}
	%>
</body>
</html>