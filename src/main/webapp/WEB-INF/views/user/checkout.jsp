<body>
	<%@include file="../layouts/user/slider.jsp"%>
	<!-- Header End====================================================================== -->
	<div id="mainBody">
		<div class="container">
			<div class="row">
				<!-- Sidebar ================================================== -->
				<%@include file="../layouts/user/slidebar.jsp"%>
				<!-- Sidebar end=============================================== -->
				<div class="span9">
					<ul class="breadcrumb">
						<li><a href="index">Trang chủ</a> <span class="divider">/</span></li>
						<li class="active">Thanh toán</li>
					</ul>
					<h3>Thanh toÃ¡n</h3>
					<hr class="soft" />

					<form class="form-horizontal">
						<div class="control-group">
							<label class="control-label" for="inputFname1">Há» tÃªn
								<sup>*</sup>
							</label>
							<div class="controls">
								<input type="text" id="inputFname1" placeholder="Há» tÃªn">
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input_phone"> Sá»
								Äiá»n thoáº¡i <sup>*</sup>
							</label>
							<div class="controls">
								<input type="text" id="input_phone"
									placeholder="Sá» Äiá»n thoáº¡i">
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input_phone"> Äá»a
								chá» <sup>*</sup>
							</label>
							<div class="controls">
								<input type="text" id="input_phone" placeholder="Äá»a chá»">
							</div>
						</div>
						<table class="table table-bordered">
							<thead>
								<tr>
									<th>Sáº£n pháº©m</th>
									<th>MÃ´ táº£</th>
									<th>Sá» lÆ°á»£ng</th>
									<th>GiÃ¡</th>
									<th>Tá»ng tiá»n sáº£n pháº©m</th>
									<th>Giáº£m giÃ¡</th>
									<th>Tá»ng cá»ng</th>
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
									<td colspan="6" style="text-align: right">Tá»ng tiá»n:</td>
									<td>$228.00</td>
								</tr>
								<tr>
									<td colspan="6" style="text-align: right">Tá»ng giáº£m
										giÃ¡:</td>
									<td>$50.00</td>
								</tr>
								<tr>
									<td colspan="6" style="text-align: right">Tá»ng cá»ng:</td>
									<td>$31.00</td>
								</tr>
								<tr>
									<td colspan="6" style="text-align: right"><strong>Tá»ng
											cá»ng =</strong></td>
									<td class="label label-important" style="display: block">
										<strong> $155.00 </strong>
									</td>
								</tr>
							</tbody>
						</table>

						<div class="control-group pull-right">
							<div class="controls">
								<input type="hidden" name="email_create" value="1"> <input
									type="hidden" name="is_new_customer" value="1"> <input
									class="btn btn-large btn-success" type="submit"
									value="Äáº·t hÃ ng" />
							</div>
						</div>
					</form>
					<
				</div>
			</div>
		</div>
	</div>
	<!-- MainBody End ============================= -->
	<!-- Footer ================================================================== -->
</body>