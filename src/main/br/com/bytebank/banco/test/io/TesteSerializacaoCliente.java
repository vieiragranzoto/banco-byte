package br.com.bytebank.banco.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import br.com.bytebank.banco.model.Cliente;

public class TesteSerializacaoCliente {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Cliente cliente = new Cliente("56631269785","Vitoria Gimenez",LocalDate.of(2000, 1, 15),"Rua José Alencar");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject(cliente);
		
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		Cliente mesmoCliente = (Cliente)ois.readObject();
		ois.close();
		System.out.println(mesmoCliente.getNome());
	}
}
