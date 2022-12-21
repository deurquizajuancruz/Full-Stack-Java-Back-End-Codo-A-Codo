<!DOCTYPE HTML>
<%@page import="ar.com.codoacodo.domain.Articulo"%>
<%@page import="java.util.List"%>
<html>
<head>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>




<body>
	<jsp:include page="navbar.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<h1>Listado de productos</h1>
			<div class="col-12 mt-2">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Título</th>
							<th scope="col">Precio</th>
							<th scope="col">Autor</th>
							<th scope="col">Imagen</th>
						</tr>
					</thead>
					<tbody>
						<%
						List<Articulo> articulos = (List<Articulo>) request.getAttribute("productos");
						for (Articulo a: articulos) {
						%>
						<tr>
							<th scope="row"><%=a.getId()%></th>
							<td><%=a.getTitulo() %></td>
							<td><%=a.getPrecio() %></td>
							<td><%=a.getAutor() %></td>
							<td><%=a.getImg() %></td>
						</tr>
						<%
						}
						%>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>