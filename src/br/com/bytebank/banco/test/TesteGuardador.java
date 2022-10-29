package br.com.bytebank.banco.test;

import java.time.LocalDate;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;
import br.com.bytebank.banco.model.Guardador;

public class TesteGuardador {
	public static void main(String[] args) {

		Guardador contas = new Guardador();

		Cliente c1 = new Cliente("43679864512", "Joaquina Silvana", LocalDate.of(2000, 01, 10),
				"Rua Engenheiro Alvaro");
		ContaCorrente cc1 = new ContaCorrente(526.5, "10", "21540", c1);

		contas.adiciona(cc1);

		Cliente c2 = new Cliente("93219864512", "Ana Julia", LocalDate.of(2000, 01, 10), "Rua Carmine monetti");
		ContaPoupanca cp1 = new ContaPoupanca(856.5, "11", "78540", c2);

		contas.adiciona(cp1);

		Cliente c3 = new Cliente("86919864512", "Diana Gimenes", LocalDate.of(2000, 01, 10), "Rua Jabuti");
		ContaCorrente cc2 = new ContaCorrente(786.5, "10", "76540", c3);

		contas.adiciona(cc2);

		Cliente c4 = new Cliente("64378645182", "Vitoria Silva", LocalDate.of(2000, 01, 10), "Rua Caminhao");
		ContaPoupanca cp2 = new ContaPoupanca(5166.5, "11", "658540", c4);

		contas.adiciona(cp2);

		Conta ref1 = contas.localiza(2);
		System.out.println(ref1.getTitular().getNome());

	}
}
