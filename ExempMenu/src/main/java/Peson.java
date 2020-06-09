/**
 *
 */
public class Peson {

    private int age;

    public Peson() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return
     */
    public int calcularIdadeMeses() {
        return this.age *12;
    }

    /**
     *
     * @return
     */
    public int calcularIdadeSemanas() {
        return this.age * 52;
    }

    public String verifyopcao(String opcao) {
        if (opcao.equals("meses")) {
            return "Em meses: " + this.calcularIdadeMeses();
        } else if (opcao.equals("semanas")) {
            return "Em semanas: " + this.calcularIdadeSemanas();
        } else if (opcao.equals("osdois")) {
            return "Em meses: " + this.calcularIdadeMeses()
                    + "\nEm semanas: " + this.calcularIdadeSemanas();
        } else if (opcao.equals("sair")) {
            System.exit(0);
        return null;
        } else {
             System.exit(0);
             return null;
        }
    }

    @Override
    public String toString() {
        return "Age: " + getAge()
             + "\nAge Month: " + this.calcularIdadeMeses()
             + "\nAge Weeks: " + this.calcularIdadeSemanas();
    }
}
