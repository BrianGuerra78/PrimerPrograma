import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //variable = condicion ? si es verdadero : si es falso;
        String variable= 7 == 7 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota de Matematicas entre 2.0 - 7.8");
        matematicas=scanner.nextDouble();
        System.out.println("Ingrese la nota de Ciencias entre 2.0 - 7.8");
        ciencias= scanner.nextDouble();
        System.out.println("Ingrese la nota de Historia entre 2.0 - 7.8");
        historia=scanner.nextDouble();

        promedio = (matematicas + ciencias + historia)/3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprovado" : "Reprobado";
        /*if(promedio >= 5.49){
            estado = "Aprovado";
        }else {
            estado = "Reprobado";
        }*/
        System.out.println("estado = " + estado);
    }
}
