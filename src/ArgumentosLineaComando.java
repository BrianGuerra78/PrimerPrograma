public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if(args.length ==0){
            System.out.println("Debe ingresar algun argumento");
            System.exit(-1);
        }else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argumentos n° " + i + ": " + args[i]);
            }
        }
    }
}
