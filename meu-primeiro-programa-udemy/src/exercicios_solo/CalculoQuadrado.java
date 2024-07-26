package exercicios_solo;

import java.util.Scanner;

public class CalculoQuadrado {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número decimal para saber o seu quadrado");
        double numero = teclado.nextDouble();
        double resultQuadrado = numero * numero;

        System.out.println("O quadrado do número digitado é: " + resultQuadrado);

        teclado.close();

    }
}
