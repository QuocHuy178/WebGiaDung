
package giadung.Service.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giadung.Dao.BillsDao;
import giadung.Entity.BillDetail;
import giadung.Entity.Bills;
import giadung.Entity.Carts;

@Service
public class BillsServiceImpl implements IBillService {

	@Autowired
	private BillsDao billsDao;

	public int AddBills(Bills bill) {
		return billsDao.AddBills(bill);
	}

	@Override
	public void AddBillDetail(HashMap<Long, Carts> carts) {
		long idBills = billsDao.GetIDLastBills();

		for (Map.Entry<Long, Carts> itemCart : carts.entrySet()) {
			BillDetail billDetail = new BillDetail();
			billDetail.setId(idBills);
			billDetail.setId_product(itemCart.getValue().getProduct().getId());
			billDetail.setQuanty(itemCart.getValue().getQuanty());
			billDetail.setTotal(itemCart.getValue().getTotalPrice());
			billsDao.AddBillsDetail(billDetail);
		}

	}

}
