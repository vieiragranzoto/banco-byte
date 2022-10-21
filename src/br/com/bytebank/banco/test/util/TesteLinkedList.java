package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteLinkedList {
	public static void main(String[] args) {
		
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
		Cliente cliente1 = new Cliente("43679864512", "Joaquina Silvana", 43, "Rua Engenheiro Alvaro");
		ContaCorrente cc1 = new ContaCorrente(526.5, "5460", "21540", cliente1);
		lista.add(cc1);
		
		Cliente cliente2 = new Cliente("12345678954","Priscilla Silva", 20, "Rua Carmine monetti");
		ContaPoupanca cp1 = new ContaPoupanca(234.5, "0123", "5670", cliente2);
		lista.add(cp1);
		
		Cliente cliente3 = new Cliente("12345678954","Priscilla Silva", 20, "Rua Carmine monetti");
		ContaCorrente cc2 = new ContaCorrente(234.5, "0123", "5670", cliente3);
		lista.add(cc2);
		
		Cliente cliente4 = new Cliente("43679864512", "Joaquina Silvana", 43, "Rua Engenheiro Alvaro");
		ContaCorrente cp2 = new ContaCorrente(526.5, "5460", "21540", cliente4);
		lista.add(cp2);
		
		
		for(Conta c : lista) {
				System.out.println(c);
		}
	}
}
