<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
<%@ include file="component/AllCss.jsp"%>
</head>
<body class="bg-light">
<%@ include file="component/UserNav.jsp"%>
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-5">

            <div class="card shadow">
                <div class="card-header bg-primary text-white text-center">
                    <h4>Change Password</h4>
                </div>

                <div class="card-body">

                    <form action="ChangePassword" method="post">

                        <div class="mb-3">
                            <label class="form-label">Old Password</label>
                            <input type="password" name="oldPassword" class="form-control" required>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">New Password</label>
                            <input type="password" name="newPassword" class="form-control" required>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Confirm Password</label>
                            <input type="password" name="confirmPassword" class="form-control" required>
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-success">
                                Update Password
                            </button>
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
    </div>
</div>

</body>
</html>
