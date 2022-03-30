package giadung.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import giadung.Entity.Categories;
import giadung.Entity.Products;

@Service
public interface IProductService {
	public Products GetProductById(long id);
	
	public List<Products> GetAllProduct();
	
	public List<Products> GetAllProductByPaginate(int start, int end);
}
