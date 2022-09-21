/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contduoc;

/**
 *
 * @author alber
 */
public class CargoEmpleado {
   //atributos
    private int codigoNumerico;
    private String tipo;
    
    //constructores

    public CargoEmpleado() {
    }

    public CargoEmpleado(int codigoNumerico, String tipo) {
        this.codigoNumerico = codigoNumerico;
        this.tipo = tipo;
    }
    
    
   //getters and setters
    public int getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(int codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
    
}
