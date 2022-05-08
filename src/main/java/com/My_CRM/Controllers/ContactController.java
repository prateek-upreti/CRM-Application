package com.My_CRM.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.My_CRM.Entities.Contact;
import com.My_CRM.Service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;

	@RequestMapping("/contact")
	public String contact(ModelMap model) {
		List<Contact> lead = contactService.findAll();
		model.addAttribute("lead", lead);
		return "contact";
	}

	@RequestMapping("updateContact")
	public String updateContact(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.findById(id);
		model.addAttribute("contact", contact);
		return "updateContact";
	}

	@RequestMapping("/saveUpdate")
	public String saveUpdate(@ModelAttribute Contact contact, ModelMap model) {
		contactService.save(contact);
		model.addAttribute("msg", "Data Saved");
		return "updateContact";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("id") long id, ModelMap model) {
		contactService.delete(id);
		List<Contact> lead = contactService.findAll();
		model.addAttribute("lead", lead);
		return "contact";
	}
}
