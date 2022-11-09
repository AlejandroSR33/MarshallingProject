package com.marshaller;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Resenna {
    private String opiniones;
    private String ISBN;
    
    public Resenna(String opiniones, String iSBN) {
        this.opiniones = opiniones;
        ISBN = iSBN;
    }

    public Resenna() {
    }


    public String getOpiniones() {
        return opiniones;
    }

    public void setOpiniones(String opiniones) {
        this.opiniones = opiniones;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    @Override
    public String toString() {
        return "Resenas [opiniones=" + opiniones + ", ISBN=" + ISBN + "]";
    }

    
}
