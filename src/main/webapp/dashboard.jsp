<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<jsp:include page="partials/headDashboard.jsp"></jsp:include>
</head>

<body id="page-top">
	<!-- sin sesion no hay panel para el usuario kakersillo -->
	<%
	if (session.getAttribute("usuario") == null) {
	%>
	<jsp:forward page="login.jsp" />
	<%
	}
	%>
	<!-- ENVOLTURA -->
	<div id="wrapper">

		<!-- Sidebar -->
		<ul class="navbar-nav bg-white sidebar sidebar-light accordion"
			id="accordionSidebar">

			<!-- Sidebar - Brand -->
			<a
				class="sidebar-brand d-flex align-items-center justify-content-center"
				href="index.jsp">
				<div class="sidebar-brand-icon ">
					<img src="assets/img/logo_small_icon_only.png" alt="" width="60px">

				</div>

			</a>

			<!-- Divider -->
			<hr class="sidebar-divider my-0">

			<!--ITEM Dashboard -->
			<li class="nav-item active"><a class="nav-link" href="index.jsp">
					<i class="fas fa-fw fa-tachometer-alt"></i> <span>Dashboard</span>
			</a></li>

			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- SIDEBAR HEADING MENU ADMIN  -->
			<div class="sidebar-heading"> 
			  <a href="#" style="text-decoration: none;">Crud</a> 
           

            <!-- ITEMS DEL MENU COLAPSE-->
           
                          <!---Insertar Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseInsertar"
                    aria-expanded="true" aria-controls="collapseTwo">Insertar</a>
                <div id="collapseInsertar" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                    <!-- EN CADA HREF IRIA CADA SERVLET EN DIRECCION A VISTA CORRESPONDIENTE -->
                        <a class="collapse-item" href="insertar-atraccion.jsp">Atraccion</a>
                        <a class="collapse-item" href="insertar-promocion.jsp">Promocion</a>
                        <a class="collapse-item" href="insertar-usuario.jsp">Usuario</a>
                         <a class="collapse-item" href="insertar-tipoAtraccion.jsp">Tipo Atraccion</a>
                    </div>
                </div>
            </li>
            <!---Fin insertar Menu-->

            <!---Actualizar Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseActualizar"
                    aria-expanded="true" aria-controls="collapseTwo">Actualizar</a>
                <div id="collapseActualizar" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <a class="collapse-item" href="actualizar-atraccion.jsp">Atraccion</a>
                        <a class="collapse-item" href="actualizar-promo.jsp">Promocion</a>
                        <a class="collapse-item" href="actualizar-usuario.jsp">Usuario</a>
                         <a class="collapse-item" href="actualizar-tipo.jsp">Tipo Atraccion</a>
                    </div>
                </div>
            </li>
            <!---Fin Actualizar Menu-->

            <!---Listar  Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseListar"
                    aria-expanded="true" aria-controls="collapseTwo">Listar</a>
                <div id="collapseListar" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <a class="collapse-item" href="listar-usuario.jsp">Usuario</a>
                    </div>
                </div>
            </li>
            <!---Fin Listar Menu-->

             <!-- -BORRAR MENU -->
             <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseBorrar"
                    aria-expanded="true" aria-controls="collapseTwo">Borrar</a>
                <div id="collapseBorrar" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <a class="collapse-item" href="borrar-atraccion.jsp">Atraccion</a>
                        <a class="collapse-item" href="borrar-promo.jsp">Promocion</a>
                        <a class="collapse-item" href="borrar-usuario.jsp">Usuario</a>
                        <a class="collapse-item" href="borrar-tipo.jsp">Tipo Atraccion</a>
                    </div>
                </div>
            </li>
            <!-- BORRAR MENU -->
            <!-- BORRAR MENU -->
			
