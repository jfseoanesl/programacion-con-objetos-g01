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
public class Rectangulo {
    
    /** definicion de atributos de instancia base
     */
    private double base;
    /** definicion de atributos de instancia altura
     */
    private double altura;
    
    // atributo de clase
    public static String color = "Azul";
    
    /** defino el metodo constructor */
    public Rectangulo(){
        this.base=5;
        this.altura=5;
    }
    
    // metodos getter base y altura
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    
    // metodos setter base y altura
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double a){
        this.altura = a;
    }
    
    
    //metodos miembros
    public double calcularArea(){
        return this.base * this.altura;
    }
    
    public double calcularPerimetro(){
        return 2*this.base + 2 * this.altura;
    }
    
}
