package com.My_CRM.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.My_CRM.Entities.Contact;
import com.My_CRM.Repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public void save(Contact contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contact> findAll() {
		return contactRepo.findAll();
	}

	@Override
	public Contact findById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		return findById.get();
	}

	@Override
	public void delete(long id) {
		contactRepo.deleteById(id);
	}

}
