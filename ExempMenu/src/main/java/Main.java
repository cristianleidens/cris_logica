import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scan = new Scanner(System.in);
        String opcao = "";
        do {
            Peson person = new Peson();
            System.out.println("Digite a Idade");
            person.setAge(scan.nextInt());

            System.out.println("Digite:\nmeses-ver em meses"
                             + "\nsemanas-ver em semanas"
                             + "\nosdois-ver os dois"
                             + "\nsair-sair");
            opcao = scan.next();
            System.out.println(person.verifyopcao(opcao));
        } while(!opcao.equals("sair"));
    }
}
