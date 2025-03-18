package lista02;

import java.util.Scanner;

public class MediaNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int quantidade = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = sc.nextInt();
            soma += numero; 
        }
        
        double media = (double) soma / quantidade;
        
        System.out.println("A média dos " + quantidade + " números é: " + media);

        sc.close();
    }
}

