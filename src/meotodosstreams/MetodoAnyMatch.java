package meotodosstreams;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Irvn Cruz
 */
public class MetodoAnyMatch {

    public static void main(String[] args) {
        //Metodo AnyMatch, valida la lista si ALMENOS UN ELEMENTO  elementos cumple con la concidicion de busqueda | Retorna booleano true: si encontro coincidencia, false: si no encontro nada
        //Metodo AllMatch, valida la lista si TODOS LOS ELEMENTOS  cumplen con la condicion de busqueda | Retorna true, si todos los elementos cumplen con la coincidencia, contrario false
        //Problema Conocer si un alumno posee por lo menos una calificacion no aproboatoria.
        //La calificacion minima para aprobar es 6
        List<Integer> calificaciones = Arrays.asList(10,9,7,6,6,7,8,7,9,9,6,7,9,10);
        
        //Ejemplo sin AnyMatch
        boolean hayReprobados = calificaciones.stream()
                                                    .filter(calificacion -> calificacion < 6)
                                                    .count() > 0;   //Si hay mas de 0, hay alumnos reprobados | Condicion que retorna un boolean
        System.out.println(hayReprobados);
        
        //Ejemplo con AnyMatch
        boolean reprobados = calificaciones.stream()
                                                .anyMatch( calificacion -> calificacion < 6);   //Si al menos un elemento cumple con la condicion, retorna true
        System.out.println(reprobados);
        
        //Ejemplo con AllMatch
        List<Integer> calificacionesExcelentes = Arrays.asList(8,10,10,10,10,10,10,10);
        boolean alumnoExcelente = calificacionesExcelentes.stream()
                                                        .allMatch(calificacion -> calificacion >= 9); //Todos los elementos tienen que cumplir con la condicion y retorna true, contrario false
        System.out.println(alumnoExcelente);
        
        //Ejemplo con AnyMatch
        boolean alumnoNormal = calificacionesExcelentes.stream()
                                                        .anyMatch(calificacion -> calificacion >= 9);//Retorna true, por que al menos uno o mas elementos cumplen con la condifcion
        System.out.println(alumnoNormal);
    }
    
}
