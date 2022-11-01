package br.com.bytebank.banco.model;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.bytebank.banco.service.JurosService;

class JurosServiceTest {

	private JurosService juros;
	private Conta conta;

	@BeforeEach
	void inicializar() {
		this.conta = new ContaCorrente(new BigDecimal("1000"), "12345", "1234567",
				new Cliente("12345678996", "Matilde Cunha", LocalDate.of(1985, 5, 14), "Rua João Pimentel"));
		this.juros = new JurosService();
	}

	@Test
	void clienteComSituacaoRegularDeveSerExibicaExcecao() {
//		assertThrows(IllegalArgumentException.class, ()->this.juros.calcularJuros(conta, situacao.REGULAR));
		try {
			juros.calcularJuros(conta, Situacao.REGULAR);
			fail("Não deu a exception!");
		} catch (Exception e) {
			assertEquals("Não é possivel efetuar a operaçao para Cliente em Situacao Regular!", e.getMessage());
		}
	}

	@Test
	void clienteComSituacaoEmAtrasoDeveTerJurosDe2PorCento() {
		BigDecimal valorJuros = this.juros.calcularJuros(conta, Situacao.EM_ATRASO);
		assertEquals(new BigDecimal("20.00"), valorJuros);
	}
	
	@Test
	void clienteComSituacaoEmAtrasoDeveTerJurosDe6PorCento() {
		BigDecimal valorJuros = this.juros.calcularJuros(conta, Situacao.IRREGULAR);
		assertEquals(new BigDecimal("60.00"), valorJuros);
	}

}
