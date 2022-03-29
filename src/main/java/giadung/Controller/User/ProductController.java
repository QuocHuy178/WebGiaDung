package giadung.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import giadung.Service.User.IProductService;
import giadung.Service.User.ProductServiceImpl;

@Controller
public class ProductController extends BaseController {
	@Autowired
	ProductServiceImpl _productService;
	
	@RequestMapping(value = { "product-details/{id}"})
	public ModelAndView Index(@PathVariable long id) {
		_mvShare.addObject("slides", _homeService.GetDataSlide());
		_mvShare.addObject("cates", _homeService.GetDataCategories());
		_mvShare.addObject("productsSidebar", _homeService.GetDataProductsSideBar());
		_mvShare.setViewName("user/product/product_details");
		_mvShare.addObject("product", _productService.GetProductById(id));
		
		return _mvShare;
	}
}
