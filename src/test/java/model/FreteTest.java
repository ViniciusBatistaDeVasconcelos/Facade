package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteTest {
    @Test
    void deveRetornarCalculoDoFrete() throws Exception {
        assertEquals(21, Frete.getInstance().calcular(30.0f, 20.0f, 10.0f));
    }

    @Test
    void deveRetornarExcecao() {
        try{
            Frete.getInstance().calcular(30.0f, 0.0f, 10.0f);
            fail();
        } catch(Exception e){
            assertEquals("Erro ao calcular o frete!", e.getMessage());
        }

    }
}