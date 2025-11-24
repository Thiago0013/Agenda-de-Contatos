package com.example.agendacontatos.controller;

import com.example.agendacontatos.dto.ContatoDTO;
import com.example.agendacontatos.model.Contato;
import com.example.agendacontatos.service.ContatoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContatoController {
    private final ContatoService service;

    public ContatoController(ContatoService service) {
        this.service = service;
    }

    @PostMapping("/contato")
    public Contato contato(@RequestBody ContatoDTO contato){
        return service.criar(contato);
    }

    @GetMapping("/contato")
    public List<Contato> contato(){
        return service.listar();
    }
}
