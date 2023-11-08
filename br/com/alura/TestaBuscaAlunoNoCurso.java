package br.com.alura;

public class TestaBuscaAlunoNoCurso {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleçoes do Java", "Bruna Camargo");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Colecoes", 24));

		Aluno a1 = new Aluno("Lucas Cangussu", 34672);
		Aluno a2 = new Aluno("Ana Luiza", 34675);
		Aluno a3 = new Aluno("Vitor Nunes", 34677);
		

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem e o aluno com matricula 34675?");
		Aluno aluno = javaColecoes.buscaMatriculado(34675);
		System.out.println("aluno : " + aluno);
	}
}
