/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_5guiapoo.Entidades;

/**
 * s
 *
 * @author Daia
 */
public class Cuenta {

    private int numeroCuenta;
    private String nombreCliente;
    private int dniCliente;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, String nombreCliente, int dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double ingresar(double ingreso) {
        if (ingreso > 0) {
             System.out.println("Ingreso correcto");
            saldoActual += ingreso;
        }
        return saldoActual;
    }

    public double retirar(double retiro) {
        if (saldoActual >= retiro) {
            saldoActual -= retiro;
        } else {
            System.out.println("Esta operacion no se puede realizar");
            saldoActual = 0;
        }
        return saldoActual;
    }

    public double extraccionRapida(int retiro) {
        if (retiro <= (saldoActual * 0.2)) {
            saldoActual -= retiro;
        } else {
            System.out.println("Esta operacion no se puede realizar");
        }
        return saldoActual;
    }

    public void consultaDeSaldo(Cuenta c1) {
        System.out.println("El saldo actual es: " + c1.getSaldoActual());
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", nombreCliente=" + nombreCliente + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + '}';
    }

}
