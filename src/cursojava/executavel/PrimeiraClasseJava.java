package cursojava.executavel;

import javax.swing.JOptionPane;

import curso.java.jdev.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual nome do Aluno ? ");
		String idade = JOptionPane.showInputDialog("Qual idade do Aluno ? ");
		String nota1 = JOptionPane.showInputDialog("Qual nota1 do Aluno ? ");
		String disciplina1 = JOptionPane.showInputDialog("Disciplina1:  ");
		String nota2 = JOptionPane.showInputDialog("Qual nota2 do Aluno ? ");
		String disciplina2 = JOptionPane.showInputDialog("Disciplina2:  ");
		String nota3 = JOptionPane.showInputDialog("Qual nota3 do Aluno ? ");
		String disciplina3 = JOptionPane.showInputDialog("Disciplina3:  ");
		String nota4 = JOptionPane.showInputDialog("Qual nota4 do Aluno ? ");
		String disciplina4 = JOptionPane.showInputDialog("Disciplina4:  ");
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));

		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		
		System.out.println(aluno1.toString());
		System.out.println("Média do aluno é " + aluno1.getMediaNota());
		System.out.println("Resultado "+(aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	
	
		 
		
		
	}
	

}
