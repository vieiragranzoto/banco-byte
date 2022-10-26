package br.com.bytebank.banco.model;

import java.io.Serializable;

public abstract interface Conta extends Comparable<Conta>,Serializable {

    double consultaSaldo();
    void deposita(double saldo);
    void saca(double saldo);
    void transfere(double valor, Conta conta);
    String getAgencia();
    String getNumero();
    Cliente getTitular();
    boolean equals(Object conta);
    public String toString();
}
