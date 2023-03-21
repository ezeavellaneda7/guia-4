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
public class ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       menorMayor();
    }

    public static void menorMayor() {
        Scanner read = new Scanner(System.in);
        int edad;
        String nombre, op = "";
        while (!op.equals("no")) {
            System.out.println("ingrese el nombre de la persona");
            nombre = read.next();
            System.out.println("ingrese su edad");
            edad = read.nextInt();
            System.out.print(nombre + " ");
            System.out.println(" ");
            if (edad >= 18) {
                System.out.println("es mayor de edad");

            } else {
                System.out.println("es menor de edad");
            }
            System.out.println("queres seguir ingresando info? ");
            op = read.next();
        }
    }
}

