package com.My_CRM.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.My_CRM.Entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
