package br.com.bytebank.banco.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Classe para moldura de atributos e metodos.
 * 
 * @author Vieira Granzoto
 * @version 0.1
 *
 */
public class ContaUtil implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private BigDecimal saldo;
    private String agencia;
    private String numero;
    private Cliente titular;
    
    public ContaUtil(){
    	this.saldo= new BigDecimal("0").setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal consultaSaldo() {
        return saldo;
    }

    public void deposita(BigDecimal saldo){
    	if(saldo.compareTo(BigDecimal.ZERO)<=0){
    		throw new ValorIncorretoException("Deposito de valor incorreto!"+saldo);
        }
        this.saldo = this.saldo.add(saldo);
    }
    
    public void saca(BigDecimal saldo){
        if(saldo.compareTo(this.saldo)==1 || saldo.compareTo(BigDecimal.ZERO)<=0){
            throw new ValorIncorretoException("Valor de saque incorreto!"+saldo);
        }
        this.saldo=this.saldo.subtract(saldo);
    }
    
    public void transfere(BigDecimal valor, Conta conta){
	    this.saca(valor);
	    conta.deposita(valor);
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public String getAgencia() {
        return agencia;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
    
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
   
   public Cliente getTitular(){
       return titular;
   }
   
   @Override
   public boolean equals(Object obj) {
	   Conta conta = (Conta)obj;
		if (this.agencia != conta.getAgencia()) {
			return false;
		}
		if (this.numero != conta.getNumero()) {
			return false;
		}
		return true;
	}
   
	@Override
	public String toString() {
		return " | Agencia: "+this.getAgencia()+" | Numero: "+this.getNumero()+" |";
	}
	
	public int compareTo(Conta outra) {
		int n1 = Integer.parseInt(this.numero);
		int n2 = Integer.parseInt(outra.getNumero());
		
		return Integer.compare(n1, n2);
	}
	
	@Override
		public int hashCode() {
			return this.numero.hashCode();
		}
	
}
