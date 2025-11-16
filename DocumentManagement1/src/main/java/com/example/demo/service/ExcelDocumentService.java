package com.example.demo.service;

public class ExcelDocumentService implements DocumentService {

	@Override
	public void ReadDocumentFromDb() {
		System.out.println("Read Excel form DB");
		
	}

	@Override
	public void ProcessForDocument() {
		System.out.println("Procces document for Excel");
		
	}

	@Override
	public String PrintDocument() {
		System.out.println("Print Excel");
		return "Excel";
	}
	

}
