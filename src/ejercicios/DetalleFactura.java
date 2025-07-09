package ejercicios;

import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Leer el primer precio
        System.out.println("Ingrese el primer precio: ");
        double precio1 = scanner.nextDouble();

        //Leer el segundo precio
        System.out.println("Ingrese el segundo precio");
        double precio2 = scanner.nextDouble();

        //total del precio
        double totalPrecio = precio1 + precio2;
        double Impuesto = totalPrecio * 0.19;
        double PrecioFinal= Impuesto + totalPrecio;
        System.out.println("La factura producto de oficina tiene un total bruto de "
                + totalPrecio + ", con un impuesto de "
                + Impuesto + ", y el monto después de impuesto es de "
                + PrecioFinal);

    }
}
