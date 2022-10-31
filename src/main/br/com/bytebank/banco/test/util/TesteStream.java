package br.com.bytebank.banco.test.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.CollectionDeContas;

public class TesteStream {
	public static void main(String[] args) {
		CollectionDeContas ldc = new CollectionDeContas(new ArrayList<Conta>());
		List<Conta> lista = new ArrayList<Conta>(ldc.getList());

		// Method References
		lista.sort(Comparator.comparing(Conta::consultaSaldo));

		BigDecimal sum = lista.stream().map(Conta::consultaSaldo).filter(c -> c.compareTo(new BigDecimal("2000")) <= 0).reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println("Soma de saldos acima de 2mil: R$" + sum);
		
		System.out.println("--------------------------");
		
//		Optional<Conta> findAny =
		lista.stream().filter(c -> c.consultaSaldo().compareTo(new BigDecimal("3000"))>=0)
				.findAny().ifPresent(
				c -> System.out.println("Qualquer Titular com saldo abaixo de 3mil: "+c.getTitular().getNome()));
//		System.out.println(findAny.orElse(null).getTitular().getNome());
		
		System.out.println("--------------------------");
		
		lista.parallelStream().filter(c -> c.consultaSaldo().compareTo(new BigDecimal("100")) >= 0)
				.collect(Collectors.toMap(c -> c.getTitular().getNome(), c -> c.consultaSaldo()))
				.forEach((nome, saldo) -> System.out.println("Titular: " + nome + "Saldo: R$" + saldo));
	}
}
