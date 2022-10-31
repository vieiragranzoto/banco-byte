package br.com.bytebank.banco.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaCorrente implements Conta {
	

	private static final long serialVersionUID = 1L;
	
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
    public ContaCorrente(BigDecimal saldo, String agencia, String numero, Cliente titular) {
    	this.contaUtil = new ContaUtil();
    	this.contaUtil.deposita(saldo);
        this.contaUtil.setAgencia(agencia);
        this.contaUtil.setNumero(numero);
        this.contaUtil.setTitular(titular);
    }

	@Override
	public BigDecimal consultaSaldo() {
		return this.contaUtil.consultaSaldo();
	}

	@Override
	public void deposita(BigDecimal saldo) {
		this.contaUtil.deposita(saldo);
	}

	@Override
	public void saca(BigDecimal saldo) {
		this.contaUtil.saca(saldo);
	}

	@Override
	public void transfere(BigDecimal valor, Conta conta) {
		valor = valor.add(valor.multiply(new BigDecimal("0.01"))).setScale(2, RoundingMode.HALF_UP);
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
		return "| CC"+this.contaUtil.toString();
	}

	@Override
	public int compareTo(Conta outra) {
		return this.contaUtil.compareTo(outra);
	}
	
	@Override
	public int hashCode() {
		return this.contaUtil.hashCode();
	}
}
