package exercicios1Java;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a nota do aluno: ");
        double nota = leia.nextDouble();
        if (nota >= 7 && nota <= 10) {
            System.out.println("Aprovado!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação!");
        } else if (nota > 10 || nota < 0) {
            System.out.println("Digite uma nota válida");
        } else
            System.out.println("Reprovado!");

        leia.close();
    }
}