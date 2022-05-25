package cursojava.executavel;

import javax.swing.JOptionPane;

import curso.java.jdev.classes.Aluno;
import curso.java.jdev.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual nome do Aluno ? ");
		String idade = JOptionPane.showInputDialog("Qual idade do Aluno ? ");
	
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		
		
		for(int posicao = 1; posicao <= 4; posicao++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " +posicao+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina" +posicao+" ?");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
		}
		
		
		System.out.println(aluno1);
		System.out.println("Média do aluno é " + aluno1.getMediaNota());
		System.out.println("Resultado "+(aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	
	
		 
		
		
	}
	

}
