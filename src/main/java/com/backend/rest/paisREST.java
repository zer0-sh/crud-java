package com.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.service.paisService;
import com.backend.model.pais;

@RestController
@RequestMapping ("/pais")
public class paisREST {

	
	@Autowired
	private paisService paisService;
	
	@GetMapping
	private ResponseEntity<List<pais>> getAllPaises (){
		return ResponseEntity.ok(paisService.findAll());
	}
	
	
}