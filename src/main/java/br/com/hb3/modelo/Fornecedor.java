package br.com.hb3.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Fornecedores")
public class Fornecedor {

	private boolean isRascunho;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String cnpj;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;
	private Long dtCadastro;
	private String rzSocial;
	private String nmFantasia;
	
	@OneToOne
	private Endereco endereco;
	
	public Fornecedor() {
	}
	
	public Fornecedor(Endereco endereco, String cnpj) {
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	public Fornecedor(boolean isRascunho, String email, String cnpj, String inscricaoEstadual,
			String inscricaoMunicipal, long dtCadastro, String rzSocial, String nmFantasia, Endereco endereco) {
		super();
		this.isRascunho = isRascunho;
		this.email = email;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.dtCadastro = dtCadastro;
		this.rzSocial = rzSocial;
		this.nmFantasia = nmFantasia;
		this.endereco = endereco;
	}

	public boolean isRascunho() {
		return isRascunho;
	}

	public void setRascunho(boolean isRascunho) {
		this.isRascunho = isRascunho;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public long getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(long dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getRzSocial() {
		return rzSocial;
	}

	public void setRzSocial(String rzSocial) {
		this.rzSocial = rzSocial;
	}

	public String getNmFantasia() {
		return nmFantasia;
	}

	public void setNmFantasia(String nmFantasia) {
		this.nmFantasia = nmFantasia;
	}

	public Long getId() {
		return id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

	/*public void salvar() {

	}

	public void alterar() {

	}

	public Fornecedor[] consultar() {
		return null;
	}

	public void excluir() {

	}

	public void inativar() {

	}

	public void ativar() {

	}

	public void addContato(Contato contato) {

	}

	public void validarCNPJ() {

	}

	public void validarListaFornecimento() {

	}*/

}
