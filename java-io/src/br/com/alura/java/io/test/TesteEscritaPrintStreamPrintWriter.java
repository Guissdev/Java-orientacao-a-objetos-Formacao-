package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com arquivo
		
//		OutputStream fos = new FileOutputStream("Lorem.txt2");
//		Writer osw = new OutputStreamWriter(fos);		
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//FileWriter fw = new FileWriter("lorem2.txt");
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//		PrintStream ps = new PrintStream(new File ("Lorem2.txt"));		
		PrintWriter ps = new PrintWriter("Lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println();
		ps.println();
		ps.println("qweerrtyuiioçççsçlfkgjbnblsdf lkfngfdk~gjmpwoikr");
		
		
		ps.close();
		
		System.out.println();
	}

}