package br.com.bytebank.banco.model;

public class Guardador {

	private Conta[] referencias;
	private int posicaolivre;
	
	public Guardador() {
		this.referencias= new Conta[10];
		this.posicaolivre=0;
	}
	
	public void adiciona(Conta conta) {
		this.referencias[this.posicaolivre]=conta;
		this.posicaolivre++;
	}
	
	public void lista() {
		for(int i = 0;i<this.posicaolivre;i++) {
			System.out.println(this.referencias[i].getTitular().getNome());
		}
	}
	
	public int getQuantidadeElemento() {
		return this.posicaolivre;
	}
	
	public Object localiza(int numero) {
		for(int i = 0;i < this.posicaolivre;i++) {
			if(this.referencias[i].getNumero()==numero) {
				return this.referencias[i];
			}
		}
		throw new RuntimeException("Numero da conta nao encontrado!"); 
	}
	
	public Object localiza(String cpf) {
		for(int i = 0;i < this.posicaolivre;i++) {
			if(this.referencias[i].getTitular().getCpf()==cpf) {
				return this.referencias[i];
			}
		}
		throw new RuntimeException("Conta com CPF:"+cpf+" nao encontrado!"); 
	}
	
	public Object localiza(Object objeto) {
		for(int i = 0;i < this.posicaolivre;i++) {
			if(this.referencias[i]==objeto) {
				return this.referencias[i];
			}
		}
		throw new RuntimeException("Objeto nao encontrado!"); 
	}
}
