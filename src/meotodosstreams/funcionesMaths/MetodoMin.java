package meotodosstreams.funcionesMaths;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/**
 *
 * @author Irvn Cruz
 */
public class MetodoMin {

    public static void main(String[] args) {
        //Metodo Min, permite encorar el numero minimo de una lista de numeros List<Integer,Double,Long> en un IntStream, DoubleStream, LongStream
        //Retorna un OptionalInt, OptionalDouble, OptionalLong
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        OptionalInt minimo = numeros.stream()
                                            .mapToInt(numero -> numero)
                                            .min(); //Regresa el numero minimo | Reportna un OptionalInt
        System.out.println("Minimo: " + minimo.orElse(0));
        
        List<Double> numerosDouble = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        OptionalDouble minimoDouble = numerosDouble.stream()
                                                                .mapToDouble(Double::doubleValue)
                                                                .min(); //Regresa el numero minimo | Reportna un OptionalDouble
        System.out.println("MinimoDouble: " + minimoDouble.orElse(0));
        
        List<Long> numerosLong = Arrays.asList(Long.parseLong("1"), Long.parseLong("2"), Long.parseLong("3"), Long.parseLong("4"), Long.parseLong("5"));
        OptionalLong minimoLong = numerosLong.stream()
                                                        .mapToLong(Long::longValue)
                                                        .min(); //Regresa el numero minimo | Reportna un OptionalLong
        System.out.println("MinimoLonng: " + minimoLong.orElse(0));
    }

}
