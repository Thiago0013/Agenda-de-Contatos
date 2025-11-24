package com.example.agendacontatos.service;

import com.example.agendacontatos.dto.ContatoDTO;
import com.example.agendacontatos.model.Contato;
import com.example.agendacontatos.model.Usuario;
import com.example.agendacontatos.repository.ContatoRepository;
import com.example.agendacontatos.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {
    private final ContatoRepository contatoRepository;
    private final UsuarioRepository userRepository;

    public ContatoService(ContatoRepository contatoRepository, UsuarioRepository userRepository){
        this.contatoRepository = contatoRepository;
        this.userRepository = userRepository;
    }

    public Contato criar(ContatoDTO dto){
        Usuario usuario = userRepository.findById(dto.idUsuario())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        Contato contato = new Contato(dto.nome(), dto.email(), dto.numero(), usuario);
        return contatoRepository.save(contato);
    }

    public List<Contato> listar(){
        return contatoRepository.findAll();
    }
}
