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
				      <!---SECCION TABLA ITINERARIO-->
                    <div id="itinerario-oculto" class="row row-cols-12 row-cols-xl-12">
                        <h2 class="fw-bolder display-4 mb-3 ">Itinerario</h2>
                        <div class="col-lg-12">
                            <table id="itinerario" class="table  table-bordered table-white  table-hover"
                                style="width: 100%">
                                <thead>
                                    <tr class="table-dark">
                                        <th>Id-itinerario</th>
                                        <th>Id-Atraccion</th>
                                        <th>Id-Promocion</th>
                                        <th>Id-Usuario</th>


                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>2</td>
                                        <td>3</td>
                                        <td>4</td>

                                    </tr>
                                    <tr>
                                        <td>7</td>
                                        <td>6</td>
                                        <td>7</td>
                                        <td>8</td>


                                    </tr>

                                </tbody>
                                <tfoot>
                                    <tr class="table-dark">
                                        <th>Id-itinerario</th>
                                        <th>Id-Atraccion</th>
                                        <th>Id-Promocion</th>
                                        <th>Id-Usuario</th>

                                    </tr>
                                </tfoot>
                            </table>

                        </div>
                    </div>

                    <!----FIN SECCION TABLA ITINERARIO-->
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
