package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.CollectionDeContas;

public class TesteLambdas {

	public static void main(String[] args) {

		CollectionDeContas cdc = new CollectionDeContas(new ArrayList<>());
		ArrayList<Conta> lista = new ArrayList<>(cdc.getList());

		lista.sort((c1, c2) -> c1.consultaSaldo().compareTo(c2.consultaSaldo()));

		lista.forEach((conta) -> System.out.println(conta.consultaSaldo()));

		Comparator<Conta> comp = (Conta c1, Conta c2) -> {
			String nomeC1 = c1.getTitular().getNome();
			String nomeC2 = c2.getTitular().getNome();

			return nomeC1.compareTo(nomeC2);
		};

		System.out.println("-----------------------");

		lista.sort(comp);

		lista.forEach((conta) -> System.out.println(conta.getTitular().getNome()));
	}
}
