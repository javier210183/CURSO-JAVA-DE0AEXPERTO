package ejercicios;

import java.util.Scanner;

public class MultiplicacionSinAsterisco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Pedir los dos números
        System.out.print("Ingresa el primer número (positivo o negativo): ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número (positivo o negativo): ");
        int num2 = scanner.nextInt();

        // Paso 2: Determinar el signo del resultado
        boolean resultadoNegativo = false;

        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            resultadoNegativo = true;
        }

        // Paso 3: Trabajamos con valores absolutos
        int a = Math.abs(num1);
        int b = Math.abs(num2);
        int resultado = 0;

        // Paso 4: Sumar 'a', 'b' veces
        for (int i = 0; i < b; i++) {
            resultado += a;
        }

        // Paso 5: Aplicar el signo si era negativo
        if (resultadoNegativo) {
            resultado = -resultado;
        }

        // Mostrar resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);

        scanner.close();
    }
}

