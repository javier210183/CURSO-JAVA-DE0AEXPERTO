package flujosDeControl;

import javax.swing.*;
import java.security.spec.RSAOtherPrimeInfo;

public class SentenciaForArreglos {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count = nombres.length;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase("andres") ||
                    nombres[i].equalsIgnoreCase("pepa")){
                continue;
            }
            System.out.println( i + ".- " + nombres[i]);

        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\":");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for(int i = 0;i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }

        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar +" fue encontrado");
        }else{
            JOptionPane.showMessageDialog(null, buscar +" no existe en el sistema");

        }
    }
}
