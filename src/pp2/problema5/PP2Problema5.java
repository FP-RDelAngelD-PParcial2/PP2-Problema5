/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema5;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        verificarPrimo();
    }
    public static int solicitarDatos(String d){ //Solicita datos
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
    public static void verificarPrimo(){
        int n = solicitarDatos("numero ");
            if(n % 2 == 0 && n!=2 || n == 1){            
                    System.out.print("El numero " + n + " no es primo");             
            }
            else{
        System.out.print("El numero " + n + " es primo");
            }
    }
}
