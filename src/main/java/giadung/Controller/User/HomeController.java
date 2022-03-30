package giadung.Controller.User;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController extends BaseController {
	
	@RequestMapping(value = { "/", "/home" })
	public ModelAndView Index() {
		_mvShare.addObject("productsHot", _homeService.GetDataProductsHot());
		_mvShare.addObject("productsHotLast", _homeService.GetDataProductsHotLast());
		_mvShare.addObject("productsNew", _homeService.GetDataProductsNew());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
	
	@RequestMapping("/product")
	public ModelAndView product() {
		_mvShare.addObject("allProduct", _productService.GetAllProduct());
		_mvShare.setViewName("user/product/product");
		return _mvShare;
	}
}
