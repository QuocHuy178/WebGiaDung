package giadung.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import giadung.Service.User.IProductService;
import giadung.Service.User.ProductServiceImpl;

@Controller
public class HomeController extends BaseController {

	@Autowired
	ProductServiceImpl _productService;

	@RequestMapping(value = { "/", "/home" })
	public ModelAndView Index() {
		_mvShare.addObject("slides", _homeService.GetDataSlide());
		_mvShare.addObject("cates", _homeService.GetDataCategories());
		_mvShare.addObject("productsSidebar", _homeService.GetDataProductsSideBar());
		_mvShare.addObject("productsHot", _homeService.GetDataProductsHot());
		_mvShare.addObject("productsHotLast", _homeService.GetDataProductsHotLast());
		_mvShare.addObject("productsNew", _homeService.GetDataProductsNew());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}

	@RequestMapping("/product")
	public ModelAndView product() {
		_mvShare.addObject("allProduct", _productService.GetAllProduct());
		_mvShare.setViewName("user/product/product");
		return _mvShare;
	}

	@RequestMapping("/category/{id}")
	public ModelAndView category(@PathVariable int id) {
		_mvShare.addObject("productByCate", _productService.GetProductByIdCate(id));
		_mvShare.setViewName("user/product/category");
		return _mvShare;
	}

//	@RequestMapping("/cc")
//	public String cc() {
//		
//		return "user/cart/product_summary";
//	}

}
