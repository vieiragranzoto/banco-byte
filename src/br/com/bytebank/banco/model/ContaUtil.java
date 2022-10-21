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
    private String agencia;
    private String numero;
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
		return "Agencia: "+this.getAgencia()+", Numero: "+this.getNumero();
	}
}
