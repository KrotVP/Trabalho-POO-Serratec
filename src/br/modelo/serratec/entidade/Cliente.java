package br.modelo.serratec.entidade;

public class Cliente extends Pessoa {

	public String codCliente;

	public Cliente(String cpf, String senha, Conta conta,String codCliente) {
		super(cpf, senha, conta);
		this.codCliente = codCliente;
	}

	public String getCodCliente() {
		return codCliente;
	}

}
