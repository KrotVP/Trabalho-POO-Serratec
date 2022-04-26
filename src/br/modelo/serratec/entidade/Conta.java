package br.modelo.serratec.entidade;

public abstract class Conta {
	protected int codAgencia;
	protected double saldo;
	protected String tipo;
	protected int codConta;

	public Conta(int codAgencia, double saldo, String tipo, int codConta) {
		this.codAgencia = codAgencia;
		this.saldo = saldo;
		this.tipo = tipo;
		this.codConta = codConta;
	}

	public int getCodAgencia() {
		return codAgencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public int getCodConta() {
		return codConta;
	}

}
