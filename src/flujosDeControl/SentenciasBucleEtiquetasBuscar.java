package flujosDeControl;

public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        //Encontrar y contabilizar el caracter dentro de un texto

        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int maxFrase = frase.length();
        int maxPalabra = palabra.length();

        int cantidad = 0;
        char letra = 'g';
        buscar:
        for (int i = 0; i < maxFrase; i++) {
            int k = i;//valor inicial de i
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '" + palabra + "' en la frase");
    }
}
