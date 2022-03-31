package giadung.Service.User;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giadung.Dao.CartDao;
import giadung.Entity.Carts;

 

@Service
public class CartServiceImpl implements ICartService{
	@Autowired
	private CartDao cartDao = new CartDao();

	@Override
	public HashMap<Long, Carts> AddCart(long id, HashMap<Long, Carts> cart) {		
		return cartDao.AddCart(id, cart);
	}

	@Override
	public HashMap<Long, Carts> EditCart(long id, int quanty, HashMap<Long, Carts> cart) {		
		return cartDao.EditCart(id, quanty, cart);
	}

	@Override
	public HashMap<Long, Carts> DeleteCart(long id, HashMap<Long, Carts> cart) {		
		return cartDao.DeleteCart(id, cart);
	}

	@Override
	public int TotalQuanty(HashMap<Long, Carts> cart) {
		return cartDao.TotalQuanty(cart);
	}

	@Override
	public double TotalPrice(HashMap<Long, Carts> cart) {
		return cartDao.TotalPrice(cart);
	}
}
