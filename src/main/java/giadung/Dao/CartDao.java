package giadung.Dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import giadung.Entity.Carts;
import giadung.Entity.Products;
@Repository
public class CartDao extends BaseDao {
	@Autowired
	ProductsDao productsDao = new ProductsDao();
	
	public HashMap<Long, Carts>  AddCart(long id, HashMap<Long, Carts> cart) {
		Carts itemCart = new Carts ();
		Products product = productsDao.GetProductById(id);
		if(product != null && cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(itemCart.getQuanty() + 1);
			itemCart.setTotalPrice(itemCart.getQuanty() * itemCart.getProduct().getPrice());
			
		}else {
			itemCart.setProduct(product);
			itemCart.setQuanty(1);
			itemCart.setTotalPrice(product.getPrice());
		}
		cart.put(id, itemCart);
		return cart;
	}
	
	public HashMap<Long, Carts>  EditCart(long id, int quanty,  HashMap<Long, Carts> cart) {
		if(cart == null) {
			return cart;
		}
		Carts itemCart = new Carts ();
		if(cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(quanty);
			double totalPrice = quanty * itemCart.getProduct().getPrice();
			itemCart.setTotalPrice(totalPrice);
		}
		
		
		cart.put(id, itemCart);
		return cart;
	}
	
	public HashMap<Long, Carts>  DeleteCart(long id,  HashMap<Long, Carts> cart) {
		if(cart == null) {
			return cart;
		}
		if(cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}
	
	public int  TotalQuanty( HashMap<Long, Carts> cart) {
		int totalQuanty = 0;
		for(Map.Entry<Long, Carts> itemCart : cart.entrySet()) {
			totalQuanty += itemCart.getValue().getQuanty();
		}
		return totalQuanty;
	}
	public double  TotalPrice( HashMap<Long, Carts> cart) {
		double totalPrice = 0;
		for(Map.Entry<Long, Carts> itemCart : cart.entrySet()) {
			totalPrice += itemCart.getValue().getTotalPrice();
		}
		return totalPrice;
	}
}
