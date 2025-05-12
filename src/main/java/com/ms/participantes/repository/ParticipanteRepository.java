package com.ms.participantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.participantes.entities.Participante;

public interface ParticipanteRepository extends JpaRepository<Participante, Long> {
    public boolean existsById(Long idParticipante);
    
}