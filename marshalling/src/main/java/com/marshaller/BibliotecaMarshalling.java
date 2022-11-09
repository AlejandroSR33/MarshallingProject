package com.marshaller;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;;





public class BibliotecaMarshalling {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.addUsuario(new Usuario("hilo","Tete","52648596R",TipoUsuario.ADMIN));
        usuarios.addUsuario(new Usuario("halo","Tutu","63284755R",TipoUsuario.PROFESOR));

        Libros libros = new Libros();
        libros.addLibros(new Libro("9568632594756","Antonio","algo"));
        libros.addLibros(new Libro("6435928173164","Nose","Anaya"));

        Prestamos prestamos = new Prestamos();
        prestamos.addPrestamos(new Prestamo("126374", "Pepe", "Pepe"));
        prestamos.addPrestamos(new Prestamo("78374", "Pepillo", "Pepillo"));

        Resennas resennas = new Resennas();
        resennas.addResennas( new Resenna("Bien","45353"));
        resennas.addResennas(new Resenna("bien","345344"));

        Biblioteca bibli = new Biblioteca(usuarios, prestamos, resennas, libros);

        marshallerXML(bibli);

        marshallerJSON(bibli);

    }

    private static void marshallerXML(Biblioteca bibli) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(bibli.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(bibli, new File("biblioteca.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(BibliotecaMarshalling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void marshallerJSON(Biblioteca bibli) {
        Gson gson = new Gson();

        String json = gson.toJson(bibli);

        try (FileWriter writer = new FileWriter("biblioteca.json")) {
            gson.toJson(bibli, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}