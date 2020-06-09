import java.util.Scanner;

/**
 *
 */
public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BancoArray agenda = new BancoArray();

        Pessoa pessoa = null;

        int opcao = 0;
        do {
            System.out.println("1-cadastrar\n2-ver agenda\n3-deletar\n4-filtrar\n5-ver qtd\n6-esvaziar agenda\n100-sair");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    pessoa = new Pessoa();
                    System.out.println("Digite o nome: ");
                    pessoa.setNome(scanner.next());
                    System.out.println("Digite a idade: ");
                    pessoa.setIdade(scanner.nextInt());
                    agenda.cadastrar(pessoa);
                    System.out.println("Contato cadastrado com sucesso!");
                    break;
                case 2:
                    if(agenda.verificarQuantidade() != 0) {
                        agenda.buscar().forEach(System.out::println);
                    } else {
                        System.out.println("Não há contatos!");
                    }

//                    for(Pessoa pessoaAuxiliar : agenda.buscar()) {
//                        System.out.println(pessoaAuxiliar.toString());
//                    }
                    break;
                case 3:
                    System.out.println("Digite uma posição para excluir: ");
                    int index = scanner.nextInt();
                    agenda.excluir(index);
                    System.out.println("Contato apagado com sucesso!");
                    break;
                case 4:
                    pessoa = new Pessoa();
                    System.out.println("Digite o nome do contato que deseja filtrar: ");
                    pessoa.setNome(scanner.next());

                    pessoa = agenda.filtrar(pessoa, 1);
                    System.out.println(pessoa != null ? pessoa : "Contato não encontrado!");
                    break;
                case 5:
                    System.out.println("Há " + agenda.verificarQuantidade() + " contato(s)");
                    break;
                case 6:
                    agenda.apagarAgenda();
                    System.out.println("Agenda limpa!");
                    break;
                case 100:
                    System.exit(0);
                    break;

            }

        } while(opcao!=100);

    }
}
