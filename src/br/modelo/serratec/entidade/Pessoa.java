package br.modelo.serratec.entidade;

public abstract class Pessoa {
	protected String cpf;
	protected String senha;
	protected Conta conta;
	public Pessoa(String cpf, String senha, Conta conta) {
		this.cpf = cpf;
		this.senha = senha;
		this.conta = conta;
	}
	

}
