package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.model.Pais;
import com.backend.repository.PaisRepository;

@Service
public class PaisService {
	

	@Autowired
	private PaisRepository paisRepository;


	public List<Pais> findAll() {
		return paisRepository.findAll();
	}


}