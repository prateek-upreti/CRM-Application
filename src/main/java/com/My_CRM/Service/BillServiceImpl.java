package com.My_CRM.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.My_CRM.Entities.Bill;
import com.My_CRM.Repositories.BillRepository;
import com.My_CRM.Utility.pdfGenerator;

@Service
public class BillServiceImpl implements BillService {
	@Autowired
	private BillRepository billRepo;

	@Autowired
	private pdfGenerator PDFgenerator;

	@Override
	public void save(Bill bill, long id) {
		billRepo.save(bill);
		String filePath = "D:\\Prateek\\Project\\CRM\\invoice_" + id + ".pdf";
		PDFgenerator.generator(bill, filePath);
	}

	@Override
	public List<Bill> findAll() {
		return billRepo.findAll();
	}

}
