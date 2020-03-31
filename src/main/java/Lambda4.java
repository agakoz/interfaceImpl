import lombok.AllArgsConstructor;
import lombok.ToString;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.function.Predicate;

public class Lambda4 {
    //done 1 klasa perosn: name, lastname, age
    //done 2 3 predykaty w klasie: imieNaA, naziwskoNaB, wiekPowyzej20Lat

    //done 3 Kolekcja List<Person   >5 elem

    /*
    done 4 stream api
    - odfiltruj uzywając 3 predykatow
    - wpisz do konsoli odfiltrowane elementy
     */
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Ala", "Koala", 21),
                new Person("Ola", "Bela", 13),
                new Person("Adam", "Berek", 23),
                new Person("Ala", "Bala", 60),
                new Person("Kamila", "Beza", 100),
                new Person("Artur", "Banaś", 13),
                new Person("Ania", "Boler", 53)
        );

        people
                .stream()
                .filter(Person.imieNaA.and(Person.naziwskoNaB).and(Person.wiekPowyzej20Lat))
                .forEach(System.out::println);
    }
}

@AllArgsConstructor
@ToString
class Person {
    String name;
    String lastname;
    int age;

    static Predicate<Person> imieNaA = person -> person.name.startsWith("A");
    static Predicate<Person> naziwskoNaB = person -> person.lastname.startsWith("B");
    static Predicate<Person> wiekPowyzej20Lat = person -> person.age > 20;
}

