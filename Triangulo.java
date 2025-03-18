package lista02;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a base do triângulo: ");
        int base = sc.nextInt();

        System.out.println("Digite a altura do triângulo: ");
        int altura = sc.nextInt();

        int area = (base * altura) / 2;

        int hipotenusa = (int) Math.sqrt(base * base + altura * altura);

        int perimetro = base + altura + hipotenusa;
       
        System.out.println("Área do triângulo: " + area);
        System.out.println("Perímetro do triângulo: " + perimetro);

        sc.close();
    }
}
