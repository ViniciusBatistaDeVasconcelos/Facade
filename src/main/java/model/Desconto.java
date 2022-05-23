package model;

public class Desconto {
    private static Desconto instance = new Desconto();

    public static Desconto getInstance() {
        return instance;
    }

    public float calcular(String cupom, float totalCompra) throws Exception {
        float desconto;

        switch (cupom) {
            case "DESCONTO10":
                desconto = 10.0f;
                break;
            case "DESCONTO25":
                desconto = 25.0f;
                break;
            case "DESCONTO50":
                desconto = 50.0f;
                break;
            case "DESCONTO100":
                desconto = 100.0f;
                break;
            default:
                desconto = 0.0f;
                break;
        }

        if(desconto > totalCompra) throw new Exception("Cupom inválido!");
        return desconto;
    }
}
