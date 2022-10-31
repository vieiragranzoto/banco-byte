package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.CollectionDeContas;

public class TesteClasseAnonima {

	public static void main(String[] args) {

		CollectionDeContas cdc = new CollectionDeContas(new ArrayList<Conta>());
		ArrayList<Conta> lista =new ArrayList<Conta>(cdc.getList());

		// classe anonima
//		lista.sort(new Comparator<Conta>() {
//
//			@Override
//			public int compare(Conta c1, Conta c2) {
//				int n1 = Integer.parseInt(c1.getNumero());
//				int n2 = Integer.parseInt(c2.getNumero());
//
//				return Integer.compare(n1, n2);
//			}
//
//		});
		
		lista.sort(Comparator.comparing(Conta::getNumero));

		for (Conta conta : lista) {
			System.out.println(conta.getTitular().getNome());
		}

		System.out.println("---------------");

		// classe anonima
//		Comparator<Conta> comp = new Comparator<Conta>() {
//
//			@Override
//			public int compare(Conta c1, Conta c2) {
//				String nomeC1 = c1.getTitular().getNome();
//				String nomeC2 = c2.getTitular().getNome();
//
//				return nomeC1.compareTo(nomeC2);
//			}
//
//		};
//
//		lista.sort(comp);
		lista.sort(Comparator.comparing(Conta::getAgencia));

		for (Conta conta : lista) {
			System.out.println(conta.getTitular().getNome());
		}
	}
}
