package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteArrayListEquals {
	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Cliente cliente1 = new Cliente("43679864512", "Joaquina Silvana", 43, "Rua Engenheiro Alvaro");
		ContaCorrente cc1 = new ContaCorrente(526.5, 5460, 21540, cliente1);
		lista.add(cc1);
		
		Cliente cliente2 = new Cliente("12345678954","Priscilla Silva", 20, "Rua Carmine monetti");
		ContaPoupanca cp1 = new ContaPoupanca(234.5, 0123, 5670, cliente2);
		lista.add(cp1);
		
		Cliente cliente3 = new Cliente("12345678954","Priscilla Silva", 20, "Rua Carmine monetti");
		ContaCorrente cc2 = new ContaCorrente(234.5, 0123, 5670, cliente3);
		
		Cliente cliente4 = new Cliente("43679864512", "Joaquina Silvana", 43, "Rua Engenheiro Alvaro");
		ContaCorrente cp2 = new ContaCorrente(526.5, 5460, 21540, cliente4);

		boolean testeEquals = lista.contains(cc2);
		
		System.out.println(testeEquals);
		
		for(Conta c : lista) {
			if(c.equals(cc2)) {
				System.out.println(c.getTitular());
			}
		}
	}
}
