import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        
       String variable = 7 == 5 ? "si es verdadero":"si es falso";
        System.out.println("variable = " + variable);
        
        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("\nIngrese la nota de matematicas entre 2.0 - 7.0\n");
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 2.0 - 7.0");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de historia entre 2.0 - 7.0");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 3.5 ? "Aprobado": "Rechazado";
        System.out.println("Estado final = " + estado);

    }
}
