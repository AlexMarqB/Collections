package list.operacoesBasicas.ex1;

public class TestarEx1 {
    public static void main(String[] args) {
        System.out.println("Testa Lista ex 1");
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Fazer compras");
        listaTarefa.adicionarTarefa("Fazer almoço");
        listaTarefa.lerTarefas();
        listaTarefa.adicionarTarefa("Jantar");
        listaTarefa.adicionarTarefa("Jantar");
        listaTarefa.lerTarefas();
        listaTarefa.removerTarefa("jantar");
        listaTarefa.lerTarefas();
    }
}
