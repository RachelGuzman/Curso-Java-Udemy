package exercicios_solo;

import java.util.Scanner;

public class CalculoMacas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de maçãs compradas: ");
        int quantidade = scanner.nextInt();
        double valorPromocao = quantidade * 0.25;
        double valorNormal = quantidade * 0.30;

        if(quantidade >= 12){
            System.out.println("O valor total da sua compra é de R$: " + valorPromocao);
        } else {
            System.out.println("O valor total da sua compra é de R$: " + valorNormal);
        }
        scanner.close();
    }
}
