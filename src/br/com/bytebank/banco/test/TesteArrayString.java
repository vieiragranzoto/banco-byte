package br.com.bytebank.banco.test;

public class TesteArrayString {
	
	public static void main(String[] args) {
		//interagir com teste na linha de comando passando parametros
		System.out.println("teste");
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}
}
