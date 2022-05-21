package cursojava.executavel;

import javax.swing.JOptionPane;

import curso.java.jdev.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual nome do Aluno ? ");
		String idade = JOptionPane.showInputDialog("Qual idade do Aluno ? ");
		String nota1 = JOptionPane.showInputDialog("Qual nota1 do Aluno ? ");
		String nota2 = JOptionPane.showInputDialog("Qual nota2 do Aluno ? ");
		String nota3 = JOptionPane.showInputDialog("Qual nota3 do Aluno ? ");
		String nota4 = JOptionPane.showInputDialog("Qual nota4 do Aluno ? ");
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));

		System.out.println(aluno1.toString());

	}

}
