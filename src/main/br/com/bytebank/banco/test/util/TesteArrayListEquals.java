package br.com.bytebank.banco.test.util;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.CollectionDeContas;

public class TesteArrayListEquals {
	public static void main(String[] args) {

		CollectionDeContas cdc = new CollectionDeContas(new ArrayList<Conta>());
		ArrayList<Conta> lista = new ArrayList<Conta>(cdc.getList());

		Conta cp = (Conta) new ContaCorrente(new BigDecimal("3736.2"), "2345", "67842",
				new Cliente("34565412345", "Giovana Xavez", LocalDate.of(1980, 05, 23), "Av. Brigadeiro Luis"));

		boolean testeEquals = lista.contains(cp);

		System.out.println(testeEquals);

		for (Conta c : lista) {
			if (c.equals(cp)) {
				System.out.println(c.getTitular());
			}

		}
	}
}