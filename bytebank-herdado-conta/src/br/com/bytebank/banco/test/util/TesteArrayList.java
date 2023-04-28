package br.com.bytebank.banco.test.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		List<Conta> lista = new ArrayList<Conta>();//Thread safe
				
		Conta cc = new ContaCorrente(22, 33);
		lista.add(cc);
		Conta cc2 = new ContaCorrente(33, 44);
		lista.add(cc2);
		
		
		
		System.out.println("Tamanho: " + lista.size());
		
		Object ref = lista.get(0);
		System.out.println(((Conta) ref).getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamano: " + lista.size());
		
		Conta cc3 = new ContaCorrente(44, 55);
		lista.add(cc);
		Conta cc4 = new ContaCorrente(55, 66);
		lista.add(cc2);
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("---------");
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
