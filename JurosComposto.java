package lista02;

import java.util.Scanner;

public class JurosComposto {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o capital incicial: ");
		int capitalInicial = sc.nextInt();
		
		System.out.println("Digite a taxa de juros anual:");
		int taxaJuros = sc.nextInt();
		
		System.out.println("Digite o número de anos: ");
		int anos = sc.nextInt();
		
		int montanteFinal = capitalInicial;
		
		for (int i = 0; i < anos; i ++) {
			montanteFinal += montanteFinal * taxaJuros / 100;
		}
		
		System.out.println("O montante final após " + anos + " anos será: " + montanteFinal);
		
		sc.close();
	}

}
