package br.com.bytebank.banco.model;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContaCorrenteTest {

	private ContaCorrente cc;
	private ContaCorrente cc2;
	@BeforeEach
	public void inicializar() {
		this.cc = new ContaCorrente(new BigDecimal("1000.00"), "12345", "1233458",
				new Cliente("65432198702", "Paula Fernandes", LocalDate.of(2002, 4, 26), "Rua Paulo Coelho"));
		this.cc2 = new ContaCorrente(new BigDecimal("1000.00"), "5460", "21540",
				new Cliente("43679864512", "Joaquina Silvana", LocalDate.of(1999, 03, 30), "Rua Engenheiro Alvaro"));
	}

	@Test
	public void deveSerFeitaATransferenciaComTaxaDe1PorCento() {
		this.cc.transfere(new BigDecimal("500.00"), cc2);
		System.out.println(cc.consultaSaldo());
		System.out.println(cc2.consultaSaldo());
		assertEquals(new BigDecimal("495.00"), cc.consultaSaldo());
	}

}
