package br.com.hb3.DAO;

import javax.persistence.EntityManager;

import br.com.hb3.modelo.Endereco;

public class EnderecoDao {
	
	private EntityManager em;

	public EnderecoDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Endereco endereco) {
		this.em.persist(endereco);
	}
	
}
