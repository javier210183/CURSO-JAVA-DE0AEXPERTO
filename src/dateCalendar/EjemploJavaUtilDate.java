package dateCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha =  new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM 'de' yyyy");
        String fechaStr = df.format(fecha);

        long j = 0;
        for(int i = 0; i < 10000000; i++){
            j += i;
        }

        System.out.println("j = " + j);

        Date fecha2 = new Date(); // fecha después del for

        long tiempoFinal = fecha2.getTime() - fecha.getTime(); // CORREGIDO
        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal + " ms");
        System.out.println("fechaStr = " + fechaStr);
    }
}
