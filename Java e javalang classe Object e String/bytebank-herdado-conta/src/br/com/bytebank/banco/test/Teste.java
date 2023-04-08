package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
//		ContaCorrente cc = new ContaCorrente(222, 333);
//		ContaPoupanca cp = new ContaPoupanca(333, 222);
//		Cliente cliente = new Cliente();
		
		Object cc = new ContaCorrente(222, 333);
		Object cp = new ContaPoupanca(333, 222);
		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);

//		println(cliente);

	}
	
	static void println() {
	}
	
	static void println(int a) {
	}
	
	static void println(boolean valor) {
	}
	
	static void println(Object referencia) {
	}
		
}

