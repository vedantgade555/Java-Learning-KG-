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
		</div>

		<div class="row">
			<div class="col-md-8 p-5">
				<div class="row">
					<div class="col-md-6">

					</div>
					<div class="col-md-6"></div>
					<div class="col-md-6"></div>
					<div class="col-md-6"></div>
				</div>

			</div>

			<div class="col-md-6">

			</div>
		</div>
	</body>
</html>
