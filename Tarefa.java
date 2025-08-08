// Essa classe representa uma tarefa (ex: "Estudar Java", "Corrigir bug #12")
public class Tarefa {

    // Atributo que guarda o título ou nome da tarefa
    private String titulo;

    // Atributo que indica se a tarefa foi concluída (true) ou não (false)
    private boolean concluida;

    // Construtor da classe: é chamado quando você cria uma nova tarefa
    public Tarefa(String titulo) {
        this.titulo = titulo;    // Salva o título da tarefa
        this.concluida = false;  // Ao criar, a tarefa começa como "não concluída"
    }

    // Método para marcar a tarefa como concluída
    public void marcarConcluida() {
        this.concluida = true;
    }

    // Método que retorna a tarefa em forma de texto, para mostrar no terminal
    public String toString() {
        // Se concluída, mostra [X], senão mostra [ ] antes do título
        return (concluida ? "[X] " : "[ ] ") + titulo;
    }
}
