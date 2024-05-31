package list.operacoesBasicas.ex2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> listaItens;

    public CarrinhoCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, float preco, int qtd) {
        listaItens.add(new Item(nome, preco, qtd));
    }

    public void removerItem(String nome){
        List<Item> itemsRemover = new ArrayList<>();
        for(Item i : listaItens) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itemsRemover.add(i);
            }
        }
        listaItens.removeAll(itemsRemover);
    }

    public float calcularValorTotal() {
        float valorTotal = 0;
        for(Item i : listaItens) {
            valorTotal += (i.getPreco() * i.getQtd());
        }
        return valorTotal;
    }

    public void lerItens() {
        System.out.println(listaItens);
    }

}
