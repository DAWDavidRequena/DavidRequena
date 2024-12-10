import java.text.DecimalFormat;

public class ClaseDecimalFormat {
    public static void main(String[] args) {

        // definimos un número decilmal
        float decimal = 1234567.89F;
        
        // Patrón para formatear decimales y millares
        String patron1 = "###, ###. ##";

        // Creamos un objeto DecimalFormat
        DecimalFormat objDF = new DecimalFormat(patron1);
        
        // mostramos a través del método format el número formateado
        String cadena = objDF.format(decimal);

        // mostramos la cadena resultante
        System.out.println(cadena);

        // Patrón para formatear sólo decimales
        // redefinimos el objeto objDF para que formatee el número con el patron2
        // lo mostramos también
        String patron2 = "###. ##";
        objDF = new DecimalFormat(patron2);
        cadena = objDF.format(decimal);       
        System.out.println(cadena);

        // Patrón para formatear sólo parte entera
        // redefinimos el objeto objDF para que formatee el número con el patron3
        // lo mostramos también
        String patron3 = "###";        
        objDF = new DecimalFormat(patron3);
        cadena = objDF.format(decimal);       
        System.out.println(cadena);       

        // Patrón para formatear ceros en la parte entera y decimal
        // redefinimos el objeto objDF para que formatee el número con el patron3
        // lo mostramos también
        String patron4 = "00000000.0000";
        objDF = new DecimalFormat(patron4);
        cadena = objDF.format(decimal);       
        System.out.println(cadena);         
    }    
}
