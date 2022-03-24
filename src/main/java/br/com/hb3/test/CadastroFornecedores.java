package br.com.hb3.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.hb3.DAO.EnderecoDao;
import br.com.hb3.DAO.FornecedorDao;
import br.com.hb3.modelo.Endereco;
import br.com.hb3.modelo.Fornecedor;

public class CadastroFornecedores {
	
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("12345");
		Fornecedor fornecedor = new Fornecedor(endereco, "147852");
		
		EntityManagerFactory FACTORY = Persistence
				.createEntityManagerFactory("gestaoEmpresa");
		
		EntityManager em = FACTORY.createEntityManager();
		
		FornecedorDao fornecedorDao = new FornecedorDao(em);
		EnderecoDao enderecoDao = new EnderecoDao(em);
		
		em.getTransaction().begin();
		fornecedorDao.cadastrar(fornecedor);
		enderecoDao.cadastrar(endereco);
		
		em.getTransaction().commit();
		em.close();
		
	}
	
	

	
	
	

}
