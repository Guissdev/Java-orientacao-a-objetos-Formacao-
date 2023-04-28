package br.com.bytebank.banco.test.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(99, 99);
//		Conta cc2 = new ContaCorrente(99, 99);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		ArrayList<String> nomes = new ArrayList<String>();
		
		
		Conta cc = new ContaCorrente(22, 33);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(33, 44);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(33, 44);
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("Ja existe ? " + existe);
		
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
