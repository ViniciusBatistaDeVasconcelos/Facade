package model;

public class CompraFacade {

    public static boolean verificarDisponibilidadeDoProduto(Compra compra) {
        return Estoque.getInstance().isDisponivel(compra.getProduto());
    }

    public static float obterTotalCompra(Compra compra) throws Exception {

        float valorTotal = compra.getProduto().getValor();

        valorTotal += Frete.getInstance().calcular(
                compra.getProduto().getAltura(),
                compra.getProduto().getLargura(),
                compra.getProduto().getProfundidade()
        );

        return valorTotal - Desconto.getInstance().calcular(compra.getCupom(), valorTotal);
    }
}
