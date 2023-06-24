package br.com.alura;

import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
		
		javaColecoes.adciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adciona(new Aula("Criando uma aula", 20));
		javaColecoes.adciona(new Aula("Modelando colecoes", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniceh", 17645);
		Aluno a4 = new Aluno("Paulo Silveira", 5617);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println(javaColecoes.getAlunos());
		System.out.println("Quem e o aluno com matriculo 5617?");
		Aluno aluno = javaColecoes.buscaMatricula(5617);
		System.out.println("Aluno: " + aluno);
		
	}
}
