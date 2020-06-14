package com.niceias.projeto.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niceias.projeto.entidades.Usuario;

@RestController
@RequestMapping(value="/usuarios")
public class Usuariorecursos {

	@GetMapping
	public ResponseEntity<Usuario> findAll(){
	    Usuario u = new Usuario(1l, "Maria", "maria@gmail.com", "99999999", "12345");
	    return ResponseEntity.ok().body(u);
	}
	
	
}
