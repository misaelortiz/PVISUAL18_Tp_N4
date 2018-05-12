/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto7.modelo.dominio;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Libros {
    ArrayList<Integer> isbns;
    ArrayList<String> titulos;
    ArrayList<String> autores;
    ArrayList<Double> precios;

    public ArrayList<Integer> getIsbns() {
        return isbns;
    }

    public void setIsbns(ArrayList<Integer> isbns) {
        this.isbns = isbns;
    }

    public ArrayList<String> getTitulos() {
        return titulos;
    }

    public void setTitulos(ArrayList<String> titulos) {
        this.titulos = titulos;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    public ArrayList<Double> getPrecios() {
        return precios;
    }

    public void setPrecios(ArrayList<Double> precios) {
        this.precios = precios;
    }
    
    
    
    public void cargarIsbn(int isbn){
        isbns.add(isbn);
    }
    public void cargarTitulo(String titulo){
        titulos.add(titulo);
    }
    public void cargarAutor(String autor){
        autores.add(autor);
    }
    public void cargarPrecio(double precio){
        precios.add(precio);
    }
    public void busqueda (){
        
    }
}
