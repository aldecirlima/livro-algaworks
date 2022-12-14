package br.com.bb.seguranca.ecoa.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.bb.seguranca.ecoa.model.Pessoa;

public class Pessoas implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private EntityManager manager;

	public Pessoas(EntityManager manager) {
		this.manager = manager;
	}

	public Pessoa porId(Long id) {
		return manager.find(Pessoa.class, id);
	}

	public List<Pessoa> todas() {
		TypedQuery<Pessoa> query = manager.createQuery("from Pessoa", Pessoa.class);
		return query.getResultList();
	}
}
