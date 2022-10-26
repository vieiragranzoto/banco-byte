package br.com.bytebank.banco.model;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 * 
 * @author Vieira Granzoto
 * @version 0.1
 *
 */
public class Cliente extends Object implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String cpf;
    private String nome;
    private int idade;
    private String endereco;

    public Cliente(String cpf, String nome, int idade, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    	public String toString() {
    		return "Cliente: "+this.getNome();
    	}
    
}
