package br.com.bytebank.banco.test.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
			
			Scanner s2 = new Scanner(linha);

			s2.useLocale(Locale.US);
			
			s2.useDelimiter(",");
			String tipo = s2.next();
			String agencia = s2.next();
			String numero = s2.next();
			String titular = s2.next();
			double saldo = s2.nextDouble();
			System.out.format(new Locale("pt","BR"),"%s - %s - %s - %s - %.2f %n",
					tipo,agencia,numero,titular,saldo);
			s2.close();
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
		}
		scanner.close();
	}
}
