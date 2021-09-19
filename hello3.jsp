<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<p>hello</p>
<p>今の時刻です。</p>

<p><% out.println(new java.util.Date()); %></p>

<%@include file="../footer.html" %>