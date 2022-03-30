package giadung.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giadung.Dao.CategoryDao;
import giadung.Dao.ProductsDao;
import giadung.Entity.Products;

@Service
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	private CategoryDao categoryDao;

	@Override
	public List<Products> GetProductByCate(int id) {
		// TODO Auto-generated method stub
		return categoryDao.GetProductByCate(id);
	}

	@Override
	public List<Products> GetAllProductByCatePaginates(int id, int start, int end) {
		// TODO Auto-generated method stub
		return categoryDao.GetAllProductByCatePaginates(id, start, end);
	}
}
