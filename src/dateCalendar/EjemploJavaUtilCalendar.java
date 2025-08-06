package dateCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();//se crea el calendario

        //calendario.set(2025, Calendar.AUGUST, 06, 19, 10);
        calendario.set(Calendar.YEAR, 2025);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 21);

       // calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 13);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 105);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin Formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha con Formato = " + fechaConFormato);
    }
}
