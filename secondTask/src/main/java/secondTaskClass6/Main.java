package secondTaskClass6;
/*
CONSIGNA
Agregar 5 objetos del tipo Persona a una lista.
Crear la logica para ordenar alfabeticamente la lista y mostrar en consola de acuerdo al siguiente criterio>
ordenado por nombre
ordenado por apellido
ordenado inversamente por apellido.
*/


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    Person personOne = new Person();
    Person personTwo = new Person();
    Person personThree = new Person();
    Person personFour = new Person();

        ArrayList<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(personOne);
        listOfPersons.add(personTwo);
        listOfPersons.add(personThree);
        listOfPersons.add(personFour);

        System.out.println(
                listOfPersons.get(0).getName() + " - " +
                listOfPersons.get(1).getName() + " - " +
                listOfPersons.get(2).getName() + " - " +
                listOfPersons.get(3).getName() + " - "
        );

        ArrayList<Person> sortedByName = Person.sortPersons(listOfPersons, "name");

        System.out.println(
                sortedByName.get(0).getName() + " - " +
                        sortedByName.get(1).getName() + " - " +
                        sortedByName.get(2).getName() + " - " +
                        sortedByName.get(3).getName() + " - "
        );
    }

}
