<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/tablib.jsp"%>

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
						<li><a href="products.php">Sản phẩm</a> <span class="divider">/</span></li>
						<li class="active">Chi tiết sản phẩm</li>
					</ul>
					<div class="row">
						<div id="gallery" class="span3">
							<a href="<c:url value="/"/>themes/images/products/${ product.image }" title="">
									<img style="height:240px;width:240px;object-fit:cover;" src="<c:url value="/"/>themes/images/products/${ product.image }"  alt="" />
								</a>

							<div class="btn-toolbar">
								<div class="btn-group">
									<span class="btn"><i class="icon-envelope"></i></span> <span
										class="btn"><i class="icon-print"></i></span> <span
										class="btn"><i class="icon-zoom-in"></i></span> <span
										class="btn"><i class="icon-star"></i></span> <span class="btn"><i
										class=" icon-thumbs-up"></i></span> <span class="btn"><i
										class="icon-thumbs-down"></i></span>
								</div>
							</div>
						</div>
						<div class="span6">
							<h3>${ product.name }</h3>
							<hr class="soft" />
							<form class="form-horizontal qtyFrm">
								<div class="control-group">
									<label class="control-label text-success fw-bold">
										<span>
											<fmt:formatNumber type="number" groupingUsed="true" value="${ product.price }" /> ₫
										</span>
									</label>
									<div class="controls">
										<input style="width: 80px;" type="number" class="span1"
											placeholder="Số lượng." />
										<button type="submit"
											class="btn btn-large btn-primary pull-right">
											Thêm vào giỏ <i class=" icon-shopping-cart"></i>
										</button>
									</div>
								</div>
							</form>

							<hr class="soft" />
							<h4>100 sản phẩm tồn kho</h4>
							<hr class="soft clr" />
							<p>${ product.description }</p>

						</div>

						<div class="span9">
							<ul id="productDetail" class="nav nav-tabs">
								<li class="active"><a href="#home" data-toggle="tab">Chi
										tiết sản phẩm</a></li>
								<li><a href="#profile" data-toggle="tab">Sản phẩm tương
										tự</a></li>
							</ul>
							<div id="myTabContent" class="tab-content">
								<div class="tab-pane fade active in" id="home">
									<h4>Thông tin sản phẩm</h4>
									<table class="table table-bordered">
										<tbody>
											<tr class="techSpecRow">
												<th colspan="2">Chi tiết</th>
											</tr>
											<tr class="techSpecRow">
												<td class="techSpecTD1">Nhà sản xuất:</td>
												<td class="techSpecTD2">${ product.id_category }</td>
											</tr>
											<tr class="techSpecRow">
												<td class="techSpecTD1">Ngày sản xuất:</td>
												<td class="techSpecTD2">${ product.create_date }</td>
											</tr>
										</tbody>
									</table>


								</div>
								<div class="tab-pane fade" id="profile">
									<div id="myTab" class="pull-right">
										<a href="#listView" data-toggle="tab"><span
											class="btn btn-large"><i class="icon-list"></i></span></a> <a
											href="#blockView" data-toggle="tab"><span
											class="btn btn-large btn-primary"><i
												class="icon-th-large"></i></span></a>
									</div>
									<br class="clr" />
									<hr class="soft" />
									<div class="tab-content">
										<div class="tab-pane" id="listView">
											<div class="row">
												<div class="span2">
													<img src="themes/images/products/4.jpg" alt="" />
												</div>
												<div class="span4">

													<hr class="soft" />
													<h5>Tên sản phẩm</h5>
													<p>Mô tả.</p>
													<a class="btn btn-small pull-right"
														href="product_details.php">Xem chi tiết</a> <br
														class="clr" />
												</div>
												<div class="span3 alignR">
													<form class="form-horizontal qtyFrm">
														<h3>$222.00</h3>

														<div class="btn-group">
															<a href="product_details.php"
																class="btn btn-large btn-primary"> Thêm vào <i
																class=" icon-shopping-cart"></i></a> <a
																href="product_details.php" class="btn btn-large"><i
																class="icon-zoom-in"></i></a>
														</div>
													</form>
												</div>
											</div>
											<hr class="soft" />
											<div class="row">
												<div class="span2">
													<img src="themes/images/products/5.jpg" alt="" />
												</div>
												<div class="span4">

													<hr class="soft" />
													<h5>Tên sản phẩm</h5>
													<p>Mô tả.</p>
													<a class="btn btn-small pull-right"
														href="product_details.php">Xem chi tiết</a> <br
														class="clr" />
												</div>
												<div class="span3 alignR">
													<form class="form-horizontal qtyFrm">
														<h3>$222.00</h3>

														<div class="btn-group">
															<a href="product_details.php"
																class="btn btn-large btn-primary"> Thêm vào <i
																class=" icon-shopping-cart"></i></a> <a
																href="product_details.php" class="btn btn-large"><i
																class="icon-zoom-in"></i></a>
														</div>
													</form>
												</div>
											</div>
											<hr class="soft" />
											<div class="row">
												<div class="span2">
													<img src="themes/images/products/6.jpg" alt="" />
												</div>
												<div class="span4">

													<hr class="soft" />
													<h5>Tên sản phẩm</h5>
													<p>Mô tả.</p>
													<a class="btn btn-small pull-right"
														href="product_details.php">Xem chi tiết</a> <br
														class="clr" />
												</div>
												<div class="span3 alignR">
													<form class="form-horizontal qtyFrm">
														<h3>$222.00</h3>

														<div class="btn-group">
															<a href="product_details.php"
																class="btn btn-large btn-primary"> Thêm vào <i
																class=" icon-shopping-cart"></i></a> <a
																href="product_details.php" class="btn btn-large"><i
																class="icon-zoom-in"></i></a>
														</div>
													</form>
												</div>
											</div>
											<hr class="soft" />
											<div class="row">
												<div class="span2">
													<img src="themes/images/products/7.jpg" alt="" />
												</div>
												<div class="span4">

													<hr class="soft" />
													<h5>Tên sản phẩm</h5>
													<p>Mô tả.</p>
													<a class="btn btn-small pull-right"
														href="product_details.php">Xem chi tiết</a> <br
														class="clr" />
												</div>
												<div class="span3 alignR">
													<form class="form-horizontal qtyFrm">
														<h3>$222.00</h3>

														<div class="btn-group">
															<a href="product_details.php"
																class="btn btn-large btn-primary"> Thêm vào <i
																class=" icon-shopping-cart"></i></a> <a
																href="product_details.php" class="btn btn-large"><i
																class="icon-zoom-in"></i></a>
														</div>
													</form>
												</div>
											</div>

											<hr class="soft" />
											<div class="row">
												<div class="span2">
													<img src="themes/images/products/8.jpg" alt="" />
												</div>
												<div class="span4">

													<hr class="soft" />
													<h5>Tên sản phẩm</h5>
													<p>Mô tả.</p>
													<a class="btn btn-small pull-right"
														href="product_details.php">Xem chi tiết</a> <br
														class="clr" />
												</div>
												<div class="span3 alignR">
													<form class="form-horizontal qtyFrm">
														<h3>$222.00</h3>

														<div class="btn-group">
															<a href="product_details.php"
																class="btn btn-large btn-primary"> Thêm vào <i
																class=" icon-shopping-cart"></i></a> <a
																href="product_details.php" class="btn btn-large"><i
																class="icon-zoom-in"></i></a>
														</div>
													</form>
												</div>
											</div>
											<hr class="soft" />
											<div class="row">
												<div class="span2">
													<img src="themes/images/products/9.jpg" alt="" />
												</div>
												<div class="span4">

													<hr class="soft" />
													<h5>Tên sản phẩm</h5>
													<p>Mô tả.</p>
													<a class="btn btn-small pull-right"
														href="product_details.php">Xem chi tiết</a> <br
														class="clr" />
												</div>
												<div class="span3 alignR">
													<form class="form-horizontal qtyFrm">
														<h3>$222.00</h3>

														<div class="btn-group">
															<a href="product_details.php"
																class="btn btn-large btn-primary"> Thêm vào <i
																class=" icon-shopping-cart"></i></a> <a
																href="product_details.php" class="btn btn-large"><i
																class="icon-zoom-in"></i></a>
														</div>
													</form>
												</div>
											</div>
											<hr class="soft" />
										</div>
										<div class="tab-pane active" id="blockView">
											<ul class="thumbnails">
												<li class="span3">
													<div class="thumbnail">
											<a href='<c:url value="/product-details/${ item.id }"/>'>
												<img
												src="<c:url value="/"/>themes/images/products/${ item.image }"
												alt="image_products" />
											</a>
											<div class="caption">
												<h5>${ item.name }</h5>
												<h4 style="text-align: center">
													<div class="text-error" href="#"></div>
													<a class="btn btn-warning" href='<c:url value="/product-details/${ item.id }"/>'>
														<i class="icon-zoom-in"></i>
													</a> <a class="btn btn-primary" href="#">Thêm vào <i
														class="icon-shopping-cart"></i>
													</a>
													<div class="text-success" href="#">
														<fmt:formatNumber type="number" groupingUsed="true"
															value="${ item.price }" />
														₫
													</div>
												</h4>
											</div>
										</div>
												</li>
												
												
												
												
												
											</ul>
											<hr class="soft" />
										</div>
									</div>
									<br class="clr">
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- MainBody End ============================= -->
	<!-- Footer ================================================================== -->
</body>