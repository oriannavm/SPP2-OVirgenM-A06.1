/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.ovirgenm.a06.pkg1;

import java.util.Scanner;

/**
 *
 * @author Orianna
 */
public class SPP2OVirgenMA061 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner kb = new Scanner(System.in);
    int suma=0, numeros;
    numeros = SolicitarDatos();
    while(numeros>0){
        suma = CalcularSuma(numeros,suma);
        numeros=SolicitarDatos();
    }
    System.out.println("El resultado es"+suma);
    }
    static int SolicitarDatos(){
        Scanner kb = new Scanner(System.in);
        int numeros;
        System.out.println("Introduce un numero entero");
        try{
            numeros = kb.nextInt();
        }catch(Exception ex){
            System.out.println("El numero no es un entero");
            return 0;
        }
        return numeros;
    }
    static int CalcularSuma(int numeros , int suma){
        suma = suma+numeros;
        return suma;
    }
}