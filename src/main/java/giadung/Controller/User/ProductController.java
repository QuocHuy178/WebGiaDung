package giadung.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import giadung.Entity.PaginatesDto;

@Controller
public class ProductController extends BaseController {
	
	@RequestMapping(value = { "product-details/{id}"})
	public ModelAndView Index(@PathVariable long id) {
		_mvShare.addObject("product", _productService.GetProductById(id));
		_mvShare.setViewName("user/product/product_details");
		
		return _mvShare;
	}
	
	@RequestMapping("/category/{id}") 
	public ModelAndView category(@PathVariable int id) {
		int totalProductPerPage = 3;
		int totalData = _cateService.GetProductByCate(id).size();
		PaginatesDto paginateInfo = _paginateService.GetInfoPaginates(totalData, totalProductPerPage, 1);
		
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsByCateAndPaginate", 
				_cateService.GetAllProductByCatePaginates(id, paginateInfo.getStart(),paginateInfo.getEnd()));
		
		_mvShare.setViewName("user/product/category");
		return _mvShare;
	}
}
