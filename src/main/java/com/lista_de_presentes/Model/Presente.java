package com.lista_de_presentes.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "presentes")

public class Presente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomePresenteador;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    private LocalDate dataPresente = LocalDate.now();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePresenteador() {
        return nomePresenteador;
    }

    public void setNomePresenteador(String nomePresenteador) {
        this.nomePresenteador = nomePresenteador;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public LocalDate getDataPresente() {
        return dataPresente;
    }

    public void setDataPresente(LocalDate dataPresente) {
        this.dataPresente = dataPresente;
    }
}
