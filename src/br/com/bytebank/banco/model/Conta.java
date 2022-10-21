package br.com.bytebank.banco.model;

public abstract interface Conta {

    double consultarSaldo();
    void deposita(double saldo);
    void saca(double saldo);
    void transfere(double valor, Conta conta);
    String getAgencia();
    String getNumero();
    Cliente getTitular();
    boolean equals(Object conta);
    public String toString();
}
