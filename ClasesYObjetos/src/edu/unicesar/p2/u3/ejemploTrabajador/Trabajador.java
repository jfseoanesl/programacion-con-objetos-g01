/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.u3.ejemploTrabajador;

/**
 * clase que calcula el sueldo de un trabajador con base en horas trabajadas
 * @author jairo
 * @version 17-09-2020
 */
public class Trabajador {
    
    //variable de instancia 
    private int nHorasTrabajadas;
    
    // variable de clase
    private static double tarifa = 50;
    
    // metodo constructor
    public Trabajador(){
        this.nHorasTrabajadas = 0;
    }
    
    // metodos getter
    public int getHorasTrabajadas(){
        return this.nHorasTrabajadas;
    }
    
    public static double getTarifa(){
        return Trabajador.tarifa;
    }
    
    // metodos setter
    public void setHorasTrabajadas(int n){
        this.nHorasTrabajadas = n;
    }
    
    public static void setTarifa(double t){
        Trabajador.tarifa = t;
    }
    
    // metodo miembro
    
    public double calcularSueldo(){
        return this.nHorasTrabajadas * Trabajador.tarifa;
    }
    
}
