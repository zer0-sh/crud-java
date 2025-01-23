package com.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.model.estado;
import com.backend.repository.*;

@Service
public class estadoService {
	
	@Autowired
	private estadoRepository estadoRepository;

	public List<estado> findAll() {
		return estadoRepository.findAll();
	}
	
	public List<estado> findAllByCountry (Long id){
		List<estado> estadosRespuesta= new ArrayList<>();
		List<estado> estados= estadoRepository.findAll();
		for (int i=0; i<estados.size(); i++) {
			if (estados.get(i).getPais().getId()==id) {
				estadosRespuesta.add(estados.get(i));
			}
		}
		return estadosRespuesta;
	}
}