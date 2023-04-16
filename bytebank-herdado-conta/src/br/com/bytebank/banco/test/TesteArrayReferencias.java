package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//int[] idades = new int [5];
		ContaCorrente[] contas = new ContaCorrente[5];
	
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaCorrente cc2 = new ContaCorrente(33, 22);
		ContaCorrente cc3 = new ContaCorrente(44, 33);
		ContaCorrente cc4 = new ContaCorrente(55, 44);
		ContaCorrente cc5 = new ContaCorrente(66, 55);
		
		contas[0] = cc1;
		contas[1] = cc2;
		contas[2] = cc3;
		contas[3] = cc4;
		contas[4] = cc5;
		
		for(int i = 0; i < contas.length; i++) {
			System.out.println( contas[i]);
	}
		//maneiras de ferenciar
		
		System.out.println(contas[1].getNumero());
		
		ContaCorrente ref = contas[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
}	
}
