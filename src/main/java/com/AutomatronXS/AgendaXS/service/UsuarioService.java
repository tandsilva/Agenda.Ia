package com.AutomatronXS.AgendaXS.service;

import com.AutomatronXS.AgendaXS.model.Usuario;
import com.AutomatronXS.AgendaXS.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository ;
    public Usuario criarUsuario(String titulo) {
        Usuario usuario = new Usuario();
        usuario.setTitulo(titulo);

        return usuarioRepository.save(usuario);
    }
    public void processarResposta(long usuarioID){
        Usuario usuario = usuarioRepository.findById(usuarioID)
                .orElseThrow(()-> new RuntimeException("Usuario nao encontrado"));

        String resposta  = usuario.gerarResposta();
        usuario.getRespostasGeradas().add(resposta);



    }







}
