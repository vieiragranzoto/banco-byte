package br.com.bytebank.banco.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class TesteSerializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

//		Cliente c1 = new Cliente("43679864512", "Joaquina Silvana", 43, "Rua Engenheiro Alvaro");
//		ContaCorrente cc = new ContaCorrente(526.5, "5460", "21540", c1);
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("conta.bin"));
//		oos.writeObject(cc);
//		
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("conta.bin"));
		Conta conta = (Conta)ois.readObject();
		ois.close();
		System.out.println(conta.getTitular().getCpf());
	}
}
