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

                <form action="UserRegister" method="post">

                    <div class="mb-3">
                        <label class="form-label">Full Name</label>
                        <input required name="fullname" type="text" class="form-control">
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Email</label>
                        <input required name="email" type="email" class="form-control">
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Password</label>
                        <input required name="password" type="password" class="form-control">
                    </div>

                    <button type="submit" class="btn btn-success w-100">
                        Register
                    </button>

                </form>

            </div>
        </div>
    </div>
</div>

</body>
</html>
