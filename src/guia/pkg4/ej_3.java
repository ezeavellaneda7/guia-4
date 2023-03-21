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
public class ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float euros;
        String moneda = "";
        int cont=0;
        System.out.println("Ingrese la cantidad de euros a convertir");
        euros=leer.nextFloat();
        do { 
            System.out.println("Ingrese la moneda a la que desea convertir");
            moneda=leer.next();
            
            if (cont>=1 && !moneda.equals("libras") && !moneda.equals("dolares") &&!moneda.equals("yenes")){
                System.out.println("Error, ingrese nuevamente");
             break;   
            }
            cont= cont+1;
        } while (!moneda.equals("libras") && !moneda.equals("dolares") &&!moneda.equals("yenes")  );
            conver(moneda, euros);
        }
    public static void conver(String moneda, float euros){
           double convertir;
        switch (moneda) {
            case "libras":
                System.out.println(euros + " Euros. equivalen a :" + (convertir = euros* 0.86 ) + " libras");
                break;
            case "dolares":
                System.out.println(euros + " Euros. equivalen a :" + (convertir = euros * 1.28611) + " Dolares");
                break;
            case "yenes":
                System.out.println(euros + " Euros. equivalen a :" + (convertir = euros * 129.852) + " Yenes");
                break;
    }
        
    }
       
        
}


