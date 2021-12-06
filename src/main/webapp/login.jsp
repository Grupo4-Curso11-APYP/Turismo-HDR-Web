<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
 <jsp:include page="partials/head.jsp"></jsp:include>
</head>

<body class="bg-light">

  <div class="container  ">
    <div class="row vh-100 align-items-center justify-content-center">
      <div class="col-sm-8 pt-1 col-md-6 col-lg-4 bg-white p4 shadow rounded-1">
        <div class="row justify-content-center mb-4">
         <a href="index.jsp" class="ps-3 ms-5"> <img src="assets/img/logo_small.png" alt="logo" 
          class="d-inline-flex pt-1 pb-2 w-75" ></a>
        </div>

<c:if test="${flash != null}">
				<div class="alert alert-danger">
					<p>
						<c:out value="${flash}" />
					</p>
				</div>
			</c:if>
			
        <form class="row g-3 needs-validation" novalidate  action="login" method="post"><!-- antes mandaba al propio login.jsp -->
          <div class="mb-4">
            <label for="nombre" class="form-label">Nombre</label>
            <input name="nombre" class="form-control" id="nombre" aria-describedby="nombrehelp" required>
            <div id="nombrehelp" class="form-text">Por favor, ingrese su nombre de usuario</div>
          </div>

          <div class="mb-4">
            <label for="password" class="form-label">Contraseña</label>
            <input type="password" name="password" class="form-control" id="password" aria-describedby="passwordhelp" required>
            <div id="passwordhelp" class="form-text">Por favor, ingrese su contraseña</div>
          </div>
          <div class="mb-4 form-check">
            <input type="checkbox" class="form-check-input " id="recordar">
            <label for=" recordar" class="form-check-label ">Recordar usuario </label>
          </div>
          <button type="submit" class="btn btn-primary w-100 mb-2">Ingresar</button>
        </form>
      </div>
    </div>

  </div>



</body>

</html>