package com.My_CRM.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.My_CRM.Entities.Bill;
import com.My_CRM.Entities.Contact;
import com.My_CRM.Service.BillService;
import com.My_CRM.Service.ContactService;

@Controller
public class BillController {
	@Autowired
	private ContactService contactService;
	@Autowired
	private BillService billService;

	@RequestMapping("/billPage")
	public String billPage(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.findById(id);
		model.addAttribute("contact", contact);
		return "billPage";
	}

	@RequestMapping("/billPageSave")
	public String billPageSave(@ModelAttribute("contact") Bill bill, @RequestParam("id") long id, ModelMap model) {
		billService.save(bill, id);
		model.addAttribute("bill", bill);
		return "billPageInfo";
	}

	@RequestMapping("/bill")
	public String bill(ModelMap model) {
		List<Bill> bill = billService.findAll();
		model.addAttribute("bill", bill);
		return "bill";
	}
}
