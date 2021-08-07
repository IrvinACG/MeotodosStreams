package meotodosstreams;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Irvn Cruz
 */
public class MetodoDistinct {

    public static void main(String[] args) {
        //Metodo Distinct, permite eliminar elementos repetidos, que regresa elementos unicos
        //Regresa elementos unicos de la coleccion
        List<String> names = List.of("Nombre 1", "Nombre 2","Nombre 3","Nombre 2","Nombre 4","Nombre 5","Nombre 1");
        
        names.stream().distinct().forEach( name -> System.out.println(name));
        
    }
    
}
