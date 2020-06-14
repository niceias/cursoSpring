package com.niceias.projeto.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.niceias.projeto.entidades.Usuario;
import com.niceias.projeto.repositorios.UsuarioRepositorio;

@Configuration
@Profile("test")
public class Testconfig implements CommandLineRunner  {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@Override
	public void run(String... args) throws Exception {
		 Usuario u1 = new Usuario(2L, "Pedro", "pedro@gmail.com", "8888888888", "123456");
		 Usuario u2 = new Usuario(3L, "Maria", "maria@gmail.com", "7777777777777", "12345");
	
		 usuarioRepositorio.saveAll(Arrays.asList(u1, u2));
	}	
	
}
