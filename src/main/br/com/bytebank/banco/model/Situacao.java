package br.com.bytebank.banco.model;

import java.math.BigDecimal;

public enum Situacao {
	REGULAR("Regular") {
		@Override
		public BigDecimal percentualJuros() {
			return new BigDecimal("0");
		}

	},
	EM_ATRASO("Em atraso") {
		@Override
		public BigDecimal percentualJuros() {
			return new BigDecimal("0.02");
		}
	},
	IRREGULAR("Irregular") {
		@Override
		public BigDecimal percentualJuros() {
			return new BigDecimal("0.06");
		}
	};

	private String descricao;

	Situacao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public abstract BigDecimal percentualJuros();
}
