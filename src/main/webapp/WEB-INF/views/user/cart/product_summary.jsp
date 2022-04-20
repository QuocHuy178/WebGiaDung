<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/tablib.jsp"%>
<body>
	<%-- <%@include file="../../layouts/user/slider.jsp"%> --%>
	<!-- Header End====================================================================== -->
	<div id="mainBody">
		<div class="container">
			<div class="row">
				<!-- Sidebar ================================================== -->
				<%@include file="../../layouts/user/sidebar.jsp"%>
				<!-- Sidebar end=============================================== -->
				<div class="span9">
					<ul class="breadcrumb">
						<li><a href="index">Trang chủ</a> <span class="divider">/</span></li>
						<li class="active">Giỏ hàng</li>
					</ul>
					<h3>
						Giỏ hàng [ <small> ${ TotalQuantyCart } sản phẩm </small>]<a
							href='<c:url value="/product/"/>'
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
								<th>Chỉnh sửa</th>
								<th>Giá</th>
								<th>Tổng cộng</th>
								<th>Xóa</th>
							</tr>
						</thead>
						<tbody>

							<c:forEach var="item" items="${ Cart }">
								<tr>
									<td><img
										src="themes/images/products/${item.value.product.image}"
										alt="" /></td>
									<td>${ item.value.product.name }</td>

									<!-- input so luong -->
									<td><input class="span1" style="max-width: 34px"
										type="number" value="${ item.value.quanty }" min="0"
										max="1000" placeholder="1" id="quanty-cart-${item.key }">


									</td>

									<!-- nut eidt -->
									<td><button data-id="${item.key}"
											class="btn btn-mini btn-danger edit-card" type="button">
											<span class="icon-check"></span>
										</button></td>

									<td><fmt:formatNumber type="number" groupingUsed="true"
											value="${ item.value.totalPrice }" /> VNĐ</td>

									<td><fmt:formatNumber type="number" groupingUsed="true"
											value="${ item.value.totalPrice * item.value.quanty}" /> VNĐ
									</td>

									<!-- nut delete -->
									<td><a href="<c:url value="/DeleteCart/${item.key }"/>"
										class="btn btn-danger" type="button"> <i
											class="icon-remove icon-white"></i>
									</a></td>
								</tr>
							</c:forEach>


							<tr>
								<td colspan="6" style="text-align: right"><strong>Tổng
										cộng =</strong></td>
								<td class="label label-important" style="display: block"><strong>
										<fmt:formatNumber type="number" groupingUsed="true"
											value="${ TotalPriceCart }" /> VNĐ
								</strong></td>
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
					<c:choose>
						<c:when test="${not empty LoginInfo }">
							<a href='<c:url value="/checkout/"/>'
								class="btn btn-large pull-right btn-danger" type="button">Thanh
								toán <i class="icon-arrow-right"></i>
							</a>
						</c:when>
						<c:otherwise>
							<a href='<c:url value="/dang-ky/"/>'
								class="btn btn-large pull-right btn-danger" type="button">Thanh
								toán <i class="icon-arrow-right"></i>
							</a>
  						</c:otherwise>
					</c:choose>


				</div>
			</div>
		</div>
	</div>
	<!-- MainBody End ============================= -->
	<!-- Footer ================================================================== -->

	<content tag="script"> <script>
		$(".edit-card").on("click", function() {
			var id = $(this).data("id");
			var quanty = $("#quanty-cart-" + id).val();
			/* 			alert(quanty); */
			window.location = "EditCart/" + id + "/" + quanty;
		});
	</script> </content>
</body>

