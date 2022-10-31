package br.com.bytebank.banco.model;

public class ValorIncorretoException extends RuntimeException{
	public ValorIncorretoException(String msg) {
		super(msg);
	}
}
