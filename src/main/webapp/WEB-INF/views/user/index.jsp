<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/tablib.jsp"%>
<title>Trang chủ</title>
<body>
	<%@include file="../layouts/user/slider.jsp"%>
	<!-- Body Section -->
	<div id="mainBody">
		<div class="container">
			<div class="row">
				<!-- Sidebar ================================================== -->
				<%@include file="../layouts/user/sidebar.jsp"%>
				<!-- Sidebar end=============================================== -->
				<div class="span9">
					<div class="well well-small">
						<h4>
							Sản phẩm nổi bật <small class="pull-right text-error">${ productsHot.size() + productsHotLast.size() }
								Sản phẩm</small>
						</h4>
						<div class="row-fluid">
							<div id="featured" class="carousel slide">
								<div class="carousel-inner">
									<div class="item active">
										<ul class="thumbnails">
											<c:forEach var="item" items="${ productsHot }"
												varStatus="index">
												<li class="span3">
													<div class="thumbnail">
														<a href='<c:url value="/product-details/${ item.id }"/>'><img
															src="themes/images/products/${ item.image }" alt=""></a>
														<div class="caption">
															<h5 class="text-1-line ">${ item.name }</h5>
															<h4 class="text-center flex-column">
																<span class="pull-right text-warning"> <fmt:formatNumber
																		type="number" groupingUsed="true"
																		value="${ item.price }" /> ₫
																</span> <a class="btn btn-success"
																	href='<c:url value="/product-details/${ item.id }"/>'>Xem</a>
															</h4>
														</div>

													</div>
												</li>

											</c:forEach>
										</ul>
									</div>
									<div class="item">
										<ul class="thumbnails">

											<c:forEach var="item" items="${ productsHotLast }"
												varStatus="index">
												<li class="span3">
													<div class="thumbnail">
														<a href='<c:url value="/product-details/${ item.id }"/>'><img
															src="themes/images/products/${ item.image }" alt=""></a>
														<div class="caption">
															<h5>${ item.name }</h5>
															<h4 class="text-center flex-column">
																<span class="pull-right text-warning"><fmt:formatNumber
																		type="number" groupingUsed="true"
																		value="${ item.price }" /> ₫</span> <a
																	class="btn btn-success"
																	href='<c:url value="/product-details/${ item.id }"/>'>Xem</a>
															</h4>
														</div>
													</div>
												</li>
											</c:forEach>
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
						<c:choose>
							<c:when test="${ productsNew.size() > 0 }">
								<c:forEach var="item" items="${ productsNew }" varStatus="loop">
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
								</c:forEach>
							</c:when>
							<c:otherwise>
								<h5 class="text-success text-center">
									Shop hiện chưa có sản phẩm mới nào!!
									</h3>
							</c:otherwise>
						</c:choose>
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>
