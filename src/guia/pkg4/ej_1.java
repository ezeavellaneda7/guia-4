/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package guia.pkg4;

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 nros enteros:");
        int a= leer.nextInt();
        int b= leer.nextInt();
       
        System.out.println("Seleccione su operacion 1:suma 2:resta 3:mult 4:div");
        int op=leer.nextInt();
        int sumar=suma(a,b), restar=resta(a,b), multr=mult(a,b);
        double  divr=div(a,b);
        switch(op){
            case 1:
                System.out.println("El resultado es : "+sumar);
                break;
            case 2:
                System.out.println("El resultado es: "+restar);
                break;
            case 3:
                System.out.println("El resultado es: "+multr);
                break;
            case 4:
                System.out.println("El resultado es: "+divr);
        }
                
            
    }
static public int suma (int a, int b){
  int  c=a+b;
   return c;
}
static public int resta(int a, int b){
    int c=a-b;
    return c;
}
static public int mult(int a, int b){
    int c=a*b;
    return c;
} 
static public double div(double a , double b){
    double c=a/b;
    return c;
}
}
