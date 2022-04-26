package br.modelo.serratec.enums;

import br.modelo.serratec.exceptions.EnumInexistenteException;

public enum Cargo {
	DIRETOR(1), GERENTE(2), PRESIDENTE(3);

	private int codigoCargo;

	Cargo(int i) {
		this.codigoCargo = i;
	}

	public int getCodigoCargo() {
		return codigoCargo;
	}

	public Cargo getCargoPorId(int id) {
		for (Cargo cargoAtual : Cargo.values()) {
			if (cargoAtual.getCodigoCargo() == id) {
				return cargoAtual;
			}

		}
		throw new EnumInexistenteException();
	}

}
