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
                <h4 class="card-title"> Chi tiết hóa đơn</h4>
              </div>
              <div class="card-body">
                <div class="table-responsive">
                  <table class="table">
                    <thead class=" text-primary">
                      <th>
                        Id Bill
                      </th>
                      <th>
                        Id Sản phẩm
                      </th>
                      <th>
                        Số lượng
                      </th>
                       <th>
                       	Tổng tiền
                      </th>
                  
                    </thead>
                    <tbody>
          			
                      <tr>
                        <td>
                          ${ billsdetail.id_bills }
                        </td>
                        <td>
                        ${ billsdetail.id_product }
                        </td>
                        <td>
                        ${ billsdetail.quanty }
                        </td>
                        <td>
                        <fmt:formatNumber type="number" groupingUsed="true"
															value="${ billsdetail.total }" /> đ
                        </td>
                       
                      </tr>
                 
                    </tbody>
                  </table>
                </div>
              </div>
</body>
</html>