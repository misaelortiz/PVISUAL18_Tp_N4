/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto6.aplicacion.controlador.beans.form;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pto6.aplicacion.modelo.dominio.Coche;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class CocheFormBean {
    Coche coche;
    ArrayList <Coche> listaCoches = new ArrayList<Coche>();
    
    public CocheFormBean() {
        coche = new Coche();
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public ArrayList<Coche> getListaCoches() {
        return listaCoches;
    }

    public void setListaCoches(ArrayList<Coche> listaCoches) {
        this.listaCoches = listaCoches;
    }
    public void agregarCoche(){
        listaCoches.add(coche);
    }
    
}
