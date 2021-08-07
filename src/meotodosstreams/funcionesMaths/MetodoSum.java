package meotodosstreams.funcionesMaths;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Irvn Cruz
 */
public class MetodoSum {

    public static void main(String[] args) {
        //Metodo Sum, permite hacer la suma de una lista de enteros, a traves de un IntStream

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        //Primer opcion con lambda, pasa mismo paramatro
        Integer suma = numeros.stream()
                                    .mapToInt(n -> n)   //Pasa y retorna el mismo int en lambda
                                    .sum(); //Hace la suma
        System.out.println("Suma: " + suma);
        
        //Segunda opcion con funcion de Integer
        Integer suma2 = numeros.stream()
                                        .mapToInt(Integer::intValue)    //Retorna un int primitivo de Integer
                                        .sum(); //Hace la suma
        System.out.println("Suma2 : "+suma2);
    }

}
