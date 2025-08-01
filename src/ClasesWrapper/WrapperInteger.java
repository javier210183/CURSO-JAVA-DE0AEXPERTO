package ClasesWrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        //transformamos integer en primitivo
        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        //transformamos un primitivo a integer
        int num = intObjeto;
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        //De string a valor entero
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        //PERDIDAS DE INFORMACION AL SUPERAR LOS MAXIMOS DE LOS TIPOS 
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);
        
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}
