import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println("Introduce la fecha con el formato 'yyyy-MM-dd");
            Date fecha = format.parse(scanner.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("format.format(fecha) = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);
            //forma 1 para comparar fechas
            if(fecha.after(fecha2)){
                System.out.println("Fecha (del usuario) es despues de la fecha 2(actual)");
            }else if(fecha.before(fecha2)){
                System.out.println("Fecha es anterior que fecha2");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha es igual a fecha2");
            }
            //forma 2 para comparar fechas
            if (fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha (del usuario) es despues de la fecha 2(actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha es anterior que fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fecha es igual a fecha2");
            }
        } catch (ParseException e) {
            //throw new RuntimeException(e);
            //e.printStackTrace();
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.err.println("El formato debe ser 'yyyy-MM-dd'");
            System.exit(1);
            //main(args);
        }
    }
}
