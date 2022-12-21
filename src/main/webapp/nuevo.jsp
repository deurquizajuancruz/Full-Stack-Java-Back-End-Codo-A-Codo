<!Doctype HTML>
<html lang="es">

<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>


<body>
	<jsp:include page="navbar.jsp"></jsp:include>
	<main class="container">
		<div class="row">
			<h1>Nuevo Art&iacute;culo</h1>
			<div class="col-12 mt-2">
				<form class="row g-3 needs-validation" novalidate
				action="<%=request.getContextPath()%>/CreateArticuloController"
				method="post">
					<div class="col-md-4">
						<label for="validationCustom01" class="form-label">T&iacute;tulo</label>
						<input name="titulo" type="text" class="form-control"
							id="validationCustom01" value="" required>
						<div class="valid-feedback">Looks good!</div>
					</div>
					<div class="col-md-4">
						<label for="validationCustom02" class="form-label">Autor</label> <input
							name="autor" type="text" class="form-control"
							id="validationCustom02" value="" required>
						<div class="valid-feedback">Looks good!</div>
					</div>
					<div class="col-md-4">
						<label for="validationCustomUsername" class="form-label">Precio</label>
						<div class="input-group has-validation">
							<input name="precio" type="number" min="0" class="form-control"
								id="validationCustomUsername"
								aria-describedby="inputGroupPrepend" required>
							<div class="invalid-feedback">Please choose a username.</div>
						</div>
					</div>
					<div class="col-md-6">
						<label for="validationCustom03" class="form-label">Imagen</label>
						<input name="imagen" type="file" class="form-control"
							id="validationCustom03" required>
						<div class="invalid-feedback">Please provide a valid city.</div>
					</div>
					<div class="col-12">
						<button class="btn btn-primary" type="submit">Cargar
							nuevo</button>
					</div>
				</form>
			</div>
		</div>
	</main>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>

</html>