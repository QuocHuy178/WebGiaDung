package giadung.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import giadung.Entity.Products;

@Service
public interface ICategoryService {
	public List<Products> GetProductByCate(int id);
	
	public List<Products> GetAllProductByCatePaginates(int id, int start, int limit);
}
