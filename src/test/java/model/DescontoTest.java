package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescontoTest {
    @Test
     void deveRetornarZero() throws Exception {
        assertEquals(0, Desconto.getInstance().calcular("", 10));
    }

    @Test
     void deveRetornarDez() throws Exception {
        assertEquals(10, Desconto.getInstance().calcular("DESCONTO10", 10));
    }

    @Test
     void deveRetornarExcecao() throws Exception {
        try{
            Desconto.getInstance().calcular("DESCONTO25", 10);
            fail();
        } catch(Exception e){
            assertEquals("Cupom inválido!", e.getMessage());
        }

    }
}