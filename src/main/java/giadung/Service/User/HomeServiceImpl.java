package giadung.Service.User;

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
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlidesDao slidesDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private ProductsDao productsDao;
	
	
	public List<Slides> GetDataSlide() {
		// TODO Auto-generated method stub
		return slidesDao.GetDataSlide();
	}

	public List<Categories> GetDataCategories() {
		// TODO Auto-generated method stub
		return categoryDao.GetDataCategories();
	}

	public List<Products> GetDataProductsHot() {
		// TODO Auto-generated method stub
		List<Products> listProducts = productsDao.GetDataProductsHot();
		return listProducts;
	}

	public List<Products> GetDataProductsHotLast() {
		List<Products> listProducts = productsDao.GetDataProductsHotLast();
		return listProducts;
	}

	@Override
	public List<Products> GetDataProductsNew() {
		// TODO Auto-generated method stub
		List<Products> listProducts = productsDao.GetDataProductsNew();
		return listProducts;
	}

	@Override
	public List<Products> GetDataProductsSideBar() {
		// TODO Auto-generated method stub
		List<Products> listProducts = productsDao.GetDataProductsSideBar();
		return listProducts;
	}

//	@Override
//	public List<Products> GetDataAllProductsById() {
//		// TODO Auto-generated method stub
//		List<Products> listCategoryById = productsDao.GetDataAllProductsById();
//		return listCategoryById;
//	}

}
