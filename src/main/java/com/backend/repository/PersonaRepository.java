package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}