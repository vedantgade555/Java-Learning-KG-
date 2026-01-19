<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Index Page</title>

		<%@ include file="component/AllCss.jsp"%>
		<!-- This is used to link another JSP file to improve reusability.
     In this file we usually put all CSS links and script tags -->

		<link rel="stylesheet" href="css/index.css">
	</head>
	<body>
		<%@ include file="component/NavBar.jsp"%>

		<!-- Adding a Corosol -->

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
					<img src="img/1.jfif" class="d-block w-100" height="500"
						alt="slide1">
				</div>
				<div class="carousel-item">
					<img src="img/2.jfif" class="d-block w-100" height="500"
						alt="slide2">
				</div>
				<div class="carousel-item">
					<img src="img/3.jfif" class="d-block w-100" height="500"
						alt="slide3">
				</div>
				<div class="carousel-item">
					<img src="img/4.jfif" class="d-block w-100" height="500"
						alt="slide4">
				</div>
				<div class="carousel-item">
					<img src="img/5.jfif" class="d-block w-100" height="500"
						alt="slide5">
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

		<!-- Corosol Ends Here -->

		<!-- Main Section Started  -->

		<div class="container p-3">
			<p class="text-center fs-2">Key Features of Our Hospital</p>

			<div class="row">
				<div class="col-md-8 p-5">
					<div class="row">
						<div class="col-md-6">
							<div class="card paint-card">
								<div class="card-body">
									<p class="fs-5">100% Safety</p>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
										Voluptatem, inventore</p>

								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="card paint-card">
								<div class="card-body">
									<p class="fs-5">Clean Environment</p>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
										Voluptatem, inventore</p>

								</div>
							</div>
						</div>
						<div class="col-md-6 pt-5">
							<div class="card paint-card">
								<div class="card-body">
									<p class="fs-5">Friendly Doctors</p>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
										Voluptatem, inventore</p>

								</div>
							</div>
						</div>
						<div class="col-md-6 pt-5">
							<div class="card paint-card">
								<div class="card-body">
									<p class="fs-5">Medical Research</p>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
										Voluptatem, inventore</p>

								</div>
							</div>
						</div>
					</div>

				</div>

				<div class="col-md-4">
					<img src="img/d1.jfif" alt="doctor image" class="img-fluid">
				</div>
			</div>

		</div>

		<div class="container p-5">
			<h1 class="text-center">Our Tream</h1>
			<div class="row">
				<div class="col-md-3">
					<div class="card" style="width: 18rem;">
						<img src="img/dc1.jfif" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">Some quick example text to build on the card title
								and make up the bulk of the card’s content.</p>
							<a href="#" class="btn btn-primary">Go somewhere</a>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card" style="width: 18rem;">
						<img src="img/dc2.jfif" class="card-img-top img-fluid" alt="...">
						<div class="card-body">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">Some quick example text to build on the card title
								and make up the bulk of the card’s content.</p>
							<a href="#" class="btn btn-primary">Go somewhere</a>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card" style="width: 18rem;">
						<img src="img/dc3.jfif" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">Some quick example text to build on the card title
								and make up the bulk of the card’s content.</p>
							<a href="#" class="btn btn-primary">Go somewhere</a>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card" style="width: 18rem;">
						<img src="img/dc4.jfif" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">Some quick example text to build on the card title
								and make up the bulk of the card’s content.</p>
							<a href="#" class="btn btn-primary">Go somewhere</a>
						</div>
					</div>
				</div>
			</div>
		</div>

	</body>
</html>
