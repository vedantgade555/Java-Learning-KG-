<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>

<%@ include file="component/AllCss.jsp"%>
<!-- All CSS & JS links -->

</head>

<body>

	<%@ include file="component/UserNav.jsp"%>

	<!-- ================= CAROUSEL START ================= -->

	<div id="carouselExampleIndicators" class="carousel slide"
		data-bs-ride="carousel">

		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="0" class="active"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="1"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="2"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="3"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="4"></button>
		</div>

		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="img/1.jfif" class="d-block w-100" height="500">
			</div>
			<div class="carousel-item">
				<img src="img/2.jfif" class="d-block w-100" height="500">
			</div>
			<div class="carousel-item">
				<img src="img/3.jfif" class="d-block w-100" height="500">
			</div>
			<div class="carousel-item">
				<img src="img/4.jfif" class="d-block w-100" height="500">
			</div>
			<div class="carousel-item">
				<img src="img/5.jfif" class="d-block w-100" height="500">
			</div>
		</div>

		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
			<span class="carousel-control-prev-icon"></span>
		</button>

		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
			<span class="carousel-control-next-icon"></span>
		</button>

	</div>

	<!-- ================= CAROUSEL END ================= -->


	<!-- ================= KEY FEATURES ================= -->

	<div class="container p-3">
		<p class="text-center fs-2">Key Features of Our Hospital</p>
	</div>

	<div class="container">
		<div class="row">

			<div class="col-md-8 p-5">
				<div class="row">

					<div class="col-md-6">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">100% Safety</p>
								<p>Lorem ipsum dolor sit amet.</p>
							</div>
						</div>
					</div>

					<div class="col-md-6">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Clean Environment</p>
								<p>Lorem ipsum dolor sit amet.</p>
							</div>
						</div>
					</div>

					<div class="col-md-6 pt-4">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Friendly Doctors</p>
								<p>Lorem ipsum dolor sit amet.</p>
							</div>
						</div>
					</div>

					<div class="col-md-6 pt-4">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Medical Research</p>
								<p>Lorem ipsum dolor sit amet.</p>
							</div>
						</div>
					</div>

				</div>
			</div>

			<div class="col-md-4 p-5">
				<img src="img/d1.jfif" class="img-fluid">
			</div>

		</div>
	</div>

	<!-- ================= OUR TEAM ================= -->

	<div class="container p-5">
		<h1 class="text-center">Our Team</h1>

		<div class="row text-center">

			<div class="col-md-3">
				<div class="card">
					<img src="img/dc1.jfif" class="card-img-top">
					<div class="card-body">
						<h5>Doctor 1</h5>
						<p>Experienced specialist</p>
					</div>
				</div>
			</div>

			<div class="col-md-3">
				<div class="card">
					<img src="img/dc2.jfif" class="card-img-top">
					<div class="card-body">
						<h5>Doctor 2</h5>
						<p>Experienced specialist</p>
					</div>
				</div>
			</div>

			<div class="col-md-3">
				<div class="card">
					<img src="img/dc3.jfif" class="card-img-top">
					<div class="card-body">
						<h5>Doctor 3</h5>
						<p>Experienced specialist</p>
					</div>
				</div>
			</div>

			<div class="col-md-3">
				<div class="card">
					<img src="img/dc4.jfif" class="card-img-top">
					<div class="card-body">
						<h5>Doctor 4</h5>
						<p>Experienced specialist</p>
					</div>
				</div>
			</div>

		</div>
	</div>

</body>
</html>
