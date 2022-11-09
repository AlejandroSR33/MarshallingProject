package com.marshaller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "libros")
@XmlAccessorType (XmlAccessType.FIELD)

public class Libros {
    
    private List<Libro> libros = null;

    public Libros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void addLibros(Libro libro){
        this.libros.add(libro);
    }

    public int getSize() {
        return libros.size();
    }


    public Libros() {
        this.libros = new ArrayList<Libro>();
    }
}
