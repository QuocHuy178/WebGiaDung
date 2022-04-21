package giadung.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import giadung.Entity.BillDetail;
import giadung.Entity.Bills;
import giadung.Entity.Categories;

public class BillDetailMapper implements RowMapper<BillDetail> {

	public BillDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		BillDetail bills = new BillDetail();
		bills.setId(rs.getLong("id"));
		bills.setId_bills(rs.getLong("id_bills"));
		bills.setId_product(rs.getLong("id_product"));
		bills.setTotal(rs.getDouble("total"));
		bills.setQuanty(rs.getInt("quanty"));
		return bills;
	}

}