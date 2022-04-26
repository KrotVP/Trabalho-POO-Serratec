package br.modelo.serratec.exceptions;

// Se extender de runtimeException será unchecked, caso contrário será checkhed
public class EnumInexistenteException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Enum não encontrado, fechando programa";
	}

}