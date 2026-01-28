package br.enterprise.gusta.jsf_test.repository;

import java.util.List;

import br.enterprise.gusta.jsf_test.model.entity.UsuarioEntity;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@RequestScoped
public class UsuarioRepository {
	@Inject
	private EntityManager em;

	public void salvar(UsuarioEntity u) {
		em.persist(u);
	}

	public List<UsuarioEntity> listar() {
		return em.createQuery("select u from UsuarioEntity u", UsuarioEntity.class).getResultList();
	}
}
