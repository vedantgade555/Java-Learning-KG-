<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <%@ include file="../component/AllCss.jsp"%>
    </head>
    <body>
        <%@ include file="Navbar.jsp" %>

        <h1 class="text-center pt-3">Admin Dashboard </h1>

        <div class="container p-5">
            <div class="row">
                <div class="col-md-4">
                    <div class="card paint-card " data-bs-toggle="modal"
                        data-bs-target="#exampleModal">
                        <div class="card-body text-center text-success">
                            <i class="fa-solid fa-user-doctor fa-3x"></i><br>
                            <p class="fs-4 text-center">
                                Doctor <br>34
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card paint-card " data-bs-toggle="modal"
                        data-bs-target="#exampleModal">
                        <div class="card-body text-center text-success">
                            <i class="fa-solid fa-circle-user fa-3x"></i><br>
                            <p class="fs-4 text-center">
                                User <br>34
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card paint-card " data-bs-toggle="modal"
                        data-bs-target="#exampleModal">
                        <div class="card-body text-center text-success">
                            <i class="fa-solid fa-calendar-check fa-3x"></i><br>
                            <p class="fs-4 text-center">
                                Total Appointment <br>34
                            </p>

                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card paint-card " data-bs-toggle="modal"
                        data-bs-target="#exampleModal">
                        <div class="card-body text-center text-success">
                            <i class="fa-solid fa-calendar-check fa-3x"></i><br>
                            <p class="fs-4 text-center">
                                Specialist <br>34
                            </p>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>