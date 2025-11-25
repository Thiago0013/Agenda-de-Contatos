package com.example.agendacontatos.repository;

import com.example.agendacontatos.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
    boolean existsByUsuario_IdAndTelefone(Long idUsuario, String telefone);
}
