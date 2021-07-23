package com.insoftar.users.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotNull(message = "Los nombres no deben ser nulo")
    private String nombres;

    @NotBlank
    @NotNull(message = "Los apellidos no deben ser nulo")
    private String apellidos;

    @Column(nullable = false,unique = true)
    @NotNull(message = "La cedula no puede ser nulo")
    @Pattern(regexp = "[0-9]*", message = "La cedula debe contener numeros")
    private String cedula;

    @Column(nullable = false,unique = true)
    @NotNull(message = "El correo no puede ser nulo")
    @Email(message = "El email debe ser de tipo email")
    private String correo;

    @Size(min = 10, message = "El telefono debe contener minimo 10 caracteres")
    @Pattern(regexp = "[0-9]*", message = "El telefono debe contener numeros")
    private String telefono;

    public Usuario() {
    }

    public Usuario(Long id, String nombres, String apellidos, String cedula, String correo, String telefono) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cedula='" + cedula + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
