package giadung.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giadung.Dao.CategoryDao;
import giadung.Dao.ProductsDao;
import giadung.Dao.SlidesDao;
import giadung.Entity.Categories;
import giadung.Entity.Products;
import giadung.Entity.Slides;

@Service
public class AdminHomeServiceImpl implements AdminIHomeService {

	@Autowired
	private CategoryDao categoryDao;
	

	@Override
	public List<Categories> GetDataCategory() {
		// TODO Auto-generated method stub
		return categoryDao.GetDataCategories();
	}


	public Categories GetCategorytById(int id) {
		// TODO Auto-generated method stub
		Categories category = categoryDao.GetCategoryById(id);

		return category;
	}
	
	
	

}
