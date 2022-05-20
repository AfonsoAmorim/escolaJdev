package cursojava.executavel;

import curso.java.jdev.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// new Aluno() � uma inst�ncia (est� criando o Objeto) 
		// aluno1 e etc s�o refer�ncias para os objetos.
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Afonso");
		aluno1.setIdade(22);
		aluno1.setNota1(10.0);
		aluno1.setNota2(10.0);
		aluno1.setNota3(10.0);
		aluno1.setNota4(10.0);
		
		Aluno maria = new Aluno("Maria"); // construtor por padr�o definido.
		maria.setIdade(20);
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getIdade());
		System.out.println("A m�dia de notas � "+aluno1.getMediaNota());
		System.out.println("Resultado � " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println(maria.getNome());
		System.out.println(maria.getIdade());
	}
	
}
