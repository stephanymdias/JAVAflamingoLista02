package lista02;

import java.util.Scanner;

public class EquacaoQuadratica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o coeficiente a: ");
        int a = sc.nextInt();

        System.out.println("Digite o coeficiente b: ");
        int b = sc.nextInt();

        System.out.println("Digite o coeficiente c: ");
        int c = sc.nextInt();
        
        int delta = b * b - 4 * a * c;

        if (delta > 0) {
          
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são reais e distintas:");
            System.out.println("Raiz 1 = " + raiz1);
            System.out.println("Raiz 2 = " + raiz2);
        } else if (delta == 0) {
            
            double raiz = -b / (2.0 * a);
            System.out.println("A raiz é real e igual:");
            System.out.println("Raiz = " + raiz);
        } else {
           
            double realParte = -b / (2.0 * a);
            double imaginarioParte = Math.sqrt(-delta) / (2.0 * a);
            System.out.println("As raízes são complexas:");
            System.out.println("Raiz 1 = " + realParte + " + " + imaginarioParte + "i");
            System.out.println("Raiz 2 = " + realParte + " - " + imaginarioParte + "i");
        }

        sc.close();
    }
}