<%--
  Created by IntelliJ IDEA.
  User: liuyiyou
  Date: 14-7-15
  Time: 下午9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="<%=request.getContextPath()%>" /><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta
    http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>spring validator验证</title>
    <p>在Spring mvc中，有三种不同的方式执行验证，使用annotation(基于注解),manually（手工编写）或者两者混合，
    <h3>第二种：基于注解</h3>
    <ul>
        <li>实体实现validator接口</li>
        <li>在控制器中调用该接口</li>
    </ul>
    <a href="<c:url value="/validator/validator2"/>">基于spring validator </a>
</head>
<body>
</body>
</html>