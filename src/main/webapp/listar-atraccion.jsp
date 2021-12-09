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
				  <!-----SECCION TABLA ATRACCIONES-->
                    <div id="" class="row row-cols-12 row-cols-xl-12">

                        <h2 class="fw-bolder display-4 mb-3 ">Atracciones</h2>
                        <div class="col-lg-12">

                            <c:if test="${flash != null}">
                                <div class="alert alert-danger">
                                    <p>
                                        <c:out value="${flash}" />

                                    </p>
                                </div>
                            </c:if>
                            <table class="table table-stripped table-hover">
                                <thead>
                                    <tr>
                                        <th><a> Nombre</a></th>
                                        <th>Costo</th>
                                        <th>Tiempo</th>
                                        <th>Cupo</th>
                                        <th>Tipo</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${atracciones}" var="atraccion">
                                        <tr>
                                            <td><strong>
                                                    <c:out value="${atraccion.nombre}"></c:out>
                                                </strong>
                                            </td>
                                            <td>
                                                <c:out value="${atraccion.costo}"></c:out>
                                            </td>
                                            <td>
                                                <c:out value="${atraccion.tiempo}"></c:out>
                                            </td>
                                            <td>
                                                <c:out value="${atraccion.cupoDisponible}"></c:out>
                                            </td>
                                            <td>
                                                <c:out value="${atraccion.tipo}"></c:out>
                                            </td>


                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>


                        </div>
                    </div>
				
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
