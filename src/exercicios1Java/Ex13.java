package exercicios1Java;

public class Ex13 {
    public static void main(String[] args) {
        // Exemplo de tipos primitivos em Java

        byte a = 127;         // Exemplo de um byte, valor máximo é 127
        short b = 32767;        // Exemplo de um short, valor máximo é 32.767
        int c = 50;          // Exemplo de um int, o tipo mais comum para números inteiros
        long d = 4L;        // Exemplo de um long, usado para números inteiros maiores, 'L' indica que é um long

        float e = 5.1f;     // Exemplo de um float, precisa do 'f' para indicar o tipo float
        double f = 6.2;     // Exemplo de um double, usado para precisão dupla, padrão para ponto flutuante

        char g = 'a';       // Exemplo de um char, usado para caracteres únicos
        boolean h = true;   // Exemplo de um boolean, pode ser true ou false

        // Impressão dos valores para verificação
        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);
    }
}