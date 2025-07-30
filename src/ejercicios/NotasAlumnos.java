package ejercicios;

import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables de suma y contadores
        double sumaTotal = 0;
        int cantidadNotas = 0;

        double sumaMayores5 = 0;
        int contadorMayores5 = 0;

        double sumaMenores4 = 0;
        int contadorMenores4 = 0;

        int contadorNotas1 = 0;

        // Bucle para pedir las 20 notas
        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingresa la nota final del alumno " + i + " (1.0 a 7.0): ");
            double nota = scanner.nextDouble();

            // Validación especial: si es 0, salimos del programa
            if (nota == 0) {
                System.out.println("Error: Se ingresó una nota 0. Finalizando el programa.");
                return;
            }

            // Validación de rango válido
            if (nota < 1.0 || nota > 7.0) {
                System.out.println("Nota inválida. Debe estar entre 1.0 y 7.0. Intenta otra vez.");
                i--; // Repetimos la iteración actual
                continue;
            }

            // Acumulamos total y contador
            sumaTotal += nota;
            cantidadNotas++;

            // Clasificaciones según el valor
            if (nota > 5.0) {
                sumaMayores5 += nota;
                contadorMayores5++;
            }

            if (nota < 4.0) {
                sumaMenores4 += nota;
                contadorMenores4++;
            }

            if (nota == 1.0) {
                contadorNotas1++;
            }
        }

        // Cálculos finales
        double promedioTotal = sumaTotal / cantidadNotas;

        double promedioMayores5 = (contadorMayores5 > 0) ? (sumaMayores5 / contadorMayores5) : 0;
        double promedioMenores4 = (contadorMenores4 > 0) ? (sumaMenores4 / contadorMenores4) : 0;

        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.printf("Promedio de notas mayores a 5: %.2f\n", promedioMayores5);
        System.out.printf("Promedio de notas menores a 4: %.2f\n", promedioMenores4);
        System.out.println("Cantidad de notas con valor 1: " + contadorNotas1);
        System.out.printf("Promedio total de las notas: %.2f\n", promedioTotal);

        scanner.close();
    }
}

