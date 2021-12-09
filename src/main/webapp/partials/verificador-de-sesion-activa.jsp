<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Inicio proteccion anti usuarios sin sesion activa -->
<%
if (session.getAttribute("usuario") == null) {
%>
<jsp:forward page="login.jsp" />
<%
}
%>
<!-- Fin proteccion anti usuarios sin sesion activa -->