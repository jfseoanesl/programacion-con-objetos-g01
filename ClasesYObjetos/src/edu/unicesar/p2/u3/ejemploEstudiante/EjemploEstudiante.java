/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.u3.ejemploEstudiante;

/**
 *
 * @author jairo
 */
public class EjemploEstudiante {
    
    public static void main(String[] arg){
        
        Estudiante e = new Estudiante();
        e.setN1(5);
        e.setN2(3);
        e.setN3(2);
        
        Estudiante c = new Estudiante(5,3,2);
        
        System.out.println("Definitiva e: " + e.calcularDefinitiva());
        System.out.println("Definitiva c: " + c.calcularDefinitiva());
        System.out.println("Numero Estudiantes: " + Estudiante.nEstudiantes);
        
        double prom = (e.calcularDefinitiva() + c.calcularDefinitiva())/Estudiante.nEstudiantes;
        System.out.println("Promedio: " + prom);
        
    }
    
}
