package giadung.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giadung.Dao.BillsDao;
import giadung.Dao.CategoryDao;
import giadung.Dao.ProductsDao;
import giadung.Entity.BillDetail;
import giadung.Entity.Bills;
import giadung.Entity.Categories;
import giadung.Entity.Products;

@Service
public class AdminBillServiceImpl implements AdminIBillService {

	@Autowired
	BillsDao billsDao = new BillsDao();
	
	@Override
	public List<BillDetail> GetBillById(long id) {
		// TODO Auto-generated method stub
		List<BillDetail> billdetail = billsDao.GetBillById(id);

		return billdetail;
	}

	@Override
	public List<Bills> GetAllBill() {
		// TODO Auto-generated method stub
		return billsDao.GetAllBill();
	}
	

	
}
