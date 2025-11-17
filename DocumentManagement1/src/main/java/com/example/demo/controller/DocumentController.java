package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelDocumentService;
import com.example.demo.service.PdfDocumentServcie;

@RestController
public class DocumentController {
	@GetMapping("xerox/{type}")
	String PrintInvoice(@PathVariable String type) {

		DocumentService ds = null;
		if (type.equals("pdf")) {
			ds = new PdfDocumentServcie();
		}
		if (type.equals("excel")) {
			ds = new ExcelDocumentService();
		}

		ds.ReadDocumentFromDb();
		ds.ProcessForDocument();
		return ds.PrintDocument();

	}

}
