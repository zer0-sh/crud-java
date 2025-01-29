package com.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.backend.model.Persona;
import com.backend.repository.PersonaRepository;

@Service
public class PersonaService {
		
	@Autowired
	private PersonaRepository personaRepository;

	public List<Persona> findAll() {
		return personaRepository.findAll();
	}

	public List<Persona> findAll(Sort sort) {
		return personaRepository.findAll(sort);
	}


	public Page<Persona> findAll(Pageable pageable) {
		return personaRepository.findAll(pageable);
	}

	public <S extends Persona> S save(S entity) {
		return personaRepository.save(entity);
	}

	public Optional<Persona> findById(Long id) {
		return personaRepository.findById(id);
	}


	public Boolean deleteById(Long id) {
		if (personaRepository.existsById(id)) {
			personaRepository.deleteById(id);
			return true;
		}
		return false;
	}

	public void delete(Persona entity) {
		personaRepository.delete(entity);
	}


	

}