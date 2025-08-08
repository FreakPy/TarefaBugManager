import java.util.ArrayList; // Importa a classe para criar listas dinâmicas

// Classe responsável por gerenciar as listas de tarefas e bugs
public class Gerenciador {

    // Lista que guarda todas as tarefas
    ArrayList<Tarefa> tarefas = new ArrayList<>();

    // Lista que guarda todos os bugs
    ArrayList<Bug> bugs = new ArrayList<>();

    // Adiciona uma nova tarefa na lista
    public void adicionarTarefa(String titulo) {
        tarefas.add(new Tarefa(titulo));
    }

    // Adiciona um novo bug na lista
    public void adicionarBug(String descricao) {
        bugs.add(new Bug(descricao));
    }

    // Mostra todas as tarefas e bugs na tela
    public void listarTudo() {
        System.out.println("\n--- Tarefas ---");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + " - " + tarefas.get(i));
        }

        System.out.println("\n--- Bugs ---");
        for (int i = 0; i < bugs.size(); i++) {
            System.out.println(i + " - " + bugs.get(i));
        }
    }

    // Marca uma tarefa como concluída
    public void concluirTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarConcluida();
        } else {
            System.out.println("Indice de tarefa inválido!");
        }
    }

    // Marca um bug como resolvido
    public void resolverBug(int indice) {
        if (indice >= 0 && indice < bugs.size()) {
            bugs.get(indice).marcarResolvido();
        } else {
            System.out.println("Índice de bug inválido!");
        }
    }

    // Apaga uma tarefa
    public void apagarTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        } else {
            System.out.println("Indice de tarefa inválido!");
        }
    }

    // Apaga um bug
    public void apagarBug(int indice) {
        if (indice >= 0 && indice < bugs.size()) {
            bugs.remove(indice);
        } else {
            System.out.println("Indice de bug inválido!");
        }
    }
}
