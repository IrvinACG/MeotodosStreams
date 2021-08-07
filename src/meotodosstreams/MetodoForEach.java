package meotodosstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Irvn Cruz
 */
public class MetodoForEach {

    public static void main(String[] args) {
        //Metodo ForEach, permite recorrer cada variables de la lista o coleccion

        //Problema: calcular el cuadrado de la lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Opcion sin forEach
        List<Integer> numeroCuadrados = numeros.stream()
                                                                    .map(numero -> numero * numero)
                                                                    .collect(Collectors.toList());
        System.out.println(numeroCuadrados);    //Imprime la lista completa

        //Opcion con ForEach
        numeros.stream()
                .forEach(numero -> { //Imprime cada variable de la lista, ya que accedemos con el ForEach
                    int cuadrado = numero * numero;
                    System.out.print(cuadrado + " ");
                });  

    }

}
