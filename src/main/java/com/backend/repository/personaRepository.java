package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.model.persona;

public interface personaRepository extends JpaRepository<persona, Long> {

}