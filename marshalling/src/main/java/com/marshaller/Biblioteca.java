package com.marshaller;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "biblioteca")
@XmlAccessorType (XmlAccessType.FIELD)

public class Biblioteca {
    private Usuarios usuario;
    private Prestamos prestamo;
    private Resennas resenas;
    private Libros libros;
    
    public Biblioteca() {
    }

    public Biblioteca(Usuarios usuario, Prestamos prestamo, Resennas resenas, Libros libros) {
        this.usuario = usuario;
        this.prestamo = prestamo;
        this.resenas = resenas;
        this.libros = libros;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Prestamos getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamos prestamo) {
        this.prestamo = prestamo;
    }

    public Resennas getResenas() {
        return resenas;
    }

    public void setResenas(Resennas resenas) {
        this.resenas = resenas;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Biblioteca [usuario=" + usuario + ", prestamo=" + prestamo + ", resenas=" + resenas + ", libros="
                + libros + "]";
    }
    
}
