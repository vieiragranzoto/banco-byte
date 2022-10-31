package br.com.bytebank.banco.test.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.CollectionDeContas;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {

		CollectionDeContas cdc = new CollectionDeContas(new ArrayList<Conta>());

		List<Conta> lista = new ArrayList<Conta>(cdc.getList());

//		lista.sort(new IdadeTitularContaComparator());
//		Collections.reverse(lista);

		Collections.sort(lista);

		for (Conta conta : lista) {
			System.out.println(conta.getNumero());
		}
	}
}

class NomeTitularContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();

		return nomeC1.compareTo(nomeC2);
	}

}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		int n1 = Integer.parseInt(c1.getNumero());
		int n2 = Integer.parseInt(c2.getNumero());

		return Integer.compare(n1, n2);
	}

}

class SaldoDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		return c1.consultaSaldo().compareTo(c2.consultaSaldo());
	}

}

class IdadeTitularContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		int idadeCt1 = c1.getTitular().getIdade();
		int idadeCt2 = c2.getTitular().getIdade();
		return Integer.compare(idadeCt1, idadeCt2);
	}

}
