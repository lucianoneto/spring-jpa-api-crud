package com.example.springjpaapicrud.controller;

import com.example.springjpaapicrud.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;


   @PostMapping
    public void adicionar(@RequestBody Usuario usuario){
       usuarioRepository.save(usuario);
    }

    @GetMapping
    public List<Usuario> listar(){
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    @DeleteMapping("/id")
    public void deletar(@PathVariable Long id){
        usuarioRepository.deleteById(id);
    }

    @Transactional
    @PutMapping
    public void atualizar (@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
