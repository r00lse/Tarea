/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ccuenta;

import java.util.List;

/**
 * Esta es la clase ccuenta que representa una abstracción de una cuenta
 * realiza varias operaciones sobre la cuenta
 * @author F javier mendez
 */
public class CCuenta {

    // Propiedades de la Clase Cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private String[] factura = {"seguro", "luz", "agua", "alquiler"};


    /* Constructor sin argumentos */

    /**
     *Constructor sin argumentos vacio
     */

    public CCuenta() {
    }

    // Constructor con parámetro para iniciar todas las propiedades de la clase

    /**
     *    Constructor con parámetro para iniciar todas las propiedades de la clase
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    // Método para asignar el nombre del titular de la cuenta

    /**
     * Método para asignar el nombre del titular de la cuenta
     * @param nom
     */
    public void setNombre(String nom) {
        nombre = nom;
    }

    // Método que me devuelve el nombre del titular

    /**
     * Método que me devuelve el nombre del titular
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    // Método que me devuelve el saldo disponible en cada momento

    /**
     * Método que me devuelve el saldo disponible en cada momento
     * @return
     */
    public double getEstado() {
        return saldo;
    }

    /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    /**
     * Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }


    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */

    /**
     *Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     * @param cantidad
     * @throws Exception
     */

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getEstado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    // Método que me devuelve el número de cuenta

    /**
     * Método que me devuelve el número de cuenta
     * @return
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método que me devuelve el cobro de la factura
     * recibe dos parámetros
     * @param tipo
     * @param cantidad
     */
    public void cobroFactura(String tipo,double cantidad){
        switch(tipo){
        
            case "alquiler":
                if (cantidad >0 && cantidad<=400)
                    this.saldo -=cantidad; //this.saldo = this.saldo-cantidad;
                break;
            case "luz":
                if (cantidad<=200)
                    this.saldo -=cantidad;
            case "agua":
                
                if (cantidad >0 && cantidad<=200)
                    this.saldo -=cantidad;
                break;
            case "seguro":
                if (cantidad >0 && cantidad<=125)
                    this.saldo -=cantidad;
                    
                
        }
    
    }
    
}
    
 
