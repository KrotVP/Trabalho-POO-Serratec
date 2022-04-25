package br.modelo.serratec.interfaces;

import br.modelo.serratec.entidade.Conta;

public interface Menu {
	boolean autenticacao(String cpf,String Senha);
	boolean saque(double valor);
	void transferir(double valor, String numeroConta);
	double checarSaldo();
	void deposito(double valor);
	double totalGastoAtéAgora();
	double relatoriosTributacao();
	double relatoriosRendimento();
	double relatorioNumeroContas();
	Conta relatorioInformacoesClientes();
	
	
}
