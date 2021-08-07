package meotodosstreams.funcionesMaths;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Irvn Cruz
 */
public class MetodoCount {

    public static void main(String[] args) {
        //Metodo Count, permite contar el numero de elementos de una lista, con o sin condiciones de filtro | Retorna Long
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        
        //Sin usar Filter (Filtro)
        Long totalElementos = numeros.stream().count();
        System.out.println("Total de Elementos: "+totalElementos);
        
        Long totalFiltrada = numeros.stream().filter( num -> num > 5).count();
        System.out.println("Total Filtrada de elementos: "+totalFiltrada);
    }
    
}
