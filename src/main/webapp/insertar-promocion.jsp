<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Turismo En Tierra Media || Dashboard</title>

<!---FONTS-->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
	integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />

<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">
<!---FIN FONTS-->


<!---DASHBOARD ESTILOS Y SCRRIPTS-->

<link href="assets/stylesheets/dashboard-2.css" rel="stylesheet">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous" defer></script>

<script defer src="scripts/validacion-contacto.js"></script>
<script defer
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"
	integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script defer
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/4.6.1/js/bootstrap.bundle.min.js"
	integrity="sha512-mULnawDVcCnsk9a4aG1QLZZ6rcce/jSzEGqUkeOLy0b6q0+T6syHrxlsAGH7ZVoqC93Pd0lBqd6WguPWih7VHA=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>


<script defer
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"
	integrity="sha512-0QbL0ph8Tc8g5bLhfVzSqxe9GERORsKhIn1IrpxDAgUsbBGz/V7iSav2zzW325XGd1OMLdL4UiqRJj702IeqnQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>


<script defer src="scripts/dashboard-2-min.js"></script>



<script src="scripts/jQuery3.6.0.js" defer></script>
<!----FIN DASHBOARD ESTILOS Y SCRIPTS-->

<!---DATATABLES CDN-->
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.11.3/css/dataTables.bootstrap5.min.css">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/v/bs5/dt-1.11.3/datatables.min.css" />


<script defer src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script defer type="text/javascript"
	src="https://cdn.datatables.net/v/bs5/dt-1.11.3/datatables.min.js"></script>
<script defer src="scripts/tablas.js"></script>
<script defer
	src="https://cdn.datatables.net/1.11.3/js/dataTables.bootstrap5.min.js"></script>
<script defer
	src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>


<!---FIN CDN DATATABLES-->






</head>

