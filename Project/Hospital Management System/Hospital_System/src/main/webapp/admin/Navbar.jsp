<nav class="navbar navbar-expand-lg navbar-dark bg-success">
  <div class="container-fluid">

    <a class="navbar-brand" href="admin/index.jsp">
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

        <li class="nav-item">
          <a class="nav-link active" href="DoctorLogin.jsp">Doctor</a>
        </li>

        <li class="nav-item">
          <a class="nav-link active" href="UserLogin.jsp">Patient</a>
        </li>
      </ul>

      <!-- RIGHT MENU -->
      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle active" href="#"
             role="button" data-bs-toggle="dropdown">
            Profile
          </a>
          <ul class="dropdown-menu dropdown-menu-end">
            <li><a class="dropdown-item" href="#">Admin</a></li>
            <li><a class="dropdown-item" href="<%= request.getContextPath() %>/adminLogout">Logout</a></li>
          </ul>
        </li>
      </ul>

    </div>
  </div>
</nav>
