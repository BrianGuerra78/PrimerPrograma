import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        /*int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal +" = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroDecimal);
        System.out.println("numero octal de " + numeroBinario + " = "+Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);*/

        String numeroString = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroString);
        }catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Error debe ingresar un numero entero");
           main(args);
           System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal +" = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroDecimal);
        String resultadoOctal = "numero octal de " + numeroBinario + " = "+Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);
        String resultadoHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" +resultadoOctal;
        mensaje += "\n"+ resultadoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
