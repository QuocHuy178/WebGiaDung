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
	
	@RequestMapping("/category/{id}") 
	public ModelAndView category(@PathVariable String id) {
		ModelAndView mv = new ModelAndView("user/category");
		mv.addObject("idCategory", id);
		return mv;
	}
}
