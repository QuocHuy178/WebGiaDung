<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/tablib.jsp"%>
<div id="carouselBlk">
	<div id="myCarousel" class="carousel slide">
		<div class="carousel-inner">
			<c:forEach var="item" items="${ slides }" varStatus="index">
				<c:if test="${index.first }">
					<div class="item active">
				</c:if>
				<c:if test="${not index.first }">
					<div class="item">
				</c:if>
				<div class="container">
					<a href="register.php"> <img style="width: 100%"
						src="<c:url value="/"/>themes/images/carousel/${item.img}"
						alt="special offers" />
					</a>
					<div class="carousel-caption">
						<h4>${item.caption}</h4>
						<p>${item.content}</p>
					</div>
				</div>
		</div>
		</c:forEach>
	</div>
	<a class="left carousel-control" href="#myCarousel" data-slide="prev">&lsaquo;</a>
	<a class="right carousel-control" href="#myCarousel" data-slide="next">&rsaquo;</a>
</div>
</div>