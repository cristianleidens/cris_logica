import java.util.Scanner;

/**
 * @autor Cristian
 * @version 1.0.0
 * @since 04/06/2020 - 14:15
 * @category view
 */
public class Main {

    public static void main(String[] args) {

        Number number = new Number();
        System.out.println("Count with me...");
        System.out.println(number.deZeroVinte());

        System.out.println("Count with me the pars...");
        System.out.println(number.deZeroVinte2());

        System.out.println("Count with me the impars...");
        System.out.println(number.deZeroVinte3());

        Scanner scan = new Scanner(System.in);
        System.out.println("Where start the count?");
        int intervalo1 = scan.nextInt();
        System.out.println("Where end's");
        int intervalo2 = scan.nextInt();
        System.out.println(number.deZeroVinte4(intervalo1, intervalo2));

        System.out.println("Where start the count?");
        int intervalo3 = scan.nextInt();
        System.out.println("Where end's");
        int intervalo4 = scan.nextInt();
        System.out.println("What is the step?");
        int step = scan.nextInt();
        System.out.println(number.deZeroVinte5(intervalo3, intervalo4,step));

        int option = 0;
        do {
            System.out.println("What do you want to do?"
                    + "\n1-Some"
                    + "\n2-Subtract"
                    + "\n3-Multiply"
                    + "\n4-Division"
                    + "\n5-Quit");

            option = scan.nextInt();

            System.out.println("What is the first number?");
            number.setNumber1(scan.nextDouble());
            System.out.println("What is the second number?");
            number.setNumber2(scan.nextDouble());

            System.out.println(number.verifyOption(option));

        } while (option != 5);
    }
}
