/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto7.aplicacion.controlador.form.bean;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pto7.modelo.dominio.Libros;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class LibreriaFormBean implements Serializable{
    int isbn;
    String titulo;
    String autor;
    double precio;
    Libros libro = new Libros();
    
    public LibreriaFormBean() {
        
    }

    public Libros getLibro() {
        return libro;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }

    

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void cargarLibro(){
        libro.cargarIsbn(isbn);
        libro.cargarTitulo(titulo);
        libro.cargarAutor(autor);
        libro.cargarPrecio(precio);
    }
    
}
