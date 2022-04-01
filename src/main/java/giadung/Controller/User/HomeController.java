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
<<<<<<< HEAD
	@RequestMapping("/product")
	public ModelAndView product() {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}
	@RequestMapping("/special_offer")
	public ModelAndView special_offer() {
		ModelAndView mv = new ModelAndView("user/special_offer");
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("user/register");
		return mv;
	}
	@RequestMapping("/category/{id}") 
	public ModelAndView category(@PathVariable String id) {
		ModelAndView mv = new ModelAndView("user/category");
		mv.addObject("idCategory", id);
		return mv;
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("user/contact");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("user/login");
		return mv;
	}
	
	@RequestMapping("/product_summary")
	public ModelAndView product_summary() {
		ModelAndView mv = new ModelAndView("user/product_summary");
		return mv;
	}
=======
>>>>>>> 2a4ce94f439ff3b443429d76da920ddc2a6b31a3
}
