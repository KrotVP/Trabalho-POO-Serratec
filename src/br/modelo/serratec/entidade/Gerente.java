package br.modelo.serratec.entidade;

import br.modelo.serratec.enums.Cargo;

public class Gerente extends Funcionario {
	
	private int codAgencia;
	
	public Gerente(String cpf, String senha, Conta conta, Cargo cargo,int codAgencia) {
		super(cpf, senha, conta, cargo);
		this.codAgencia=codAgencia;
	}

	public int getCodAgencia() {
		return codAgencia;
	}

}
