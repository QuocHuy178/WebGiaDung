﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
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
						<li class="active">Đăng Kí</li>
					</ul>
					<div class="row">
						<!-- dangky -->
						<div class="span4">
							<div class="well">
								<h5>Tạo tài khoản</h5>
								 <form:form action="dang-ky" method="POST" modelAttribute="user">
									<div class="control-group">
										<label class="control-label" for="inputEmail0">E-mail</label>
										<div class="controls">
											<form:input type="email" class="span3"
												placeholder="Nhập Email của bạn" path="user" />
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
								</form:form>
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