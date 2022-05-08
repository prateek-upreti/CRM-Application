package com.My_CRM.Service;

import java.util.List;

import com.My_CRM.Entities.Lead;

public interface LeadService {

	public void save(Lead lead);

	public List<Lead> findAll();

	public Lead findById(long id);

	public void delete(long id);

}
