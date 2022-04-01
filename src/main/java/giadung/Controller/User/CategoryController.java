package giadung.Controller.User;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class CategoryController {
	@RequestMapping(value = "/product/{id}") 
	public ModelAndView category(@PathVariable String id) {
		ModelAndView mv = new ModelAndView("user/category");
		mv.addObject("idCategory", id);
		return mv;
	}
	
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import giadung.Entity.PaginatesDto;

@Controller
public class CategoryController extends BaseController{
	@RequestMapping("/category/{id}")
	public ModelAndView category(@PathVariable int id) {
		int totalData = _cateService.GetProductByCate(id).size();
		PaginatesDto paginateInfo = _paginateService.GetInfoPaginates(totalData, _totalProductPerPage, 1);

		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsByCatePaginate",
				_cateService.GetAllProductByCatePaginates(id, paginateInfo.getStart(), _totalProductPerPage));

		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("currentPage", 1);
		_mvShare.addObject("totalPage", paginateInfo.getTotalPage());

		_mvShare.setViewName("user/product/category");
		return _mvShare;
	}

	@RequestMapping(value = "/category/{id}", params = "page")
	public ModelAndView categoryPaginate(@PathVariable int id, @RequestParam("page") int page) {
		int totalData = _cateService.GetProductByCate(id).size();
		PaginatesDto paginateInfo = _paginateService.GetInfoPaginates(totalData, _totalProductPerPage, page);

		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsByCatePaginate",
				_cateService.GetAllProductByCatePaginates(id, paginateInfo.getStart(), _totalProductPerPage));

		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("currentPage", page);
		_mvShare.addObject("totalPage", paginateInfo.getTotalPage());

		_mvShare.setViewName("user/product/category");
		return _mvShare;
	}
>>>>>>> 2a4ce94f439ff3b443429d76da920ddc2a6b31a3
}
