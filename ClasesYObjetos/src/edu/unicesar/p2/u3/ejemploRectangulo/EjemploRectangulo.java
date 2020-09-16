/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.u3.ejemploRectangulo;

/**
 *
 * @author jairo
 */
public class EjemploRectangulo {
    
    public static void main(String[] arg){
        
        // crea objeto rectangulo a
        Rectangulo a = new Rectangulo();
        a.setBase(10);
        a.setAltura(7);
        imprimirRectangulo(a);
        
        // crea objeto rectangulo b
        Rectangulo b = new Rectangulo(20,20);
        imprimirRectangulo(b);
       
        // crear rectangulo C
        Rectangulo c = new Rectangulo(25);
        imprimirRectangulo(c);
        
    }
    
    public static void imprimirRectangulo(Rectangulo r){
        System.out.println("Para base = " + r.getBase());
        System.out.println("Para altura= " + r.getAltura());
        System.out.println("Color = " + Rectangulo.color);    
        System.out.println("Area a: " + r.calcularArea());
        System.out.println("Perimetro a: " + r.calcularPerimetro()); 
    }
}
