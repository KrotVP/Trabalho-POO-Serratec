package br.modelo.serratec.entidade;

import br.modelo.serratec.enums.Cargo;

public abstract class Funcionario extends Pessoa {
	
	private  Cargo cargo;
	
	public Funcionario(String cpf, String senha, Conta conta,Cargo cargo) {
		super(cpf, senha, conta);
		this.cargo=cargo;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	
	

}
