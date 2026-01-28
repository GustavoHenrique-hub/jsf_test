package br.enterprise.gusta.jsf_test.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UsuarioEntity {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	// getters/setters
}
