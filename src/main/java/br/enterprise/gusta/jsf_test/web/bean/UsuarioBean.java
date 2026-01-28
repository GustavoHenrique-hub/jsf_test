package br.enterprise.gusta.jsf_test.web.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.enterprise.gusta.jsf_test.model.entity.UsuarioEntity;
import br.enterprise.gusta.jsf_test.service.UsuarioService;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@ViewScoped
public class UsuarioBean implements Serializable {

	@Inject
	private UsuarioService service;

	private UsuarioEntity usuario = new UsuarioEntity();
	
	private List<UsuarioEntity> lista = new ArrayList<UsuarioEntity>();

	public void salvar() {
		service.cadastrar(usuario);
		usuario = new UsuarioEntity();
	}
	
	public void listar(){
		lista = service.listar();
	}

	public UsuarioEntity getUsuario() {
		return usuario;
	}

	public List<UsuarioEntity> getLista() {
		return lista;
	}

	public void setLista(List<UsuarioEntity> lista) {
		this.lista = lista;
	}
	
	
}
