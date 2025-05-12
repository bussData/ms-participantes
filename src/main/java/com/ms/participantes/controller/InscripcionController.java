package com.ms.participantes.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.participantes.entities.Inscripcion;
import com.ms.participantes.service.InscripcionService;
import com.ms.participantes.dto.InscripcionRequest;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api2/inscripciones")
public class InscripcionController {
    private final InscripcionService inscripcionService;

    public InscripcionController(InscripcionService inscripcionService) {
        this.inscripcionService = inscripcionService;
    }

    //opcion para inscribir un participante a un evento
    @PostMapping
    public Inscripcion inscribir(@RequestBody InscripcionRequest request) {
        Long idParticipante = request.getIdParticipante();
        Long idEvento = request.getIdEvento();

        Inscripcion nueva = inscripcionService.inscribir(idParticipante, idEvento);
        return nueva;
    }

    //listamos todos las inscripciones por participante id
    @GetMapping("/{idParticipante}") 
    public ResponseEntity<List<Inscripcion>> obtenerInscripcionesPorParticipante(@PathVariable Long idParticipante){
        List<Inscripcion> listInscripciones = inscripcionService.obtenerInscripcionesPorParticipante(idParticipante);
        if (listInscripciones==null || listInscripciones.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listInscripciones);
    }
}
