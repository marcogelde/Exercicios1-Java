package exercicios1Java;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o seu primeiro nome: ");
        String nome = leia.nextLine();
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = leia.nextLine();
        System.out.println("Seu nome e sobrenome é = " + nome + " " + sobrenome);
    }
}