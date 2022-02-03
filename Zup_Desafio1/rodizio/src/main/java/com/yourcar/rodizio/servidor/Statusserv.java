package com.yourcar.rodizio.servidor;

import com.yourcar.rodizio.usuario.Usuarioval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/*import repositorio.Usuariorepositorio;*/

import java.util.List;

@RestController /*classe de controlador / resposta do servidor*/
public class Statusserv {



    @GetMapping(path = "/servidor/status")
    public String check() {
        return "online";
    }

    }

