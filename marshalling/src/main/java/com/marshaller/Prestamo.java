package com.marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "prestamo")
@XmlAccessorType (XmlAccessType.FIELD)

public class Prestamo {
    private String dniUsuario;
    private String nombreUsuaro;
    private String apellidoUsuario;
    
    public Prestamo() {
    }

    public Prestamo(String dniUsuario, String nombreUsuaro, String apellidoUsuario) {
        this.dniUsuario = dniUsuario;
        this.nombreUsuaro = nombreUsuaro;
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public String getNombreUsuaro() {
        return nombreUsuaro;
    }

    public void setNombreUsuaro(String nombreUsuaro) {
        this.nombreUsuaro = nombreUsuaro;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    @Override
    public String toString() {
        return "Prestamos [dniUsuario=" + dniUsuario + ", nombreUsuaro=" + nombreUsuaro + ", apellidoUsuario="
                + apellidoUsuario + "]";
    }
}
