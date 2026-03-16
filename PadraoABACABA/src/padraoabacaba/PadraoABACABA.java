/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padraoabacaba;

/**
 *
 * @author Lucas
 */
public class PadraoABACABA {

  /*
    Desenvolva um programa em Java que imprima um padrão de régua binária, 
    também conhecido como padrão ABACABA. O programa deve gerar as primeiras quatro linhas do padrão,
    conforme o exemplo abaixo. Observe a estrutura recursiva do padrão, onde cada linha é 
    construída a partir da linha anterior.
    1 
    1 2 1 
    1 2 1 3 1 2 1
    1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
  */
    public static void main(String[] args) {
        String row = "1";
        
        for (int i = 1; i <= 4; i++) {
            System.out.println(row);
            
            if (i < 4)
                row = row + " " + ( i + 1 ) + " " + row;
        }
    } // dificil pra caceta esse ;-;
    
}
