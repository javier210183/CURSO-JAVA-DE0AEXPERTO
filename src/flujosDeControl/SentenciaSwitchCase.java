package flujosDeControl;

import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes entre 1 y 12: \n");
        int mes = s.nextInt();
        String nombreMes = null;

        switch(mes){

            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
        }
        System.out.println("nombreMes = " + nombreMes);
        char num = 'z';

        switch(num){
            case '0':
                System.out.println("El numero cero");
                break;
            case '1':
                System.out.println("El numero uno");
                break;
            case '2':
                System.out.println("El numero dos");
                break;
            case '3':
                System.out.println("El numero tres");
                break;
            case 'a':
                System.out.println("El caractyer es a");
                break;
            default:
                System.out.println("Numero o caracter desconocido");


        }
        String nombre = "andres";

        switch(nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido");
                break;
            case "andres":
                System.out.println("Hola andres");
                break;
            case "pepe":
                System.out.println("Hola pepe");
                break;
            default:
                System.out.println("Usuario desconocido");

        }
    }
}
