package br.com.zup.Produtos.Dtos;

public class ProdutosDTO {
    private String nome;
    private int valor;

    public ProdutosDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
