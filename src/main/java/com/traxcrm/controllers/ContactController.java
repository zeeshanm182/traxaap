package com.traxcrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.traxcrm.entities.Contact;
import com.traxcrm.services.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("listcontacts")
	public String listAllContacts(ModelMap model) {
		List<Contact> contacts = contactService.listAll();
		model.addAttribute("contacts", contacts);
		return "contact_search_result";
	}
	
	@RequestMapping("/getContactById")
	public String getgetContactById(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.findContactById(id);
		model.addAttribute("contact", contact);
		return "contact_info";
	}
	
	
	
}
