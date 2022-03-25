package giadung.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giadung.Dto.ProductsDto;
import giadung.Entity.Categories;
import giadung.Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
	public List<Slides>GetDataSlide(); 
	public List<Categories>getDataCategories(); 
	public List<ProductsDto>getDataProductsHot();
	public List<ProductsDto>getDataProductsHotLast();
}
