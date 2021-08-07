package meotodosstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author Irvn Cruz
 */
public class MetodoReduce {
    
    public static void main(String[] args) {
        //Medodo Reduce,  permite convertir una lista X en un resultado Y
       
        int valorInicioAcumulador = 0;
        //Como valorInicioAcumulador es tipo int, el reduce regresara un int
        int result =        Stream.of(1,2,3,4,5,6,7,8,9,10).reduce(valorInicioAcumulador, (acumulador, elemento) -> acumulador + elemento);
        System.out.println("Resultado suma numeros 1: "+ result);
        
        //Como valorInicio es de tipo String, el reduce regresara un String
        String valorInicio = "";
        String resultStr = Stream.of("Java","C","C++","PHP","Python").reduce(valorInicio, (acumulador, lenguaje) -> acumulador +lenguaje + " | " );
        System.out.println("Resultado concatenacions 1: "+ resultStr);
        
        
        //Ejemplo sin Reduce tradicional
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int resultNumeros = 0;
        for(Integer i : numeros){
            resultNumeros += i;
        }
        System.out.println("Resultado suma numeros 2: "+ resultNumeros);
        
        //Ejemplo con Reduce sin especificar valorInicio | Retorna un Optional<Integer>
        Optional<Integer> resultNumerosReduce = numeros.stream().reduce((acumulador,elemento) -> acumulador+elemento);
        System.out.println("Resultado suma numeros 3: "+ resultNumerosReduce.orElse(null));
        
         //Ejemplo con Reduce con especificar valorInicio (int)| Retorna un Optional<Integer>
        int resultNumerosReduceValorInicio = numeros.stream().reduce(0, (acumulador,elemento) -> acumulador + elemento);
        System.out.println("Resultado suma numeros 4: "+resultNumerosReduceValorInicio);
        
         //Ejemplo con Reduce con especificar valorInicio (int)| Retorna un Optional<Integer>
        int resultNumerosReduceValorInicio2 = numeros.stream().reduce(0, Integer::sum);
        System.out.println("Resultado suma numeros 5: "+resultNumerosReduceValorInicio2);
        
        //Como valorInicio es de tipo String, el reduce regresara un String
        String resultStrReduceStringReferencia = Stream.of("Java","C","C++","PHP","Python").reduce("", String::concat );
        System.out.println("Resultado concatenacions 2: "+ resultStrReduceStringReferencia);
    }
    
}
