import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class Main2 {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("Cris");
        names.add("Myrena");
        names.add("Felipe");
        names.add("Thiago");

        for(String name: names) {
            System.out.println(name);
        }

        names.remove(1);
        names.remove("Felipe");

        System.out.println("Quantidade: " + names.size());
        names.clear();
        System.out.println("Quantidade: " + names.size());

        System.out.println(names.isEmpty() ? "Esta vazio" : names);

        List<String> namess = new ArrayList<>();
        namess.add("Criss");
        namess.add("Myllenaa");



    }
}
