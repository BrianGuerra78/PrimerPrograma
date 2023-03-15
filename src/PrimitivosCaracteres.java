public class PrimitivosCaracteres {

    public static void main(String[] args) {

        char caracter = 'a';
        char caracter2 = '\u0040';//unicode
        char decimal = 64;//decimal
        System.out.println("caracter = " + caracter);
        System.out.println("caracter2 = " + caracter2);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter2 es " + (decimal==caracter2));

        System.out.println("tipo char correspondiente en byte = " + Character.BYTES);
        System.out.println("tipo char correspondiente en bites = " + Character.SIZE);
        System.out.println("valor maximo de un char = " + Character.MAX_VALUE);
        System.out.println("valor minimo de un char = " + Character.MIN_VALUE);

        char espacio = ' ';
        char espacio2 = '\u0020';
        char retroceso = '\b'; //sirve para borrar o retroceder
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';//borrar linea
        System.out.println("tipo char correspondiente en byte ="+espacio + Character.BYTES);
        System.out.println("tipo char correspondiente en bites ="+espacio2 + Character.SIZE);
        System.out.println("tipo char correspondiente en byte ="+retroceso + Character.BYTES);
        System.out.println("tipo char correspondiente en byte = "+tabulador + Character.BYTES);
        System.out.println("tipo char correspondiente en byte = "+nuevaLinea + Character.BYTES);
        System.out.println("tipo char correspondiente en byte = "+retornoCarro + Character.BYTES);
    }
}
