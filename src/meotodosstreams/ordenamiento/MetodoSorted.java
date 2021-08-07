package meotodosstreams.ordenamiento;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import meotodosstreams.model.Book;

/**
 *
 * @author Irvn Cruz
 */
public class MetodoSorted {

    public static void main(String[] args) {
        //Metodo Sorted, permite ordenar una coleccion
        List<Integer> numeros = List.of(1,9,4,6,3,1,7,9,5,2,5,7,12,34,521,23,76,23,12);
        
        //Ordenamiento ascendente por Default
        List<Integer> numerosAscendentes = numeros.stream()
                                                                        .sorted() //ascendente por Default
                                                                        .collect(Collectors.toList());
        System.out.println(numerosAscendentes);
        
        //Ordenamiento descendente
        List<Integer> numerosDescendentes = numeros.stream()
                                                                            .sorted(Comparator.reverseOrder()) //Ordenamiento Descendente
                                                                            .collect(Collectors.toList());
        System.out.println(numerosDescendentes);
        
        //Ejemplo Ordenar por pagians, si hay mas de 3 libros, contrario ordenar por titulo
        List<Book> books = new ArrayList<>();
        books.add(new Book("El senio de los anios",750));
        books.add(new Book("Don Quijote de la Mancha", 500));
        books.add(new Book("El principito",100)); 
        books.add(new Book("EL hobbit",489));
        books.add(new Book("Poemario",78));
        
        
        Comparator<Book> comparatorBook; 
        if(books.size() > 3)
            comparatorBook = Comparator.comparing(book -> book.getPages());
        else
            comparatorBook = Comparator.comparing(book -> book.getTitle());
        //Crear comparator apartir de una clase | Se para el objeto "book" y se regresa el atributo por el cual se hara la comparacion "bool.getPages"
        books.stream()
                .sorted( comparatorBook.reversed())
                .limit(10) //Limita la cantidad de elemento de una coleccion
                .skip(1) //Descarta el 1 primer elemento y pasa al segundo | Descarta los primeros n elementos y pasa a n+1 : Saltar 10 elementos primeros y pasa al 11 como inicio
                .forEach(book -> System.out.println(book.toString()));
        
    }
    
}
