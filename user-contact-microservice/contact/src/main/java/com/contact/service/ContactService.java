package com.contact.service;

import java.util.List;

import com.contact.bean.Contact;

public interface ContactService {
	public List<Contact> getContacts(long userId);
}
