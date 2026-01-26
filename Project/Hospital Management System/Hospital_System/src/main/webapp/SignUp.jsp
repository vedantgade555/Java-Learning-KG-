<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Register</title>

<%@ include file="component/AllCss.jsp"%>
</head>
<body>

	<%@ include file="component/NavBar.jsp"%>

	<div class="container d-flex justify-content-center align-items-center"
		style="min-height: 90vh;">

		<div class="col-md-4">
			<div class="card paint-card">
				<div class="card-body">

					<p class="fs-4 text-center fw-bold">User Register</p>

					<!-- ✅ FIXED ACTION (SCRIPTLET – ALWAYS WORKS) -->
					<form action="<%=request.getContextPath()%>/UserRegister"
						method="post">

						<div class="mb-3">
							<label class="form-label">Full Name</label> <input type="text"
								name="fullname" class="form-control" required>
						</div>

						<div class="mb-3">
							<label class="form-label">Email</label> <input type="email"
								name="email" class="form-control" required>
						</div>

						<div class="mb-3">
							<label class="form-label">Password</label> <input type="password"
								name="password" class="form-control" required>
						</div>

						<button type="submit" class="btn btn-success w-100">
							Register</button>

					</form>
					<%
					String msg = (String) session.getAttribute("msg");
					if (msg != null) {
					%>
					<div style="color: green; font-weight: bold;">
						<%=msg%>
					</div>
					<%
					session.removeAttribute("msg"); // IMPORTANT
					}
					%>


				</div>
			</div>
		</div>
	</div>

</body>
</html>
