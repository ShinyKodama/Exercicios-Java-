/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculodesensacaotermica;

import java.util.Scanner;

public class CalculoDeSensacaoTermica {

/*
    Exercício 11: Cálculo de Sensação Térmica
        Escreva um programa em Java que calcule a sensação térmica (wind chill) com base na
        temperatura do ar e na velocidade do vento. O programa deve receber dois valores double
        como argumentos de linha de comando: t (temperatura em graus Celsius) e v (velocidade
        do vento em quilômetros por hora).
        Fórmula: A sensação térmica w é definida por:

        w = 13.12 + 0.6215t - 11.37v^0.16 + 0.3965tv^0.16

    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double temperatura = 0, velocidadeVento = 0;
        
        while (true) {
            clearScreen();
            System.out.println("===== SEJA BEM-VINDO(A) =====");
            System.out.println("CALCULO DE SENSACAO TERMICA...\n");
            System.out.println("Valores Utilizados: ");
            System.out.println("  Temperatura(Celcius);");
            System.out.println("  Velocidade do Vento(km/h). \n");
            
            try {
                System.out.print("Entre com a Temperatura(Celsius): ");
                temperatura = s.nextDouble();
                
                System.out.print("Entre com a Velocidade do Vento (km/h): ");
                velocidadeVento = s.nextDouble();
                
            } catch (Exception e) { System.out.println(e); }
            
            double sensacaoTermica = 13.12 + 0.6215 * temperatura - 11.37 * Math.pow(velocidadeVento, 0.16)
                   + 0.3965 * temperatura * Math.pow(velocidadeVento, 0.16);
            
            System.out.println("===== RESULTADO =====");
            System.out.printf("%.2f graus Celsius...\n", sensacaoTermica);
            System.out.println("=====================");
            
            System.out.println(" Aperte ENTER para voltar...");
            s.nextLine();
            s.nextLine();
            continue;
        }
    }
    
    public static void clearScreen(){
        System.out.println(" \n".repeat(50));
    }
    
}
