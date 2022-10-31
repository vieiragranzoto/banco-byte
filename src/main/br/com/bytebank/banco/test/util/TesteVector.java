package br.com.bytebank.banco.test.util;

import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.model.CollectionDeContas;
import br.com.bytebank.banco.model.Conta;

public class TesteVector {
	public static void main(String[] args) {
		
		CollectionDeContas cdc = new CollectionDeContas(new Vector<Conta>());
		List<Conta> lista = new Vector<Conta>(cdc.getList());

		for (Conta c : lista) {
			System.out.println(c.getTitular());
		}
	}
}
