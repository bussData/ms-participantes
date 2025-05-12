package com.ms.participantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.participantes.entities.Inscripcion;
import java.util.List;
 
public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
    public Inscripcion save(Inscripcion inscripcion);
    public boolean existsByIdParticipanteAndIdEvento(Long idParticipante, Long idEvento);
    public int countByIdEvento(Long idEvento);
    public List<Inscripcion> findByIdParticipante(Long idParticipante);
} 