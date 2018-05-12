/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto7.aplicacion.controlador.beans.form;

import pto7.aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped

public class LibroFormBeans implements Serializable{
    private Libro libro;
    private ArrayList <Libro> libros;
    /**
     * Creates a new instance of LibroFormBeans
     */
    public LibroFormBeans() {
        libro = new Libro();
        libros = new ArrayList<>();
        
    }


    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro (){
        libros.add(libro);
        libro = new Libro();
    }
    
    
    
}
