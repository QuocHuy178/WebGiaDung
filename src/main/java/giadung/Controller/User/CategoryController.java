package giadung.Controller.User;

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
	
}
