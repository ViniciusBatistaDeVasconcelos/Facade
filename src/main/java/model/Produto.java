package model;

public class Produto {

    private String nome;
    private String descricao;
    private float altura;
    private float largura;
    private float profundidade;
    private float valor;

    public Produto(String nome, String descricao, float altura, float largura, float profundidade, float valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargura() {
        return largura;
    }

    public float getProfundidade() {
        return profundidade;
    }

    public float getValor() {
        return valor;
    }
}
