public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");
        boolean esIgual = curso== curso2;
        System.out.println("esIgual = " + esIgual);
        
        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);

        String frase = "Programacion Java";
        String frase2 = "programacion java";
        boolean esIgual2 = frase==frase2;
        esIgual2 =frase.equalsIgnoreCase(frase2);
        System.out.println(esIgual2);

        String curso3 = "Programacion Java";
        esIgual = curso ==curso3;
        System.out.println("esIgual = "+ esIgual );
    }
}
