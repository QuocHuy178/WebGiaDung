<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
					<li><a href="index.php">Trang chủ</a> <span class="divider">/</span></li>
					<li class="active">Đăng nhập</li>
				</ul>
				<h3> Đăng nhập</h3>
				<hr class="soft" />

				<div class="row">
					<div class="span4">
						<div class="well">
							<h5>Tạo tài khoản</h5><br />
							Nhập email để tạo tài khoản của bạn.<br /><br /><br />
							<form action="register.php">
								<div class="control-group">
									<label class="control-label" for="inputEmail0">E-mail</label>
									<div class="controls">
										<input class="span3" type="text" id="inputEmail0" placeholder="Email">
									</div>
								</div>
								<div class="controls">
									<button type="submit" class="btn block">Đăng ký</button>
								</div>
							</form>
						</div>
					</div>
					<div class="span1"> &nbsp;</div>
					<div class="span4">
						<div class="well">
							<h5>Đã có tài khoản ?</h5>
							<form>
								<div class="control-group">
									<label class="control-label" for="inputEmail1">Email</label>
									<div class="controls">
										<input class="span3" type="text" id="inputEmail1" placeholder="Email">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" for="inputPassword1">Mật khẩu</label>
									<div class="controls">
										<input type="password" class="span3" id="inputPassword1" placeholder="Mật khẩu">
									</div>
								</div>
								<div class="control-group">
									<div class="controls">
										<button type="submit" class="btn">Đăng nhập</button> <a href="forgetpass.php">Quên mật khẩu ?</a>
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