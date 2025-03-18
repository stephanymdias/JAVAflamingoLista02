package lista02;

import java.util.Scanner;

public class MediaGeometrica {

    public static void main(String[] args) {
    	 Scanner sc = new Scanner (System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = sc.nextInt();

      
        int produto = num1 * num2 * num3;
        int mediaGeometrica = (int) Math.pow(produto, 1.0 / 3);  
      
        System.out.println("A média geométrica é: " + mediaGeometrica);

        sc.close();
    }
}
