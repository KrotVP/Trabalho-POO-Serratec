package br.modelo.serratec.entidade;

import br.modelo.serratec.enums.TipoConta;

public class ContaCorrente extends Conta {
	TipoConta tipo;

	public ContaCorrente(int codAgencia, double saldo, String tipo, int codConta, TipoConta tipo2) {
		super(codAgencia, saldo, tipo, codConta);
		this.tipo = tipo2;
	}

}
