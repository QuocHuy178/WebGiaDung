package giadung.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import giadung.Dao.SlidesDao;
import giadung.Service.User.HomeServiceImpl;

@Controller 
public class UserController {
	@Autowired
	HomeServiceImpl HomeService;
	
	@RequestMapping(value= {"/","/trang-chu"})
	public ModelAndView  Index() {
		ModelAndView mv = new ModelAndView("/user/index");
		mv.addObject("slides",HomeService.GetDataSlide());
		return mv;
	}
}
