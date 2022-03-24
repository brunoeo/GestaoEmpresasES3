package br.com.hb3.DAO;

import javax.persistence.EntityManager;

import br.com.hb3.modelo.Fornecedor;

public class FornecedorDao {
	
	private EntityManager em;

	public FornecedorDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Fornecedor fornecedor) {
		this.em.persist(fornecedor);
	}
	
	
}
