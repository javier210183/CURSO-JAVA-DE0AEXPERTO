package ejercicios;

import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos los nombres por teclado
        System.out.print("Introduce el primer nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Introduce el segundo nombre: ");
        String nombre2 = scanner.nextLine();

        System.out.print("Introduce el tercer nombre: ");
        String nombre3 = scanner.nextLine();

        // Procesar cada nombre
        String nuevo1 = procesarNombre(nombre1);
        String nuevo2 = procesarNombre(nombre2);
        String nuevo3 = procesarNombre(nombre3);

        // Unir y mostrar el resultado
        String resultado = nuevo1 + "_" + nuevo2 + "_" + nuevo3;
        System.out.println("Resultado: " + resultado);
    }

    // Método para transformar el nombre
    private static String procesarNombre(String nombre) {
        if (nombre.length() < 3) {
            return "X.xx"; // Valor por defecto si el nombre es muy corto
        }

        char segundo = Character.toUpperCase(nombre.charAt(1));
        String ultimos = nombre.substring(nombre.length() - 2);

        return segundo + "." + ultimos;
    }
}
