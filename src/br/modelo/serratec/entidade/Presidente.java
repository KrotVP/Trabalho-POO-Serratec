package br.modelo.serratec.entidade;

import br.modelo.serratec.enums.Cargo;

public class Presidente extends Funcionario {

	public Presidente(String cpf, String senha, Conta conta, Cargo cargo) {
		super(cpf, senha, conta, cargo);

	}

}
