package giadung.Service.Admin;

import java.util.List;

import org.springframework.stereotype.Service;

import giadung.Entity.Categories;
import giadung.Entity.Products;

@Service
public interface AdminIProductService {
	public Products GetProductById(long id);
	
	public List<Products> GetAllProduct();
	
}
