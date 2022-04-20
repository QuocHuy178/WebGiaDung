<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/tablib.jsp"%>
<title>Insert title here</title>
</head>
<body>
 <a class="navbar-brand" href="./categoryadd.php">Thêm danh mục</a>
	<div class="card-header">
                <h4 class="card-title"> Danh mục</h4>
              </div>
              <div class="card-body">
                <div class="table-responsive">
                  <table class="table">
                    <thead class=" text-primary">
                      <th>
                        Id
                      </th>
                      <th>
                        Tên Danh Mục
                      </th>
                      <th>
                        Action
                      </th>
                    </thead>
                    <tbody>
          			<c:forEach var="item" items="${ cateadmin }">
                      <tr>
                        <td>
                          ${ item.id }
                        </td>
                        <td>
                        ${ item.name }
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