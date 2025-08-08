// Importa a classe Scanner, que permite ler entradas do teclado
import java.util.Scanner;

// Classe principal do programa
public class Main {

    // Metodo main: ponto de entrada do programa
    public static void main(String[] args) {
        
        // Cria um objeto Gerenciador, responsavel por manipular tarefas e bugs
        // Aqui, "g" sera usado para acessar metodos como adicionar, listar e remover.
        Gerenciador g = new Gerenciador(); 

        // Cria um objeto Scanner para capturar entradas do usuario via teclado
        // O argumento "System.in" indica que a entrada sera pelo console
        Scanner sc = new Scanner(System.in); 
        
        // Variavel que armazenara a opcao escolhida pelo usuario no menu
        int opcao;

        // Estrutura de repeticao que mantem o programa rodando ate que a opcao escolhida seja "0" (Sair)
        do {
            // Exibe o menu principal no console
            // "\n" insere uma linha em branco para melhor visualizacao
            System.out.println("\n=== GERENCIADOR DE TAREFAS E BUGS ===");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Adicionar Bug");
            System.out.println("3. Listar Tudo");
            System.out.println("4. Marcar Tarefa como Concluida");
            System.out.println("5. Marcar Bug como Resolvido");
            System.out.println("6. Apagar Tarefa");
            System.out.println("7. Apagar Bug");
            System.out.println("0. Sair");

            // Solicita ao usuario que escolha uma opcao do menu
            System.out.print("Escolha: ");

            // Le o numero digitado pelo usuario e armazena em "opcao"
            opcao = sc.nextInt();
            
            // Limpa o buffer do teclado para evitar problemas na proxima leitura de strings
            sc.nextLine(); 

            // Estrutura switch para executar a acao correspondente a opcao escolhida
            switch (opcao) {

                case 1: // Adicionar nova tarefa
                    System.out.print("Titulo da tarefa: "); // Solicita titulo
                    String t = sc.nextLine(); // Le titulo digitado
                    g.adicionarTarefa(t); // Adiciona tarefa usando o metodo do Gerenciador
                    break;

                case 2: // Adicionar novo bug
                    System.out.print("Descricao do bug: "); // Solicita descricao
                    String b = sc.nextLine(); // Le descricao digitada
                    g.adicionarBug(b); // Adiciona bug usando o metodo do Gerenciador
                    break;

                case 3: // Listar todas as tarefas e bugs cadastrados
                    g.listarTudo();
                    break;

                case 4: // Marcar uma tarefa como concluida
                    System.out.print("Indice da tarefa: "); // Solicita o indice
                    int iT = sc.nextInt(); // Le indice digitado
                    g.concluirTarefa(iT); // Marca tarefa como concluida
                    break;

                case 5: // Marcar um bug como resolvido
                    System.out.print("Indice do bug: "); // Solicita o indice
                    int iB = sc.nextInt(); // Le indice digitado
                    g.resolverBug(iB); // Marca bug como resolvido
                    break;

                case 6: // Apagar tarefa
                    System.out.print("Indice da tarefa: "); // Solicita o indice
                    int aT = sc.nextInt(); // Le indice digitado
                    g.apagarTarefa(aT); // Remove tarefa da lista
                    break;

                case 7: // Apagar bug
                    System.out.print("Indice do bug: "); // Solicita o indice
                    int aB = sc.nextInt(); // Le indice digitado
                    g.apagarBug(aB); // Remove bug da lista
                    break;

                case 0: // Sair do programa
                    System.out.println("Saindo...");
                    break;

                default: // Qualquer valor diferente dos listados
                    System.out.println("Opcao invalida!"); // Mensagem de erro
            }

        } while (opcao != 0); // Continua executando enquanto o usuario nao escolher "0"

        // Fecha o Scanner para liberar recursos do sistema
        sc.close();
    }
}
