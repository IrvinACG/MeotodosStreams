package meotodosstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Irvn Cruz
 */
public class MetodoFlatMap {

    public static void main(String[] args) {
        //Metodo FlatMap, este metodo permite combinar varias conleccion y obtener una unica coleccion

        List<String> list1 = Arrays.asList("uno", "dos", "tres");
        List<String> list2 = Arrays.asList("cuatro", "cinco");
        List<String> list3 = Arrays.asList("seis");
        
        List<String> finalList = Stream.of(list1,list2,list3)
                                                .flatMap(listaUnica -> listaUnica.stream()) //Mapea todas las lista en una sola y retorna un stream nuevo con todas las colecciones
                                                .collect(Collectors.toList());
        
        System.out.println(finalList);

    }

}
