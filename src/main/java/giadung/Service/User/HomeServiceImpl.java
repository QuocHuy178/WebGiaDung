package giadung.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giadung.Dao.CategoryDao;
import giadung.Dao.ProductsDao;
import giadung.Dao.SlidesDao;
import giadung.Dto.ProductsDto;
import giadung.Entity.Categories;
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

	public List<Categories> getDataCategories() {
		// TODO Auto-generated method stub
		return categoryDao.getDataCategories();
	}

	public List<ProductsDto> getDataProductsHot() {
		// TODO Auto-generated method stub
		List<ProductsDto> listProducts = productsDao.getDataProductsHot();
		return listProducts;
	}

	public List<ProductsDto> getDataProductsHotLast() {
		List<ProductsDto> listProducts = productsDao.getDataProductsHotLast();
		return listProducts;
	}

	@Override
	public List<ProductsDto> getDataProductsNew() {
		// TODO Auto-generated method stub
		List<ProductsDto> listProducts = productsDao.getDataProductsNew();
		return listProducts;
	}

	@Override
	public List<ProductsDto> getDataProductsSideBar() {
		// TODO Auto-generated method stub
		List<ProductsDto> listProducts = productsDao.getDataProductsNew();
		return listProducts;
	}

//	@Override
//	public List<ProductsDto> getDataAllProductsById() {
//		// TODO Auto-generated method stub
//		List<ProductsDto> listCategoryById = productsDao.getDataAllProductsById();
//		return listCategoryById;
//	}

}
