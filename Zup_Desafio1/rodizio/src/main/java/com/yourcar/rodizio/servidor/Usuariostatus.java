//package com.yourcar.rodizio.servidor;//package com.yourcar.rodizio.servidor;
////
////import com.yourcar.rodizio.usuario.Usuarioval;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.http.ResponseEntity;
////import org.springframework.stereotype.Repository;
////import org.springframework.web.bind.annotation.*;
////import repositorio.Usuariorepositorio;
////
////import java.util.List;
////
////@RestController
////@RequestMapping("/servidor/usuario")
////public class Usuariostatus {
////
////    @Autowired
////    private  repositorio.Usuariorepositorio usuariorepositorio;
////
////    @GetMapping
////    public List<Usuarioval> listar() {
////        return (List<Usuarioval>) usuariorepositorio.findAll();
////    }
////
////        }
//
//import com.yourcar.rodizio.repositorio.Usuariorepositorio;
//import com.yourcar.rodizio.usuario.Usuarioval;
//import org.hibernate.annotations.NotFound;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.server.DelegatingServerHttpResponse;
//import org.springframework.web.bind.annotation.*;
//
//
//import java.util.List;
//
//@RestController
//    @RequestMapping("/servidor/usuario")
//    @ResponseStatus(HttpStatus.OK)
//    public class Usuariostatus {
//
//    @Autowired //neste momento estamos atribuindo funcoees ao repositorio, se deixarmos sem o autowired o programa retornaria null
//    private Usuariorepositorio usuariorepositorio;
//
//    @GetMapping
//    public List<Usuarioval> listar() {
//        return usuariorepositorio.findAll();
//
//    }
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public  Usuarioval adicionar(@RequestBody  Usuarioval usuarioval){ //Request Body converte corpo da requisicao para objeto cliente no caso.
//        return usuariorepositorio.save(usuarioval);
//    }
//    }
//
//
//
//
//
