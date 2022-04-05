package giadung.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import giadung.Entity.Users;
import giadung.Service.User.AccountServiceImpl;

@Controller
public class UserController extends BaseController {

	AccountServiceImpl accountService = new AccountServiceImpl();

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView Dangky() {
		_mvShare.setViewName("user/account/register");
		_mvShare.addObject("user", new Users());
		return _mvShare;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView CreateAcc(@ModelAttribute("user") Users user) {
		int count = accountService.AddAccount(user);
		if (count > 0) {
			_mvShare.addObject("status", "Đăng ký tài khoản thành công!");
		} else {
			_mvShare.addObject("status", "Đăng ký tài khoản thất bại!");
		}

		_mvShare.setViewName("user/account/register");
		return _mvShare;
	}

	@RequestMapping("/forgetpass")
	public ModelAndView forgotpass() {
		ModelAndView mv = new ModelAndView("user/account/forgetpass");
		return mv;
	}

}
