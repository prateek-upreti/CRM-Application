package com.My_CRM.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.My_CRM.Entities.Lead;
import com.My_CRM.Repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void save(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public List<Lead> findAll() {
		return leadRepo.findAll();
	}

	@Override
	public Lead findById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		return findById.get();
	}

	@Override
	public void delete(long id) {
		leadRepo.deleteById(id);
	}

}
