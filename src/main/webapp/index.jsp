<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="es">

<head>
<jsp:include page="partials/head.jsp"></jsp:include>
<jsp:include page="partials/verificador-de-sesion-activa.jsp"></jsp:include>
</head>

<body>

	<!---NAV BAR --->
	<nav class="navbar navbar-expand-lg navbar-light bg-white fixed-top">
		<div class="container">
			<a class="navbar-brand" href="#"><img
				src="assets/img/logo_small.png" alt="" width="200px"
				class="d-inline-block align-text-center pt-1 pb-2"></a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<ion-icon name="menu-outline"></ion-icon>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#" id="inicio">Inicio</a></li>

					<li class="nav-item dropdown"><a id="perfiles-creados"
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Perfil </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="dashboard.jsp"
								id="usuario">Ver Perfil</a></li>



						</ul></li>
					<li class="nav-item"><a class="nav-link" href="#quienes-somos"
						tabindex="-1" aria-disabled="false">Quiénes Somos</a></li>
					<li class="nav-item"><a class="nav-link" href="#contacto"
						tabindex="-1" aria-disabled="false">Contacto</a></li>
					<li class="nav-item"><a class="nav-link "
						href="/turismoHDR/logout" data-toggle="modal"
						data-target="#logoutModal">Salir</a></li>
				</ul>

			</div>
		</div>
	</nav>

	<!---FIN NAVBAR-->
	<!---Sectccion Imagen y breve despcripcion-->
	<section id="hero" style="background-image: url(assets/img/img5.jpg)">

		<div
			class="container align-items-center  text-center pt-2 mb-5 mt-5   ">
			<h1 class="text-center fw-bolder pt-5">Turismo en
				Tierra Media</h1>

			<h2 class="display-3 fw-bolder">¡Hola
				<c:out value="${usuario.nombre}"></c:out>!
			</h2>
			<a type="menu"
				class=" text-center btn btn-light btn-sm mt-5   border border-light fw-bold "
				href="#ayp"> Explorar Ahora </a>
		</div>
	</section>
	<!---FIN SECCION-->

	<!----SECCION ATRACCIONES Y PROMOCIONES-->
	<section id="ayp" class="p-4">
		<div class="container-fluid  text-center">


			<!-----CARRUSEL SLIDER-->

			<div id="carouselExampleControlsNoTouching" class="carousel slide"
				data-bs-touch="false" data-bs-interval="false">
				<div class="carousel-inner">
					<!--PRIMER ITEM-->
					<div class="carousel-item active" id="atracciones">
						<h2 class="display-2 fw-bold">Atracciones</h2>



						<p class="">En esta sección podrás encontrar todas las
							atracciones y promociones disponibles hasta el momento.</p>


						<!----ATRACCIONES-->
						<div class=" pt-5 row row-cols-1 row-cols-md-3 g-4">
							<div class="col-lg-6 col-sm-6" id="col1">
								<div class="card h-100 card_1">
									<img src="assets/img/card-1.jpg" class="card-img-top"
										alt="mordor">
									<div class="card-body card-1">
										<h5 class="card-title fw-bold">Mordor</h5>
										<p class="card-text">Mordor era una llanura volcánica
											negra ubicada en el sureste de la Tierra Media al este de
											Gondor, Ithilien y el gran río Anduin. Mordor fue elegido por
											Sauron para ser su reino debido a las cadenas montañosas que
											lo rodean por tres lados, creando una fortaleza natural
											contra sus enemigos.</p>
										<a type="button" class="btn btn-transparent border-dark mt-2"
											href="dashboard.jsp">Visitar</a>
									</div>
								</div>

							</div>
							<div class="col-lg-6  col-sm-6" id="col2">
								<div class="card h-100">
									<img src="assets/img/card-2.jpg" class="card-img-top"
										alt="minas-thirt">
									<div class="card-body" id="card-2">
										<h5 class="card-title fw-bold">Minas Tirith</h5>
										<p class="card-text">Minas Tirith (S. 'Torre de la
											Guardia') era una ciudad de Gondor , originalmente llamada
											Minas Anor. Desde TA 1640 en adelante fue la capital del
											reino del Sur y la sede de sus reyes y mayordomos
											gobernantes.</p>
										<a type="button" class="btn btn-transparent border-dark mt-2"
											href="dashboard.jsp">Visitar</a>
									</div>
								</div>

							</div>
							<div class="col-lg-6  col-sm-6" id="col3">
								<div class="card h-100">
									<img src="assets/img/card-3.png" class="card-img-top" alt="...">
									<div class="card-body" id="card-3">
										<h5 class="card-title fw-bold">Abismo de Helm</h5>
										<p class="card-text">El Abismo de Helm se trata de una profunda garganta que se abre al pie
											del pico Thrihyrne, en la vertiente norte de las Montañas
											Blancas.</p>
										<a type="button" class="btn btn-transparent border-dark mt-2"
											href="dashboard.jsp">Visitar</a>
									</div>
								</div>
							</div>
							<div class="col-lg-6  col-sm-6" id="col4">
								<div class="card h-100">
									<img src="assets/img/card-4.jpg" class="card-img-top" alt="...">
									<div class="card-body" id="card-4">
										<h5 class="card-title  fw-bold">Moria</h5>
										<p class="card-text">Fue una gran mina que durante muchas
											edades produjo inmensas riquezas, símbolo del poderío enano
											en la Tierra Media, pero también causa de muchas desdichas y
											pesares. Durante más de un milenio fue un gran centro de
											comercio enano, hasta que los habitantes de la ciudad
											excavaron demasiado profundo, en busca de mithril.</p>
										<a type="button" class="btn btn-transparent border-dark mt-2"
											href="dashboard.jsp">Visitar</a>
									</div>
								</div>
							</div>
							<div class="col-lg-6  col-sm-6" id="col5">
								<div class="card h-100">
									<img src="assets/img/card-5.jpg" class="card-img-top" alt="...">
									<div class="card-body" id="card-5">
										<h5 class="card-title fw-bold">Bosque Negro</h5>
										<p class="card-text">La zona forestal más grande que aún
											perdura en la Tierra Media. Se halla al este del tramo
											superior de Anduin y al sur de las Montañas Grises. Su
											nombre original era el Gran Bosque Verde o Bosque Verde el
											Grande (S. Eryn Galen) y formaba el hábitat de los elfos
											silvanos</p>
										<a type="button" class="btn btn-transparent border-dark mt-2"
											href="dashboard.jsp">Visitar</a>
									</div>
								</div>
							</div>
							<div class="col-lg-6   col-sm-6" id="col6">
								<div class="card h-100">
									<img src="assets/img/card-6.jpg" class="card-img-top" alt="...">
									<div class="card-body" id="card-6">
										<h5 class="card-title fw-bold">La Comarca</h5>
										<p class="card-text">También llamada las Cuatro Cuadernas,
											el nombre original en hobbítico es Sûza. Es una región de
											colinas en Eriador con pequeños bosques que se extiende desde
											el Brandivino hasta las Colinas Lejanas (unas 18.000 millas
											cuadradas), a unas cuarenta horas de camino hacia el oeste.</p>
										<a type="button" class="btn btn-transparent border-dark mt-2"
											href="dashboard.jsp">Visitar</a>
									</div>
								</div>
							</div>

							<div class="col-lg-6   col-sm-6" id="col6">
								<div class="card h-100">
									<img src="assets/img/card-7.jpg" class="card-img-top" alt="...">
									<div class="card-body" id="card-6">
										<h5 class="card-title fw-bold">Erebor</h5>
										<p class="card-text">Erebor, también llamada la Montaña
											Solitaria, se trata de una elevación aislada situada al noreste
											de Rhovanion, que fue arrebatada por un dragón, llamado
											Smaug, al rey Thrór de los enanos.</p>
										<a type="button" class="btn btn-transparent border-dark mt-2"
											href="dashboard.jsp">Visitar</a>
									</div>
								</div>
							</div>

							<div class="col-lg-6   col-sm-6" id="col6">
								<div class="card h-100">
									<img src="assets/img/card-8.jpg" class="card-img-top" alt="...">
									<div class="card-body" id="card-6">
										<h5 class="card-title fw-bold">Lothlórien</h5>
										<p class="card-text">Lothlórien o Lórien es el reino más hermoso de los Elfos que
											permanecieron en la Tierra Media durante la Tercera Edad.
											Un amplio bosque entre las Montañas Nubladas y
											el río Anduin, es el centro élfico de resistencia contra el
											Señor Oscuro Sauron.</p>
										<a type="button" class="btn btn-transparent border-dark mt-2"
											href="dashboard.jsp">Visitar</a>
									</div>
								</div>
							</div>
							<!---FIN ATRACCIONES-->
						</div>
					</div>
					<!--FIN PRIMER ITEM-->



					<!---SEGUNDO ITEM-->
					<div class="carousel-item " id="promociones">
						<h2 class="display-2 fw-bold">Promociones</h2>
						<p class="">En Esta Seccion Podras Encontrar todas las
							Atracciones y Promociones Disponibles hasta el momento .</p>
						<!---PROMOCIONES-->
						<div class=" pt-5 row row-cols-1 row-cols-md-3 g-4">
							<div class="col-lg-6 col-sm-6" id="col1">
								<div class="card h-100 card_1">
									<img src="assets/img/card-promo4.jpg" class="card-img-top"
										alt="Degustacion">
									<div class="card-body card-1">
										<h5 class="card-title fw-bold">Pack Degustacion</h5>
										<p class="card-text">
											¡NO TE PIERDAS ESTA OFERTA INCREIBLE!<br> Llevando
											Lothlórien y La Comarca Te hacemos un descuento unico de $36
											monedas
										</p>
										<a type="button" class="btn btn-transparent border-dark mt-2"
											href="dashboard.jsp">Visitar</a>
									</div>
								</div>

							</div>
							<div class="col-lg-6  col-sm-6" id="col2">
								<div class="card h-100">
									<img src="assets/img/card-promo3.jpg" class="card-img-top"
										alt="Paisaje">
									<div class="card-body" id="card-2">
										<h5 class="card-title fw-bold">Pack Paisaje</h5>
										<p class="card-text">
											Con la compra de Erebor y Minas Tirith te llevas de regalo
											una visita a Abismo de Helm <br> ¡LLEVATE ESTE INCREIBLE
											COMBO POR SOLO $120 MONEDAS!
										</p>
										<a type="button" class="btn btn-transparent border-dark mt-2"
											href="dashboard.jsp">Visitar</a>
									</div>
								</div>

							</div>
							<div class="col-lg-6  col-sm-6" id="col3">
								<div class="card h-100">
									<img src="assets/img/card-promo2.jpg" class="card-img-top"
										alt="adrenalina">
									<div class="card-body" id="card-3">
										<h5 class="card-title fw-bold">Pack Adrenalina</h5>
										<p class="card-text">
											¡QUERES VIVIR UNA EXPERIENCIA ÚNICA?!<br> ¡QUE TE DEJE
											LOS PELOS DE PUNTA?!<br> Entonces este pack es el tuyo,
											no esperes más y empieza a disfrutar de Mordor y Bosque Negro.
											<br>comprando ahora te hacemos un descuento del 25%
										</p>
										<a type="button" class="btn btn-transparent border-dark mt-2"
											href="dashboard.jsp">Visitar</a>
									</div>
								</div>
							</div>
							<div class="col-lg-6  col-sm-6" id="col4">
								<div class="card h-100">
									<img src="assets/img/card-promo.jpg" class="card-img-top"
										alt="Aventura">
									<div class="card-body" id="card-4">
										<h5 class="card-title  fw-bold">Pack Aventura</h5>
										<p class="card-text">
											¡APROVECHA ESTE COMBO INCREÍBLE!<br> Combo ideal para
											visitar con la familia, no te pierdas la posibilidad de
											conocer Mordor y Moria,<br> y tener una experiencia
											única a tan sólo el precio de $140 monedas
										</p>
										<a type="button" class="btn btn-transparent border-dark mt-2"
											href="dashboard.jsp">Visitar</a>
									</div>
								</div>
							</div>



						</div>

						<!----FIN PROMOCIONES-->
					</div>
					<!--FIN SEGUNDO ITEM-->
				</div>
				<button class="carousel-control-prev bg-dark-50" type="button"
					data-bs-target="#carouselExampleControlsNoTouching"
					data-bs-slide="prev">
					<span class="carousel-control-prev-icon" aria-hidden="true"></span>
					<span class="visually-hidden">Previous</span>
				</button>
				<button class="carousel-control-next bg-dark-50" type="button"
					data-bs-target="#carouselExampleControlsNoTouching"
					data-bs-slide="next">
					<span class="carousel-control-next-icon " aria-hidden="true"></span>
					<span class="visually-hidden">Next</span>
				</button>

			</div>

			<!----FIN CARRUSEL SLIDER-->



		</div>


	</section>
	<!---FIN SECCION ATRACCIONES Y PROMOCIONES-->


	<!----SECCION SOBRE LA EMPRESA--->
	<section id="quienes-somos">
		<div class="container bg-light">
			<div class="contenido-empresa">
				<h2 class="display-5 text-center mt-5 pt-2 ">
					Turismo en Tierra Media <br>Fue desarrollado por el grupo <br>
					<b>Hijos Del Rigor</b>
				</h2>
				<p class="text-center">La Tierra Media (Middle Earth en inglés),
					también conocida como Endor, es el continente ficticio donde tienen
					lugar la mayoría de los acontecimientos de las obras del escritor
					J. R. R. Tolkien. ... Es uno de los continentes de Arda, el mundo
					donde se sitúa la totalidad del legendarium de Tolkien.</p>
			</div>
			<div class=" pt-5 row row-cols-1 row-cols-md-3 g-4">
				<div class="col-lg-3 col-sm-6">
					<div class="contenido-miembro">
						<div class="contenido-detalles">
							<h5 class="text-start ps-1 mt-2">Gandalf</h5>
							<span class="ps-1">La copia Barata de Albus Dumbledore</span>
							<ul class="list-inline pe-3">
								<li class=" list-inline-item"><a href=""> <ion-icon
											name="logo-instagram"></ion-icon>
								</a></li>
								<li class="list-inline-item"><a href=""> <ion-icon
											name="logo-slack"></ion-icon>
								</a></li>
								<li class="list-inline-item"><a href=""> <ion-icon
											name="logo-twitter"></ion-icon>
								</a></li>
								<li class="list-inline-item"><a href=""> <ion-icon
											name="logo-linkedin"></ion-icon>
								</a></li>
							</ul>
						</div>
						<img src="assets/img/pf1.png" class="img-fluid" alt="perfil-1">
					</div>

				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="contenido-miembro">
						<div class="contenido-detalles">
							<h5 class="text-start ps-1 mt-2">Sam</h5>
							<span class="ps-1">Sherk Con la posima de felices por
								siempre </span>
							<ul class="list-inline pe-3">
								<li class=" list-inline-item"><a href=""> <ion-icon
											name="logo-instagram"></ion-icon>
								</a></li>
								<li class="list-inline-item"><a href=""> <ion-icon
											name="logo-slack"></ion-icon>
								</a></li>
								<li class="list-inline-item"><a href=""> <ion-icon
											name="logo-twitter"></ion-icon>
								</a></li>
								<li class="list-inline-item"><a href=""> <ion-icon
											name="logo-linkedin"></ion-icon>
								</a></li>
							</ul>
						</div>
						<img src="assets/img/pf2.jpg" class="img-fluid" alt="perfil-2">
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="contenido-miembro">
						<div class="contenido-detalles">
							<h5 class="text-start ps-1 mt-2">Galadriel</h5>
							<span class="ps-1">Hada Madrina full-stack</span>
							<ul class="list-inline pe-3">
								<li class=" list-inline-item"><a href=""> <ion-icon
											name="logo-instagram"></ion-icon>
								</a></li>
								<li class="list-inline-item"><a href=""> <ion-icon
											name="logo-slack"></ion-icon>
								</a></li>
								<li class="list-inline-item"><a href=""> <ion-icon
											name="logo-twitter"></ion-icon>
								</a></li>
								<li class="list-inline-item"><a href=""> <ion-icon
											name="logo-linkedin"></ion-icon>
								</a></li>
							</ul>
						</div>
						<img src="assets/img/pf3.jpg" class="img-fluid" alt="perfil-3">
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="contenido-miembro">
						<div class="contenido-detalles">
							<h5 class="text-start ps-1 mt-2">Eowyn</h5>
							<span class="ps-1">Reina de muy muy Lejano</span>
							<ul class="list-inline pe-3">
								<li class=" list-inline-item"><a href=""> <ion-icon
											name="logo-instagram"></ion-icon>
								</a></li>
								<li class="list-inline-item"><a href=""> <ion-icon
											name="logo-slack"></ion-icon>
								</a></li>
								<li class="list-inline-item"><a href=""> <ion-icon
											name="logo-twitter"></ion-icon>
								</a></li>
								<li class="list-inline-item"><a href=""> <ion-icon
											name="logo-linkedin"></ion-icon>
								</a></li>
							</ul>
						</div>
						<img src="assets/img/pf4.jpg" class="img-fluid" alt="perfil-4">
					</div>
				</div>
			</div>

		</div>
	</section>
	<!---FIN SECCION SOBRE LA EMPRESA-->


	<!--CONTACTO-->
	<section id="contacto">
		<div class="container bg-light mt-2 mb-3">
			<div class="row">
				<div class="col-lg-6 col-sm-6 mt-5 pt-5 mb-2">
					<h2 class="fw-bolder ">¿Estás listo para ser parte de esta
						aventura?</h2>
					<p class="pp">Por favor en este espacio nos gustaría que nos
						puedan dejar un comentario de como la pasaron , recomendaciones
						que nos quieran aportar , o cualquier consulta que quieran
						hacernos. ¡¡Muchas gracias por ser parte de esta aventura!!</p>

				</div>
				<div class="col-lg-6 col-sm-6 mt-5 pt-5 pe-3 mb-2">
					<h2 class="fw-bolder display-5 ms-2 ps-3">Contacto</h2>

					<form id="form-contact" class="row g-3 needs-validation" novalidate>
						<div class="col-md-4">
							<label for="validationCustom01" class="form-label">Nombre</label>
							<input type="text" class="form-control" id="validationCustom01"
								required>
							<div class="valid-feedback">¡Se ve bien!</div>
						</div>
						<div class="col-md-4">
							<label for="validationCustom02" class="form-label">Apellido</label>
							<input type="text" class="form-control" id="validationCustom02"
								required>
							<div class="valid-feedback">¡Se ve bien!</div>
						</div>
						<div class="col-md-4">
							<label type="Email" for="validationCustomUsername"
								class="form-label">Email</label>
							<div class="input-group has-validation">
								<span class="input-group-text" id="inputGroupPrepend">@</span> <input
									type="text" class="form-control" id="validationCustomUsername"
									aria-describedby="inputGroupPrepend" required>
								<div class="invalid-feedback">Por favor, ingrese un nombre
									de usuario.</div>
							</div>
						</div>
						<div class="col-md-6">
							<label for="validationCustom03" class="form-label">Ciudad</label>
							<input type="text" class="form-control" id="validationCustom03"
								required>
							<div class="invalid-feedback">Proporcione una ciudad
								válida.</div>
						</div>

						<div class="col-md-3">
							<label for="validationCustom05" class="form-label">Comentario</label>
							<textarea type="text" class="form-control"
								id="validationCustom05"></textarea>
							<div class="invalid-feedback">por favor ingrese un
								comentario</div>
						</div>
						<div class="col-12">
							<div class="form-check">
								<input class="form-check-input" type="checkbox" value=""
									id="invalidCheck" required> <label
									class="form-check-label" for="invalidCheck"> Acepta
									términos y condiciones </label>
								<div class="invalid-feedback">Debes estar de acuerdo antes
									de enviar.</div>
							</div>
						</div>
						<div class="col-12">
							<button class="btn btn-primary" type="submit">Enviar
								Formulario</button>
						</div>
					</form>

				</div>
			</div>


		</div>

		</div>
	</section>
	<!---FIN CONTACTO-->


	<!--FOOTER-->
	<footer class=" py-5 mt-5 bg-light shadow">
		<div class="container">




			<div class="row">
				<div class="col-lg-3 mb-3 ">
					<a class="d-inline-flex align-items-center mb-2" href=""> <img
						src="assets/img/logo_small.png" alt="logo" width="200px"></a>
					<div>
						<ul class="list-unstyled  small  text-muted">
							<li class="mb-2"></li>
							<li class="mb-2">Gracias por visitar nuestra web</li>


						</ul>
					</div>

				</div>
				<div class="col-6 col-lg-2 mb-3">
					<div>
						<a href="" class="fw-bolder text-dark">Atracciones</a>
						<ul class="list-unstyled  small  text-muted">
							<li class="mb-2"><a href="" class="text-dark">Lista De
									Atracciones</a></li>



						</ul>
					</div>
					<div class="col-6 col-lg-2 mb-3">
						<div>
							<a href="" class="fw-bolder text-dark">Promociones</a>
							<ul class="list-unstyled  small  text-muted">
								<li class="mb-2"><a href="" class="text-dark">Promociones
										Disponibles</a></li>
								

							</ul>
						</div>

					</div>
					<div class="col-8 col-lg-2 mb-3">
						<div>
							<a href="" class="fw-bolder text-dark">Otros Servicios</a>
							<ul class="list-unstyled  small  text-muted">
								<li class="mb-2"><a href="" class="text-dark">Argentina
										Programa</a></li>
							

							</ul>
						</div>

					</div>

				</div>


			</div>
		</div>

	</footer>



	<!-- MODAL LOGOUT -->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">¿Preparado para
						Salir?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">x</span>
					</button>
				</div>
				<div class="modal-body">Seleccione "Cerrar sesion" a
					continuación si está listo para finalizar su sesión actual.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancelar</button>
					<a class="btn btn-primary" href="login.jsp">Cerrar sesión</a>
				</div>
			</div>
		</div>
	</div>


	<!-- FIN MODAL LOGOUT -->

</body>

</html>