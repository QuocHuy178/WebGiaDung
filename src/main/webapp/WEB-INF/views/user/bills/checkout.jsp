<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/tablib.jsp"%>
<body>
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
						<li class="active">Thanh toán</li>
					</ul>
					<h3>Thanh toán đơn hàng</h3>
					<hr class="soft" />
					<form:form method="POST" modelAttribute="bills"
						class="form-horizontal">
						<div class="control-group">
							<label class="control-label" for="inputFname1">Họ và tên
								<sup>*</sup>
							</label>
							<div class="controls">
								<form:input type="text" class="span3"
									placeholder="Nhập họ và tên của bạn" path="display_name" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input_phone">Email<sup>*</sup>
							</label>
							<div class="controls">
								<form:input type="email" class="span3"
									placeholder="Nhập số điện thoại của bạn" path="user" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input_phone">Số điện
								thoại<sup>*</sup>
							</label>
							<div class="controls">
								<form:input type="text" class="span3"
									placeholder="Nhập số điện thoại của bạn" path="phone" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input_phone">Địa chỉ<sup>*</sup>
							</label>
							<div class="controls">
								<form:textarea type="text" class="span3"
									placeholder="Nhập số địa chỉ của bạn" path="address" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input_phone">Ghi chú</label>
							<div class="controls">
								<form:textarea type="text" class="span3"
									placeholder="Nhập số địa chỉ của bạn" path="note" />
							</div>
						</div>
						<!-- 						<table class="table table-bordered">
							<thead>
								<tr>
									<th>Sản phẩm</th>
									<th>Tên sản phẩm</th>
									<th>Số lượng</th>
									<th>Giá</th>
									<th>Tạm tính</th>
									<th>Giảm giá</th>
									<th>Tổng cộng</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><img width="60" src="themes/images/products/4.jpg"
										alt="" /></td>
									<td>MASSA AST<br />Color : black, Material : metal
									</td>
									<td>
										<div class="input-append">
											<input class="span1" style="max-width: 34px" placeholder="1"
												id="appendedInputButtons" size="16" type="text" readonly>
										</div>
									</td>
									<td>$120.00</td>
									<td>$25.00</td>
									<td>$15.00</td>
									<td>$110.00</td>
								</tr>
								<tr>
									<td><img width="60" src="themes/images/products/8.jpg"
										alt="" /></td>
									<td>MASSA AST<br />Color : black, Material : metal
									</td>
									<td>
										<div class="input-append">
											<input class="span1" style="max-width: 34px" placeholder="1"
												size="16" type="text" readonly>
										</div>
									</td>
									<td>$7.00</td>
									<td>--</td>
									<td>$1.00</td>
									<td>$8.00</td>
								</tr>
								<tr>
									<td><img width="60" src="themes/images/products/3.jpg"
										alt="" /></td>
									<td>MASSA AST<br />Color : black, Material : metal
									</td>
									<td>
										<div class="input-append">
											<input class="span1" style="max-width: 34px" placeholder="1"
												size="16" type="text" readonly>
										</div>
									</td>
									<td>$120.00</td>
									<td>$25.00</td>
									<td>$15.00</td>
									<td>$110.00</td>
								</tr>

								<tr>
									<td colspan="6" style="text-align: right"><strong>TỔNG CỘNG =</strong></td>
									<td class="label label-important" style="display: block">
										<strong> $155.00 </strong>
									</td>
								</tr>
							</tbody>
						</table> -->

						<div class="control-group pull-right">
							<div class="controls">
								<input  class="btn btn-large btn-success" type="submit"
									value="Đặt hàng" />
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
	<!-- MainBody End ============================= -->
	<!-- Footer ================================================================== -->
</body>