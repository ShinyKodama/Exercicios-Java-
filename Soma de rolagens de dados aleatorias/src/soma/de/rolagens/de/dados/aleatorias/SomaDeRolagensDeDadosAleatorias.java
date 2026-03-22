/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soma.de.rolagens.de.dados.aleatorias;
import java.util.Scanner;
import java.util.Random;
public class SomaDeRolagensDeDadosAleatorias {
    /*
        Exercício 9: Soma de Rolagens de Dados Aleatórias 
            Crie um programa em Java que simule a rolagem de dois dados de seis lados. O programa 
            deve gerar dois números inteiros aleatórios entre 1 e 6 (inclusive) e imprimir a soma desses 
            dois números.
    */
    static Scanner s = new Scanner(System.in);
    static Random r = new Random();
    
    public static void main(String[] args) {
        int dado1 = java.util.concurrent.ThreadLocalRandom
                    .current()
                    .nextInt(1, 7),
                
            dado2 = java.util.concurrent.ThreadLocalRandom
                    .current()
                    .nextInt(1, 7),
                
            max = Math.max(dado1, dado2),
            min = Math.min(dado1, dado2),
                
            valor = java.util.concurrent.ThreadLocalRandom
                    .current()
                    .nextInt(min, max + 1);
        
        System.out.printf("A soma dos valores gerados\n"
                        + "aleatoriamente %d e %d resulta em:\n"
                        + "%d...", dado1, dado2, dado1 + dado2);
    }
    
}
