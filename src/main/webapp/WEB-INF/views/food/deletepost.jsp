<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.mycom.myapp.food.FoodDAO,com.mycom.myapp.food.FoodVO"%>
<%
	String sid = request.getParameter("id");
	if (sid != ""){  
		int id = Integer.parseInt(sid);
		FoodVO u = new FoodVO();
		u.setSeq(id);
		FoodDAO foodDAO = new FoodDAO();
		foodDAO.deleteFood('u');
	}
	response.sendRedirect("list");

%>