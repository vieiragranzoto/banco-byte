package br.com.bytebank.banco.model;

import java.util.ArrayList;

public class ListaDeContas {
	
	private Cliente c1,c2,c3,c4;
	private Conta cc1, cp1, cp2, cc2;
	private ArrayList<Conta> lista;
	
	public ListaDeContas(){
		this.c1 = new Cliente("43679864512", "Joaquina Silvana", 43, "Rua Engenheiro Alvaro");
		this.cc1 = new ContaCorrente(526.5, "5460", "21540", c1);
		
		this.c2 =new Cliente("12345678954","Jaime Soares", 42, "Rua Carmine monetti");
		this.cp1 = new ContaPoupanca(234.5, "0123", "5670", c2);
		
		this.c3 = new Cliente("34565412345", "Giovana Xavez", 54, "Av. Brigadeiro Luis");
		this.cp2 = new ContaPoupanca(744.2, "2345", "67842", c3);
		
		this.c4 = new Cliente("69836974102", "Monica Silva", 19, "R. Libero Badaro");
		this.cc2 = new ContaCorrente(744.2, "2345", "67842", c4);
		
		this.lista=new ArrayList<Conta>();
		lista.add(cc1);
		lista.add(cp1);
		lista.add(cp2);
		lista.add(cc2);
	}
	
	public ArrayList<Conta> getLista() {
		return lista;
	}
}
