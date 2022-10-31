package br.com.bytebank.banco.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class CollectionDeContas {

	private Cliente c1, c2, c3, c4;
	private Conta cc1, cp1, cp2, cc2;
	private Collection<Conta> collection;
	private Map<String, Conta> registroConta = new HashMap<>();

	public CollectionDeContas(Collection<Conta> tipo) {
		this.c1 = new Cliente("43679864512", "Joaquina Silvana", LocalDate.of(1999, 03, 30), "Rua Engenheiro Alvaro");
		this.cc1 = new ContaCorrente(new BigDecimal("1526.5"), "5460", "21540", c1);
		registro(cc1);

		this.c2 = new Cliente("12345678954", "Jaime Soares", LocalDate.of(2000, 01, 10), "Rua Carmine monetti");
		this.cp1 = new ContaPoupanca(new BigDecimal("2234.5"), "0123", "56702", c2);
		registro(cp1);

		this.c3 = new Cliente("34565412345", "Giovana Xavez", LocalDate.of(1980, 05, 23), "Av. Brigadeiro Luis");
		this.cp2 = new ContaPoupanca(new BigDecimal("3736.2"), "2345", "67842", c3);
		registro(cp2);

		this.c4 = new Cliente("69836974102", "Monica Silva", LocalDate.of(1991, 10, 31), "R. Libero Badaro");
		this.cc2 = new ContaCorrente(new BigDecimal("744.2"), "3259", "45678", c4);
		registro(cc2);

		this.collection = tipo;
		collection.add(cc1);
		collection.add(cp1);
		collection.add(cp2);	
		collection.add(cc2);
	}

	public List<Conta> getList() {
		List<Conta> lista = (List<Conta>)collection;
		return Collections.unmodifiableList(lista);
	}
	
	public Set<Conta> getSet() {
		Set<Conta> set = (Set<Conta>)collection;
		return Collections.unmodifiableSet(set);
	}

	public Map<String, Conta> getRegistroConta() {
		return Collections.unmodifiableMap(registroConta);
	}

	private void registro(Conta conta) {
		this.registroConta.put(conta.getNumero(), conta);
	}
	
	public boolean estaRegistrado(Conta conta) {
		return this.collection.contains(conta);
	}
	
	public Conta buscarRegistro(String i) {
		if(!this.registroConta.containsKey(i)) {
			throw new NoSuchElementException("Conta nao encontrada!");
		}
		return this.registroConta.get(i);
	}
}
