package br.com.bytebank.banco.model;

public class ContaPoupanca implements Conta {
	private ContaUtil contaUtil;

    public ContaPoupanca(double saldo, int agencia, int numero, Cliente titular) {
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
		this.contaUtil.transfere(valor, conta);
	}

	@Override
	public int getAgencia() {
		return this.contaUtil.getAgencia();
	}

	@Override
	public int getNumero() {
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
		return "CP, "+this.contaUtil.toString();
	}
	
}