<body id="page-top">
	<!-- sin sesion no hay panel para el usuario kakersillo -->

	
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

			<div class="sidebar-heading">

				<!---OPCIONES-->
				<a href="" style="text-decoration: none;">Crud</a>


				<!-- ITEMS DEL MENU COLAPSE-->

				<!---Insertar Menu -->
				<li class="nav-item"><a class="nav-link collapsed" href="#"
					data-toggle="collapse" data-target="#collapseInsertar"
					aria-expanded="true" aria-controls="collapseTwo">Insertar</a>
					<div id="collapseInsertar" class="collapse"
						aria-labelledby="headingTwo" data-parent="#accordionSidebar">
						<div class="bg-white py-2 collapse-inner rounded">
							<a class="collapse-item " href="#">Atraccion</a> <a
								class="collapse-item active" href="#">Promocion</a> <a
								class="collapse-item " href="#">Usuario</a> <a
								class="collapse-item" href="#">Tipo Atraccion</a>
						</div>
					</div></li>
				<!---Fin insertar Menu-->

				<!---Listar Menu -->
				<li class="nav-item"><a class="nav-link collapsed" href="#"
					data-toggle="collapse" data-target="#collapseActualizar"
					aria-expanded="true" aria-controls="collapseTwo">Actualizar</a>
					<div id="collapseActualizar" class="collapse"
						aria-labelledby="headingTwo" data-parent="#accordionSidebar">
						<div class="bg-white py-2 collapse-inner rounded">
							<a class="collapse-item" href="#">Atraccion</a> <a
								class="collapse-item" href="#">Promocion</a> <a
								class="collapse-item" href="#">Usuario</a> <a
								class="collapse-item" href="#">Tipo Atraccion</a>
						</div>
					</div></li>
				<!---Fin Listar Menu-->

				<!---Actualizar  Menu -->
				<li class="nav-item"><a class="nav-link collapsed" href="#"
					data-toggle="collapse" data-target="#collapseListar"
					aria-expanded="true" aria-controls="collapseTwo">Listar</a>
					<div id="collapseListar" class="collapse"
						aria-labelledby="headingTwo" data-parent="#accordionSidebar">
						<div class="bg-white py-2 collapse-inner rounded">

							<a class="collapse-item" href="#">Usuario</a>

						</div>
					</div></li>
				<!---Fin Actualizar Menu-->

				<!-- -BORRAR MENU -->
				<li class="nav-item"><a class="nav-link collapsed" href="#"
					data-toggle="collapse" data-target="#collapseBorrar"
					aria-expanded="true" aria-controls="collapseTwo">Borrar</a>
					<div id="collapseBorrar" class="collapse"
						aria-labelledby="headingTwo" data-parent="#accordionSidebar">
						<div class="bg-white py-2 collapse-inner rounded">
							<a class="collapse-item" href="#">Atraccion</a> <a
								class="collapse-item" href="#">Promocion</a> <a
								class="collapse-item" href="#">Usuario</a> <a
								class="collapse-item" href="#">Tipo Atraccion</a>
						</div>
					</div></li>
				<!-- BORRAR MENU -->

			</div>

			<!-- ITEM  Collapse Menu PERFILES -->
			<div class="sidebar-heading">



				<li class="nav-item"><a class="nav-link collapsed" href="#"
					data-toggle="collapse" data-target="#collapseOpciones"
					aria-expanded="true" aria-controls="collapseTwo">Otras Opciones</a>
					<div id="collapseOpciones" class="collapse"
						aria-labelledby="headingTwo" data-parent="#accordionSidebar">
						<div class="bg-white py-2 collapse-inner rounded">
							<a class="collapse-item" href="#">Atraccion</a> <a
								class="collapse-item" href="#">Promocion</a> <a
								class="collapse-item" href="#">Itinerario</a> <a
								class="collapse-item" href="#">Historial</a>
						</div>
					</div></li>
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
								class="mr-2 d-none d-lg-inline text-gray-600 small"> <c:out
										value="${usuario.nombre}"></c:out>
							</span> <img class="img-profile rounded-circle"
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


					    <!-- PROMOCIONES ALTA -->
                    <div class="col-xl-5 col-lg-6 bg-dark ms-5 mb-3 rounded-2">

                        <h2 class="fw-bolder mt-3 text-white ">Ingresar Una Nueva
                            Promocion</h2>

                        <form id="form-contact" class="row text-white g-2 needs-validation mb-3 " novalidate>
                            <div class="col-md-4">
                                <label for="validationCustom01" class="form-label">ID-Atraccion1</label>
                                <input type="number" class="form-control" id="validationCustom01" required>
                                <div class="valid-feedback">¡Se ve bien!</div>
                            </div>
                            <div class="col-md-4">
                                <label for="validationCustom01" class="form-label">ID-Atraccion2</label>
                                <input type="text" class="form-control" id="validationCustom01" required>
                                <div class="valid-feedback">¡Se ve bien!</div>
                            </div>
                            <div class="col-md-4">
                                <label for="validationCustom01" class="form-label">Nombre</label>
                                <input type="text" class="form-control" id="validationCustom01" required>
                                <div class="valid-feedback">¡Se ve bien!</div>
                            </div>
                            <div class="col-md-4">
                                <label for="validationCustom02" class="form-label">Tipo</label>
                                <input type="number" class="form-control" id="validationCustom02" required>
                                <div class="valid-feedback">Por favor , Ingrese un costo
                                    valido</div>
                            </div>
                            <div class="col-md-4">
                                <label for="validationCustom02" class="form-label">Monto</label>
                                <input type="number" class="form-control" id="validationCustom02">
                                <div class="invalid-feedback">Por favor, Ingrese un
                                    tiempo valido.</div>
                            </div>
                            <div class="col-md-4">
                                <label for="validationCustom02" class="form-label">Descuento</label>
                                <input type="number" class="form-control" id="validationCustom02">
                                <div class="invalid-feedback">Por favor, Ingrese un
                                    tiempo valido.</div>
                            </div>


                            <div class="col-md-6">
                                <label for="validationCustom03" class="form-label">Tiempo</label>
                                <input type="text" class="form-control" id="validationCustom03" required>
                                <div class="invalid-feedback">Por favor ingre un Cupo
                                    valido .</div>
                            </div>

                            <div class="col-md-6">
                                <label for="validationCustom02" class="form-label">Atraccion
                                    Gratis</label> <input type="text" class="form-control" id="validationCustom02">

                                <div class="invalid-feedback">por favor ingrese un Tipo
                                    de Atraccion valido</div>
                            </div>

                            <div class="col-12">
                                <button class="btn btn-primary mb-3" type="submit">Ingresar
                                    Promocion</button>
                            </div>
                        </form>


                    </div>
                    <!-- FIN PROMOCIONES ALTA -->
					










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