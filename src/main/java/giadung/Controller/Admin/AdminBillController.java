package giadung.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import giadung.Entity.PaginatesDto;


@Controller
public class AdminBillController extends BaseControllerAdmin {
	@RequestMapping(value = { "/admin/BillAdmin" })
	public ModelAndView Index() {
		_mvShare.addObject("billadmin", _billsService.GetAllBill());
		_mvShare.setViewName("admin/BillAdmin");
		return _mvShare;
	}
	
	@RequestMapping(value = { "/admin/BillDetail/{id}" })
	public ModelAndView Index(@PathVariable long id) {
		_mvShare.addObject("billsdetail", _billsService.GetBillById(id));
		_mvShare.setViewName("admin/BillDetail");

		return _mvShare;
	}
}
