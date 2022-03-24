<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
	href="<%=Common.path%>themes/bootshop/bootstrap.min.css" media="screen" />
<link href="themes/css/base.css" rel="stylesheet" media="screen" />
<!-- Bootstrap style responsive -->
<link href="<%=Common.path%>themes/css/bootstrap-responsive.min.css"
	rel="stylesheet" />
<link href="<%=Common.path%>themes/css/font-awesome.css"
	rel="stylesheet" type="text/css">

<!-- Switch mode interface -->
<link rel="stylesheet"
	href="<%=Common.path%>themes/switch/themeswitch.css" type="text/css"
	media="screen" />


<!-- Google-code-prettify -->
<link href="<%=Common.path%>themes/js/google-code-prettify/prettify.css"
	rel="stylesheet" />
<!-- fav and touch icons -->
<link rel="shortcut icon" href="themes/images/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="<%=Common.path%>themes/images/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="<%=Common.path%>themes/images/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="<%=Common.path%>themes/images/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="<%=Common.path%>themes/images/ico/apple-touch-icon-57-precomposed.png">
<style type="text/css" id="enject"></style>
</head>
<body>
	<%@include file="/WEB-INF/views/layouts/user/header.jsp"%>

	<decorator:body />

	<%@include file="/WEB-INF/views/layouts/user/footer.jsp"%>

</body>
<!-- Placed at the end of the document so the pages load faster ============================================= -->
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script src="<%=Common.path%>themes/js/jquery.js" type="text/javascript"></script>
<script src="<%=Common.path%>themes/js/bootstrap.min.js"
	type="text/javascript"></script>
<script src="<%=Common.path%>themes/js/google-code-prettify/prettify.js"></script>
<script src="<%=Common.path%>themes/js/bootshop.js"></script>
<script src="<%=Common.path%>themes/js/jquery.lightbox-0.5.js"></script>
<script src="<%=Common.path%>themes/switch/theamswitcher.js"
	type="text/javascript" charset="utf-8"></script>
</html>
