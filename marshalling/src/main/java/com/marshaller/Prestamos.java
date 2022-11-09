package com.marshaller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "prestamos")
@XmlAccessorType (XmlAccessType.FIELD)

public class Prestamos{
    private List<Prestamo> prestamos = null;

    public Prestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void addPrestamos(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }

    public int getSize() {
        return prestamos.size();
    }


    public Prestamos() {
        this.prestamos = new ArrayList<Prestamo>();
    }
}