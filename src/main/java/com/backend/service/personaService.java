package com.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.backend.model.persona;
import com.backend.repository.personaRepository;

@Service
public class personaService {
		
	@Autowired
	private personaRepository personaRepository;

	public List<persona> findAll() {
		return personaRepository.findAll();
	}

	public List<persona> findAll(Sort sort) {
		return personaRepository.findAll(sort);
	}


	public Page<persona> findAll(Pageable pageable) {
		return personaRepository.findAll(pageable);
	}

	public <S extends persona> S save(S entity) {
		return personaRepository.save(entity);
	}

	public Optional<persona> findById(Long id) {
		return personaRepository.findById(id);
	}


	public Boolean deleteById(Long id) {
		if (personaRepository.existsById(id)) {
			personaRepository.deleteById(id);
			return true;
		}
		return false;
	}

	public void delete(persona entity) {
		personaRepository.delete(entity);
	}


	

}