</div>
			<!-- ITEM  Collapse Menu PERFILES -->

		  <div class="sidebar-heading">
             


              <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseOpciones"
                    aria-expanded="true" aria-controls="collapseTwo">Otras Opciones</a>
                <div id="collapseOpciones" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <a class="collapse-item" href="listar-atraccion.jsp">Atraccion</a>
                        <a class="collapse-item" href="listar-promo.jsp">Promocion</a>
                        <a class="collapse-item" href="listar-itinerario.jsp">Itinerario</a>
                        
                    </div>
                </div>
            </li>
            <!---Fin insertar Menu-->

         

          
         
            </div>


			<!-- Divider -->
			<hr class="sidebar-divider">







			<!-- SIDEBAR TOGGLE -->
			<div class="text-center d-none d-md-inline">
				<button class="rounded-circle border-0" id="sidebarToggle"></button>
			</div>
		</ul>
		<!-- FIN  Sidebar -->

		<!-- CONTENIDO ENVUELTO-->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- CONTENIDO DEL MENU-->
			<div id="content">

				<!-- BARRA DE ARRIBA  -->
				<nav
					class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">


					<button id="sidebarToggleTop"
						class="btn btn-link d-md-none rounded-circle mr-3">
						<i class="fa fa-bars"></i>
					</button>


					<div
						class="d-none d-sm-inline-block form-inline text-black-50      ">
						<div>
							<h2 class="me-2">Turismo en Tierra Media</h2>
						</div>
					</div>


					<!-- Topbar Navbar -->
					<ul class="navbar-nav ml-auto">
						<div class="topbar-divider d-none d-sm-block"></div>
						<li class="nav-item dropdown no-arrow"><a
							class="nav-link dropdown-toggle" href="#" id="userDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <span
								class="mr-2 d-none d-lg-inline text-gray-600 small"><c:out
										value="${usuario.nombre}"></c:out></span> <img
								class="img-profile rounded-circle"
								src="assets/img/undraw_profile.svg">
						</a>

							<div
								class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="userDropdown">
								<a class="dropdown-item disabled" style="color: black;"><i
									title="monedas" style="color: gold;" class="me-2 fas fa-coins"></i>Presupuesto:
									<c:out value="${usuario.presupuesto}"></c:out> </a> <a
									class="dropdown-item disabled" style="color: black;"> <i
									title="tiempo" style="color: blue;"
									class="me-2 fas fa-stopwatch"></i>Tiempo: <c:out
										value="${usuario.tiempoDisponible}h"></c:out>
								</a> <a class="dropdown-item disabled" style="color: black;"> <i
									title="preferencia" style="color: red;"
									class="me-2 fab fa-gratipay"></i>Preferencia: <c:out
										value="${usuario.tipoFavorito}"></c:out>
								</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="/turismoHDR/logout"
									data-toggle="modal" data-target="#logoutModal"> <i
									class="fas fa-sign-out-alt fa-sm fa-fw mr-2 "
									style="color: black;"></i> Salir
								</a>
							</div></li>

					</ul>

				</nav>
				<!-- FIN BARRA DE ARRIBA -->

				<!-- INICIO DEL CONTENIDO ,LA COMIDA VA AQUI-->
				<div class="container-fluid">

					<!-- HEADER DE PAGINA-->
					<div
						class="d-sm-flex align-items-center justify-content-between mb-4">
						<h1 class="h3 mb-0 text-gray-800">Dashboard</h1>

					</div>
					<!-- HAEDER FIN  -->

					<!-- ----------------------------------CRUD-------------------------------------------------- -->
				
					<!-- -------------------------------FIN CRUD----------------------------------------------------------- -->



					

				</div>
			</div>

		</div>
		<!-- FIN CONTEINER -->

	</div>
	<!-- FIN MENU CONTENIDO -->

	<!-- FOOTER -->
	<footer class="sticky-footer bg-white ">
		<div class="container mb-4">
			<div class="copyright text-center my-auto">
				<span>Copyright &copy;Turismo En Tierra Media 2021</span>
			</div>
		</div>
	</footer>
	<!-- FIN FOOTER -->

	<!-- FIN CONTENIDO ENVUELTO-->

	<!-- FIN ENVOLTURA-->

	<!--SCROLL-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>
	<!-- FIN SCROLL -->

	<!-- MODAL SALIDA-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">ï¿½Preparado
						para Salir?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">x</span>
					</button>
				</div>
				<div class="modal-body">Seleccione "Cerrar sesion" a
					continuacion si esta listo para finalizar su sesion actual.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancelar</button>
					<a class="btn btn-primary" href="login.jsp">Cerrar sesion</a>
				</div>
			</div>
		</div>
	</div>
	<!-- FIN MODAL SALIDA -->



</body>

</html>
