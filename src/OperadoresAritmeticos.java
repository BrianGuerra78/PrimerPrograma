import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j=4;
        int suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));

        int resta = i-j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i - j));

        int multi = i * j;
        System.out.println("multiplicacion = " + multi);

        int div = i / j;
        float div2 = (float)i / (float) j;
        System.out.println("divicion = " + div);
        System.out.println("divicion 2 = " + div2);
        
        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }else {
            System.out.println("numero impar = " + numero);
        }

    }
}
