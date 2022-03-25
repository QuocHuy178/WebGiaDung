<%@page import="giadung.common.Common"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>Trang chủ</title>
<body>
	<%@include file="../layouts/user/slider.jsp"%>
	<!-- Body Section -->
	<div id="mainBody">
		<div class="container">
			<div class="row">
				<!-- Sidebar ================================================== -->
				<%@include file="../layouts/user/slidebar.jsp"%>
				<!-- Sidebar end=============================================== -->
				<div class="span9">
					<div class="well well-small">
						<h4>
							Sản phẩm nổi bật <small class="pull-right">200+ sản phẩm</small>
						</h4>
						<div class="row-fluid">
							<div id="featured" class="carousel slide">
								<div class="carousel-inner">
									<div class="item active">
										<ul class="thumbnails">
											<li class="span3">
												<div class="thumbnail">
													<i class="tag"></i> <a href="product_details.php"><img
														src="themes/images/products/b1.jpg" alt=""></a>
													<div class="caption">
														<h5>Giày</h5>
														<h4 class="text-center flex-column">
															<span class="pull-right text-warning">$222.00</span> <a
																class="btn btn-success" href="product_details.php">Xem</a>
														</h4>
													</div>
												</div>
											</li>
											<li class="span3">
												<div class="thumbnail">
													<i class="tag"></i> <a href="product_details.php"><img
														src="themes/images/products/b1.jpg" alt=""></a>
													<div class="caption">
														<h5>Giày</h5>
														<h4 class="text-center flex-column">
															<span class="pull-right text-warning">$222.00</span> <a
																class="btn btn-success" href="product_details.php">Xem</a>
														</h4>
													</div>
												</div>
											</li>
											<li class="span3">
												<div class="thumbnail">
													<i class="tag"></i> <a href="product_details.php"><img
														src="themes/images/products/b1.jpg" alt=""></a>
													<div class="caption">
														<h5>Giày</h5>
														<h4 class="text-center flex-column">
															<span class="pull-right text-warning">$222.00</span> <a
																class="btn btn-success" href="product_details.php">Xem</a>
														</h4>
													</div>
												</div>
											</li>
											<li class="span3">
												<div class="thumbnail">
													<i class="tag"></i> <a href="product_details.php"><img
														src="themes/images/products/b1.jpg" alt=""></a>
													<div class="caption">
														<h5>Giày</h5>
														<h4 class="text-center flex-column">
															<span class="pull-right text-warning">$222.00</span> <a
																class="btn btn-success" href="product_details.php">Xem</a>
														</h4>
													</div>
												</div>
											</li>


										</ul>
									</div>
									<div class="item">
										<ul class="thumbnails">
											<li class="span3">
												<div class="thumbnail">
													<i class="tag"></i> <a href="product_details.php"><img
														src="themes/images/products/b1.jpg" alt=""></a>
													<div class="caption">
														<h5>Giày</h5>
														<h4 class="text-center flex-column">
															<span class="pull-right text-warning">$222.00</span> <a
																class="btn btn-success" href="product_details.php">Xem</a>
														</h4>
													</div>
												</div>
											</li>
											<li class="span3">
												<div class="thumbnail">
													<i class="tag"></i> <a href="product_details.php"><img
														src="themes/images/products/b1.jpg" alt=""></a>
													<div class="caption">
														<h5>Giày</h5>
														<h4 class="text-center flex-column">
															<span class="pull-right text-warning">$222.00</span> <a
																class="btn btn-success" href="product_details.php">Xem</a>
														</h4>
													</div>
												</div>
											</li>
										</ul>
									</div>
									
									
								</div>
								<a class="left carousel-control" href="#featured"
									data-slide="prev">‹</a> <a class="right carousel-control"
									href="#featured" data-slide="next">›</a>
							</div>
						</div>
					</div>
					<h4>Sản phẩm mới nhất</h4>
					<ul class="thumbnails">
						<c:forEach var="item" items="${ slides }" varStatus="index">
							<li class="span3">
								<div class="thumbnail">
									<a href="product_details.php"> <img
										src="<%=Common.path%>themes/images/products/${item.img}"
										alt="products" /></a>
									<div class="caption">
										<h5>${item.caption}</h5>
										<p>${item.content}</p>

										<h4 style="text-align: center">
											<div class="text-error" href="#">$222.00</div>
											<a class="btn btn-warning" href="product_details.php"> <i
												class="icon-zoom-in"></i>
											</a> <a class="btn btn-primary" href="#">Thêm vào <i
												class="icon-shopping-cart"></i>
											</a>
										</h4>
									</div>
								</div>
							</li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>
