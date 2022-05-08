package com.My_CRM.Utility;

import org.springframework.stereotype.Component;
import com.My_CRM.Entities.Bill;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;

@Component
public class pdfGenerator {
	public void generator(Bill bill, String filePath) {
		try {
			PdfWriter pdfWriter = new PdfWriter(filePath);
			PdfDocument pdfDocument = new PdfDocument(pdfWriter);
			Document document = new Document(pdfDocument);
			pdfDocument.setDefaultPageSize(PageSize.A4);
			float col = 280f;
			float columnWidth[] = { col, col };
			Table table = new Table(columnWidth);
			table.addCell(new Cell().add(new Paragraph("INVOICE").setTextAlignment(TextAlignment.CENTER)
					.setVerticalAlignment(VerticalAlignment.MIDDLE).setMarginTop(30f).setMarginBottom(30f)
					.setFontSize(30f).setBorder(Border.NO_BORDER)));

			table.addCell(new Cell().add(new Paragraph("iText7 PDF API\nBill Generator\nPSA Student")
					.setTextAlignment(TextAlignment.RIGHT).setVerticalAlignment(VerticalAlignment.MIDDLE)
					.setMarginTop(30f).setMarginBottom(30f).setBorder(Border.NO_BORDER).setMarginRight(10f)));
			float colWidth[] = { 100, 200, 200, 200 };

			Table customerInfoTable = new Table(colWidth);

			customerInfoTable.addCell(new Cell(0, 4).add(new Paragraph("Customer Information").setBold()));
			customerInfoTable.addCell(new Cell().add(new Paragraph("Name")));
			customerInfoTable.addCell(new Cell().add(new Paragraph(bill.getFirstName() + " " + bill.getLastName())));
			customerInfoTable.addCell(new Cell().add(new Paragraph("Invoice No")));
			customerInfoTable.addCell(new Cell().add(new Paragraph("0" + bill.getId())));
			customerInfoTable.addCell(new Cell().add(new Paragraph("Mobile")));
			customerInfoTable.addCell(new Cell().add(new Paragraph("+91" + bill.getMobile())));
			customerInfoTable.addCell(new Cell().add(new Paragraph("Email")));
			customerInfoTable.addCell(new Cell().add(new Paragraph(bill.getEmail())));
			float itemInfoColWidth[] = { 300, 300 };

			Table itemInfoTable = new Table(itemInfoColWidth);
			itemInfoTable.addCell(new Cell(0, 4).add(new Paragraph("Product and Price").setBold()));

			itemInfoTable.addCell(new Cell().add(new Paragraph("Product Name")));
			itemInfoTable.addCell(new Cell().add(new Paragraph("Amount")));
			itemInfoTable.addCell(new Cell().add(new Paragraph(bill.getProduct())));
			itemInfoTable.addCell(new Cell().add(new Paragraph("Rs " + bill.getAmount())));
			document.add(table);
			document.add(customerInfoTable);
			document.add(itemInfoTable);
			document.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
