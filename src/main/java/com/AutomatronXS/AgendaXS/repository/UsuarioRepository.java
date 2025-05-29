package com.AutomatronXS.AgendaXS.repository;

import com.AutomatronXS.AgendaXS.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Aqui você pode colocar consultas personalizadas, se precisar


        Optional<Usuario> findByIdAndTitulo(Long id, String titulo);
}
