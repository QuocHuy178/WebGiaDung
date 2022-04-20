<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/tablib.jsp"%>

<title>Insert title here</title>
</head>
<body>
 <a class="navbar-brand" href="./categoryadd.php">Thêm sản phẩm</a>
<div class="card-header">
                <h4 class="card-title"> Sản phẩm</h4>
              </div>
              <div class="card-body">
                <div class="table-responsive">
                  <table class="table">
                    <thead class=" text-primary">
                      <th>
                        Id
                      </th>
                      <th>
                        Tên Sản Phẩm
                      </th>
                       <th>
                        Giá
                      </th>
                       <th>
                        Hình
                      </th>
                      <th>
                        Action
                      </th>
                    </thead>
                    <tbody>
          			<c:forEach var="item" items="${ proadmin }">
                      <tr>
                        <td>
                          ${ item.id }
                        </td>
                        <td>
                        ${ item.name }
                        </td>
                         <td>
                        	${ item.price }
                        </td>
                         <td>
                        	<img style="height:100px;width:100px;object-fit:cover" alt="" src="<c:url value="/"/>themes/images/products/${ item.image }">
                        </td>
                        <td>
                          <a href="<c:url value="./editCategory/${ item.id }"/>">edit</a> |
                          <a href="?cateid=<?php echo $result['cateId'] ?>">delete</a>
                        </td>
                      </tr>
                  </c:forEach>
                    </tbody>
                  </table>
                </div>
              </div>
</body>
</html>