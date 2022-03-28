package giadung.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giadung.Entity.Categories;
import giadung.Entity.Products;
import giadung.Entity.Slides;

@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlide();

	public List<Categories> GetDataCategories();

	public List<Products> GetDataProductsHot();

	public List<Products> GetDataProductsHotLast();

	public List<Products> GetDataProductsNew();

	public List<Products> GetDataProductsSideBar();
//	public List<Products>GetDataAllProductsById();
}
