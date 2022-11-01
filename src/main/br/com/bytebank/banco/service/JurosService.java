package br.com.bytebank.banco.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.Situacao;

public class JurosService {

	public BigDecimal calcularJuros(Conta conta, Situacao situacao) {

		if (situacao == Situacao.REGULAR) {
			throw new IllegalArgumentException("Não é possivel efetuar a operaçao para Cliente em Situacao Regular!");
		}

		BigDecimal valor = conta.consultaSaldo().multiply(situacao.percentualJuros());

		return valor.setScale(2, RoundingMode.HALF_UP);
	}
}
