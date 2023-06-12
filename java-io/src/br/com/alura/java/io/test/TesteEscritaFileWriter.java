package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com arquivo
		
//		OutputStream fos = new FileOutputStream("Lorem.txt2");
//		Writer osw = new OutputStreamWriter(fos);		
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("qweerrtyuiioçççsçlfkgjbnblsdf lkfngfdk~gjmpwoikr");
		
		bw.close();
		
	}

}