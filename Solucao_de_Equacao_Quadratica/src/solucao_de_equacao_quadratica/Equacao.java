/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solucao_de_equacao_quadratica;

import java.util.Scanner;

public class Equacao {
     Scanner s = new Scanner(System.in);
    public double a = 1, b, c;
    
    public void Calcular(double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        double x1 = (-b + Math.sqrt(delta)) / (2 * a),
               x2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        Console.clearScreen();
        
        String titulo = " RESULTADOS! ", linha = "-";
        System.out.printf("%s%s%s\n",
                linha.repeat(10), titulo, linha.repeat(10));
        
        if (delta <= 0) {
            System.out.println("Delta = 0, impossível terminar o cálculo!");
            return;
        }
            
        else 
            System.out.printf(
            "Equação -> %.0fx² %s %.0fx %s %.0f = 0\n"
          + "X1 -> %.1f\n"
          + "X2 -> %.1f\n"
          + "DELTA -> %.1f\n"
          + "%s\n",
                a, 
                (b >= 0 ? "+" : "-"),   // troca de sinal se o valor for menor q zero
                Math.abs(b),            // pega o módulo do valor
                (c >= 0 ? "+" : "-"),   // merma coisa
                Math.abs(c),            // merma coisa 2
                x1, x2, delta,
                linha.repeat(33) // linha pra ficar bonitinho dps :)
        );
                    
        
        
                
}
}
