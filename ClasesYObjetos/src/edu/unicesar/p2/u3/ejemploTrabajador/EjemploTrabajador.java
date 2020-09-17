/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.u3.ejemploTrabajador;

/**
 *
 * @author jairo
 */
public class EjemploTrabajador {
    
    public static void main(String[] arg){
        
        Trabajador t = new Trabajador();
        t.setHorasTrabajadas(20);
        imprimirTrabajador(t);
        
        Trabajador t2 = new Trabajador();
        t2.setHorasTrabajadas(30);
        imprimirTrabajador(t2);
        
        Trabajador.setTarifa(100);
        imprimirTrabajador(t);
        imprimirTrabajador(t2);
        
    }
    
    public static void imprimirTrabajador(Trabajador t){
        System.out.println("Horas Trabajadas: " + t.getHorasTrabajadas());
        System.out.println("Tarifa: " + Trabajador.getTarifa());
        System.out.println("Sueldo trabajador: " + t.calcularSueldo());
    }
}
