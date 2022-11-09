package com.marshaller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "resenna")
@XmlAccessorType (XmlAccessType.FIELD)

public class Resennas {
    private List<Resenna> resennas = null;

    public Resennas(List<Resenna> resennas) {
        this.resennas = resennas;
    }

    public List<Resenna> getResennas() {
        return resennas;
    }

    public void setResennas(List<Resenna> resennas) {
        this.resennas = resennas;
    }

    public void addResennas(Resenna resenna){
        this.resennas.add(resenna);
    }

    public int getSize() {
        return resennas.size();
    }


    public Resennas() {
        this.resennas = new ArrayList<Resenna>();
    }
}
