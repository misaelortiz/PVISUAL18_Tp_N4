/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pto5.aplicacion.controlador.beans.forms;

import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import pto5.aplicacion.modelo.dominio.Profesor;

/**
 *
 * @author E. Misael Ortiz
 */
@ManagedBean
@ViewScoped

public class ProfesorFormBean {
    private Profesor profesor;
    

    public ProfesorFormBean(){
        profesor = new Profesor();
        
    }

    /**
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
public void guardar() {
        System.out.println("Se ejecuto");
         
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Exito","El profesor de registro correctamente"));
    }



public void validatorEmail(FacesContext context, UIComponent component, Object value) throws ValidatorException{
    Pattern pattern;
  
    String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    
    pattern = Pattern.compile(EMAIL_PATTERN);
       

        
        if(value == null) {
            return;
        }
         
        if(!pattern.matcher(value.toString()).matches()) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al Validar", 
                        value + "Email no valido;"));
        }
  }      
}

