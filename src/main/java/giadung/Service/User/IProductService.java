package giadung.Service.User;

import org.springframework.stereotype.Service;

import giadung.Entity.Products;

@Service
public interface IProductService {
	public Products GetProductById(long id);
}
