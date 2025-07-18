import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog( null, "Ingrese un numero entero");
        int numeroDecimal = 0;

        try{
             numeroDecimal = Integer.parseInt(numeroStr);

        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);//volvemos a ejecutar la clase main .
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = ("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        System.out.println(resultadoOctal);
        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);

    }

}
