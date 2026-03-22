package calculo.de.desclocamento.vertical;

import java.util.Scanner;

public class CalculoDeDesclocamentoVertical {

    /*

    Exercício 10: Cálculo de Deslocamento Vertical 
        Desenvolva um programa em Java que calcule o deslocamento vertical de um objeto 
        lançado para cima. O programa deve receber três valores double como argumentos de linha 
        de comando: x0 (posição inicial em metros), v0 (velocidade inicial em metros por segundo) 
        e t (tempo em segundos). 

    */
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("===== SEJA BEM-VINDO(A) =====\n"
                        + "Cálculo de Deslocamento Vertical de um Objeto lançado para cima...\n"
                        + "Entre com três valores: \n"
                        + "1° - Posição Inicial(metros) \n"
                        + "2° - Velocidade inicial(m/s) \n"
                        + "3° - Tempo(s)\n");
        
        System.out.print("Posição inicial(metros): ");
        double posInicial = s.nextDouble();
        
        System.out.print("Velocidade inicial(m/s): ");
        double velInicial = s.nextDouble();
        
        System.out.print("Tempo(s): ");
        double t = s.nextDouble();
        
        double g = 9.8;
        
        double deslocamento = posInicial + (velInicial * t) - (0.5 * g * t * t);
        
        System.out.println("\n===== RESULTADO =====");
        System.out.printf("Posição final: %.2f metros\n", deslocamento);
        System.out.println("=====================");
        
    }
    
}
