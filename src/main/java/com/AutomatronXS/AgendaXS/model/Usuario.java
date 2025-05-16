package com.AutomatronXS.AgendaXS.model;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter

public class Usuario {


        private Long id;
        private String titulo;
        private String descricao;
        private LocalDate data;
        private String emocao; // alegria, tristeza, raiva...
        private boolean concluida;
        private List<String> respostasGeradas; // respostas da IA baseadas na emoção


    public Usuario() {
    }

    public Usuario(Long id, List<String> respostasGeradas, boolean concluida, String emocao, LocalDate data, String descricao, String titulo) {
        this.id = id;
        this.respostasGeradas = respostasGeradas;
        this.concluida = concluida;
        this.emocao = emocao;
        this.data = data;
        this.descricao = descricao;
        this.titulo = titulo;
    }

    // Métodos
        public void marcarComoConcluida() {
            this.concluida = true;
        }

        public String gerarResposta() {
            switch (emocao) {
                case "tristeza":
                    return "Não desanime! Vamos fazer isso juntos.";
                case "alegria":
                    return "Ótimo! Vamos aproveitar esse bom humor.";
                case "raiva":
                    return "Respira... depois voltamos a isso.";
                default:
                    return "Vamos seguir em frente com calma.";
            }
        }
    }

