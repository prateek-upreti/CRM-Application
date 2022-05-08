package com.My_CRM.Service;

import java.util.List;
import com.My_CRM.Entities.Contact;

public interface ContactService {

	public void save(Contact contact);

	public List<Contact> findAll();

	public Contact findById(long id);

	public void delete(long id);

}
