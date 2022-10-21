package br.com.bytebank.banco.model;

public class ContaCorrente implements Conta {

	private ContaUtil contaUtil;

	/**
	 * Construtor para inicializar o objeto ContaUtil a partir dos atributos:
	 * saldo, agencia, numero, titular
	 * 
	 * @param saldo
	 * @param agencia
	 * @param numero
	 * @param titular
	 */
    public ContaCorrente(double saldo, String agencia, String numero, Cliente titular) {
    	this.contaUtil = new ContaUtil();
    	this.contaUtil.deposita(saldo);
        this.contaUtil.setAgencia(agencia);
        this.contaUtil.setNumero(numero);
        this.contaUtil.setTitular(titular);
    }

	
	@Override
	public double consultarSaldo() {
		return this.contaUtil.consultarSaldo();
	}

	@Override
	public void deposita(double saldo) {
		this.contaUtil.deposita(saldo);
	}

	@Override
	public void saca(double saldo) {
		this.contaUtil.saca(saldo);
	}

	@Override
	public void transfere(double valor, Conta conta) {
		valor = valor + (valor*0.01);
		this.contaUtil.transfere(valor, conta);
	}

	@Override
	public String getAgencia() {
		return this.contaUtil.getAgencia();
	}

	@Override
	public String getNumero() {
		return this.contaUtil.getNumero();
	}

	@Override
	public Cliente getTitular() {
		return this.contaUtil.getTitular();
	}
	
	@Override
	public boolean equals(Object conta) {
		return this.contaUtil.equals(conta);
	}
	
	@Override
	public String toString() {
		return "CC, "+this.contaUtil.toString();
	}

}
