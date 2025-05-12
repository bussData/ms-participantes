package com.ms.participantes.service;

import java.util.List;

import com.ms.participantes.entities.Inscripcion;

public interface InscripcionService{
    public Inscripcion inscribir(Long idParticipante, Long idEvento);
    public List<Inscripcion> obtenerInscripcionesPorParticipante(Long idParticipante);    
   
}