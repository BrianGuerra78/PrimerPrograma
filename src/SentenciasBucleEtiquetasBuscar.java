public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigures tragan trigo en un trigal";
        int max = frase.length();
        int cantidad = 0;
        char letra = 'g';
        for (int i = 1; i < max; i++) {
            if (frase.charAt(i) != letra) {
                continue;
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces el caracter '" + letra + "' en la frase");
        System.out.println("==============================================================================");

        String frase1 = " trigo tres tristes tigures tragan trigotrigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxfrase = frase1.length() - maxPalabra;

        int cantidad1 = 0;
        char letra1 = 'g';
        buscar:
        for (int i = 0; i <= maxfrase; ) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase1.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad1++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado = " + cantidad1 + " veces la palabra '" + palabra + "' en la frase");
    }
}
