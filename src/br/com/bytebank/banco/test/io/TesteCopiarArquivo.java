package br.com.bytebank.banco.test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("contas.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = new FileOutputStream("contas2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while(linha!=null) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		bw.close();
		br.close();
		
		FileInputStream fis2 = new FileInputStream("contas2.txt");
		InputStreamReader isr2 = new InputStreamReader(fis2);
		BufferedReader br2 = new BufferedReader(isr2);
		
		String linha2 = br2.readLine();
		
		while(linha2!=null) {
			System.out.println(linha2);
			linha2 = br2.readLine();
		}
		br2.close();
	}

}
