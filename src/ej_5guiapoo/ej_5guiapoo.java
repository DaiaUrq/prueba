/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_5guiapoo;

import ej_5guiapoo.Entidades.Cuenta;
import ej_5guiapoo.Servicios.CuentaServicios;
import java.util.Scanner;

/**
 *
 * @author Daia
 */
public class  ej_5guiapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CuentaServicios cs = new CuentaServicios();
        
        Cuenta c1 = cs.altaCuenta();
        
        System.out.println("Ingrese el monto de dinero a ingresar");
        double ing = leer.nextDouble();
        c1.ingresar(ing);
        
        System.out.println("Ingrese el monto de dinero a retirar");
        double ret = leer.nextDouble();
        c1.retirar(ret);
        
        System.out.println("Ingrese el monto de dinero a extraer");
        int rap = leer.nextInt();
        c1.extraccionRapida(rap);
        
        c1.consultaDeSaldo(c1);
        
        System.out.println(c1);
    }
    
}
