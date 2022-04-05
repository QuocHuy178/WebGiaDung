
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
						<li><a href='<c:url value="/home"/>'>Trang chủ</a> <span class="divider">/</span></li>
						<li class="active">Đăng nhập</li>
					</ul>
					<div class="row">
						<div class="span4">
							<div class="well">
								<h5>Bạn đã có tài khoản?</h5>
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
											<a href="'<c:url value="/forgetpass"/>'">Quên mật khẩu ?</a>
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
