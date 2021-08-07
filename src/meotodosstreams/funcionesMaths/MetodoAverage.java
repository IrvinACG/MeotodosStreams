package meotodosstreams.funcionesMaths;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

/**
 *
 * @author Irvn Cruz
 */
public class MetodoAverage {

    public static void main(String[] args) {
        //Metodo Average, permite calcular el promedio de un DoubleStram, IntStream, LongStream | Retorina un OptionalDouble
        
        List<Double> numerosDouble = Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0);
        
        OptionalDouble promedio1 = numerosDouble.stream()
                                            .mapToDouble(numero -> numero)   //Al pasar la misma variable se puede usar Double::doubleValue()
                                            .average(); //Calcula el promedio del DobuleStream | Reportna un OptionalDouble
        System.out.println("Promedio: "+promedio1.orElse(0));
        
        List<Integer> numerosInt = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        OptionalDouble promedio2 = numerosInt.stream()
                                                        .mapToInt(numero -> numero) //Al pasar la misma variable se puede usarInteger::intValue()
                                                        .average(); //Calcula el promedio del IntStream | Reportna un OptionalDouble
        System.out.println("Promedio2: "+promedio2.orElse(0));
        
        List<Long> numerosLong = Arrays.asList(Long.parseLong("1"),Long.parseLong("2"),Long.parseLong("3"),Long.parseLong("4"),Long.parseLong("5"));
        OptionalDouble promedio3 = numerosLong.stream()
                                                        .mapToLong(numero -> numero)    //Al pasar la misma variable se puede usarLong::longValue()
                                                        .average(); //Calcula el promedio del LongStream | Reportna un OptionalDouble
        System.out.println("Promedio3: "+promedio3.orElse(0));
    }
    
}
