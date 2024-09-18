package exercicios1Java;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int a = leia.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = leia.nextInt();
        if (a > b) {
            System.out.println("Valor " + a + " é maior que valor " + b);
        } else if (a < b) {
            System.out.println("Valor " + a + " é menor que valor " + b);
        } else
            System.out.println("Valor " + a + " é igual ao valor " + b);
    }
}