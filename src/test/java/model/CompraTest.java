package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveRetornarProdutoDisponivelVerdadeiro() {
        Cliente cliente = new Cliente("Laura Clarice Beatriz Nogueira", "509.846.424-20");
        Produto produto = new Produto(
                "Geladeira Brastemp BRM44HK",
                "Frost Free Duplex com Compartimento Extrafrio e Fresh Zone Inox - 375L",
                176.0f,
                62.10f,
                75.50f,
                3149.0f
        );

        Compra compra = new Compra(cliente, produto, "DESCONTO10");
        Estoque.getInstance().addProduto(produto);

        assertTrue(compra.produtoDisponivel());
    }

    @Test
    void deveRetornarProdutoDisponivelFalso() {
        Cliente cliente = new Cliente("Laura Clarice Beatriz Nogueira", "509.846.424-20");
        Produto produto = new Produto(
                "Geladeira Brastemp BRM44HK",
                "Frost Free Duplex com Compartimento Extrafrio e Fresh Zone Inox - 375L",
                176.0f,
                62.10f,
                75.50f,
                3149.0f
        );

        Compra compra = new Compra(cliente, produto, "DESCONTO10");

        assertFalse(compra.produtoDisponivel());
    }

    @Test
    void deveRetornarTotalCompra() throws Exception {
        Cliente cliente = new Cliente("Laura Clarice Beatriz Nogueira", "509.846.424-20");
        Produto produto = new Produto(
                "Geladeira Brastemp BRM44HK",
                "Frost Free Duplex com Compartimento Extrafrio e Fresh Zone Inox - 375L",
                176.0f,
                62.10f,
                75.50f,
                3149.0f
        );

        Compra compra = new Compra(cliente, produto, "DESCONTO100");
        // (( 176.0f * 62.10f * 75.50f ) / 6000 ) + 20.0 = 157.5308f
        // R = 3149.0f + 157.5308f - 100.0f
        assertEquals(3206.5308f, compra.totalCompra(), 0.1f);
    }
}