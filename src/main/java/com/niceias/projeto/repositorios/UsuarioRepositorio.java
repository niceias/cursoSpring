package com.niceias.projeto.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niceias.projeto.entidades.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long  >  {

}
