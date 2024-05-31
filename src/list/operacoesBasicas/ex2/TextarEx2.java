package list.operacoesBasicas.ex2;

public class TextarEx2 {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionarItem("Arroz", 14.60f, 2);
        carrinho.adicionarItem("Feijão", 13.90f, 1);
        carrinho.adicionarItem("Salsicha", 5.99f, 5);
        carrinho.adicionarItem("salsicha", 4.33f, 5);
        carrinho.lerItens();
        System.out.println(carrinho.calcularValorTotal());
        carrinho.removerItem("salsicha");
        carrinho.lerItens();
        System.out.println(carrinho.calcularValorTotal());
    }
}
