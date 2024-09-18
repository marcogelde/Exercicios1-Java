package exercicios1Java;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = leia.nextInt();
        if (num == 0) {
            System.out.println("Esse número é igual a 0");
        } else if (num > 0) {
            System.out.println("Esse número é positivo");
        } else {
            System.out.println("Esse número é negativo");
        }
    }
}