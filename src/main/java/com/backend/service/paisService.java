package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.model.pais;
import com.backend.repository.paisRepository;

@Service
public class paisService {
	

	@Autowired
	private paisRepository paisRepository;


	public List<pais> findAll() {
		return paisRepository.findAll();
	}


}