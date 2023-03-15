public class Main {
    public static void main(String[] args) {
         String saludar= "Hola Mundo desde Java";
         System.out.println(saludar);
        System.out.println("saludar = " + saludar.toUpperCase());//todo mayusculas

        int numero = 10;
        System.out.println("numero " + numero);

        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero "+ numero);
            numero2 = 10;
        }
        System.out.println("numero 2 "+ numero2);
        var numero3 = 16;//variables dinamicas, deacuerdo al valor que guarda es el tipo
        var numero4 = "16";

        String nombre;
        nombre = "Andres";

        if(numero >10){
            nombre = "Juan";
        }
        System.out.println("nombre: "+nombre);


    }
}