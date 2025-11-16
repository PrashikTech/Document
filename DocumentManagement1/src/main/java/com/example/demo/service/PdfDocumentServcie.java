package com.example.demo.service;

public class PdfDocumentServcie implements DocumentService {

	@Override
	public void ReadDocumentFromDb() {
		System.out.println("Read Pdf from DB");
		
	}

	@Override
	public void ProcessForDocument() {
		System.out.println("Procees for Pdf");
		
	}

	@Override
	public String PrintDocument() {
		System.out.println("Print Pdf");
		return "PDF";
	}

}
