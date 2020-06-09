import java.util.List;

/**
 *
 */
public interface BancoArrayInterface {

    public void cadastrar(Person person);
    public List<Person> search();
    public void exclude();
    public void edit();
    public void filter();

}
