package br.com.bytebank.banco.test.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import br.com.bytebank.banco.model.CollectionDeContas;
import br.com.bytebank.banco.model.Conta;

public class TesteTreeSet {
	public static void main(String[] args) {
		CollectionDeContas cdc = new CollectionDeContas(new TreeSet<>(Comparator.comparing(Conta::getNumero)));
		TreeSet<Conta> tree = new TreeSet<>(cdc.getSet());
		Iterator<Conta> iterador = tree.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next().getTitular().getNome());
		}
	}
}
