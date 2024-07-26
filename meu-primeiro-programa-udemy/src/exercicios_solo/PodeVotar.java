package exercicios_solo;

import java.util.Scanner;

public class PodeVotar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano de seu nascimento:");
        int dataNascimento = scanner.nextInt();
        System.out.println("Digite o ano atual:");
        int anoAtual = scanner.nextInt();
        int result = anoAtual - dataNascimento;

        if(result >= 16){
            System.out.println("Você pode votar!");
        } else {
            System.out.println("Você ainda não pode votar.");
        }
        scanner.close();
    }
}
