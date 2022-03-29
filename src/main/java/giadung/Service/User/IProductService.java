package giadung.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import giadung.Entity.Products;

@Service
public interface IProductService {
	public Products GetProductById(long id);
	
	public List<Products> GetProductByIdCate(int id);
	
	public List<Products> GetAllProduct();
}
