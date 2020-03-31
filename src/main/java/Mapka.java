import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

public class Mapka {
    public static void main(String[] args) {
        List<Integer> pierwsza = List.of(3,65,7);
        List<Integer> druga = List.of(100,5,1);
        List<Integer> trzecia = List.of(43,15,6);

        List<List<Integer>> listaList = List.of(pierwsza, druga, trzecia);
        System.out.println("Lista list:");
        System.out.println(listaList);
        var splaszczona = listaList
                .stream()
                .flatMap(p-> p.stream())
                .sorted()
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("Splaszczona i posortowana:");
        System.out.println(splaszczona);
    }

}
