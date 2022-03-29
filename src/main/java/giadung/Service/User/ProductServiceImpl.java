package giadung.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giadung.Dao.ProductsDao;
import giadung.Entity.Categories;
import giadung.Entity.Products;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	ProductsDao productDao = new ProductsDao();

	public Products GetProductById(long id) {
		List<Products> listProducts = productDao.GetProductById(id);
		return listProducts.get(0);
	}

	@Override
	public List<Products> GetProductByIdCate(int id) {
		// TODO Auto-generated method stub

		return productDao.GetProductByIdCate(id);
	}

	@Override
	public List<Products> GetAllProduct() {
		// TODO Auto-generated method stub
		
		return productDao.GetAllProduct();
	}
}
