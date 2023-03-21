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
public class ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nro ");
        float nro = leer.nextFloat();
        
     primo(nro);   
        System.out.println(primo(nro));
    }
  public static boolean primo(float num) {
        if (num % 2 == 0 && num!=2) return false;
        for (int i = 3; i < num; i+=2) {
            if(num%i==0)
                return false;
        }
        if (num == 0 || num == 1 || num == 4) {
    return false;
        }
        return true;
    }
}
    

