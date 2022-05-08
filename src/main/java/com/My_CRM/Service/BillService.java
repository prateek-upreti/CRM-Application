package com.My_CRM.Service;

import java.util.List;
import com.My_CRM.Entities.Bill;

public interface BillService {

	public void save(Bill bill, long id);

	public List<Bill> findAll();

}
