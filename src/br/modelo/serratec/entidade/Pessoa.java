package br.modelo.serratec.entidade;

public abstract class Pessoa {
	protected String cpf;
	protected String senha;
	protected Conta conta;

	public Pessoa(String cpf, String senha, Conta conta) {
		super();
		this.cpf = cpf;
		this.senha = senha;
		this.conta = conta;
	}

	public String getCpf() {
		return cpf;
	}

	public Conta getConta() {
		return conta;
	}

}
