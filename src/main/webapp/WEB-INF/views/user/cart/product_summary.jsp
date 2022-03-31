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
					<li class="active">Giỏ hàng</li>
				</ul>
				<h3>
					Giỏ hàng [ <small> ${ TotalQuantyCart } sản phẩm </small>]<a href="products.php"
						class="btn btn-large pull-right"><i class="icon-arrow-left"></i>
						Trở lại trang sản phẩm </a>
				</h3>
				<hr class="soft" />


				<table class="table table-bordered">
					<thead>
						<tr>
							<th>Sản phẩm</th>
							<th>Mô tả</th>
							<th>Số lượng</th>
							<th>Cập nhật</th>
							<th>Giá</th>
						
							<th>Tổng cộng</th>
							<th>Xóa</th>
						</tr>
					</thead>
					<tbody>

							<c:forEach var="item" items="${ Cart }"
												>
								<tr>
								<td><img width="60" src="themes/images/products/3.jpg"
									alt="" /></td>
								<td>
								${ item.value.product.name }
								</td>
								<td>
									<div class="input-append">
										<input class="span1" style="max-width: 34px" type="number"
											value="${ item.value.quanty }" size="16" min="0" max="1000" placeholder="1">
										
									</div>
								</td>
								<td><a href="<c:url value="/EditCart/1"/>" class="btn" type="button">
											<i class="icon-check"></i>
										</a></td>
								<td>
									<fmt:formatNumber type="number" groupingUsed="true"
							value="${ item.value.totalPrice }" />  ₫
								</td>
							
								<td>
									<fmt:formatNumber type="number" groupingUsed="true"
							value="${ item.value.totalPrice * item.value.quanty}" />  ₫
								 </td>
								<td>
										<a href="<c:url value="/DeleteCart/${item.key }"/>" class="btn btn-danger" type="button">
											<i class="icon-remove icon-white"></i>
										</a></td>
								</tr>			
							</c:forEach>
					
					

						
						<tr>
							<td colspan="6" style="text-align: right"><strong>Tổng
									cộng =</strong></td>
							<td class="label label-important" style="display: block">
							<strong>
								<fmt:formatNumber type="number" groupingUsed="true" value="${ TotalPriceCart }" /> ₫ 
							</strong>
							</td>
						</tr>
					</tbody>
				</table>


				<!-- <table class="table table-bordered">
						<tbody>
							<tr>
								<td>
									<form class="form-horizontal">
										<div class="control-group">
											<label class="control-label"><strong> VOUCHERS CODE: </strong> </label>
											<div class="controls">
												<input type="text" class="input-medium" placeholder="CODE">
												<button type="submit" class="btn"> ADD </button>
											</div>
										</div>
									</form>
								</td>
							</tr>

						</tbody>
					</table> -->


				<a href="login.php" class="btn btn-large pull-right">Thanh toán
					<i class="icon-arrow-right"></i>
				</a>

			</div>
		</div>
	</div>
</div>
<!-- MainBody End ============================= -->
<!-- Footer ================================================================== -->
</body>