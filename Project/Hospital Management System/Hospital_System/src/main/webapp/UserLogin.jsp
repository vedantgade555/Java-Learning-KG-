<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>

<!-- Bootstrap & common CSS -->
<%@ include file="component/AllCss.jsp"%>

<!-- Page specific CSS -->
<link rel="stylesheet" href="css/login.css">

</head>
<body>

<!-- Navbar -->
<%@ include file="component/NavBar.jsp"%>

<div class="container d-flex justify-content-center align-items-center" style="min-height: 90vh;">
    <div class="row w-100">
        <div class="col-md-4 offset-md-4">
            <div class="card paint-card">
                <div class="card-body">

                    <p class="fs-4 text-center fw-bold mb-4">User Login</p>

                    <form action="#" method="post">

                        <div class="mb-3">
                            <label class="form-label">Email address</label>
                            <input required name="email" type="email"
                                   class="form-control">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Password</label>
                            <input required name="password" type="password"
                                   class="form-control">
                        </div>

                        <button type="submit"
                                class="btn btn-success w-100">
                            Login
                        </button>

                    </form>

                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
