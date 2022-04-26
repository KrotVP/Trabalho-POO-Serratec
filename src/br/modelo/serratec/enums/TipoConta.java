package br.modelo.serratec.enums;

import br.modelo.serratec.exceptions.EnumInexistenteException;

public enum TipoConta {
	POUPANCA(1), CORRENTE(2);

	private int id;

	TipoConta(int i) {
		this.id = i;
	}

	public int getId() {
		return id;
	}

	public TipoConta getTipoContaPorId(int id) {
		for (TipoConta tipoAtual : TipoConta.values()) {
			if (tipoAtual.getId() == id) {
				return tipoAtual;
			}

		}
		// tendi nada
		throw new EnumInexistenteException();
	}

}
