package exercicios1Java;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int a = leia.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = leia.nextInt();
        System.out.println("Soma = " + (a + b));
        System.out.println("Subtração = " + (a - b));
        System.out.println("Multiplicação = " + (a * b));
        System.out.println("Divisão = " + (a / b));
    }
}