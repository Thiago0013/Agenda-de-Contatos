package com.example.agendacontatos.dto;

import com.example.agendacontatos.model.Usuario;

public record ContatoDTO(String nome, String email, String numero, Long idUsuario){}
