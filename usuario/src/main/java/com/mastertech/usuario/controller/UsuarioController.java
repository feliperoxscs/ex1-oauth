package com.mastertech.usuario.controller;

import com.mastertech.usuario.security.Usuario;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {


    @GetMapping("/listar")
    public Usuario listarUsuario(@AuthenticationPrincipal Usuario usuario) {
        return usuario;
    }
}
