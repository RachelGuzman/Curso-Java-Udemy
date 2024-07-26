package exercicios_solo;

import java.util.Scanner;

public class PositOuNeg {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = teclado.nextInt();

        if(num < 0) {
            System.out.println("Esse número é negativo.");
        } else if(num > 0) {
            System.out.println("Esse número é positivo.");
        } else {
            System.out.println("Esse é o número zero.");
        }

        teclado.close();
    }
}
