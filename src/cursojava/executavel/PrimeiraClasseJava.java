package cursojava.executavel;

import curso.java.jdev.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// new Aluno() � uma inst�ncia (est� criando o Objeto) 
		// aluno1 e etc s�o refer�ncias para os objetos.
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Afonso");
		aluno1.setIdade(22);
		
		Aluno maria = new Aluno("Maria"); // construtor por padr�o definido.
		maria.setIdade(20);
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getIdade());
		System.out.println(maria.getNome());
		System.out.println(maria.getIdade());
	}
	
}
