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
public class Estudiante {
    
    // variables de instancia
    private double n1, n2, n3;
    
    // variables de clase
    private static final double P1=0.3;
    private static final double P2=0.3;
    private static final double P3=0.4;
    
    public static int nEstudiantes=0;
    
    // metodo constructor por defecto
    public Estudiante(){
        this(0,0,0);
    }
    
    //constructor sobrecargado
    public Estudiante(double n1, double n2, double n3){
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
        Estudiante.nEstudiantes++;
    }
    
    // metodos getter y setter
    
    public double getN1(){ return this.n1;}
    public double getN2(){ return this.n2;}
    public double getN3(){ return this.n3;}
    
    public void setN1(double n){this.n1=n;}
    public void setN2(double n){this.n2=n;}
    public void setN3(double n){this.n3=n;}
    
    // metodo miembro
    public double calcularDefinitiva(){
        double nFinal = this.n1 * Estudiante.P1 + this.n2*Estudiante.P2 + this.n3*Estudiante.P3;
        return nFinal;
    }
    
    
}
