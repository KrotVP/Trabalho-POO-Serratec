package br.modelo.serratec.entidade;

import br.modelo.serratec.enums.Cargo;

public class Diretor extends Funcionario {

	public Diretor(String cpf, String senha, Conta conta, Cargo cargo) {
		super(cpf, senha, conta, cargo);

	}

}
