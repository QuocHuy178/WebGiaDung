package giadung.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import giadung.Entity.PaginatesDto;


@Controller
public class ProductController extends BaseController {
	@RequestMapping("/product")
	public ModelAndView allProduct() {
		int totalData = _productService.GetAllProduct().size();
		PaginatesDto paginateInfo = _paginateService.GetInfoPaginates(totalData, _totalProductPerPage, 1);

		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("allProductsPaginate",
				_productService.GetAllProductPaginate(paginateInfo.getStart(), _totalProductPerPage));

		_mvShare.addObject("currentPage", 1);
		_mvShare.addObject("totalPage", paginateInfo.getTotalPage());

		_mvShare.setViewName("user/product/product");
		return _mvShare;
	}
	
	@RequestMapping(value = "/product", params = "page")
	public ModelAndView allProductPaginate(@RequestParam("page") int page) {
		int totalData = _productService.GetAllProduct().size();
		PaginatesDto paginateInfo = _paginateService.GetInfoPaginates(totalData, _totalProductPerPage, page);

		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("allProductsPaginate",
				_productService.GetAllProductPaginate(paginateInfo.getStart(), _totalProductPerPage));

		_mvShare.addObject("currentPage", page);
		_mvShare.addObject("totalPage", paginateInfo.getTotalPage());

		_mvShare.setViewName("user/product/product");
		return _mvShare;
	}
	
	@RequestMapping(value = { "product-details/{id}" })
	public ModelAndView Index(@PathVariable long id) {
		_mvShare.addObject("product", _productService.GetProductById(id));
		_mvShare.setViewName("user/product/product_details");

		return _mvShare;
	}
}
