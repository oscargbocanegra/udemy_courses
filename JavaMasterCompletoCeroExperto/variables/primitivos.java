package JavaMasterCompletoCeroExperto.variables;

public class primitivos {
    public static void main(String[] args) {

        //boolean tipo mas simple de un solo bit.
        boolean a = false;
        boolean b = true;
        System.out.println("a = " + a + "b = " + b);

        //char usa el código UNICOIDE ocupa 16 bits
        char c = 'a';
        char d = '1';
        char e = '\u0021';

        // Numeros enteros entre -128 a 127
        byte enteroByte = 127;
        System.out.println("enteroByte = " + enteroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bytes a " + Byte.SIZE);
        System.out.println("Valor máximo en byte " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo en byte " + Byte.MIN_VALUE);
        System.out.println("_____________________________________________________");

        //entre -32768 a 32767
        short enteroShort = 32767;
        System.out.println("enteroShort = " + enteroShort);
        System.out.println("tipo Short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo Short corresponde en bytes a " + Short.SIZE);
        System.out.println("Valor máximo en byte " + Short.MAX_VALUE);
        System.out.println("Valor mínimo en byte " + Short.MIN_VALUE);
        System.out.println("_____________________________________________________");

        //entre -2147483648 a 2147483647
        int enteroInt = 2147483647;
        System.out.println("enteroInt = " + enteroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bytes a " + Integer.SIZE);
        System.out.println("Valor máximo en int " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo en int " + Integer.MIN_VALUE);
        System.out.println("_____________________________________________________");

        //entre -92233720036854775808 a 92233720036854775807
        long enteroLong = 9223372036854775807L;
        System.out.println("enteroLong = " + enteroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bytes a " + Long.SIZE);
        System.out.println("Valor máximo en long " + Long.MAX_VALUE);
        System.out.println("Valor mínimo en long " + Long.MIN_VALUE);
        System.out.println("_____________________________________________________");

        //entre -1.4E-45 a 3.4028235E38
        float realFloat = 3.1416f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bytes a " + Float.SIZE);
        System.out.println("Valor máximo en Float " + Float.MAX_VALUE);
        System.out.println("Valor mínimo en Float " + Float.MIN_VALUE);
        System.out.println("_____________________________________________________");

        //entre -4.9E-324 a 1.7976931348623157E308
        double realDouble = 4.7029235E3;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo Double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo Double corresponde en bytes a " + Double.SIZE);
        System.out.println("Valor máximo en Double " + Double.MAX_VALUE);
        System.out.println("Valor mínimo en Double " + Double.MIN_VALUE);
        System.out.println("_____________________________________________________");



    }
}
