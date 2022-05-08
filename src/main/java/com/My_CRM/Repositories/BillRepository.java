package com.My_CRM.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.My_CRM.Entities.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {

}
