package br.modelo.serratec.enums;

public enum Cargo {
	DIRETOR(1),
	GERENTE(2),
	PRESIDENTE(3);
	private int codigoCargo;
	Cargo(int i) {
		this.codigoCargo=i;
	}
	public int getCodigoCargo() {
		return codigoCargo;
	}
	
	
}
