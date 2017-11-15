/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author LOGAN
 */
public class Mensaje {
    
    private boolean error;
    private String mensaje;

    public Mensaje(boolean error, String mensaje) {
        this.error = error;
        this.mensaje = mensaje;
    }
    
    public Mensaje(){
        
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

   
}
