import java.sql.SQLOutput;

public class EjemplosStringMetodos {
    public static void main(String[] args) {

        String nombre = "Andres";

        System.out.println("nombre.lemght() = " + nombre.length());
        System.out.println("nombre.toUpperCase()  =  " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.chartAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.chartAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.chartAt(5) = " + nombre.charAt(5));


        System.out.println("nombre.substring = " + nombre.substring(1));
        System.out.println("nombre.substring = " + nombre.substring(1,4));


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.contains('t') = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"\") = " + trabalenguas.endsWith("as"));
        System.out.println("   trabalenguas " );
        System.out.println("   trabalenguas ".trim() );


    }
}
