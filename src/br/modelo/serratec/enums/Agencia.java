package br.modelo.serratec.enums;

import br.modelo.serratec.exceptions.EnumInexistenteException;

public enum Agencia {
	AGENCIA01(1), AGENCIA02(2), AGENCIA03(3);

	private int codAgencia;

	Agencia(int i) {
		this.codAgencia = i;
	}

	public Agencia getAgenciaPorId(int id) {
		for (Agencia agenciaAtual : Agencia.values()) {
			if (agenciaAtual.getCodAgencia() == id) {
				return agenciaAtual;
			}

		}
		throw new EnumInexistenteException();
	}

	public int getCodAgencia() {
		return codAgencia;
	}

}
