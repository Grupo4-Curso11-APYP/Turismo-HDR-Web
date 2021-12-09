<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<jsp:include page="partials/headNavSidebarDeLosDash.jsp"></jsp:include>

				<!-- INICIO DEL CONTENIDO ,LA COMIDA VA AQUI-->
				<div class="container-fluid">

					<!-- HEADER DE PAGINA-->
					<div
						class="d-sm-flex align-items-center justify-content-between mb-4">
						<h1 class="h3 mb-0 text-gray-800">Dashboard</h1>

					</div>
					<!-- HAEDER FIN  -->

					<!-- ----------------------------------CRUD-------------------------------------------------- -->
				
    <!---ACTUALIZACION DE USUARIO-->
    <div class="col-xl-4 col-lg-5 bg-dark  ms-5 mb-3 rounded-2">
        <h2 class="fw-bolder mt-3 text-white ">Actualizar Datos de
            Usuarios</h2>

        <form id="form-contact" class="row g-2 needs-validation mb-3 " novalidate>

            <div class="col-md-4">
                <label for="validationCustom01" class="form-label text-white">Nombre</label>
                <input type="text" class="form-control" id="validationCustom01" required>
                <div class="valid-feedback text-white">¡Se ve bien!</div>
            </div>
            <div class="col-md-4">
                <label for="validationCustom02" class="form-label text-white">Presupuesto</label>
                <input type="number" class="form-control" id="validationCustom02" required>
                <div class="valid-feedback text-white">Por favor ,
                    Ingrese un costo valido</div>
            </div>

            <div class="col-md-6">
                <label for="validationCustom03" class="form-label text-white">Tiempo</label>
                <input type="number" class="form-control" id="validationCustom03" required>
                <div class="invalid-feedback text-white">Por favor ingre
                    un Cupo valido .</div>
            </div>

            <div class="col-md-6">
                <label for="validationCustom02" class="form-label text-white">Tipo
                    Favorito</label> <input type="text" class="form-control"
                    id="validationCustom02">

                <div class="invalid-feedback text-white">por favor
                    ingrese un Tipo de Atraccion valido</div>
            </div>

            <div class="col-12">
                <button class="btn btn-warning mb-3" type="submit">Actualizar
                    Usuario</button>
            </div>
        </form>

    </div>
    <!---FIN ACTUALIZACION DE USUARIO-->
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
