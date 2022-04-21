package giadung.Service.Admin;

import java.util.List;

import org.springframework.stereotype.Service;

import giadung.Dao.BillsDao;
import giadung.Entity.BillDetail;
import giadung.Entity.Bills;


@Service
public interface AdminIBillService {
	public BillDetail GetBillById(long id);
	
	public List<Bills> GetAllBill();
	
}
