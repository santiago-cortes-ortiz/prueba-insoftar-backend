package com.insoftar.users.controller;

import com.insoftar.users.model.Usuario;
import com.insoftar.users.service.ServicioUsuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://localhost:4200/")
public class ControladorUsuario {

    private final ServicioUsuario servicioUsuario;

    public ControladorUsuario(ServicioUsuario servicioUsuario) {
        this.servicioUsuario = servicioUsuario;
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Usuario> guardarUsuario(@Valid @RequestBody Usuario usuarioNuevo){
        return new ResponseEntity<>(servicioUsuario.guardarUsuario(usuarioNuevo), HttpStatus.CREATED);
    }

    @PutMapping
    @ResponseBody
    public ResponseEntity<Usuario> actualizarUsuario(@Valid @RequestBody Usuario usuarioModificado){
        return new ResponseEntity<>(servicioUsuario.actualizarUsuario(usuarioModificado), HttpStatus.OK);
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Usuario>> listarUsuarios(){
        return new ResponseEntity<>(servicioUsuario.listarUsuarios(),HttpStatus.OK);
    }

}
