package flamingoLista02;

import java.util.Scanner;

public class ConversorMoedas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Conversor de Moedas: ");
		
		System.out.println("Digite o valor que você deseja converter: ");
		float real = sc.nextFloat();
		
		System.out.println("Digite o valor do dolar vigente: ");
		float dollar = sc.nextFloat();
		
		System.out.println("Digite o valor do Euro vigente: ");
		float euro = sc.nextFloat();
		
		System.out.println("Digite o valor da libra vigente: ");
		float libras = sc.nextFloat();
		
		float conversorDollar = real/dollar;
		float conversorEuro = real/euro;
		float conversorLibras = real/libras;
		
		System.out.printf("O valor convertido em Dollar é: EUR%2f\n",conversorEuro );
		System.out.printf("O valor convertido em Euro é: US$.2f\n", conversorDollar ); 
		System.out.printf("O valor convertido em Libras é: GBP%.2f\n", conversorLibras);
		
		sc.close();
	}
	
	


}
