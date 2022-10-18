package br.com.bytebank.banco.model;

abstract interface Conta {

    double consultarSaldo();
    void deposita(double saldo);
    void saca(double saldo);
    void transfere(double valor, Conta conta);
    int getAgencia();
    int getNumero();
    Cliente getTitular();
}
