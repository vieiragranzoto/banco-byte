package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TestetoString {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("45888276706","Priscilla Vieira", 
				23, "Rua São José");
		ContaPoupanca cp = new ContaPoupanca(3237.8,3514,1086689,cliente1); 
		
		Cliente cliente2 = new Cliente("54965276706","Diana Oliveira", 27, 
				"Rua Barão José");
		ContaCorrente cc = new ContaCorrente(5065.9,4574,2136689,cliente2); 
		
		System.out.println(cc);
		System.out.println(cp);

	}

}
