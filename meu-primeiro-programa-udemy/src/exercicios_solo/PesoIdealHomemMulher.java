package exercicios_solo;

import java.util.Scanner;

public class PesoIdealHomemMulher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para sexo feminino ou digite 2 para sexo masculino.");
        int sexo = scanner.nextInt();


        System.out.println("Agora, digite a sua altura (em metros): ");
        double altura = scanner.nextDouble();

        double formulaHomem = (72.7 * altura) - 58;
        double formulaMulher = (62.1 * altura) - 44.7;

        if(sexo == 1){
            System.out.println("O seu peso ideal é: " + formulaMulher + " kg.");
        } else {
            System.out.println("O seu peso ideal é: " + formulaHomem + " kg.");
        }
        scanner.close();
    }
}
