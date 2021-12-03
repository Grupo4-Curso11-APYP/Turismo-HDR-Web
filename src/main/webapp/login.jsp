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
        <form class="row g-3 needs-validation" novalidate  action="dashboard.jsp">
          <div class="mb-4">
            <label for="Email" class="form-labe">Email</label>
            <input type="email" class="form-control" id="email" aria-describedby="emailhelp" required>
            <div id="emailhelp" class="form-text">ingrese su correo</div>
          </div>

          <div class="mb-4">
            <label for="password" class="form-labe">Contraseña</label>
            <input type="password" class="form-control" id="password" aria-describedby="passwordhelp" required>
            <div id="passwordhelp" class="form-text">ingrese su Contraseña</div>
          </div>
          <div class="mb-4 form-check">
            <input type="checkbox" class="form-check-input " id="recordar">
            <label for=" recordar" class="form-check-label ">Recordar usuraio </label>
          </div>
          <button type="submit" class="btn btn-primary w-100 mb-2">Ingresar</button>
        </form>
        <p class="mb-0 text-center " style="font-size: 14px;" >Aun no te Registraste? <a href="registro.jsp">Ingresa Ahora!</a></p>
      </div>
    </div>

  </div>



</body>

</html>