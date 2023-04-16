package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//int[] idades = new int [5];
		Object[] referencias = new Object[5];
	
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaPoupanca cc2 = new ContaPoupanca(33, 22);
		ContaCorrente cc3 = new ContaCorrente(44, 33);
		ContaCorrente cc4 = new ContaCorrente(55, 44);
		ContaCorrente cc5 = new ContaCorrente(66, 55);
		
		referencias[0] = cc1;
		referencias[1] = cc2;
		referencias[2] = cc3;
		referencias[3] = cc4;
		referencias[4] = cc5;
		
		for(int i = 0; i < referencias.length; i++) {
			System.out.println( referencias[i]);
	}
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		
		//maneiras de ferenciar
		
		//System.out.println(cc2.getNumero());	
		
//		Object referenciaGenerica = contas[1];
//		
//		System.out.println(referenciaGenerica.getNumero());
		
		ContaPoupanca ref = (ContaPoupanca)referencias[1]; //Type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}	
}
