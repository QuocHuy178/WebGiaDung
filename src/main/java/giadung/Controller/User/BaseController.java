package giadung.Controller.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import giadung.Service.User.CategoryServiceImpl;
import giadung.Service.User.HomeServiceImpl;
import giadung.Service.User.PaginatesServiceImpl;
import giadung.Service.User.ProductServiceImpl;

@Controller
public class BaseController {
	@Autowired
	HomeServiceImpl _homeService;
	@Autowired
	ProductServiceImpl _productService;
	@Autowired
	CategoryServiceImpl _cateService;
	@Autowired
	PaginatesServiceImpl _paginateService;
	
	public ModelAndView _mvShare = new ModelAndView();
	
	@PostConstruct
	public ModelAndView Init() {
		_mvShare.addObject("slides", _homeService.GetDataSlide());
		_mvShare.addObject("cates", _homeService.GetDataCategories());
		_mvShare.addObject("productsSidebar", _homeService.GetDataProductsSideBar());
		
		return _mvShare;
	}
}
