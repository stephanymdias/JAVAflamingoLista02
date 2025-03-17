package exercicios;

import java.util.Scanner;

public class cadastroAlunos {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Dados do estudante
		
	System.out.println("Digite o nome do estudante: ");
	
	String nome = sc.next();
	
	System.out.println("Digite o sobrenome do estudante: ");
	
	String sobrenome = sc.next();
	
	System.out.println("Digite a idade do estudante: ");
	
	int idade = sc.nextInt();
	
	System.out.println("Digite a CPF do estudante: ");
	
	String cpf = sc.next();
	
	System.out.println("Digite o RG do estudante: ");
	
	String rg = sc.next();
	
	System.out.println("Digite o gênero do estudante: ");
	
	String genero = sc.next();
	
	System.out.println("Digite a data de nascimento do estudante: ");
	
	String nascimento = sc.next();
	
	System.out.println("Digite o endereço do estudante: ");
	
	String endereco = sc.next();
	
	
	System.out.println("Nome: " + nome);
	System.out.println("Sobrenome: " + sobrenome);
	System.out.println("Idade: " + idade);
	System.out.println("CPF: " + cpf);
	System.out.println("RG: " + rg);
	System.out.println("Gênero: " + genero);
	System.out.println("Data de nascimento: " + nascimento);
	System.out.println("Endereço: " + endereco);
	
	sc.close();
	}
}
