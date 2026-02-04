package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;
import entities.Professor;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Professor> professores = new ArrayList<Professor>();
		int opcao;
		
		try {

			do {
				System.out.print("Digite a opção para cadastro(opção 1- Aluno/ opção 2- Professor/ opção 3 - Sair): ");
				opcao = Integer.parseInt(sc.next());
				
				switch (opcao) {
				case 1: 
					System.out.print("Digite o nome do Aluno: ");
					sc.nextLine();
					String nome = sc.nextLine();
					System.out.print("Digite o sobrenome do Aluno: ");
					String sobrenome = sc.nextLine();
					System.out.print("Digite a matricula: ");
					int matricula = sc.nextInt();
					System.out.println();
					
					alunos.add(new Aluno(nome, sobrenome, matricula));
					
					System.out.println(alunos.toString());
					System.out.println();
					
					break;
				case 2:
					System.out.print("Digite o nome do Professor: ");
					sc.nextLine();
					String nomeProfessor = sc.nextLine();
					System.out.print("Digite o sobrenome do Professor: ");
					String sobrenomeProfessor = sc.nextLine();
					System.out.print("Digite a disciplina: ");
					String disciplina = sc.nextLine();
					System.out.println();
					
					professores.add(new Professor(nomeProfessor, sobrenomeProfessor, disciplina));
					
					System.out.println(professores.toString());
					System.out.println();
					
					break;
				case 3:
					System.out.println("Saindo...");
					break;
				
				default:
					throw new IllegalArgumentException("Opção invalida: ");
				}
				
			}while(opcao != 3);
		}
		catch (NumberFormatException e) {
			System.out.println("Digite um numero valido...");	
		}
		catch (InputMismatchException e) {
			System.out.println("Digite um numero valido...");
		}
			
		sc.close();
	}

}
