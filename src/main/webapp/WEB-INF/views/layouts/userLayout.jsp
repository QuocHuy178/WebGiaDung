<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@include file="/WEB-INF/views/layouts/user/tablib.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<title>Bootshop online Shopping cart</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<!--Less styles -->
<!-- Other Less css file //different less files has different color scheam
	<link rel="stylesheet/less" type="text/css" href="themes/less/simplex.less">
	<link rel="stylesheet/less" type="text/css" href="themes/less/classified.less">
	<link rel="stylesheet/less" type="text/css" href="themes/less/amelia.less">  MOVE DOWN TO activate
	-->
<!--<link rel="stylesheet/less" type="text/css" href="themes/less/bootshop.less">
	<script src="themes/js/less.js" type="text/javascript"></script> -->

<!-- Bootstrap style -->
<link id="callCss" rel="stylesheet"
	href="<c:url value="/"/>themes/bootshop/bootstrap.min.css"
	media="screen" />
<link href="<c:url value="/"/>themes/css/base.css" rel="stylesheet"
	media="screen" />
<!-- Bootstrap style responsive -->
<link href="<c:url value="/"/>themes/css/bootstrap-responsive.min.css"
	rel="stylesheet" />
<link href="<c:url value="/"/>themes/css/font-awesome.css"
	rel="stylesheet" type="text/css">

<!-- Switch mode interface -->
<link rel="stylesheet"
	href="<c:url value="/"/>themes/switch/themeswitch.css" type="text/css"
	media="screen" />

<!-- Google-code-prettify -->
<link
	href="<c:url value="/"/>themes/js/google-code-prettify/prettify.css"
	rel="stylesheet" />

<!-- custom css -->
<link href="<c:url value="/"/>themes/css/custom.css" rel="stylesheet"
	media="screen" />
<!-- fav and touch icons -->
<link rel="shortcut icon"
	href="<c:url value="/"/>themes/images/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="<c:url value="/"/>themes/images/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="<c:url value="/"/>themes/images/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="<c:url value="/"/>themes/images/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="<c:url value="/"/>themes/images/ico/apple-touch-icon-57-precomposed.png">
<style type="text/css" id="enject"></style>
</head>
<body>
	<%@include file="/WEB-INF/views/layouts/user/header.jsp"%>

	<decorator:body />

	<%@include file="/WEB-INF/views/layouts/user/footer.jsp"%>

</body>
<!-- Placed at the end of the document so the pages load faster ============================================= -->
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script src="<c:url value="/"/>themes/js/jquery.js"
	type="text/javascript"></script>
<script src="<c:url value="/"/>themes/js/bootstrap.min.js"
	type="text/javascript"></script>
<script
	src="<c:url value="/"/>themes/js/google-code-prettify/prettify.js"></script>
<script src="<c:url value="/"/>themes/js/bootshop.js"></script>
<script src="<c:url value="/"/>themes/js/jquery.lightbox-0.5.js"></script>
<script src="<c:url value="/"/>themes/switch/theamswitcher.js"
	type="text/javascript" charset="utf-8"></script>
</html>
