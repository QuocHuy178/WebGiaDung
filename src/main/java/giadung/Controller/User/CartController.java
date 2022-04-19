package giadung.Controller.User;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import giadung.Entity.Bills;
import giadung.Entity.Carts;
import giadung.Entity.Users;
import giadung.Service.User.BillsServiceImpl;
import giadung.Service.User.CartServiceImpl;

@Controller
public class CartController extends BaseController {
	@Autowired
	private CartServiceImpl cartServiceImpl = new CartServiceImpl();

	@Autowired
	private BillsServiceImpl billService = new BillsServiceImpl();

	@RequestMapping(value = "listcart")
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

	@RequestMapping(value = "AddCart/{id}")
	public String AddCart(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		HashMap<Long, Carts> cart = (HashMap<Long, Carts>) session.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Long, Carts>();
		}
		cart = cartServiceImpl.AddCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartServiceImpl.TotalQuanty(cart));
		session.setAttribute("TotalPriceCart", cartServiceImpl.TotalPrice(cart));
//		return "redirect:/product-details/"+id;
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "EditCart/{id}/{quanty}")
	public String EditCart(HttpServletRequest request, HttpSession session, @PathVariable long id,
			@PathVariable int quanty) {
		HashMap<Long, Carts> cart = (HashMap<Long, Carts>) session.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Long, Carts>();
		}
		cart = cartServiceImpl.EditCart(id, quanty, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartServiceImpl.TotalQuanty(cart));
		session.setAttribute("TotalPriceCart", cartServiceImpl.TotalPrice(cart));
//		return "redirect:/product-details/"+id;
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "DeleteCart/{id}")
	public String DeleteCart(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		HashMap<Long, Carts> cart = (HashMap<Long, Carts>) session.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Long, Carts>();
		}
		cart = cartServiceImpl.DeleteCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartServiceImpl.TotalQuanty(cart));
		session.setAttribute("TotalPriceCart", cartServiceImpl.TotalPrice(cart));
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "checkout", method = RequestMethod.GET)
	public ModelAndView CheckOut(HttpServletRequest request, HttpSession session) {
		_mvShare.setViewName("user/bills/checkout");
		_mvShare.addObject("bills", new Bills());
		Bills bills = new Bills();
		Users loginInfo = (Users) session.getAttribute("LoginInfo");
		if (loginInfo != null) {
			bills.setAddress(loginInfo.getAddress());
			bills.setDisplay_name(loginInfo.getDisplay_name());
			bills.setUser(loginInfo.getUser());
		}
		_mvShare.addObject("bills", bills);
		return _mvShare;
	}

	@RequestMapping(value = "checkout", method = RequestMethod.POST)
	public String CheckOutBill(HttpServletRequest request, HttpSession session, @ModelAttribute("bills") Bills bill) {
		bill.setQuanty(Integer.parseInt((String) session.getAttribute("TotalPriceCart")));
		bill.setTotal(Double.parseDouble((String) session.getAttribute("TotalQuantyCart")));
		if (billService.AddBills(bill) > 0) {
			HashMap<Long, Carts> carts = (HashMap<Long, Carts>) session.getAttribute("Cart");
			billService.AddBillDetail(carts);
		}
		session.removeAttribute("Cart");
		return "redirect:listcart";
	}

}
