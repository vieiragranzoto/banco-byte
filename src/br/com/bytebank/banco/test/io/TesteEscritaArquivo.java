package br.com.bytebank.banco.test.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ListaDeContas;

public class TesteEscritaArquivo {

	public static void main(String[] args) throws IOException {
		
		ListaDeContas ldc = new ListaDeContas();
		ArrayList<Conta>lista=ldc.getLista();
		
		FileOutputStream fos = new FileOutputStream("contas.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		lista.sort((Conta c1, Conta c2) -> {
			String nomeC1 = c1.getTitular().getNome();
			String nomeC2 = c2.getTitular().getNome();
			
			return nomeC1.compareTo(nomeC2);
		});
		
		lista.forEach(
				(conta) -> {
					try {
						bw.write("-----------------------------------------");
						bw.newLine();
						bw.newLine();
						bw.write(""+conta);
						bw.newLine();
						bw.newLine();
						bw.write("Titular: "+conta.getTitular().getNome());
						bw.newLine();
						bw.newLine();
						bw.write("Saldo:"+conta.consultaSaldo());
						bw.newLine();
						bw.newLine();
						bw.flush();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
		);
		bw.write("-----------------------------------------");		
		
		bw.close();
	}

}
