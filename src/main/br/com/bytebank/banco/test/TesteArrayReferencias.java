package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.Conta;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Conta[] contas = new Conta[4];

		Cliente c1 = new Cliente("43679864512", "Joaquina Silvana", LocalDate.of(2000, 01, 10),
				"Rua Engenheiro Alvaro");
		ContaCorrente cc1 = new ContaCorrente(new BigDecimal("545.5"), "5460", "21540", c1);
		contas[0] = cc1;

		Cliente c2 = new Cliente("12345678954", "Jaime Soares", LocalDate.of(2000, 01, 10), "Rua Carmine monetti");
		ContaPoupanca cp1 = new ContaPoupanca(new BigDecimal("234.5"), "0123", "5670", c2);
		contas[1] = cp1;

		Cliente c3 = new Cliente("34565412345", "Giovana Xavez", LocalDate.of(2000, 01, 10), "Av. Brigadeiro Luis");
		ContaPoupanca cp2 = new ContaPoupanca(new BigDecimal("754.2"), "2345", "67842", c3);
		contas[2] = cp2;

		Cliente c4 = new Cliente("69836974102", "Monica Silva", LocalDate.of(2000, 01, 10), "R. Libero Badaro");
		ContaCorrente cc2 = new ContaCorrente(new BigDecimal("744.2"), "2345", "67842", c4);
		contas[3] = cc2;

		Conta ref = (Conta) contas[2];

		System.out.println("Referencia do cliente: " + ref.getTitular().getNome());
		System.out.println("-------------------------------------------");
		for (int i = 0; i < contas.length; i++) {
			System.out.println(contas[i].consultaSaldo());
		}
	}
}
