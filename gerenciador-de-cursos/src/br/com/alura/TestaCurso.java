package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adciona(new Aula("Criando uma aula", 20));
		javaColecoes.adciona(new Aula("Modelando coleções", 22));

		
		System.out.println(javaColecoes.getAulas());
		
	}

}