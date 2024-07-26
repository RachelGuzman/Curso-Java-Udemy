package exercicios_solo;

import java.util.Scanner;

public class MediaNumInt {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Para calcular a média de três números inteiros, digite o primeiro número");
        int num1 = teclado.nextInt();

        System.out.println("Agora, digite o segundo número");
        int num2 = teclado.nextInt();

        System.out.println("Digite agora o terceiro número inteiro");
        int num3 = teclado.nextInt();

        int media = (num1 + num2 + num3) / 3;
        System.out.println("A média dos três números é: " + media);

        teclado.close();
    }
}
