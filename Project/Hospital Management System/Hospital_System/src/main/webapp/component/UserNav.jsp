<%@ page import="com.entity.User" %>

<%
	User user = (User) session.getAttribute("userObj");
%>

<nav class="navbar navbar-expand-lg navbar-dark bg-success">
	<div class="container-fluid">

		<a class="navbar-brand" href="index.jsp">
			<i class="fa-solid fa-house-chimney-medical"></i> MEDI HOME
		</a>

		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent"
			aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto">

				<li class="nav-item">
					<a class="nav-link" href="#">APPOINTMENT</a>
				</li>

				<li class="nav-item">
					<a class="nav-link" href="UserLogin.jsp">View Appointment</a>
				</li>

				<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" href="#" role="button"
						data-bs-toggle="dropdown" aria-expanded="false">
						<i class="fa-regular fa-circle-user"></i>
						<%= (user != null) ? user.getFullname() : "User" %>
					</a>

					<ul class="dropdown-menu dropdown-menu-end">
						<li><a class="dropdown-item" href="#">Change Password</a></li>
						<li><a class="dropdown-item" href="<%= request.getContextPath() %>/userLogout">Logout</a></li>
					</ul>
				</li>

			</ul>
		</div>
	</div>
</nav>
