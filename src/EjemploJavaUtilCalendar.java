import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2020,0, 25,19,20,10);
        calendario.set(Calendar.YEAR,2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);
        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR,7);
        calendario.set(Calendar.AM_PM,Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND,10);
        calendario.set(Calendar.MILLISECOND,125);
        Date fecha = calendario.getTime();

        System.out.println("Fecha sin formato = " + fecha);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MMMM-dd hh:mm:ss:SSS a");
        String FechaConFormato = format.format(fecha);
        System.out.println("FechaConFormato = " + FechaConFormato);
    }
}