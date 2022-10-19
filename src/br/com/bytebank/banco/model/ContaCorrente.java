package br.com.bytebank.banco.model;

public class ContaCorrente implements Conta {

	private ContaUtil conta;

	/**
	 * Construtor para inicializar o objeto ContaUtil a partir dos atributos:
	 * saldo, agencia, numero, titular
	 * 
	 * @param saldo
	 * @param agencia
	 * @param numero
	 * @param titular
	 */
    public ContaCorrente(double saldo, int agencia, int numero, Cliente titular) {
    	this.conta = new ContaUtil();
    	this.conta.deposita(saldo);
        this.conta.setAgencia(agencia);
        this.conta.setNumero(numero);
        this.conta.setTitular(titular);
    }

	
	@Override
	public double consultarSaldo() {
		return this.conta.consultarSaldo();
	}

	@Override
	public void deposita(double saldo) {
		this.conta.deposita(saldo);
	}

	@Override
	public void saca(double saldo) {
		this.conta.saca(saldo);
	}

	@Override
	public void transfere(double valor, Conta conta) {
		valor = valor + (valor*0.01);
		this.conta.transfere(valor, conta);
	}

	@Override
	public int getAgencia() {
		return this.conta.getAgencia();
	}

	@Override
	public int getNumero() {
		return this.conta.getNumero();
	}

	@Override
	public Cliente getTitular() {
		return this.conta.getTitular();
	}
	
	@Override
	public String toString() {
		return "Conta tipo Corrente, "+this.conta.toString();
	}

}
