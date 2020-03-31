import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.List;

public class ComparatorEx {

    //done 1 Person: name, lastName (opcjonalnie pola obiektowe)
    //done 2 dwa komparatory
    //done 3 wypisać posortowane:
    /*
     3a pierwszy
     3b drugi
     3c oba
     3d oba, jeden z nich pdwócony
     */
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Ala", "Zar"),
                new User("Basia", "Bela"),
                new User("Adam", "Berek"),
                new User("Zara", "Lok"),
                new User("Kamila", "Beza"),
                new User("Artur", "Rak"),
                new User("Laura", "Ad"));

        System.out.println();
        System.out.println("3a: name sort:".toUpperCase());

        users
                .stream()
                .sorted(User.sortName)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("3b: lastname sort:".toUpperCase());

        users
                .stream()
                .sorted(User.sortLastName)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("3c: reversed lastname + name sort:".toUpperCase());

        users
                .stream()
                .sorted(User.sortLastName.reversed()
                        .thenComparing(User.sortName))
                .forEach(System.out::println);


    }
}

@AllArgsConstructor
@Data
class User {
    String name;
    String lastName;

    static Comparator<User> sortName = Comparator.comparing(User::getName);
    static Comparator<User> sortLastName = Comparator.comparing(User::getLastName);

}