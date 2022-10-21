package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Cliente c1 = new Cliente("43679864512", "Joaquina Silvana", 43, "Rua Engenheiro Alvaro");
		ContaCorrente cc1 = new ContaCorrente(526.5, 5460, 21540, c1);
		lista.add(cc1);
		
		Cliente c2 = new Cliente("12345678954","Jaime Soares", 42, "Rua Carmine monetti");
		ContaPoupanca cp1 = new ContaPoupanca(234.5, 0123, 5670, c2);
		lista.add(cp1);
		
		Cliente c3 = new Cliente("34565412345", "Giovana Xavez", 54, "Av. Brigadeiro Luis");
		ContaPoupanca cp2 = new ContaPoupanca(744.2, 2345, 67842, c3);
		lista.add(cp2);
	
		
		Cliente c4 = new Cliente("69836974102", "Monica Silva", 19, "R. Libero Badaro");
		ContaCorrente cc2 = new ContaCorrente(744.2, 2345, 67842, c4);
		lista.add(cc2);
		
		Conta ref = lista.get(0);
		System.out.println(ref.getTitular().getNome());
		
//		System.out.println(lista.size());
//		
//		Object ref = lista.get(2);
//		System.out.println(ref);
//		
//		lista.remove(2);
//		
//		System.out.println(lista.size());
		
//		for(int i = 0;i<lista.size();i++) {
//			System.out.println(lista.get(i));
//		}
		
//		for(Conta c : lista) {
//			System.out.println(c);
//		}
	}
}
