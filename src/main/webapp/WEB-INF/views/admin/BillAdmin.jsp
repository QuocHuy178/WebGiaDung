<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/tablib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<div class="card-header">
                <h4 class="card-title"> Hóa đơn</h4>
              </div>
              <div class="card-body">
                <div class="table-responsive">
                  <table class="table">
                    <thead class=" text-primary">
                      <th>
                        Id
                      </th>
                      <th>
                        User
                      </th>
                      <th>
                        Địa chỉ
                      </th>
                       <th>
                        SĐT
                      </th>
                      <th>
                        Số lượng
                      </th>
                       <th>
                        Tổng tiền
                      </th>
                        <th>
                        Tùy chọn
                      </th>
                    </thead>
                    <tbody>
          			<c:forEach var="item" items="${ billadmin }">
                      <tr>
                        <td>
                          ${ item.id }
                        </td>
                        <td>
                        ${ item.user }
                        </td>
                        <td>
                        ${ item.address }
                        </td>
                        <td>
                        ${ item.phone }
                        </td>
                        <td>
                        ${ item.quanty }
                        </td>
                        <td>
                       	<fmt:formatNumber type="number" groupingUsed="true"
															value=" ${ item.total }" /> đ
                        </td>
                        <td>
                          <a href="<c:url value="./BillDetail/${ item.id }"/>">Xem</a>
                        </td>
                      </tr>
                  </c:forEach>
                    </tbody>
                  </table>
                </div>
              </div>
</body>
</html>