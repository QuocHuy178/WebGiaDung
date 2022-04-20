package giadung.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import giadung.Controller.User.BaseController;
import giadung.Service.User.ProductServiceImpl;


@Controller
public class AdminHomeController extends BaseControllerAdmin {


	@RequestMapping(value = { "/admin", "/admin/home" })
	public ModelAndView Index() {
		_mvShare.addObject("cateadmin", _homeService.GetDataCategory());
		_mvShare.setViewName("admin/index");
		return _mvShare;
	}
	
	@RequestMapping(value = { "/admin/editCategory/{id}" })
	public ModelAndView Index(@PathVariable int id) {
		_mvShare.addObject("cate",_homeService.GetCategorytById(id));
		_mvShare.setViewName("admin/editCategory");

		return _mvShare;
	}

	

}
