/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_5guiapoo.Servicios;

import ej_5guiapoo.Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Daia
 */
public class CuentaServicios {

    public Cuenta altaCuenta() {
        Cuenta c1 = new Cuenta();

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());

        System.out.println("Ingrese Nombre del cliente");
        c1.setNombreCliente(leer.next());

        System.out.println("Ingrese D.N.I. del cliente");
        c1.setDniCliente(leer.nextInt());

        System.out.println("Ingrese el saldo actual de la cuenta");
        c1.setSaldoActual(leer.nextInt());
        return c1;
    }
}
