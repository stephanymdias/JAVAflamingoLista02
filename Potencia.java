package lista02;
import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = sc.nextInt();

        System.out.println("Digite o expoente: ");
        int expoente = sc.nextInt();

        int resultado = 1;

        if (expoente >= 0) {
            for (int i = 1; i <= expoente; i++) {
                resultado *= base; 
            }
        } else {
            for (int i = 1; i <= -expoente; i++) {
                resultado *= base; 
            }
          
            resultado = 1 / resultado; 
        }

        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
        
        sc.close();
    }
}

