package giadung.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import giadung.Service.User.ProductServiceImpl;


@Controller
public class HomeController extends BaseController {


	@Autowired
	ProductServiceImpl _productService;

	@RequestMapping(value = { "/", "/home" })
	public ModelAndView Index() {
		_mvShare.addObject("productsHot", _homeService.GetDataProductsHot());
		_mvShare.addObject("productsHotLast", _homeService.GetDataProductsHotLast());
		_mvShare.addObject("productsNew", _homeService.GetDataProductsNew());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}

	@RequestMapping("/special_offer")
	public ModelAndView special_offer() {
		ModelAndView mv = new ModelAndView("user/account/special_offer");
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("user/account/register");
		return mv;
	}

	
	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("user/contact");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("user/account/login");
		return mv;
	}
	
	@RequestMapping("/product_summary")
	public ModelAndView product_summary() {
		ModelAndView mv = new ModelAndView("user/cart/product_summary");
		return mv;
	}

}
