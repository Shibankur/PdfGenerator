/**
 * 
 */
package com.generate.pdf;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;  
import org.apache.pdfbox.pdmodel.PDPage;  

/**
 * @author ShibankurD
 *
 */
public class GeneratePDFAppMain {
	public static void main(String []args) throws IOException {
		System.out.println("Inside main class.");
		PDDocument pdfdoc= new PDDocument();  
		pdfdoc.addPage(new PDPage());  
		//path where the PDF file will be store  
		try {
			pdfdoc.save("Sample.pdf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		//prints the message if the PDF is created successfully   
		System.out.println("PDF created");  
		//closes the document  
		pdfdoc.close();  
	}  
}

