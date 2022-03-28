package giadung.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {
	
	@RequestMapping(value = { "/", "/home" })
	public ModelAndView Index() {
		_mvShare.addObject("slides", _homeService.GetDataSlide());
		_mvShare.addObject("cates", _homeService.GetDataCategories());
		_mvShare.addObject("productsHot", _homeService.GetDataProductsHot());
		_mvShare.addObject("productsHotLast", _homeService.GetDataProductsHotLast());
		_mvShare.addObject("productsNew", _homeService.GetDataProductsNew());
		_mvShare.addObject("productsSidebar", _homeService.GetDataProductsSideBar());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
	

	@RequestMapping("/product")
	public ModelAndView product() {
		_mvShare.setViewName("user/product/product");
		return _mvShare;
	}
	
	@RequestMapping("/category/{id}") 
	public ModelAndView category(@PathVariable String id) {
		_mvShare.setViewName("user/product/category");
		_mvShare.addObject("idCategory", id);
		return _mvShare;
	}

}
