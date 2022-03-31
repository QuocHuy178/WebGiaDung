package giadung.Controller.User;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import giadung.Entity.Carts;
import giadung.Service.User.CartServiceImpl;

@Controller
public class CartController  extends BaseController{
	@Autowired
	private CartServiceImpl cartServiceImpl = new CartServiceImpl();
	
	@RequestMapping(value =  "listcart")
	public ModelAndView Index() {
		_mvShare.addObject("slides", _homeService.GetDataSlide());
		_mvShare.addObject("cates", _homeService.GetDataCategories());
		_mvShare.addObject("productsSidebar", _homeService.GetDataProductsSideBar());
		_mvShare.addObject("productsHot", _homeService.GetDataProductsHot());
		_mvShare.addObject("productsHotLast", _homeService.GetDataProductsHotLast());
		_mvShare.addObject("productsNew", _homeService.GetDataProductsNew());
		_mvShare.setViewName("user/cart/product_summary");
		return _mvShare;
	}
	@RequestMapping(value =  "AddCart/{id}")
	public String AddCart(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		HashMap<Long, Carts> cart = (HashMap<Long, Carts>)session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Long, Carts>();
		}
		cart =  cartServiceImpl.AddCart(id, cart);
		session.setAttribute("Cart", cart); 
		session.setAttribute("TotalQuantyCart", cartServiceImpl.TotalQuanty(cart)); 
		session.setAttribute("TotalPriceCart", cartServiceImpl.TotalPrice(cart)); 
//		return "redirect:/product-details/"+id;
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value =  "EditCart/{id}")
	
	public String EditCart(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		HashMap<Long, Carts> cart = (HashMap<Long, Carts>)session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Long, Carts>();
		}
//		cart =  cartServiceImpl.EditCart(id,quanty, cart);
//		session.setAttribute("Cart", cart); 
//		session.setAttribute("TotalQuantyCart", cartServiceImpl.TotalQuanty(cart)); 
//		session.setAttribute("TotalPriceCart", cartServiceImpl.TotalPrice(cart)); 
//		return "redirect:/product-details/"+id;
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value =  "DeleteCart/{id}")
	
	public String DeleteCart(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		HashMap<Long, Carts> cart = (HashMap<Long, Carts>)session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Long, Carts>();
		}
		cart =  cartServiceImpl.DeleteCart(id, cart);
		session.setAttribute("Cart", cart); 
		session.setAttribute("TotalQuantyCart", cartServiceImpl.TotalQuanty(cart)); 
		session.setAttribute("TotalPriceCart", cartServiceImpl.TotalPrice(cart)); 
//		return "redirect:/product-details/"+id;
		return "redirect:"+request.getHeader("Referer");
	}

}
