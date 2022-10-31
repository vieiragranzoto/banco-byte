package br.com.bytebank.banco.test.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeituraArquivo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("contas.txt");
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha!=null) {
			if(linha.contains("Titular")) {
				String[] partes= linha.split(":");
				String depois = partes[1];
				System.out.println("Nome: "+depois);
			}
			if(linha.contains("Saldo")) {
				String[] partes= linha.split(":");
				String depois = partes[1];
				System.out.println("Saldo da conta: "+depois);
				System.out.println("");
			}
			linha = br.readLine();
		}
		
		br.close();
	}

}
