public class WrapperBoolean {
    public static void main(String[] args) {


        Integer num1, num2;
        num1 = 1;
        num2 = 2;


        boolean primBoolean = num1 > num2;//false
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = false;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        System.out.println("Comparando dos objetos boolean " + (objBoolean == objBoolean2));
        System.out.println("Comparando dos objetos boolean " + (objBoolean.equals(objBoolean2)));
        System.out.println("Comparando dos objetos boolean " + (objBoolean2 == objBoolean3));
        System.out.println("Comparando dos objetos boolean " + (objBoolean == objBoolean3));
        
        boolean primBoolean2 = objBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);

    }
}
