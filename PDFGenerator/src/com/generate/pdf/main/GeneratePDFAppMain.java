/**
 * 
 */
package com.generate.pdf.main;

import java.io.IOException;
import java.io.FileOutputStream;
import com.itextpdf.text.Paragraph;
import com.generate.pdf.util.ApplicationConstant;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @author ShibankurD
 *
 */
public class GeneratePDFAppMain {
	public static void main(String[] args) throws IOException {
		System.out.println("Inside main class.");

		try {
			// location where PDF will be generated
			FileOutputStream fos = new FileOutputStream("D:\\Account Details.pdf");
			System.out.println("Password Protected File Generated.");
			// creates an instance of PDF document
			Document doc = new Document();
			// doc writer for the PDF

			PdfWriter writer = PdfWriter.getInstance(doc, fos);
			writer.setEncryption(ApplicationConstant.USER_PASSWORD.getBytes(), 
					ApplicationConstant.OWNER_PASSWORD.getBytes(),
					PdfWriter.ALLOW_PRINTING, 
					PdfWriter.ENCRYPTION_AES_128);

			// opens the PDF
			doc.open();
			// adding paragraphs to the PDF
			doc.add(new Paragraph("                        HSBC Bank (USA)"));
			doc.add(new Paragraph("                                       "));
			doc.add(new Paragraph("Account Holder Name: Rachel Weisz"));
			doc.add(new Paragraph("Account Number: xxx-xxx-xxx-234"));
			doc.add(new Paragraph("Branch:  Los Angeles"));
			doc.add(new Paragraph("Branch Code: 18743"));
			doc.add(new Paragraph("Mobile Number: +1 (xxxx)-xxx-456"));
			doc.add(new Paragraph("Address: P.O. Box 1421, PC 111, CPO, New York (USA)"));
			doc.add(new Paragraph("Debit Card Number: xxxx-xxxx-xxxx-0987"));
			doc.add(new Paragraph("e-mail: rachel@gmial.com"));
			doc.add(new Paragraph("Toll Free Number: 18000xxxxx"));
			// closes the document
			doc.close();
			// closes the output stream
			fos.close();
		}
		// catch the exception if any
		catch (Exception e) {
			// prints the occurred exception
			e.printStackTrace();
		}
	}
}
