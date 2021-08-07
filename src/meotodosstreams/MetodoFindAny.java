package meotodosstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import meotodosstreams.model.User;

/**
 *
 * @author Irvn Cruz
 */
public class MetodoFindAny {

    public static void main(String[] args) {
        //Metodo FindAny, retorna cualquier objeto que cumpla con el criterio de la condficion | Retorna un Optional <Objeto>
        //Metodo FindFirst, retorna el PRIMER objeto que cumpla con el criterio de la condificion | Reporna un Optional <Objeto>

        List<User> users = new ArrayList<>();
        users.add(new User("Ana", 25));
        users.add(new User("Alejandro", 20));
        users.add(new User("Jose", 21));
        users.add(new User("Juan", 23));
        users.add(new User("Andrea", 20));
        users.add(new User("Javier", 23));

        //Ejemplo con FindAny, obtener el nombre que empiza con A
        //No regresar el Optional <Object>, puede ser riesgo ya que puede ser Null
        User usuario1 = users.stream()
                                    .filter(user -> user.getName().startsWith("J"))
                                    .findAny() //Regresa cualquier objeto que cumpla con la condificion | Retorna un Optional<Objeto>
                                    .get();   //Regresa el objeto
        System.out.println(usuario1);
        
        //Ejemplo con FindFirst, obtener el usuario con 20 anios
        //Mejores practicas es regresar el Optional <Object>
        Optional<User> usuario2 = users.stream()
                                    .filter(user -> user.getAge() == 20)
                                    .findFirst(); //Regresa el primer objeto que cumpla con la condicion | Reportna un Optiona<Objeto>
        //Optional.orElse(Objeto opcional a regresar)
        System.out.println(usuario2.orElse(null));
    }

}
