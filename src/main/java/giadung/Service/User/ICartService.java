package giadung.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import giadung.Entity.Carts;


@Service
public interface ICartService {
	public HashMap<Long, Carts>  AddCart(long id, HashMap<Long, Carts> cart);
	public HashMap<Long, Carts>  EditCart(long id, int quanty,  HashMap<Long, Carts> cart);
	public HashMap<Long, Carts>  DeleteCart(long id,  HashMap<Long, Carts> cart);
	public int  TotalQuanty( HashMap<Long, Carts> cart);
	public double  TotalPrice( HashMap<Long, Carts> cart);
}
