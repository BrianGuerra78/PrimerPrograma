public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.jpeg";
        int i = archivo.indexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));
        int j =archivo.lastIndexOf(".");
        System.out.println("archivo.substring(j+1) = " + archivo.substring(j+1));
    }
}
