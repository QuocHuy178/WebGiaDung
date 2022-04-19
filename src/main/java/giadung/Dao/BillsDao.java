package giadung.Dao;

import org.springframework.stereotype.Repository;

import giadung.Entity.BillDetail;
import giadung.Entity.Bills;

@Repository
public class BillsDao extends BaseDao {

	public int AddBills(Bills bill) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO bills ");
		sql.append("( ");
		sql.append("  `user`, `phone`, `display_name`, `address`, `total`, `quanty`, `note` ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("   '" + bill.getUser() + "', "); // email
		sql.append("   '" + bill.getPhone() + "', ");
		sql.append("   '" + bill.getDisplay_name() + "', ");
		sql.append("   '" + bill.getAddress() + "', ");
		sql.append("    " + bill.getTotal() + ", ");// tong tien hoa don
		sql.append("    " + bill.getQuanty() + ", ");
		sql.append("    '" + bill.getNote() + "' ");
		sql.append(");");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	};

	public long GetIDLastBills() { // sau khi insert bill -> lay id lon nhat
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT MAX(id) FROM bills;");
		long id = _jdbcTemplate.queryForObject(sql.toString(), new Object[] {}, Long.class);
		return id;
	};

	public int AddBillsDetail(BillDetail billDetail) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO billdetail ");
		sql.append("( ");
		sql.append("  id_product, ");
		sql.append("  id_bills, ");
		sql.append("  quanty, ");
		sql.append("  total ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("   " + billDetail.getId_product() + ", "); // email
		sql.append("   " + billDetail.getId_bills() + ", "); // email
		sql.append("   " + billDetail.getQuanty() + ", ");
		sql.append("   " + billDetail.getTotal() + ", ");
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	};
}
