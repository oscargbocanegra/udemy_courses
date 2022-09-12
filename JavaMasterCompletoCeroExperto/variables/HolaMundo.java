package JavaMasterCompletoCeroExperto.variables;

public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpercase() = " + saludar.toUpperCase());

        int numero = 10;

        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);
        var numero3 = 11;

        String nombre;
        nombre = "Andres";
        if(numero3 > 10){
            nombre= "Juan";
        }
        System.out.println("nombre = " + nombre);

        //comentarios en java con doble línea

        /*
        * Comentarios en Java por bloques
        * */

        // Ctrl + /  = comenta varias lineas al tiempo.
        // Ctrl + Shift + /  = comenta por bloques







    }
}
