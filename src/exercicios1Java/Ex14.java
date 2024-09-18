package exercicios1Java;

public class Ex14 {
    public static void main(String[] args) {
        // Variável do tipo String
        String texto = "Hello, World!";

        // Array de inteiros
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("String: " + texto);

        System.out.print("Array: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}