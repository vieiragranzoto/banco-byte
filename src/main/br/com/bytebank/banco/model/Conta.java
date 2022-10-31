package br.com.bytebank.banco.model;

import java.io.Serializable;
import java.math.BigDecimal;

public abstract interface Conta extends Comparable<Conta>,Serializable {

	BigDecimal consultaSaldo();
    void deposita(BigDecimal saldo);
    void saca(BigDecimal saldo);
    void transfere(BigDecimal valor, Conta conta);
    String getAgencia();
    String getNumero();
    Cliente getTitular();
    boolean equals(Object conta);
    String toString();
    int hashCode();
}
