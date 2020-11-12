<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content=" ">
        <meta name="author" content=" "> 
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/images/favicon.png"> 
        <title>Project report : Dashboard</title> 
		
		<!-- DataTables -->
        <link href="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/plugins/datatables/buttons.bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/plugins/datatables/fixedHeader.bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/plugins/datatables/responsive.bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/plugins/datatables/scroller.bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/plugins/datatables/dataTables.colVis.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/plugins/datatables/fixedColumns.dataTables.min.css" rel="stylesheet" type="text/css"/>
		<link rel="${pageContext.request.contextPath}/stylesheet" href="plugins/magnific-popup/css/magnific-popup.css" />
        <link rel="${pageContext.request.contextPath}/stylesheet" href="plugins/jquery-datatables-editable/datatables.css" />
		
		<link rel="stylesheet" href="plugins/morris/morris.css"> 
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/core.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/components.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/icons.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/pages.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/menu.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/responsive.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/switchery/switchery.min.css">
        <script src="${pageContext.request.contextPath}/assets/js/modernizr.min.js"></script>
    </head>
    <body class="fixed-left"> 
        <div id="wrapper">
            <div class="topbar">
                <div class="topbar-left">
					<a href=".html">
                        <span>
                            
                        </span>
                        <i>
                          
                        </i>
                    </a>
                </div>
 
                <div class="navbar navbar-default" role="navigation">
                    <div class="container"> 
                        <ul class="nav navbar-nav navbar-left">
                            <li>
                                <button class="button-menu-mobile open-left waves-effect">
                                    <i class="mdi mdi-menu"></i>
                                </button>
                            </li>
                            <li class="hidden-xs">
                                <form role="search" class="app-search">
                                    <input type="text" placeholder="Search..."
                                           class="form-control">
                                    <a href="#"><i class="fa fa-search"></i></a>
                                </form>
                            </li> 
                        </ul>
                         
                        <ul class="nav navbar-nav navbar-right">
                            <li class="dropdown user-box">
                                <a href="#" class="dropdown-toggle waves-effect user-link" data-toggle="dropdown" aria-expanded="true">
                                    <img src="${pageContext.request.contextPath}/assets/images/admin.png" alt="user-img" class="img-circle user-img">
                                </a>

                                <ul class="dropdown-menu dropdown-menu-right arrow-dropdown-menu arrow-menu-right user-list notify-list">
                                    <li>
                                        <h5>Project Reports</h5>
                                    </li>
                                    <li><a href=#"><i class="ti-user m-r-5"></i> Profile</a></li>
                                    <li><a href="<%=request.getContextPath()%>/Logout"><i class="ti-power-off m-r-5"></i> Logout</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
             
            <div class="left side-menu">
                <div class="sidebar-inner slimscrollleft">
                    <div id="sidebar-menu">
                        <ul>
                        	<li class="menu-title">Navigation</li>
							<li>
                                <a href="<%=request.getContextPath() %>/dashboard" class="waves-effect"><i class="mdi mdi-view-dashboard"></i><span> Dashboard </span></a>
                            </li>	 
							<li class="has_sub">
                                <a href="javascript:void(0);" class="waves-effect"><i class="mdi mdi-layers"></i><span> Home </span> <span class="menu-arrow"></span></a>
                                <ul class="list-unstyled">
                                    <li><a href="#">Link 1</a></li>
                                    <li><a href="#"> Link 2</a></li>
                                    <li><a href="#"> Link 3</a></li>
                                    <li><a href="#"> Link 4</a></li>
                                    <li><a href="#"> Link 5</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                    <div class="clearfix"></div>

                    <div class="help-box">
                        <h5 class="text-muted m-t-0">For Help ?</h5>
                        <p class=""><span class="text-custom">Email:</span> <br/>kumarkishan@gmail.com</p>
                        <p class="m-b-0"><span class="text-custom">Call:</span> <br/> (074) 06 52 28</p>
                    </div>

                </div>
            </div>
            
            <div class="content-page"> 
                <div class="content">
                    <div class="container">
                        <div class="row">
							<div class="col-xs-12">
								<div class="page-title-box">
                                    <h4 class="page-title">Home</h4>
                                    <ol class="breadcrumb p-0 m-0">
                                        <li>
                                            <a href="#">Home</a>
                                        </li> 
                                        <li class="active">
                                             Excel sheet
                                        </li>
                                    </ol>
                                    <div class="clearfix"></div>
                                </div>
							</div>
						</div>
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="card-box">
                                    <h4 class="header-title m-t-0">Save</h4>
                                    <a href="<%=request.getContextPath() %>/DownloadFileExcelSheet" type="button" class="btn btn-primary waves-effect w-md waves-light m-b-5">download</a>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="card-box table-responsive">
                                    <h4 class="m-t-0 header-title"><b>Show Data</b></h4>
                                    <table id="datatable" class="table table-striped table-bordered">
                                        <thead>
                                        <tr>
                                            <th>Branch Name</th>
                                            <th>Branch Code</th>
                                            <th>Invoic Number</th>
                                            <th>Invoice Date</th>
                                            <th>Modifield Date</th>
                                            <th>Status</th>
                                            <th>Delivery</th>
                                            <th>address</th>
                                            <th>payments</th>
                                            <th>Actions</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                          <c:forEach var="tempBanner" items="${banners}">
                                        <tr>
                                            <td><img src="${tempBanner.image}" width="80" height="50"/></td>
											<td>${tempBanner.caption1}</td>
											<td>${tempBanner.caption2}</td>
											<td>${tempBanner.caption3}</td>
											<td>${tempBanner.caption4}</td>
											<td>${tempBanner.typeofprop}</td>
											<td>${tempBanner.price}</td>
											<td>${tempBanner.sqft}</td>
											<td>${tempBanner.propLink}</td>
                                            <td class="actions">
												<a href="editbanner" class="on-default edit-row"><i class="fa fa-pencil"></i></a>
												<a href="deletebanner?id=${tempBanner.id}" class="on-default remove-row"><i class="fa fa-trash-o"></i></a>
											</td>
                                        </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
						
                    </div>
                </div>

                <footer class="footer text-right">
                    2020 © Rista List. Powered by Communus Technologies.
                </footer>

            </div>
        </div>
        
        <script>
            var resizefunc = [];
        </script>
 
        <script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/detect.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/fastclick.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.blockUI.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/waves.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.slimscroll.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.scrollTo.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/switchery/switchery.min.js"></script> 
        <script src="${pageContext.request.contextPath}/plugins/waypoints/jquery.waypoints.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/counterup/jquery.counterup.min.js"></script> 
		<script src="${pageContext.request.contextPath}/plugins/morris/morris.min.js"></script>
		<script src="${pageContext.request.contextPath}/plugins/raphael/raphael-min.js"></script> 
        <script src="${pageContext.request.contextPath}/assets/pages/jquery.dashboard.js"></script> 
        <script src="${pageContext.request.contextPath}/assets/js/jquery.core.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.app.js"></script>
		
		
		<script src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.js"></script>
        <script src="plugins/datatables/dataTables.bootstrap.js"></script>

        <script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.buttons.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/buttons.bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/jszip.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/pdfmake.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/vfs_fonts.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/buttons.html5.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/buttons.print.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.fixedHeader.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.keyTable.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.responsive.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/responsive.bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.scroller.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.colVis.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.fixedColumns.min.js"></script>
		
		<script>
            $(document).ready(function () {
                $('#datatable').dataTable();
                $('#datatable-keytable').DataTable({keys: true});
                $('#datatable-responsive').DataTable();
                $('#datatable-colvid').DataTable({
                    "dom": 'C<"clear">lfrtip',
                    "colVis": {
                        "buttonText": "Change columns"
                    }
                });
                $('#datatable-scroller').DataTable({
                    ajax: "../plugins/datatables/json/scroller-demo.json",
                    deferRender: true,
                    scrollY: 380,
                    scrollCollapse: true,
                    scroller: true
                });
                var table = $('#datatable-fixed-header').DataTable({fixedHeader: true});
                var table = $('#datatable-fixed-col').DataTable({
                    scrollY: "300px",
                    scrollX: true,
                    scrollCollapse: true,
                    paging: false,
                    fixedColumns: {
                        leftColumns: 1,
                        rightColumns: 1
                    }
                });
            });
            TableManageButtons.init();

        </script>

    </body>
</html>