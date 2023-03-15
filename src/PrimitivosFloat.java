public class PrimitivosFloat {
    
    static float varFlotante;
    public static void main(String[] args) {

        float realFloat = 2.12e3f;//2120f;
        System.out.println("realFloat = " + realFloat);

        float realFloat2 = 1.5e-10f;
        System.out.println("realFloat2 = " + realFloat2);

        float realF = 5.12e3f;
        System.out.println("realF = " + realF);
        System.out.println("tipo float correspondiente en byte = " + Float.BYTES);
        System.out.println("tipo float correspondiente en bites = " + Float.SIZE);
        System.out.println("valor maximo de un float = " + Float.MAX_VALUE);
        System.out.println("valor minimo de un float = " + Float.MIN_VALUE);

        double realDouble=3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double correspondiente en byte = " + Double.BYTES);
        System.out.println("tipo double correspondiente en bites = " + Double.SIZE);
        System.out.println("valor maximo de un double = " + Double.MAX_VALUE);
        System.out.println("valor minimo de un doubleb = " + Double.MIN_VALUE);

        System.out.println("varFlotante = " + varFlotante);

    }
}
