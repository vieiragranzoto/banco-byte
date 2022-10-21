package br.com.bytebank.banco.model;

/**
 * Classe para moldura de atributos e metodos.
 * 
 * @author Vieira Granzoto
 * @version 0.1
 *
 */
public class ContaUtil {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public double consultarSaldo() {
        return saldo;
    }

    public void deposita(double saldo){
    	if(saldo<=0){
    		throw new ValorIncorretoException("Deposito de valor incorreto!");
        }
        this.saldo += saldo;
    }
    
    public void saca(double saldo){
        if(saldo>this.saldo||saldo<=0){
            throw new ValorIncorretoException("Valor de saque incorreto!");
        }
        this.saldo -= saldo;
    }
    
    public void transfere(double valor, Conta conta){
	    this.saca(valor);
	    conta.deposita(valor);
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
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
		return "Numero: "+this.getNumero()+", Agencia: "+this.getAgencia();
	}
}
