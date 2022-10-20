package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[4];
		
		Cliente c1 = new Cliente("43679864512", "Joaquina Silvana", 43, "Rua Engenheiro Alvaro");
		ContaCorrente cc1 = new ContaCorrente(526.5, 5460, 21540, c1);
		contas[0]=cc1;
		
		Cliente c2 = new Cliente("12345678954","Jaime Soares", 42, "Rua Carmine monetti");
		ContaPoupanca cc2 = new ContaPoupanca(234.5, 0123, 5670, c2);
		contas[1]=cc2;
		
		Cliente c3 = new Cliente("34565412345", "Giovana Xavez", 54, "Av. Brigadeiro Luis");
		ContaPoupanca cc3 = new ContaPoupanca(744.2, 2345, 67842, c3);
		contas[2]=cc3;
		
		Cliente c4 = new Cliente("69836974102", "Monica Silva", 19, "R. Libero Badaro");
		ContaPoupanca cc4 = new ContaPoupanca(744.2, 2345, 67842, c4);
		contas[3]=cc4;
		
		for(int i = 0;i<contas.length;i++) {
			System.out.println(contas[i].getTitular().getNome());
		}
	}
}
