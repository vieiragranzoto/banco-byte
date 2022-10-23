package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteLambdas {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("43679864512", "Ana Dapont", 43, "Rua Douglas Oliveira");
		ContaCorrente cc1 = new ContaCorrente(4653.5, "3456", "78910", cliente1);
		
		Cliente cliente2 = new Cliente("23456789154","Ana Barbosa", 21, "Rua Bruno Tavares");
		ContaPoupanca cp1 = new ContaPoupanca(2264.5, "1234", "56789", cliente2);	
		
		Cliente cliente3 = new Cliente("34565412345", "Ana Carmin", 30, "Rua Carlos Soares");
		ContaPoupanca cp2 = new ContaPoupanca(3679.2, "2345", "67891", cliente3);
		
		Cliente cliente4 = new Cliente("12345678965", "Ana Abuquerque", 19, "Rua Aluisio Neves");
		ContaCorrente cc2 = new ContaCorrente(1789.2, "0123", "12345", cliente4);
		
		List<Conta> lista = new ArrayList<>();
		
		lista.add(cc1);
		lista.add(cp1);
		lista.add(cp2);
		lista.add(cc2);

		lista.sort( 
				(c1, c2) -> Double.compare(c1.consultaSaldo(), c2.consultaSaldo())
		);
		
		lista.forEach(
				(conta) -> System.out.println(conta.consultaSaldo())
		);
		
		Comparator<Conta> comp = (Conta c1, Conta c2) -> {
				String nomeC1 = c1.getTitular().getNome();
				String nomeC2 = c2.getTitular().getNome();
				
				return nomeC1.compareTo(nomeC2);
			};
			
		System.out.println("-----------------------");
		
		lista.sort(comp);

		lista.forEach(
				(conta) -> System.out.println(conta.getTitular().getNome())
		);
	}
}

