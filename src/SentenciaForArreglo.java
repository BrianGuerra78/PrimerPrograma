import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres= {"Brian" ,"Rolando","Dylan","Paco","Luis"};
        int count = nombres.length;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase("brian") || nombres[i].equalsIgnoreCase("paco")){
                continue;
            }
            System.out.println(i+1 +".-" +nombres[i]);
        }
        String buscar = JOptionPane.showInputDialog("Ingres eun nombre");
        System.out.println("buscar = "+ buscar);
        boolean encontrado = false;
        for (int i = 0; i < count; i++){
             if(nombres[i].equalsIgnoreCase(buscar)){
                 encontrado=true;
                 break;
             }
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null,buscar + " fue encontrado!");
        }else {
            JOptionPane.showMessageDialog(null,buscar + " no existe en el sistema");
        }
    }
}
