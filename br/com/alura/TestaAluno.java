package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaAluno {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("Lucas Cangussu");
		alunos.add("Flavia Verneque");
		alunos.add("Rayane Loppes");
		alunos.add("Ana Luiza");
		alunos.add("Vitor Nunes");
		alunos.add("Carol Carvalho");
		
		boolean pauloEstaMatriculado = alunos.contains("Bruna Camargo");
		alunos.remove("Rayane Loppes");
		System.out.println(pauloEstaMatriculado);

		System.out.println(alunos.size());

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
		
		
		List<String> alunosEmlista = new ArrayList<>(alunos);

	}

}
