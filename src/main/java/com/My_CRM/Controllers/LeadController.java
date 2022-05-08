package com.My_CRM.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.My_CRM.Entities.Contact;
import com.My_CRM.Entities.Lead;
import com.My_CRM.Service.ContactService;
import com.My_CRM.Service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;

	@Autowired
	private ContactService contactService;

	@RequestMapping("/createLead")
	public String createLead() {
		return "createLead";
	}

	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute Lead lead, ModelMap model) {
		leadService.save(lead);
		model.addAttribute("lead", lead);
		return "leadInfo";
	}

	@RequestMapping("/lead")
	public String lead(ModelMap model) {
		List<Lead> lead = leadService.findAll();
		model.addAttribute("lead", lead);
		return "lead";
	}

	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.findById(id);
		model.addAttribute("lead", lead);
		return "leadInfo";
	}

	@RequestMapping("/convertInfo")
	public String convertInfo(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.findById(id);
		Contact contact = new Contact();
		contact.setId(lead.getId());
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contactService.save(contact);

		leadService.delete(id);

		model.addAttribute("lead", lead);
		return "convertInfo";
	}
}
