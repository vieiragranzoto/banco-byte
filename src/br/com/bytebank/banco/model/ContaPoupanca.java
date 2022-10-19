package br.com.bytebank.banco.model;

public class ContaPoupanca implements Conta {
	private ContaUtil conta;

    public ContaPoupanca(double saldo, int agencia, int numero, Cliente titular) {
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
		return "Conta tipo Poupanca, "+this.conta.toString();
	}
	
}
