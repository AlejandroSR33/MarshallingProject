package com.marshaller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Usuarios {
    private List<Usuario> usuarios = null;

    public Usuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public void addUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    public int getSize() {
        return usuarios.size();
    }

    public Usuarios() {
        this.usuarios = new ArrayList<Usuario>();
    }

}
