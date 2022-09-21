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
public class CalculosEmpleado {
    //atributos
    private int descuentoHoras, sueldoImponible,descuentosPrevisionales,sueldoLiquido;
    
    
    //metodos constructores
    public CalculosEmpleado() {
    }

    public CalculosEmpleado(int descuentoHoras, int sueldoImponible, int descuentosPrevisionales, int sueldoLiquido) {
        this.descuentoHoras = descuentoHoras;
        this.sueldoImponible = sueldoImponible;
        this.descuentosPrevisionales = descuentosPrevisionales;
        this.sueldoLiquido = sueldoLiquido;
    }

    //getters y setters
    public int getDescuentoHoras() {
        return descuentoHoras;
    }

    public void setDescuentoHoras(int descuentoHoras) {
        this.descuentoHoras = descuentoHoras;
    }

    public int getSueldoImponible() {
        return sueldoImponible;
    }

    public void setSueldoImponible(int sueldoImponible) {
        this.sueldoImponible = sueldoImponible;
    }

    public int getDescuentosPrevisionales() {
        return descuentosPrevisionales;
    }

    public void setDescuentosPrevisionales(int descuentosPrevisionales) {
        this.descuentosPrevisionales = descuentosPrevisionales;
    }

    public int getSueldoLiquido() {
        return sueldoLiquido;
    }

    public void setSueldoLiquido(int sueldoLiquido) {
        this.sueldoLiquido = sueldoLiquido;
    }
    
    //metodos solicitados
    public void CalculoDescuentoHoras(int sueldo, int horasTrabajadas){
        int horasNoTrabajadas = 180 - horasTrabajadas;
        this.descuentoHoras = (sueldo/180) * horasNoTrabajadas;
        
    }
    
    public void CalculoSueldoImponible(int sueldo){
        this.sueldoImponible = sueldo - this.descuentoHoras;
    }
    
    public void CalculoDescuentoPrevisional(){
        this.descuentosPrevisionales = (int) (this.sueldoImponible * 0.20);
    }
    
    public void CalculoSueldoLiquido(){
        this.sueldoLiquido = this.sueldoImponible - this.descuentosPrevisionales;
    }
    
    public void MostrarInformacion(Empleado emp, CargoEmpleado cargo, int sueldo, int horas){
        System.out.println("                           Datos Empleado                           \n");
        System.out.println("Nombre:                          " + emp.getNombres() + " " + emp.getApellidoPaterno() + " " + emp.getApellidoMaterno());
        System.out.println("Fecha de Nacimiento:             " + emp.getDiaNac()+ "/" + emp.getMesNac() + "/" + emp.getAnoNac()+"\n");
        System.out.println("                               Cargo                              \n");
        System.out.println("Nombre:                          " + cargo.getTipo());
        System.out.println("Sueldo Bruto:                    " + sueldo);
        System.out.println("Horas Laborales Trabajadas:      " + horas);
        System.out.println("Descuento Horas No Trabajadas:   " + this.descuentoHoras);
        System.out.println("Sueldo Imponible:                " + this.sueldoImponible);
        System.out.println("Descuentos Previsionales:        " + this.descuentosPrevisionales);
        System.out.println("Sueldo Líquido:                  " + this.sueldoLiquido);
        
    }
    
}
