package giadung.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giadung.Dao.CategoryDao;
import giadung.Dao.ProductsDao;
import giadung.Entity.Categories;
import giadung.Entity.Products;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	ProductsDao productsDao = new ProductsDao();

	@Override
	public Products GetProductById(long id) {
		List<Products> listProducts = productsDao.GetProductById(id);
		return listProducts.get(0);
	}


	@Override
	public List<Products> GetAllProduct() {
		// TODO Auto-generated method stub
		
		return productsDao.GetAllProduct();
	}


	@Override
	public List<Products> GetAllProductPaginate(int start, int limit) {
		// TODO Auto-generated method stub
		return productsDao.GetAllProductPaginates(start, limit);
	}
}
