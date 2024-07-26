package exercicios_solo;

import java.util.Scanner;

public class SomaInt {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int num1 = teclado.nextInt();

        System.out.println("Agora, digite outro número inteiro");
        int num2 = teclado.nextInt();

        int soma = num1 + num2;
        System.out.println("A soma dos dois números é: " + soma);

        teclado.close();

    }
}
