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
						<li><a href='<c:url value="/home"/>'>Trang chủ</a> <span
							class="divider">/</span></li>
						<li class="active">Đăng nhập</li>
					</ul>
					<div class="row">
						<!-- dangky -->
						<div class="span4">
							<div class="well">
								<h5>Tạo tài khoản</h5>
								<%-- <form:form action="register" method="POST" modelAttribute="user"> --%>
									<div class="control-group">
										<label class="control-label" for="inputEmail0">E-mail</label>
										<div class="controls">
											<form:input type="email" path="user" class="span3"
												placeholder="Nhập Email của bạn" />
										</div>

										<label class="control-label" for="inputEmail1">Mật
											khẩu</label>
										<div class="controls">
											<form:input type="password" path="password" class="span3"
												placeholder="Nhập mật khẩu của bạn" />
										</div>

										<label class="control-label" for="name">Họ và Tên</label>
										<div class="controls">
											<form:input type="text" path="display_name" class="span3"
												placeholder="Nhập họ và tên của bạn" />

											<label class="control-label" for="name">Địa chỉ</label>
											<div class="controls">
												<form:input type="text" path="address" class="span3"
													placeholder="Nhập địa chỉ của bạn" />
											</div>
										</div>
										<div class="controls">
											<button type="submit" class="btn block btn-info">Đăng
												ký thành viên</button>
										</div>
									</div>
							<%-- 	</form:form> --%>
							</div>
						</div>

						<!-- dangnhap -->
						<div class="span1">&nbsp;</div>
						<div class="span4">
							<div class="well">
								<h5>Đã có tài khoản ?</h5>
								<form>
									<div class="control-group">
										<label class="control-label" for="inputEmail1">Email</label>
										<div class="controls">
											<input class="span3" type="text" id="inputEmail1"
												placeholder="Email">
										</div>
									</div>
									<div class="control-group">
										<label class="control-label" for="inputPassword1">Mật
											khẩu</label>
										<div class="controls">
											<input type="password" class="span3" id="inputPassword1"
												placeholder="Mật khẩu">
										</div>
									</div>
									<div class="control-group">
										<div class="controls">
											<button type="submit" class="btn">Đăng nhập</button>
											<a href="forgetpass">Quên mật khẩu ?</a>
										</div>
									</div>
								</form>
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