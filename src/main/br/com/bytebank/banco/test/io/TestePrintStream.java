package br.com.bytebank.banco.test.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class TestePrintStream {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		PrintStream ps = new PrintStream(new File("contas2.txt"),"UTF-8");
		
		ps.println("TESTE PRINT STREAM!!!!!!");
		ps.println();
		ps.println("Olá..2.");
		ps.close();
	}
}
