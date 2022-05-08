package com.My_CRM.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {
	@Autowired
	private JavaMailSender sender;

	@RequestMapping("/emailPage")
	public String emailPage(@RequestParam("email") String email, ModelMap model) {
		model.addAttribute("email", email);
		return "emailPage";
	}

	@RequestMapping("/send")
	public String send(@RequestParam("to") String to, @RequestParam("subject") String subject,
			@RequestParam("body") String body, ModelMap model) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject(subject);
		message.setText(body);
		sender.send(message);
		model.addAttribute("msg", "Send Successfully");
		return "emailPage";
	}
}
