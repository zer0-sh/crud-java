package com.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.service.estadoService;
import com.backend.model.estado;

@RestController
@RequestMapping ("/estados")
public class estadoREST {
	
	@Autowired
	private estadoService estadoService;
	
	@GetMapping ("{id}")
	private ResponseEntity<List<estado>> getAllEstadosByPais (@PathVariable("id") Long idPais){
		return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
		
	}

}
