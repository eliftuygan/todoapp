<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>TODOAPP</title>

  <!-- Custom styles for this template-->
  <link href="static/css/todoCss.css" rel="stylesheet">
  <!-- Custom styles for this page -->
  <link href="static/css/dataTables.bootstrap4.min.css" rel="stylesheet">

</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="/">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">TO-DO APP</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">
      
      
     <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
          <i class="fas fa-fw fa-cog"></i>
          <span>Add New Task</span>
        </a>
        <div id="collapseOne" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
              <input class="form-control form-control-user" placeholder="Name">
              <input class="form-control form-control-user" placeholder="Description">
              <input class="form-control form-control-user" placeholder="Deadline">
          </div>
        </div>
      </li>

      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
          <i class="fas fa-fw fa-cog"></i>
          <span>My TO-DO Lists</span>
        </a>
        <div id="collapseOne" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <a class="collapse-item" href="/" > <b>List1</b> <div align="right"><img alt="done"  src="static/css/add.JPG" height="12" width="12"> <small>add task</small></div>  </a> 
            <a class="collapse-item" href="/"><b>List2</b><div align="right"><img alt="done"  src="static/css/add.JPG" height="12" width="12"> <small>add task</small></div> </a>
          </div>
        </div>
      </li>
      

      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true" aria-controls="collapsePages">
          <i class="fas fa-fw fa-folder"></i>
          <span>Pages</span>
        </a>
        <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">Login Screens:</h6>
            <a class="collapse-item" href="login">Login</a>
            <a class="collapse-item" href="register">Register</a>
            <a class="collapse-item" href="forgot">Forgot Password</a>
        </div>
      </li>

  

      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

  

    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Topbar -->
        <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

          <!-- Sidebar Toggle (Topbar) -->
          <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
            <i class="fa fa-bars"></i>
          </button>

          <!-- Topbar Search -->
          <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
            <div class="input-group">
              <input type="text" class="form-control bg-light border-0 small" placeholder="New TO-DO List" aria-label="Search" aria-describedby="basic-addon2">
              <div class="input-group-append">
                <button class="btn btn-primary" type="button">
                  <i class="fas fa-search fa-sm">Create</i>
                </button>
              </div>
            </div>
          </form>

          <!-- Topbar Navbar -->
          <ul class="navbar-nav ml-auto">

            <!-- Nav Item - Search Dropdown (Visible Only XS) -->
            <li class="nav-item dropdown no-arrow d-sm-none">
              <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-search fa-fw"></i>
              </a>
              <!-- Dropdown - Messages -->
              <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in" aria-labelledby="searchDropdown">
                <form class="form-inline mr-auto w-100 navbar-search">
                  <div class="input-group">
                    <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
                    <div class="input-group-append">
                      <button class="btn btn-primary" type="button">
                        <i class="fas fa-search fa-sm"></i>
                      </button>
                    </div>
                  </div>
                </form>
              </div>
            </li>

           

            <!-- Nav Item - User Information -->
            <li class="nav-item dropdown no-arrow">
              <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Elif Arslançeri</span>
                <img class="img-profile rounded-circle" src="static/css/elif.jpg">
              </a>
              <!-- Dropdown - User Information -->
              <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                <a class="dropdown-item" href="#">
                  <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                  Profile
                </a>
                <a class="dropdown-item" href="#">
                  <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                  Settings
                </a>
                <a class="dropdown-item" href="#">
                  <i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
                  Activity Log
                </a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                  <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                  Logout
                </a>
              </div>
            </li>

          </ul>

        </nav>
        <!-- End of Topbar -->

        <!-- Begin Page Content -->
        <div class="container-fluid">

        


          <!-- DataTales Example -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">LIST</h6>
            </div>
            <div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>Name</th>
                      <th>Description</th>                      
                      <th>Deadline</th>
                      <th>Status</th>
                      <th>Create Date</th>
                      <th>Operations</th>
                    </tr>
                  </thead>
                  <tfoot>
                    <tr>
                      <th>Name</th>
                      <th>Description</th>
                      <th>Deadline</th>
                      <th>Status</th>
                      <th>Create Date</th>
                      <th>Operations</th>
                    </tr>
                  </tfoot>
                  <tbody>
                   <c:forEach var="task" items="${tasks}">
                    <tr>
                      <td>${task.name}</td>
                      <td>${task.description}</td>
                      <td>${task.deadline}</td>
                      <td>${task.status}</td>
                      <td>${task.createdate}</td>
                      <td> <div align="center"><img alt="done"  src="static/css/done.JPG" height="15" width="15">  <img alt="delete" src="static/css/delete.jpg" height="15" width="15"></div></td>
                    </tr>
                    </c:forEach>
                  <tr>
                      <td>task1</td>
                      <td>meeting</td>
                      <td>01.08.2019</td>
                      <td>open</td>
                      <td>08.05.2019</td>
                      <td> <div align="center"><img alt="done"  src="static/css/done.JPG" height="15" width="15">  <img alt="delete" src="static/css/delete.jpg" height="15" width="15"></div></td>
                
                    </tr>
                   <tr>
                      <td>task2</td>
                      <td>university class</td>
                      <td>01.08.2019</td>
                      <td>completed</td>
                      <td>08.05.2019</td>
                       <td> <div align="center"><img alt="done"  src="static/css/done.JPG" height="15" width="15">  <img alt="delete" src="static/css/delete.jpg" height="15" width="15"></div></td>
                
                    </tr>
                    <tr>
                      <td>task3</td>
                      <td>gym</td>
                      <td>01.10.2019</td>
                      <td>open</td>
                      <td>08.05.2019</td>
                      <td> <div align="center"><img alt="done"  src="static/css/done.JPG" height="15" width="15">  <img alt="delete" src="static/css/delete.jpg" height="15" width="15"></div></td>
                    </tr>
                    
                  </tbody>
                </table>
              </div>
            </div>
          </div>

        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->

      <!-- Footer -->
      <footer class="sticky-footer bg-white">
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
            <span>Copyright &copy; ElifArslanceri 2019</span>
          </div>
        </div>
      </footer>
      <!-- End of Footer -->

    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <a class="btn btn-primary" href="login">Logout</a>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="static/js/jquery.min.js"></script>
  <script src="static/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="static/js/jquery.easing.min.js"></script>



  <!-- Page level plugins -->
  <script src="static/js/jquery.dataTables.min.js"></script>
  <script src="static/js/dataTables.bootstrap4.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="static/js/datatables-demo.js"></script>

</body>

</html>
