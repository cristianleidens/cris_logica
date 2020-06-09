import java.util.Scanner;

public class Number {

    private double number1;
    private double number2;

    /**
     * count zero at twenty
     * @return
     */
    public String deZeroVinte() {
        int count = 0;
        StringBuilder names = new StringBuilder();
        while (count <= 20) {
            names.append("\n" + count);
            count++;
        }
        return names.toString();
    }

    public String deZeroVinte2() {
        StringBuilder names = new StringBuilder();
        for(int count=0;  count<=20; count++){
            if(count%2==0){
                names.append("\n" + count);
            }
        }
        return names.toString();
    }

    public String deZeroVinte3() {
        StringBuilder names = new StringBuilder();
        for(int count=0;  count<=20; count++){
            if(count%2==1){
                names.append("\n" + count);
            }
        }
        return names.toString();
    }

    public String deZeroVinte4(int interval1, int interval2) {
        StringBuilder names = new StringBuilder();
        for(int count = interval1; count <= interval2; count++){
            names.append("\n" + count);
        }
        return names.toString();
    }

    public String deZeroVinte5(int interval3, int interval4, int step) {
        StringBuilder names = new StringBuilder();
        for(int count = interval3; count <= interval4; count = count + step){
            names.append("\n" + count);
        }
        return names.toString();
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double sum() {
        return this.number1 + this.number2;
    }

    public double subtract() {
        return this.number1 - this.number2;
    }

    public double multiply() {
        return this.number1 * this.number2;
    }

    public double division() {
        return this.number1 / this.number2;
    }

    public String verifyOption(int option) {
        switch (option) {
            case 1:
                return "\n"+this.sum();
            case 2:
                return "\n"+this.subtract();
            case 3:
                return "\n"+this.multiply();
            case 4:
                return "\n"+this.division();
            case 5:
                System.exit(0);
                return null;
            default:
                return "Use a valid option!";
            }
        }
}
