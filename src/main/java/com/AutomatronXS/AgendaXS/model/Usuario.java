package com.AutomatronXS.AgendaXS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDate data;
    private Sentimento emocao;
    private boolean concluida;
    private List<String> respostasGeradas;

    public Usuario() {
    }

    public Usuario(Long id, String titulo, String descricao, LocalDate data, boolean concluida, Sentimento emocao, List<String> respostasGeradas) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.concluida = concluida;
        this.emocao = emocao;
        this.respostasGeradas = respostasGeradas;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    public String gerarResposta() {
        switch (emocao) {
            case TRISTEZA:
                return "Não desanime! Vamos fazer isso juntos.";
            case ALEGRIA:
                return "Ótimo! Vamos aproveitar esse bom humor.";
            case RAIVA:
                return "Respira... depois voltamos a isso.";
            default:
                return "Vamos seguir em frente com calma.";
        }
    }
}
