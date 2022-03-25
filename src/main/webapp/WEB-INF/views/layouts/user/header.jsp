<%@page import="giadung.common.Common"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%> --%>
<div id="header">
	<div class="container">
		<div id="welcomeLine" class="row">
			<div class="span6">
				Chào mừng <strong> Phát</strong>
			</div>
			<div class="span6">
				<div class="pull-right">
					<a href="product_summary.php"><span
						class="btn btn-mini btn-primary"><i
							class="icon-shopping-cart icon-white"></i> 3 sản phẩm trong giỏ
							hàng </span> </a>
				</div>
			</div>
		</div>
		<!-- Navbar ================================================== -->
		<div id="logoArea" class="navbar">
			<a id="smallScreen" data-target="#topMenu" data-toggle="collapse"
				class="btn btn-navbar"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a>
			<div class="navbar-inner">
				<a class="brand" href="index.php"><img
					src="<%=Common.path%>themes/images/logo.png" alt="Bootsshop" /></a>
				<form class="form-inline navbar-search" method="post"
					action="products.php">
					<input id="srchFld" class="srchTxt" type="text" /> <select
						class="srchTxt">
						<option>Tất cả</option>
						<option>Áo</option>
						<option>Quần</option>
					</select>
					<button type="submit" id="submitButton" class="btn btn-primary">Tìm
						kiếm</button>
				</form>
				<ul id="topMenu" class="nav pull-right">
					<li class=""><a href="product">Sản phẩm</a></li>
					<li class=""><a href="normal.php">Đặt hàng</a></li>
					<li class=""><a href="contact.php">Liên hệ</a></li>
					<li class=""><a href="#login" role="button"
						data-toggle="modal" style="padding-right: 0"><span
							class="btn btn-large btn-success">Đăng nhập</span></a>
						<div id="login" class="modal hide fade in" tabindex="-1"
							role="dialog" aria-labelledby="login" aria-hidden="false">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">×</button>
								<h3>Đăng nhập</h3>
							</div>
							<div class="modal-body">
								<form class="form-horizontal loginFrm">
									<div class="control-group">
										<input type="text" id="inputEmail" placeholder="Email">
									</div>
									<div class="control-group">
										<input type="password" id="inputPassword"
											placeholder="Mật khẩu">
									</div>
									<div class="control-group">
										<label class="checkbox"> <input type="checkbox">
											Ghi nhớ
										</label>
									</div>
								</form>
								<button type="submit" class="btn btn-success">Đăng nhập</button>
								<button class="btn" data-dismiss="modal" aria-hidden="true">Đóng</button>
							</div>
						</div></li>
				</ul>
			</div>
		</div>
	</div>
</div>