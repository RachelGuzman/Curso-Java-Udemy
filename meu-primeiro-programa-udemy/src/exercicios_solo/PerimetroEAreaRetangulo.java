package exercicios_solo;

import java.util.Scanner;

public class PerimetroEAreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do retângulo");
        double largura = scanner.nextDouble();
        System.out.println("Digite a altura do retângulo");
        double altura = scanner.nextDouble();
        double perimetro = 2 * (altura + largura);
        double area = altura * largura;
        System.out.println("A área do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é: " + perimetro);

        scanner.close();
    }
}
