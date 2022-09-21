/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contduoc;

/**
 *
 * @author Trinidad Gaete
 */

import java.util.Scanner;
public class Empleado {
    
    //Atributos
    private String nombres, apellidoPaterno, apellidoMaterno;
    private int rut, diaNac, mesNac, anoNac, diaCon, mesCon, anoCon, tipoCargo;
    private char dv;
    
    //Constructor

    public Empleado() {
    }

    public Empleado(String nombres, String apellidoPaterno, 
            String apellidoMaterno, int rut, int diaNac, int mesNac, int anoNac,
            int diaCon, int mesCon, int anoCon, int tipoCargo, char dv) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rut = rut;
        this.diaNac = diaNac;
        this.mesNac = mesNac;
        this.anoNac = anoNac;
        this.diaCon = diaCon;
        this.mesCon = mesCon;
        this.anoCon = anoCon;
        this.tipoCargo = tipoCargo;
        this.dv = dv;
    }
    
    //Getters & Setters

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getDiaNac() {
        return diaNac;
    }

    public void setDiaNac(int diaNac) {
        this.diaNac = diaNac;
    }

    public int getMesNac() {
        return mesNac;
    }

    public void setMesNac(int mesNac) {
        this.mesNac = mesNac;
    }

    public int getAnoNac() {
        return anoNac;
    }

    public void setAnoNac(int anoNac) {
        this.anoNac = anoNac;
    }

    public int getDiaCon() {
        return diaCon;
    }

    public void setDiaCon(int diaCon) {
        this.diaCon = diaCon;
    }

    public int getMesCon() {
        return mesCon;
    }

    public void setMesCon(int mesCon) {
        this.mesCon = mesCon;
    }

    public int getAnoCon() {
        return anoCon;
    }

    public void setAnoCon(int anoCon) {
        this.anoCon = anoCon;
    }

    public int getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(int tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }
    
    //Constructores
    
//    public void datosEmpleado(){
//        //Funcion para ingresar los datos personales de cada empleado
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Complete los siguientes datos del nuevo empleado:");
//        System.out.println("Nombres: ");
//        nombres = scanner.nextLine();
//        System.out.println("Apellido paterno: ");
//        apellidoPaterno = scanner.nextLine();
//        System.out.println("Apellido materno: ");
//        apellidoMaterno = scanner.nextLine();
//        System.out.println("RUT sin digito verificador ej. 12345678: ");
//        rut = scanner.nextInt();
//        System.out.println("Dígito verificador: ");
//        dv = scanner.next().charAt(dv);
//        //fecha de nacimiento, fecha de contratación, tipo de cargo
//
//        System.out.println("DATOS DEL EMPLEADO:");
//        System.out.println("Nombre completo: " + nombres + " " + apellidoPaterno
//                           + " " + apellidoMaterno);
//        System.out.println("RUT: "+ rut +"-"+ dv);
//        System.out.println("Confirme que los datos son los correctos:");
//        //Funcion para confirmar datos y retonar
//        //Agregar while para que pida el dato hasta que se ingrese correctamente
//        System.out.println("El empleado se ha registrado exitosamente.");
//    } 
}
