package com.example.agendacontatos.controller;

import com.example.agendacontatos.dto.UsuarioDTO;
import com.example.agendacontatos.model.Usuario;
import com.example.agendacontatos.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Usuario> listar(){
        return service.listar();
    }

    @PostMapping
    public Usuario criar(@RequestBody UsuarioDTO dto){
        return service.criar(dto);
    }
}
