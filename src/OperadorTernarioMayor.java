import java.util.Scanner;

public class OperadorTernarioMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un Numero");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa un segundo Numero");
        int num2 = scanner.nextInt();

        System.out.println("Ingresa un tercer Numero");
        int num3 = scanner.nextInt();

        System.out.println("Ingresa un cuarto Numero");
        int num4 = scanner.nextInt();

        max= (num1 >num2)? num1 : num2;
        max = (max > num3)? max: num3;
        max = (max > num4)? max: num4;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("El numero mayor es:  = " + max);
    }
}
