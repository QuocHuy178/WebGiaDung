<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/tablib.jsp"%>
<div class="sidebar" data-color="orange">
      <!--
        Tip 1: You can change the color of the sidebar using: data-color="blue | green | orange | red | yellow"
    -->
      <div class="logo">
        <a href="http://www.creative-tim.com" class="simple-text logo-mini">
          CT
        </a>
        <a href="http://www.creative-tim.com" class="simple-text logo-normal">
          Creative Tim
        </a>
      </div>
      <div class="sidebar-wrapper" id="sidebar-wrapper">
        <ul class="nav">
          <li class="active ">
            <a href="/giadung/admin/home">
              <i class="now-ui-icons design_app"></i>
              <p>Danh mục</p>
            </a>
          </li>
        
          <li>
            <a href="/giadung/admin/ProductAdmin">
              <i class="now-ui-icons design_bullet-list-67"></i>
              <p>Sản phẩm</p>
            </a>
          </li>

          <li>
            <a href="./categoryadmin.php">
              <i class="now-ui-icons design_bullet-list-67"></i>
              <p>Danh mục</p>
            </a>
          </li>
        </ul>
      </div>
    </div>