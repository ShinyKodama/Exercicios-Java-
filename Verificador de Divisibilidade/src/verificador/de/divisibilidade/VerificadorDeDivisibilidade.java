/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificador.de.divisibilidade;

import java.util.Scanner;

public class VerificadorDeDivisibilidade {
    /*
    
    Exercício 5: Verificador de Divisibilidade 
        Escreva um programa em Java que receba dois números inteiros positivos como 
        argumentos de linha de comando. O programa deve imprimir true se um dos números dividir 
        o outro exatamente (ou seja, o resto da divisão for zero), e false caso contrário. 
    
    */
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("1° Valor: ");
        int v1 = s.nextInt();
        
        System.out.print("2° Valor: ");
        int v2 = s.nextInt();
        
        
        System.out.println(restoZero(v1, v2));
    }
    
    public static boolean restoZero(int v1, int v2) { 
        if (v2 == 0 || v1 == 0)
           return false;
        
        return v1 % v2 == 0 || v2 % v1 == 0;
    }
    
}
