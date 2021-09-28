package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.bean.Contact;
import com.contact.service.ContactService;

@RestController
@RequestMapping("/user/contact")
public class ContactController {

	@Autowired
	ContactService contactService;
	
	@RequestMapping("/{userId}")
	public List<Contact> getUserContact(@PathVariable("userId") long userId) {
		return contactService.getContacts(userId);
	}
}
