package com.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "persona")
public class persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String apellido;
	private int edad;
	
	@ManyToOne
	@JoinColumn (name="id_pais")
	private pais pais;
	@ManyToOne
	@JoinColumn (name="id_estado")
	private estado estado;

	public persona(String nombre, String apellido, int edad, pais pais, estado estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.pais = pais;
		this.estado = estado;
	}
	public persona() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public pais getPais() {
		return pais;
	}
	public void setPais(pais pais) {
		this.pais = pais;
	}
	public estado getEstado() {
		return estado;
	}
	public void setEstado(estado estado) {
		this.estado = estado;
	}
}