package flujosDeControl;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle:
        for (int i = 0; i <= 7; i++) {
        int j = 0;
            System.out.println();
            while ( j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia  = " + i + " descanso del fin de semana!! ");
                    continue bucle;
                }
                System.out.println("Dia   " + i + ", trabajando a las " + j + "hrs. ");
                j++;
            }
        }
        System.out.println("\n\n-----------------------otro bucle-------------------------"); 
        
        bucle1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }
        System.out.println("\n\n-----------------------otro bucle-------------------------");
        etiqueta:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

    }
}
