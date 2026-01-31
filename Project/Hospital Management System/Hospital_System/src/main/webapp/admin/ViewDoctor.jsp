<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.entity.Doctor" %>

<%@ include file="../component/AllCss.jsp"%>


<nav class="navbar navbar-expand-lg navbar-dark bg-success">
  <div class="container-fluid">

    <a class="navbar-brand" href="../admin/index.jsp">
      <i class="fa-solid fa-house-chimney-medical"></i> MEDI HOME
    </a>

    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
      data-bs-target="#navbarSupportedContent">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">

      <!-- LEFT MENU -->
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" href="admin/index.jsp">Home</a>
        </li>
    </div>
  </div>
</nav>



<div class="container p-5">
	<h3 class="text-center">Doctor List</h3>

	<table class="table table-bordered table-striped">
		<thead class="table-success">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Password</th>
				<th>Specialist</th>
				<th>Status</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<%
			List<Doctor> list = (List<Doctor>) request.getAttribute("doctorList");

    if (list != null && !list.isEmpty()) {
        for (Doctor d : list) {
        %>
			<tr>
				<td><%= d.getId() %></td>
				<td><%= d.getName() %></td>
				<td><%= d.getEmail() %></td>
				<td><%= d.getPassword() %></td>
				<td><%= d.getSpecialist() %></td>
				<td><%= d.getStatus() %></td>
				<td><a href="edit_doctor.jsp?id=<%= d.getId() %>"
					class="btn btn-sm btn-primary">Edit</a> <a
					href="<%=request.getContextPath()%>/deleteDoctor?id=<%= d.getId() %>"
					class="btn btn-sm btn-danger"
					onclick="return confirm('Are you sure?')">Delete</a></td>
			</tr>
			<%
        }
    } else {
%>
			<tr>
				<td colspan="7" class="text-center text-danger">No doctors
					found</td>
			</tr>
			<%
    }
%>
		</tbody>


	</table>
</div>