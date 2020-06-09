import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Cris");
        names.add("cris");
        names.add("Myllena");
        names.add("myllena");
        names.add("thiago");
        names.add("thiago");

        for(String name : names) {
            System.out.println(name);
        }

        System.out.println("Quantidade de nomes: " + names.size());

        names.forEach(name -> System.out.println(name));

        names.forEach(System.out::println);

        for(String name : names) {
            if(name.contains("C")) {
                System.out.println(name);
            }
        }

        names.stream().filter(name -> name.contains("C")).forEach(System.out::println);

    }
}
