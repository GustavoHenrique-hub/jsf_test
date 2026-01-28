package br.enterprise.gusta.jsf_test.service;

import java.util.List;

import br.enterprise.gusta.jsf_test.model.entity.UsuarioEntity;
import br.enterprise.gusta.jsf_test.repository.UsuarioRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@RequestScoped
public class UsuarioService {

	@Inject
	private UsuarioRepository repo;

	@Inject
	private EntityManager em;

	public void cadastrar(UsuarioEntity u) {
		em.getTransaction().begin();
		repo.salvar(u);
		em.getTransaction().commit();
	}

	public List<UsuarioEntity> listar() {
		em.getTransaction().begin();
		repo.listar();
		em.getTransaction().commit();
		return repo.listar();
	}
}
