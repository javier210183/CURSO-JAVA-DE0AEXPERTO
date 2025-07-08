public class Main {
    public static void main(String[] args) {
        String saludar = "Hola Javier";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;
        System.out.println("numero = " + numero);

        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero = " + numero2);

        var numero3 = "15";

        String nombre;

        nombre = "Miguel";

        if(numero >10){
            nombre = "Javi";
        }
        System.out.println("nombre = " + nombre);
    }

}