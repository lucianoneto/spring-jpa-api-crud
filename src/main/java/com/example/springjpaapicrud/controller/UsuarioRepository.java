package com.example.springjpaapicrud.controller;

import com.example.springjpaapicrud.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
