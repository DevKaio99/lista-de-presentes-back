package com.lista_de_presentes.DTO;

import com.lista_de_presentes.Model.Item;

public class ItensDTO {

    private Long id;
    private String nome;
    private Double preco;
    private Integer quantidade;
    private String foto;

    public ItensDTO(Item item) {
        this.id = item.getId();
        this.nome = item.getNome();
        this.preco = item.getPreco();
        this.quantidade = item.getQuantidade();
        this.foto = item.getFoto();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
