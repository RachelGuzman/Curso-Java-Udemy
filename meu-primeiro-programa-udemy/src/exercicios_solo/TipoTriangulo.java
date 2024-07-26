package exercicios_solo;

import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as medidas dos lados do triângulo:");
        System.out.println("Lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.println("Lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.println("Lado 3: ");
        double lado3 = scanner.nextDouble();

        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("O triângulo é Equilátero.");
        } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triângulo é Isósceles.");
        } else {
            System.out.println("O triângulo é Escaleno.");
        }

        scanner.close();
    }
}
