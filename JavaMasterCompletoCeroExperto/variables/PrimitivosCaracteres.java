package JavaMasterCompletoCeroExperto.variables;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        System.out.println("caracter = " + caracter);
        char decimal = 64;
        System.out.println("decimal = " + decimal);
        char simpolo = '@';
        System.out.println("simpolo = " + simpolo);
        System.out.println("decimal = caracter:  " + (decimal == caracter));
        var caractervar = '\u0040';
        System.out.println("caractervar = " + caractervar);
        System.out.println("_____________________________________________________");
        System.out.println("Char corresponde en byte a " + Character.BYTES);
        System.out.println("Char corresponde en bytes a " + Character.SIZE);
        System.out.println("Character máximo en Float " + Character.MAX_VALUE);
        System.out.println("Character mínimo en Float " + Character.MIN_VALUE);
        System.out.println("_____________________________________________________");

        char espacio = ' ';
        System.out.println("Char corresponde en byte a " + espacio + Character.BYTES);
        char espacioU = '\u0020';
        System.out.println("Char corresponde en byte a " + espacioU + Character.BYTES);
        char retroceso = '\b';
        System.out.println("Char corresponde en byte a " + retroceso + Character.BYTES);
        char tabulador = '\t';
        System.out.println("Char corresponde en \tbyte a " + tabulador + Character.BYTES);
        char nuevaLinea = '\n';
        System.out.println("Char corresponde en byte a " + nuevaLinea + Character.BYTES);
        char retornoCarro = '\r';
        System.out.println("Char corresponde en byte a " + retornoCarro + Character.BYTES);





    }
}
