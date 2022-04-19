package giadung.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import giadung.Entity.Bills;
import giadung.Entity.Carts;

@Service
public interface IBillService {
	public int AddBills(Bills bill);
		
	public void AddBillDetail(HashMap<Long, Carts> carts);
}
