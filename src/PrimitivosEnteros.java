
public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = "+ numeroByte);
        System.out.println("tipo byte correspondiente en byte = " + Byte.BYTES);
        System.out.println("tipo byte correspondiente en bites = " + Byte.SIZE);
        System.out.println("valor maximo de un byte = " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte = " + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("numeroShort = "+ numeroShort);
        System.out.println("tipo short correspondiente en byte = " + Short.BYTES);
        System.out.println("tipo short correspondiente en bites = " + Short.SIZE);
        System.out.println("valor maximo de un short = " + Short.MAX_VALUE);
        System.out.println("valor minimo de un short = " + Short.MIN_VALUE);

        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int correspondiente en byte = " + Integer.BYTES);
        System.out.println("tipo int correspondiente en bites = " + Integer.SIZE);
        System.out.println("valor maximo de un int = " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un int = " + Integer.MIN_VALUE);

        long numeroLong = 2147483648L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long correspondiente en byte = " + Long.BYTES);
        System.out.println("tipo long correspondiente en bites = " + Long.SIZE);
        System.out.println("valor maximo de un long = " + Long.MAX_VALUE);
        System.out.println("valor minimo de un long = " + Long.MIN_VALUE);

        var numeroVar = 127;


    }
}
