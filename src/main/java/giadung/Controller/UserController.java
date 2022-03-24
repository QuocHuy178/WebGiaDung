package giadung.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import giadung.Dao.SlidesDao;

@Controller 
public class UserController {
	@Autowired
	SlidesDao homeDao;
	
	@RequestMapping(value= {"/","/trang-chu"})
	public ModelAndView  Index() {
		ModelAndView mv = new ModelAndView("/user/index");
		mv.addObject("slides",homeDao.GetDataSlide());
		return mv;
	}
}
