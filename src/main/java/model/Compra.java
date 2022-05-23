package model;

public class Compra {

    private Cliente cliente;
    private Produto produto;
    private String cupom;

    public Compra(Cliente cliente, Produto produto, String cupom) {
        this.cliente = cliente;
        this.produto = produto;
        this.cupom = cupom;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public String getCupom() {
        return cupom;
    }

    public boolean produtoDisponivel() {
        return CompraFacade.verificarDisponibilidadeDoProduto(this);
    }

    public float totalCompra() throws Exception {
        return CompraFacade.obterTotalCompra(this);
    }
}
