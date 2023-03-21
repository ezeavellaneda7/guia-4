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
public class ejprac_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una palabra o frase");
        cambiarLetras(leer.next());
    }

    public static void cambiarLetras(String palabra) {
        //a = @ - e = # - i = $ - o = % - u = *
        String palabraAuxiliar = "";
        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.substring(i, i + 1)) {
                case "a":
                case "A":
                    palabraAuxiliar += "@";
                    break;
                case "e":
                case "E":
                    palabraAuxiliar += "#";
                    break;
                case "i":
                case "I":
                    palabraAuxiliar += "$";
                    break;
                case "o":
                case "O":
                    palabraAuxiliar += "%";
                    break;
                case "u":
                case "U":
                    palabraAuxiliar += "*";
                    break;
                default:
                    palabraAuxiliar += palabra.substring(i, i + 1);
            }
        }
        System.out.println("La palabra cambiada es: " + palabraAuxiliar);
    }
        
}
