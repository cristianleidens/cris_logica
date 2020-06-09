import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class BancoArray implements BancoArrayInterface {

    List<Pessoa> agenda;

    public BancoArray() {
        agenda = new ArrayList<>();
    }

    @Override
    public void cadastrar(Pessoa pessoa) {
        this.agenda.add(pessoa);
    }

    @Override
    public List<Pessoa> buscar() {
        return this.agenda;
    }

    @Override
    public void excluir(int index) {
        this.agenda.remove(index);
    }

    @Override
    public void alterar(int index, Pessoa pessoa) {
        this.agenda.add(index, pessoa);
    }

    @Override
    public Pessoa filtrar(Pessoa pessoa, int filtro) {
        switch(filtro) {
            case 1: //nome
                for(Pessoa pessoaAuxiliar : this.agenda) {
                    if(pessoaAuxiliar.getNome().contains(pessoa.getNome())) {
                        return pessoaAuxiliar;
                    }
                }
                break;
            case 2: //idade
                for(Pessoa pessoaAuxiliar : this.agenda) {
                    if(pessoaAuxiliar.getIdade() == pessoa.getIdade()) {
                        return pessoaAuxiliar;
                    }
                }
                break;
            default:
                return null;
        }
        return null;
    }

    @Override
    public int verificarQuantidade() {
        return this.agenda.size();
    }

    @Override
    public void apagarAgenda() {
        this.agenda.clear();
    }
}
