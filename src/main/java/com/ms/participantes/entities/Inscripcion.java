package com.ms.participantes.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "inscripcion",
    uniqueConstraints = @UniqueConstraint(columnNames = {"idParticipante", "idEvento"}))
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long idParticipante;
    
    @Column(nullable = false)
    private Long idEvento;
 
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }

    
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