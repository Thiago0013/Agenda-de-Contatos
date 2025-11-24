package com.example.agendacontatos.service;

import com.example.agendacontatos.dto.UsuarioDTO;
import com.example.agendacontatos.model.Usuario;
import com.example.agendacontatos.repository.UsuarioRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario criar(UsuarioDTO dto){
        Usuario usuario = new Usuario(dto.nome(), dto.email());
        return repository.save(usuario);
    }

    public List<Usuario> listar(){
        return repository.findAll();
    }
}
