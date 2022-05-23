package model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private static Estoque instance = new Estoque();

    public static Estoque getInstance() {
        return instance;
    }

    private List<Produto> produtos = new ArrayList<Produto>();

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public boolean isDisponivel(Produto produto) {
        return this.produtos.contains(produto);
    }

    public void setListaVazia() {
        this.produtos.clear();
    }
}
