<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>








<c:if test="${flash != null}">
	<div class="alert alert-danger">
		<p>
			<c:out value="${flash}" />
			
		</p>
	</div>
</c:if>

<div class="bg-light p-4 mb-3 rounded">
	
</div>

<c:if test="${usuario.isAdmin()}">
	<div class="mb-3">
		<a href="/views/attractions/create.do" class="btn btn-primary"
			role="button"> <i class="bi bi-plus-lg"></i> Nueva Atracción
		</a>
	</div>
</c:if>
<table class="table table-stripped table-hover">
	<thead>
		<tr>
			<th>Atracci&oacute;n</th>
			<th>Costo</th>
			<th>Duraci&oacute;n</th>
			<th>Cupo</th>
			<th>Acciones</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${atraccion}" var="atracciones">
			<tr>
				<td><strong><c:out value="${atracciones.nombre}"></c:out></strong>
					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Cras pretium eros urna. Sed quis erat congue, bibendum tortor
						malesuada, iaculis diam. Ut ut imperdiet sapien.</p></td>
				<td><c:out value="${atracciones.costo}"></c:out></td>
				<td><c:out value="${atracciones.tiempo}"></c:out></td>
				<td><c:out value="${atracciones.cupoDisponible}"></c:out></td>

				<td><c:if test="${usuario.admin}">
						<a href="/turismo/attractions/edit.do?id=${atracciones.nombre}"
							class="btn btn-light rounded-0" role="button"><i
							class="bi bi-pencil-fill"></i></a>
						<a href="/turismo/attractions/delete.do?id=${atracciones.nombre}"
							class="btn btn-danger rounded" role="button"><i
							class="bi bi-x-circle-fill"></i></a>
					</c:if> <c:choose>

						<c:when
							test="${usuario.canAfford(attraction) && user.canAttend(attraction) && attraction.canHost(1)}">
							<a href="/turismo/attractions/buy.do?id=${attraction.id}"
								class="btn btn-success rounded" role="button">Comprar</a>
						</c:when>
						<c:otherwise>
							<a href="#" class="btn btn-secondary rounded disabled"
								role="button">No se puede comprar</a>
						</c:otherwise>
					</c:choose></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

