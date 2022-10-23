package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteOrdenacao {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("43679864512", "Ana Dapont", 43, "Rua Douglas Oliveira");
		ContaCorrente cc1 = new ContaCorrente(4653.5, "3456", "78910", c1);
		
		Cliente c2 = new Cliente("23456789154","Ana Barbosa", 21, "Rua Bruno Tavares");
		ContaPoupanca cp1 = new ContaPoupanca(2264.5, "1234", "56789", c2);	
		
		Cliente c3 = new Cliente("34565412345", "Ana Carmin", 30, "Rua Carlos Soares");
		ContaPoupanca cp2 = new ContaPoupanca(3679.2, "2345", "67891", c3);
		
		Cliente c4 = new Cliente("12345678965", "Ana Abuquerque", 19, "Rua Aluisio Neves");
		ContaCorrente cc2 = new ContaCorrente(1789.2, "0123", "12345", c4);
		
		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cp1);
		lista.add(cp2);
		lista.add(cc2);
		
//		for (Conta conta : lista) {
//			System.out.println(conta.getTitular().getIdade());
//		}	
//		System.out.println("-------------------------");
		
//		lista.sort(new IdadeTitularContaComparator());
//		Collections.reverse(lista);

		Collections.sort(lista);
		
		for (Conta conta : lista) {
			System.out.println(conta.getNumero());
		}
	}
}

class NomeTitularContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		
		return nomeC1.compareTo(nomeC2);
	}
	
}

class NumeroDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		int n1 = Integer.parseInt(c1.getNumero());
		int n2 = Integer.parseInt(c2.getNumero());
		
		return Integer.compare(n1, n2);
	}
	
}

class SaldoDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		return Double.compare(c1.consultaSaldo(), c2.consultaSaldo());
	}
	
}

class IdadeTitularContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		int idadeCt1 = c1.getTitular().getIdade();
		int idadeCt2 = c2.getTitular().getIdade();
		return Integer.compare(idadeCt1, idadeCt2);
	}
	
}
