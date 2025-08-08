// Essa classe representa um bug (erro no sistema que precisa ser corrigido)
public class Bug {

    // Atributo que guarda a descrição do bug
    private String descricao;

    // Atributo que indica se o bug já foi resolvido ou não
    private boolean resolvido;

    // Construtor: cria um novo bug com a descrição recebida
    public Bug(String descricao) {
        this.descricao = descricao; // Guarda o texto do bug
        this.resolvido = false;     // Todo bug começa como "não resolvido"
    }

    // Método para marcar o bug como resolvido
    public void marcarResolvido() {
        this.resolvido = true;
    }

    // Método que retorna como o bug será mostrado no terminal
    public String toString() {
        // Se o bug foi resolvido, aparece "[RESOLVIDO]", caso contrário, "[ABERTO]"
        return (resolvido ? "[RESOLVIDO] " : "[ABERTO] ") + descricao;
    }
}
