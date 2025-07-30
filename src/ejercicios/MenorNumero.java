package ejercicios;

import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Pedimos cuántos números se van a comparar (mínimo 10)
        System.out.print("¿Cuántos números quieres ingresar? (mínimo 10): ");
        int cantidad = scanner.nextInt();

        // Validación: Aseguramos que sean al menos 10
        while (cantidad < 10) {
            System.out.print("Debes ingresar al menos 10 números. Intenta de nuevo: ");
            cantidad = scanner.nextInt();
        }

        // Paso 2: Inicializamos el menor con un valor muy grande (o el primer número ingresado más adelante)
        int menor = Integer.MAX_VALUE;

        // Paso 3: Iteramos usando un for para pedir cada número
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int numero = scanner.nextInt();

            // Paso 4: Comparamos con el menor actual
            if (numero < menor) {
                menor = numero;
            }
        }

        // Paso 5: Imprimimos el número menor
        System.out.println("El número menor ingresado es: " + menor);

        // Paso 6: Verificamos si es menor que 10 o no
        if (menor < 10) {
            System.out.println("¡El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }

        scanner.close();
    }
}
