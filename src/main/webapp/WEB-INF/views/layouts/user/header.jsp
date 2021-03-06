<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/tablib.jsp"%>
<div id="header">
	<div class="container">
		<div id="welcomeLine" class="row">
			<div class="span6">
				<c:if test="${not empty LoginInfo }">
					Xin chào <strong>${LoginInfo.display_name}</strong>, Chúc bạn một ngày tốt lành!
				</c:if>
			</div>

			<div class="span6">
				<div class="pull-right">
					<c:choose>
						<c:when test="${not empty TotalQuantyCart }">
							<a href="<c:url value="/listcart"/>"> <span
								class="btn btn-mini btn-primary"> <i
									class="icon-shopping-cart icon-white"></i> ${ TotalQuantyCart }
									sản phẩm trong giỏ hàng
							</span>
							</a>
						</c:when>
						<c:otherwise>
							<a href="<c:url value="/listcart"/>"> <span
								class="btn btn-mini btn-primary"> <i
									class="icon-shopping-cart icon-white"></i> 0 sản phẩm trong giỏ
									hàng
							</span>
							</a>
						</c:otherwise>
					</c:choose>
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
				<a class="brand" href='<c:url value="/home"/>'><img
					src="<c:url value="/"/>themes/images/giadunglogo.png"
					alt="ThuanFastStore" /></a>

				<form class="form-inline navbar-search" method="post"
					action="href='<c:url value="product"/>'">
					<input placeholder="Tìm kiếm sản phẩm..." id="srchFld"
						class="srchTxt" type="text" /> <select class="srchTxt"
						name="options">
						<option value="">-- Lọc --</option>
						<c:forEach var="item" items="${ cates }" varStatus="index">
							<option value="${ item.id }">${ item.name }</option>
						</c:forEach>
					</select>
					<button type="submit" id="submitButton" class="btn btn-primary">Tìm
						kiếm</button>
				</form>
				<ul id="topMenu" class="nav pull-right">

					<li class=""><a href='<c:url value="/product"/>'>Sản phẩm</a></li>
					<li class=""><a href="listcart">Đặt hàng</a></li>
					<li class=""><a href="contact">Liên hệ</a></li>
					<c:if test="${empty LoginInfo }">
						<li class=""><a href='<c:url value="/dang-ky"/>'
							role="button" data-toggle="modal" style="padding-right: 0"> <span
								class="btn btn-large btn-success">Tài khoản </span>
						</a>
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
									<button type="submit" class="btn btn-success">Đăng
										nhập</button>
									<button class="btn" data-dismiss="modal" aria-hidden="true">Đóng</button>
								</div>
							</div></li>
					</c:if>
					<c:if test="${not empty LoginInfo }">
						<li class=""><a href='<c:url value="/dang-xuat"/>'
							role="button" data-toggle="modal" style="padding-right: 0"> <span
								class="btn btn-large btn-danger">Đăng xuất</span>
						</a></li>
					</c:if>
				</ul>
			</div>
		</div>
	</div>
</div>