package com.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.model.Estado;
import com.backend.repository.*;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;

	public List<Estado> findAll() {
		return estadoRepository.findAll();
	}
	
	public List<Estado> findAllByCountry (Long id){
		List<Estado> estadosRespuesta= new ArrayList<>();
		List<Estado> estados= estadoRepository.findAll();
		for (int i=0; i<estados.size(); i++) {
			if (estados.get(i).getPais().getId()==id) {
				estadosRespuesta.add(estados.get(i));
			}
		}
		return estadosRespuesta;
	}
}