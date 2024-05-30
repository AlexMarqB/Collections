package list.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        //uma lista pode conter elementos repetidos por isso iremos remover TODOS os elementos com a descrição
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            // comparar a string com outra ignorando case (maiuscula, minuscula)
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
              tarefasParaRemover.add(t);
            }
        }
        //removeAll recebe uma collection
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int numeroTotalTarefas() {
        //retorna a quantidade de elementos dentro da lista
        return tarefaList.size();
    }

    public void lerTarefas(){
        System.out.println(tarefaList);
    }

    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    public void setTarefaList(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;
    }
}
