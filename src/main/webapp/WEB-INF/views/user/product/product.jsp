<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<body>
<%@include file="../../layouts/user/slider.jsp"%>
<!-- Header End====================================================================== -->
<div id="mainBody">
	<div class="container">
		<div class="row">
			<!-- Sidebar ================================================== -->
			<%@include file="../../layouts/user/sidebar.jsp"%>
			<!-- Sidebar end=============================================== -->
			<div class="span9">
				<ul class="breadcrumb">
					<li><a href="index.php">Trang chủ</a> <span class="divider">/</span></li>
					<li class="active">Sản phẩm</li>
				</ul>

				<hr class="soft" />
				<form class="form-horizontal span6">
					<div class="control-group">
						<label class="control-label alignL">Sắp xếp theo </label> <select>
							<option>Tên sản phẩm A - Z</option>
							<option>Tên sản phẩm Z - A</option>
							<option>Giá thấp - cao</option>
							<option>Giá cao - thấp</option>
						</select>
					</div>
				</form>

				<div id="myTab" class="pull-right">
					<a href="#listView" data-toggle="tab"></a> <a
						href="#blockView" data-toggle="tab"><span
						class="btn btn-large btn-primary"><i class="icon-th-large"></i></span></a>
				</div>
				<br class="clr" />
				<div class="tab-content">

					<div class="tab-pane  active" id="blockView">
						<ul class="thumbnails">
						
							<li class="span3">
								<div class="thumbnail">
									<a href="product_details.php"><img
										src="themes/images/products/3.jpg" alt="" /></a>
									<div class="caption">
										<h5>Manicure &amp; Pedicure</h5>
										<p>Mô tả.</p>
										<h4 style="text-align: center">
											<a class="btn" href="product_details.php"> <i
												class="icon-zoom-in"></i></a> <a class="btn" href="#">Thêm
												vào <i class="icon-shopping-cart"></i>
											</a> <a class="btn btn-primary" href="#">&euro;222.00</a>
										</h4>
									</div>
								</div>
							</li>
						</ul>
						<hr class="soft" />
					</div>
				</div>

				<div class="pagination">
					<ul>
						<li><a href="#">&lsaquo;</a></li>
						<li><a class="active" href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">...</a></li>
						<li><a href="#">&rsaquo;</a></li>
					</ul>
				</div>
				<br class="clr" />
			</div>
		</div>
	</div>
</div>
<!-- MainBody End ============================= -->
<!-- Footer ================================================================== -->
</body>