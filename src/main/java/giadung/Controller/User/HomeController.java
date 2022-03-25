package giadung.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import giadung.Service.User.HomeServiceImpl;

@Controller
public class HomeController extends BaseController {
	
	@RequestMapping(value = { "/", "/home" })
	public ModelAndView Index() {
		_mvShare.addObject("slides", _homeService.GetDataSlide());
		_mvShare.addObject("cates", _homeService.getDataCategories());
		_mvShare.addObject("products", _homeService.getDataProductsHot());
		_mvShare.addObject("productshot", _homeService.getDataProductsHotLast());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}

	@RequestMapping("/product")
	public ModelAndView product() {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}
}
