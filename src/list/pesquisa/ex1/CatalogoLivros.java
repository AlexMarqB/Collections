package list.pesquisa.ex1;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(listaLivros.isEmpty()) {
            return livrosPorAutor;
        }
        for(Livro l : listaLivros) {
            if(l.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(listaLivros.isEmpty()) {
            return livrosPorIntervalo;
        }
        for(Livro l : listaLivros) {
            if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                livrosPorIntervalo.add(l);
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = new Livro();
        if(listaLivros.isEmpty()) {
            return livroPorTitulo;
        }
        for(Livro l : listaLivros) {
            if(l.getTitulo().equalsIgnoreCase(titulo)) {
                livroPorTitulo = l;
            }
        }
        return livroPorTitulo;
    }
}
