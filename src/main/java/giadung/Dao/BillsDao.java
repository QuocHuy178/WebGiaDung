package giadung.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import giadung.Entity.BillDetail;
import giadung.Entity.Bills;
import giadung.Entity.Categories;
import giadung.Entity.Products;
import giadung.Mapper.BillDetailMapper;
import giadung.Mapper.BillsMapper;
import giadung.Mapper.CategoriesMapper;
import giadung.Mapper.ProductsMapper;

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
//		String sql = "INSERT INTO bills VALUES "+""+bill.getUser()+","+bill.getPhone()+","+bill.getDisplay_name()+","+ bill.getAddress()+","+bill.getTotal()+","+bill.getQuanty()+","+bill.getNote()+"";
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	};

	public long GetIDLastBills() { // sau khi insert bill -> lay id lon nhat
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT MAX(id) FROM bills;");
		long id = _jdbcTemplate.queryForObject(sql.toString(), Long.class);
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
		sql.append("   " + billDetail.getTotal());
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}

	public List<Bills> GetAllBill() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM bills ";
		List<Bills> listBills = _jdbcTemplate.query(sql, new BillsMapper());
		return listBills;
	}

	public BillDetail GetBillById(long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * From billdetail Where billdetail.id_bills = "
				+ id + "";
		BillDetail billdetail = _jdbcTemplate.queryForObject(sql, new BillDetailMapper());
		return billdetail;
	}


}
