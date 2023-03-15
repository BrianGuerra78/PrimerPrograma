import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];*/
        //String username = "Brian";
        //String password = "12345";

        //String username2 = "Martin";
        //String password2 = "12345";
       /* usernames[0]="Brian";
        passwords[0]="12345";

        usernames[1]="Martin";
        passwords[1]="12345";

        usernames[2]="Pepe";
        passwords[2]="12345";*/

        String[] usernames = {"Brian","Martin","Pepe"};
        String[] passwords = {"123","1234","12345"};

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Ingresa el usuario: ");
        String usuario = scanner.nextLine();
        System.out.println("Ingresa la contraseña: ");
        String contraseña= scanner.nextLine();

        boolean esAutenticado = false;

       /* if(username .equals(usuario) && password.equals(contraseña) || username2 .equals(usuario) && password2.equals(contraseña)){
            esAutenticado = true;
        }else {
            System.out.println("Usuario o contraseña incotecto!");
        }*/
        for (int i = 0; i < usernames.length; i++){
            esAutenticado = (usernames[i].equals(usuario) && passwords[i].equals(contraseña) ) ? true : esAutenticado;
            /*if(usernames[i].equals(usuario) && passwords[i].equals(contraseña) ){
                esAutenticado = true;
                break;
            }*/
        }
        String mensaje = esAutenticado ? "Bienvenido usuario : ".concat(usuario).concat("!") :
                "Usuario o contraseña incotecto! \nLo sentimos, acceso denegado";
        System.out.println(mensaje);
       /* if ((esAutenticado)){
            System.out.println("Bienvenido usuario : ".concat(usuario).concat("!"));
        }else {
            System.out.println("Usuario o contraseña incotecto!");
            System.out.println("Lo siento, acceso denegado");
        }*/
    }
}
