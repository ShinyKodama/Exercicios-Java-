/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distancia.a.origem;

/**
 *
 * @author Lucas
 */

import java.util.Scanner;

public class DistanciaAOrigem {

    /*
        Exercício 7: Distância à Origem 
            Desenvolva um programa em Java que calcule a distância de um ponto (x, y) até a origem 
            (0, 0) em um plano cartesiano. O programa deve receber as coordenadas x e y (valores 
            double) como argumentos de linha de comando e imprimir a distância calculada.
    */
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while (true) {
            clearScreen();
            System.out.print("1° Valor: ");
            double n1 = s.nextDouble();
            
            System.out.print("2° Valor: ");
            double n2 = s.nextDouble();
            
            System.out.println(" ====== RESULTADO ====== ");
            System.out.printf(" A distância entre os dois pontos é: %.2f\n", XYDistance(n1, n2));
            System.out.println(" ======================= ");
            
            System.out.print(" Pressione ENTER para voltar...");
            s.nextLine();
            s.nextLine();
            
            continue;
        }
    }
    
    public static double XYDistance(double x, double y) { return Math.sqrt((x * x) + (y * y)); }
    public static void clearScreen() { System.out.println("\n".repeat(60)); }
    
}
