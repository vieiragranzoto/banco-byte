package br.com.bytebank.banco.test.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.CollectionDeContas;

public class TesteFileWritter {
	public static void main(String[] args) throws IOException {

		CollectionDeContas cdc = new CollectionDeContas(new ArrayList<Conta>());

		ArrayList<Conta> lista = new ArrayList<>(cdc.getList());

		BufferedWriter bw = new BufferedWriter(new FileWriter("contas.txt"));

		lista.sort((Conta c1, Conta c2) -> {
			String nomeC1 = c1.getTitular().getNome();
			String nomeC2 = c2.getTitular().getNome();

			return nomeC1.compareTo(nomeC2);
		});

		lista.forEach((conta) -> {
			try {
				bw.write("-----------------------------------------");
				bw.newLine();
				bw.newLine();
				bw.write("" + conta);
				bw.newLine();
				bw.newLine();
				bw.write("Titular: " + conta.getTitular().getNome());
				bw.newLine();
				bw.newLine();
				bw.write("Saldo:" + conta.consultaSaldo());
				bw.newLine();
				bw.newLine();
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		bw.write("-----------------------------------------");

		bw.close();
	}
}
