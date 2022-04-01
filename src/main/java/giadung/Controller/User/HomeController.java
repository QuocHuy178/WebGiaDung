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
		_mvShare.addObject("cates", _homeService.getDataCategories());
		_mvShare.addObject("products", _homeService.getDataProductsHot());
		_mvShare.addObject("productshot", _homeService.getDataProductsHotLast());
		_mvShare.addObject("productsnew", _homeService.getDataProductsNew());
		_mvShare.addObject("productssidebar", _homeService.getDataProductsSideBar());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
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
}
