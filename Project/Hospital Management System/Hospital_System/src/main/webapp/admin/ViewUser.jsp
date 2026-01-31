<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.entity.User" %>

<%@ include file="../component/AllCss.jsp"%>

<nav class="navbar navbar-expand-lg navbar-dark bg-success">
  <div class="container-fluid">
    <a class="navbar-brand" href="../admin/index.jsp">
      <i class="fa-solid fa-house-chimney-medical"></i> MEDI HOME
    </a>
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
				<th>Action</th>
			</tr>
		</thead>

		<tbody>
			<%
			List<User> list = (List<User>) request.getAttribute("userList");

			if (list != null && !list.isEmpty()) {
				for (User u : list) {
			%>
			<tr>
				<td><%= u.getId() %></td>
				<td><%= u.getFullname() %></td>
				<td><%= u.getEmai() %></td>
				<td>
					<a href="edit_doctor.jsp?id=<%= u.getId() %>"
					   class="btn btn-sm btn-primary">Edit</a>

					<a href="<%=request.getContextPath()%>/deleteDoctor?id=<%= u.getId() %>"
					   class="btn btn-sm btn-danger"
					   onclick="return confirm('Are you sure?')">Delete</a>
				</td>
			</tr>
			<%
				}
			} else {
			%>
			<tr>
				<td colspan="4" class="text-center text-danger">
					No doctors found
				</td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</div>
