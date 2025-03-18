package lista02;

import java.util.Scanner;

public class MediaPonderada {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		int nota1 = sc.nextInt();
		System.out.println("Digite o peso da primeira nota: ");
		int peso1 = sc.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		int nota2 = sc.nextInt();
		System.out.println("Digite o peso da segunda nota: ");
		int peso2 = sc.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		int nota3 = sc.nextInt();
		System.out.println("Digite o peso da terceira nota: ");
		int peso3 = sc.nextInt();
		
		int somaPesos = peso1 + peso2 + peso3;
		int mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos;
		
		System.out.println("A média ponderada é: " + mediaPonderada);
		
		sc.close();
	}

}
