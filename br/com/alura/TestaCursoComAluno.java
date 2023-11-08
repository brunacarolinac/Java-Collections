package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

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

		System.out.println("Todos os alunos matriculados: ");

		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while (iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}

		// for(Aluno a : javaColecoes.getAlunos()) {
		// System.out.println(a);

		// }

		System.out.println("O aluno " + a1 + " esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));

		Aluno cangussu = new Aluno("Lucas Cnagussu", 34672);
		System.out.println("E esse cangussu, esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(cangussu));

		System.out.println("O a1 e equals ao cangussu?");
		System.out.println(a1.equals(cangussu));

		// obrigatoriamente o seguinte e true:

		System.out.println(a1.hashCode() == cangussu.hashCode());
	}

}
