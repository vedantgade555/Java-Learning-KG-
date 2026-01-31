<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Doctor</title>
<%@ include file="../component/AllCss.jsp"%>
</head>
<body class="bg-light">

	<%@ include file="../admin/Navbar.jsp"%>

	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">

				<div class="card shadow">
					<div class="card-header bg-success text-white text-center">
						<h4>Add Doctor</h4>
					</div>

					<div class="card-body">
						<form action="<%= request.getContextPath() %>/AddDoctor"
							method="post">

							<div class="mb-3">
								<label class="form-label">Doctor Name</label> <input type="text"
									name="name" class="form-control" required>
							</div>

							<div class="mb-3">
								<label class="form-label">Email</label> <input type="email"
									name="email" class="form-control" required>
							</div>

							<div class="mb-3">
								<label class="form-label">Password</label> <input
									type="password" name="password" class="form-control" required>
							</div>

							<div class="mb-3">
								<label class="form-label">Specialist</label> <input type="text"
									name="specialist" class="form-control" required>
							</div>

							<div class="d-grid">
								<button type="submit" class="btn btn-success">Add
									Doctor</button>
							</div>

						</form>
					</div>
				</div>

				<%-- Message Section --%>
				<%
            String msg = (String) session.getAttribute("msg");
            if (msg != null) {
            %>
				<div class="alert alert-info mt-3 text-center">
					<%= msg %>
				</div>
				<%
                session.removeAttribute("msg");
            }
            %>

			</div>
			<a href="<%= request.getContextPath() %>/ViewDoctorServlet">View Doctors</a>
		</div>
	</div>

</body>
</html>
