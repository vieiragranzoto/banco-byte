package br.com.bytebank.banco.test.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import br.com.bytebank.banco.model.CollectionDeContas;
import br.com.bytebank.banco.model.Conta;

public class TesteSetEMap {
	public static void main(String[] args) {
		CollectionDeContas cdc = new CollectionDeContas(new HashSet<>());
//		cdc.getRegistroConta().keySet().forEach((numero) -> System.out.println("Numero da conta:" + numero));
		Set<Conta> set = new HashSet<Conta>(cdc.getSet());
		Iterator<Conta> iterador = set.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}
}
