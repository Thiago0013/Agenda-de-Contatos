package com.example.agendacontatos.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    @JsonBackReference
    private Usuario usuario;

    public Contato() {}

    public Contato(String nome, String email, String telefone, Usuario usuario) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.usuario = usuario;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public Usuario getUsuario() { return usuario; }
}

