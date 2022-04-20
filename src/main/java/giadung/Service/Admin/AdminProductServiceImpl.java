package giadung.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giadung.Dao.CategoryDao;
import giadung.Dao.ProductsDao;
import giadung.Entity.Categories;
import giadung.Entity.Products;

@Service
public class AdminProductServiceImpl implements AdminIProductService {
	@Autowired
	ProductsDao productsDao = new ProductsDao();

	@Override
	public Products GetProductById(long id) {
//		List<Products> listProducts = productsDao.GetProductById(id);
//		return listProducts.get(0);
		Products products = productsDao.GetProductById(id);

		return products;
	}

	@Override
	public List<Products> GetAllProduct() {
		// TODO Auto-generated method stub

		return productsDao.GetAllProduct();
	}

	
}
