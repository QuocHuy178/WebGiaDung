package giadung.Controller.Admin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import giadung.Service.Admin.AdminHomeServiceImpl;
import giadung.Service.Admin.AdminProductServiceImpl;
import giadung.Service.User.CategoryServiceImpl;
import giadung.Service.User.HomeServiceImpl;
import giadung.Service.User.PaginatesServiceImpl;
import giadung.Service.User.ProductServiceImpl;

@Controller
public class BaseControllerAdmin {
	@Autowired
	AdminHomeServiceImpl _homeService;
	@Autowired
	AdminProductServiceImpl _productService;
	
	public ModelAndView _mvShare = new ModelAndView();
	
	
}
