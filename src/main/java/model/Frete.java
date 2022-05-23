package model;

public class Frete {
    private static Frete instance = new Frete();

    public static Frete getInstance() {
        return instance;
    }

    public float calcular(float altura, float largura, float profundidade) throws Exception {

        if (altura <= 0.0f || largura <= 0.0f || profundidade <= 0.0f) {
            throw new Exception("Erro ao calcular o frete!");
        }

        float custoEnvio = (altura * largura * profundidade) / 6000.0f;

        return custoEnvio + 20.0f;
    }
}