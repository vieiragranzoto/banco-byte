package br.com.bytebank.banco.test;

import java.time.LocalDate;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteTransfereCC {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("45888276706", "Priscilla Vieira", LocalDate.of(2000, 01, 10), "Rua São José");
		ContaPoupanca cp = new ContaPoupanca(3237.8, "3514", "1086689", cliente1);

		Cliente cliente2 = new Cliente("54965276706", "Diana Oliveira", LocalDate.of(2000, 01, 10), "Rua Barão José");
		ContaCorrente cc = new ContaCorrente(5065.9, "4574", "2136689", cliente2);

		cc.transfere(500, cp);

		System.out.println("--------------------------------");
		System.out.println("Cliente: " + cliente1.getNome());
		System.out.println("Saldo conta poupanca: R$ " + cp.consultaSaldo());
		System.out.println("--------------------------------");
		System.out.println("Cliente: " + cliente2.getNome());
		System.out.println("Saldo conta corrente: R$ " + cc.consultaSaldo());
		System.out.println("--------------------------------");

	}

}
