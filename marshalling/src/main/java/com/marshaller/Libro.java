package com.marshaller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "libro")
@XmlAccessorType (XmlAccessType.FIELD)
public class Libro{
    private String ISBN;
    private String autor;
    private String editorial;
    
    public Libro() {
    }

    public Libro(String iSBN, String autor, String editorial) {
        ISBN = iSBN;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libros [ISBN=" + ISBN + ", autor=" + autor + ", editorial=" + editorial + "]";
    }
}