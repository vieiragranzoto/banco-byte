package br.com.bytebank.banco.test.util;

import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.model.CollectionDeContas;
import br.com.bytebank.banco.model.Conta;

public class TesteLinkedList {
	public static void main(String[] args) {

		CollectionDeContas cdc = new CollectionDeContas(new LinkedList<Conta>());
		List<Conta> lista = new LinkedList<Conta>(cdc.getList());
		
//		System.out.println(lista.size());
		System.out.println(lista.get(2));
	}
}
