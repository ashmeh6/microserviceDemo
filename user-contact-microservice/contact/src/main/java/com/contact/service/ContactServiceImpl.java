package com.contact.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.bean.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> contacts = new ArrayList<>(Arrays.asList(
			new Contact(1, "ramesh@mail.com", "1111111", 1301L),
			new Contact(2, "suresh@mail.com", "2221111", 1301L),
			new Contact(3, "mahesh@mail.com", "999", 1302L),
			new Contact(4, "shamu@mail.com", "888", 1302L),
			new Contact(5, "hesh@mail.com", "123456", 1303L)
			));
	
	@Override
	public List<Contact> getContacts(long userId) {
		return contacts.stream().filter(contact -> contact.getUserId()==userId).collect(Collectors.toList());
	}

}
