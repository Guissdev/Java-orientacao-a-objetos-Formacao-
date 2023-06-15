package br.com.alura.java.io.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Guilherme");
		cliente.setProfissao("Programador");
		cliente.setCpf("52412312300");
				
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//		Cliente cliente = (Cliente) ois.readObject();
//		ois.close();
//		System.out.println(cliente.getCpf());	
	}

}
