package br.com.zup.Produtos.Dtos;

import java.util.List;

public class LeadDTO {
    private String nome;
    private String email;
    private String telefone;
    private List<ProdutosDTO> produtos;

    public LeadDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<ProdutosDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutosDTO> produtos) {
        this.produtos = produtos;
    }
}
