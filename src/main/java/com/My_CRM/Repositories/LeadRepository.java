package com.My_CRM.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.My_CRM.Entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
