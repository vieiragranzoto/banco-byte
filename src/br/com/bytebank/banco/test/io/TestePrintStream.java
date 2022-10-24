package br.com.bytebank.banco.test.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestePrintStream {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = new PrintStream(new File("contas2.txt"));
		
		ps.println("TESTE PRINT STREAM!!!!!!");
		ps.println();
		ps.println("Olá...");
		ps.close();
	}
}
