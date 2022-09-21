/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contduoc;

import java.util.Scanner;

/**
 *
 * @author Trinidad Gaete
 */
public class ContDuoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        Empleado empleado1 = new Empleado();
//        empleado1.datosEmpleado();
        Scanner scanner = new Scanner(System.in);
        CargoEmpleado ce = new CargoEmpleado();
        Empleado empleado1 = new Empleado();
        int opcion;
        
        //Saludo de bienvenida
        System.out.println("        BIENVENIDO A CONTDUOC       ");
        do {
            //Menú
            System.out.println("\n***MENU***");
            System.out.println("\n1.- Crear empleado. ");
            System.out.println("2.- Calcular sueldo líquido del empleado. ");
            System.out.println("3.- Salir. \n");
            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: //llamar a la creacion del empleado
                    
                    System.out.println("\nComplete los siguientes datos del nuevo empleado:");
                    System.out.println("\nPrimer nombre: ");
                    String nombres = scanner.next();
                    empleado1.setNombres(nombres);

                    System.out.println("Apellido paterno: ");
                    String apellidoPaterno = scanner.next();
                    empleado1.setApellidoPaterno(apellidoPaterno);

                    System.out.println("Apellido materno: ");
                    String apellidoMaterno = scanner.next();
                    empleado1.setApellidoMaterno(apellidoMaterno);

                    System.out.println("RUT sin digito verificador ej. 12345678: ");
                    int rut = scanner.nextInt();
                    empleado1.setRut(rut);

                    System.out.println("Dígito verificador: ");
                    String dv = scanner.next();
                    empleado1.setDv(dv.charAt(0));

                    System.out.println("Dia de nacimiento: ");
                    int dia = scanner.nextInt();
                    empleado1.setDiaNac(dia);

                    System.out.println("Mes de nacimiento: ");
                    int mes = scanner.nextInt();
                    empleado1.setMesNac(mes);

                    System.out.println("Año de nacimiento: ");
                    int annio = scanner.nextInt();
                    empleado1.setAnoNac(annio);

                    System.out.println("Dia de contratacion: ");
                    int dia1 = scanner.nextInt();
                    empleado1.setDiaCon(dia1);

                    System.out.println("Mes de contratacion: ");
                    int mes1 = scanner.nextInt();
                    empleado1.setMesCon(mes1);

                    System.out.println("Año de contratacion: ");
                    int annio1 = scanner.nextInt();
                    empleado1.setAnoCon(annio1);

                    //preguntar por el cargo asociado al empleado
                    
                    ce.setCodigoNumerico(1);
                    int op2;
                    do {
                        System.out.println("\nIngrese el tipo de cargo:");
                        System.out.println("1.- Ayudante Contador");
                        System.out.println("2.- Contador General");
                        System.out.println("3.- Contador Tributario");
                        System.out.println("4.- Personal Administrativo");
                        System.out.println("Ingrese una opción: ");
                        op2 = scanner.nextInt();
                        switch (op2) {
                            case 1:
                                ce.setTipo("Ayudante Contador");
                                break;
                            case 2:
                                ce.setTipo("Contador General");
                                break;
                            case 3:
                                ce.setTipo("Contador Tributario");
                                break;
                            case 4:
                                ce.setTipo("Personal Administrativo");
                                break;
                            default:
                                System.out.println("Debe ingresar una opción del 1 al 4");
                                break;
                        }
                    } while (op2 < 1 || op2 > 4);

                    break;
                
                //Calcular sueldo líquido    
                case 2:

                    int sueldo;
                    do {
                        System.out.println("Ingrese sueldo bruto: ");
                        sueldo = scanner.nextInt();
                    } while (sueldo <= 0);

                    int horas;
                    do {
                        System.out.println("Cantidad de horas trabajadas: ");
                        horas = scanner.nextInt();
                    } while (horas <= 0 || horas > 180);
                    
                    CalculosEmpleado calc = new CalculosEmpleado();
                    calc.CalculoDescuentoHoras(sueldo, horas);
                    calc.CalculoSueldoImponible(sueldo);
                    calc.CalculoDescuentoPrevisional();
                    calc.CalculoSueldoLiquido();
                    calc.MostrarInformacion(empleado1, ce, sueldo, horas);
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema");
                    break;

                default:
                    System.err.println("ERROR. Ingrese una opcion del 1 al 3.");
                    break;
            }

        } while (opcion != 3);

    }

}
