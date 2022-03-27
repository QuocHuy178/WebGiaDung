
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="sidebar" class="span3">
	<div class="well well-small">
		<a id="myCart" href="product_summary.php"><img
			src="themes/images/ico-cart.png" alt="cart">3 sản phẩm <span
			class="badge badge-warning pull-right">$155.00</span></a>
	</div>
	<ul id="sideManu" class="nav nav-tabs nav-stacked">
		<li class="subMenu open"><a> Danh mục (${cates.size()})</a>
			<ul>
				<c:forEach var="item" items="${ cates }" varStatus="index">
					<li><a href='<c:url value="/category/${item.id }"/>'> <i
							class="icon-chevron-right"></i> ${ item.name }
					</a></li>
				</c:forEach>
			</ul>
		</li>
	</ul>
	<br />
	<c:forEach var="item" items="${ productssidebar }" varStatus="index">
		<div class="thumbnail">
			<a href="/product_details/${ item.id }"> <img
				src="themes/images/products/${ item.image }" alt="">
			</a>
			<div class="caption">
				<h5>${ item.name }</h5>
				<h4 style="text-align: center">
					<div class="text-error" href="#">
						<fmt:formatNumber type="number" groupingUsed="true"
							value="${ item.price }" />
						VNĐ
					</div>
					<a class="btn btn-warning" href="/product_details/${ item.id }">
						<i class="icon-zoom-in"></i>
					</a> <a class="btn btn-primary" href="#">Thêm vào <i
						class="icon-shopping-cart"></i>
					</a>
				</h4>
			</div>
		</div>
	</c:forEach>
	<br />
	<div class="thumbnail">
		<img src="themes/images/payment_methods.png"
			title="Bootshop Payment Methods" alt="Payments Methods">
		<div class="caption">
			<h5>Phương thức thanh toán</h5>
		</div>
	</div>
</div>