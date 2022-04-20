package giadung.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import giadung.Entity.PaginatesDto;


@Controller
public class AdminProductController extends BaseControllerAdmin {
	@RequestMapping(value = { "/admin/ProductAdmin" })
	public ModelAndView Index() {
		_mvShare.addObject("proadmin", _productService.GetAllProduct());
		_mvShare.setViewName("admin/ProductAdmin");
		return _mvShare;
	}
	
//	@RequestMapping(value = { "product-details/{id}" })
//	public ModelAndView Index(@PathVariable long id) {
//		_mvShare.addObject("product", _productService.GetProductById(id));
//		_mvShare.setViewName("user/product/product_details");
//
//		return _mvShare;
//	}
}
