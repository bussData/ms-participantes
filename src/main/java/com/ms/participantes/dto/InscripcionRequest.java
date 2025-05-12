package com.ms.participantes.dto;

public class InscripcionRequest{

    private Long idParticipante;
    private Long idEvento;

    public Long getIdParticipante(){
        return idParticipante;
    }

    public void setIdParticipante(Long idParticipante){
        this.idParticipante = idParticipante;
    }

    public Long getIdEvento(){
        return idEvento;
    }

    public void setIdEvento(Long idEvento){
        this.idEvento = idEvento;
    }
}