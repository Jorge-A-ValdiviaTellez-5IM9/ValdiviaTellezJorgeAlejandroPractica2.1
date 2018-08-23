/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ipn.cecyt9.customer;

/**
 *
 * @author Alumno
 */
public abstract class abstract1 {
    
    public String flash(boolean luz){
        String texto="";
        if (luz=true){
            texto="Disparo el flash";
        }
        else{
            texto="No flash";
        }
        return texto;
    }
    
    public String tomarFoto(boolean boton){
        String texto="";
        if (boton=true){
            texto="Tomar foto";
        }
        else{
            texto="";
        }
        return texto;
    }
    
       
    public abstract String ajustarISO(String foto);
    public abstract String verFoto(String mostrarfoto);

}
