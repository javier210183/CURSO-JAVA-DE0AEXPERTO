package valorReferencia;
class Persona{
    private String  nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Andres");

        System.out.println("iniciamos el main ");

        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("Antes de imbocar al metodo test");
        test(persona);
        System.out.println("Despues de imbocar al metodo test");


        System.out.println("Finaliza el metodo main con los datos del arreglo modificados! " );
    }
    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo test " );

       persona.modificarNombre("Pepe");
        System.out.println("Finaliza el metodo test");
    }
}
