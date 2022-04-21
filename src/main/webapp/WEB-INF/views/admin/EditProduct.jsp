<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/tablib.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<div class="content">
        <div class="row">
          <div class="col-md-12">
            <div class="card">
              <div class="container">
                <div class="col-lg-12 p-5 col-lg-offset-2 col-md-8 col-md-offset-2 col-sm-12 col-xs-12 edit_information">
                  <section class="panel panel-default">
                    <div class="panel-heading text-center">
                      <h3 class="panel-title">Sửa Sản Phẩm</h3>
                    </div>
                    <div class="panel-body">
                          <form action="" method="post" enctype="multipart/form-data" class="form-horizontal">
                            <div class="form-group">
                              <label for="tech" class="col-sm-3 control-label">Danh mục</label>

                              <select class="form-control" name="category">
                                <option value="">--Chọn danh mục--</option>
                               
                                    <option value="" />
                           
                              </select>

                            </div> <!-- form-group // -->
                            

                            </div> <!-- form-group // -->
                            <div class="form-group">
                              <label for="name" class="col-sm-3 control-label">Tên Sản Phẩm</label>

                              <input type="text" class="form-control" name="productName" id="name" value="${product.name }">

                            </div> <!-- form-group // -->

                            <div class="form-group">
                              <label for="about" class="col-sm-3 control-label">Mô Tả</label>
                              
                             

                              <textarea type="text" style="background-color:rgb(236 217 217 / 50%); border-radius:12px;" class="form-control" path="product_desc">${product.description }</textarea>

                            </div> <!-- form-group // -->
                            <div class="form-group">
                              <label for="qty" class="col-sm-3 control-label">Giá</label>

                              <input type="text" class="form-control" name="price" value="${product.price }">

                            </div> <!-- form-group // -->
                   
                            <div class="form-group">
                              <label for="name" class="col-sm-3 control-label">Hình</label>

                              <!-- <label class="control-label small" for="file_img">Hình 1 (jpg/png):</label> -->
                              <input style="opacity:1; position:unset;" type="file" name="image"> </br>
                              <img style="height:120px;width:120px;object-fit:cover;" src="<c:url value="/"/>themes/images/products/${ product.image }" alt="">

                            </div> <!-- form-group // -->
                            <div class="form-group">
                              <label for="tonkho" class="col-sm-3 control-label">Sản phẩm nổi bật</label>

                              <select class="form-control" name="type">
                               
                                  <option value="1">Nổi Bật</option>
                                  <option value="0">Không Nổi Bật</option>
                                
                                  
                            
                              </select>

                            </div>
                            <div class="form-group">
                              <label for="giamgia" class="col-sm-3 control-label">Sản phẩm mới</label>

                              <select class="form-control" name="type">
                               
                                  <option value="1">Mới</option>
                                  <option value="0">Không mới</option>
                                
                                  
                            
                              </select>

                            </div>
                            <hr>
                            <div class="form-group">

                              <button type="submit" name="submit" value="Update" class="btn btn-primary">Cập Nhật</button>

                            </div> <!-- form-group // -->
                            <a href="./productlist.php" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Về Danh sách Sản Phẩm</a>

                          </form>
                    
                    </div><!-- panel-body // -->
                  </section><!-- panel// -->
                </div>

              </div>
            </div>
          </div>

        </div>
      </div>
	
</body>
</html>