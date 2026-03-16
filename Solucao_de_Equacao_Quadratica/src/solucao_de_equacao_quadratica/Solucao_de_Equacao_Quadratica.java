/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucao_de_equacao_quadratica;

import java.util.Scanner;

public class Solucao_de_Equacao_Quadratica {

    /*
    Exercício 2: Solução de Equação Quadrática 
        Crie um programa em Java que calcule as raízes de uma equação quadrática (ax² + bx + c 
        = 0). O programa deve receber os coeficientes b e c como argumentos de linha de comando 
        (assumindo a = 1 para simplificar) e imprimir as duas raízes reais da equação. Certifique-se 
        de lidar com o cálculo do discriminante.
    */
    static Equacao e = new Equacao();
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
      
        while (true) {
            Init();                  // Há um problema com acentuacoes e caracteres especiais, tentei fazer o que pude :p
            System.out.print("Deseja Sair? (S/N): ");
            String sair = s.nextLine().toLowerCase();
           
            if (sair.equals("s"))
                return;
           
            System.out.print("Pressione ENTER para voltar...");
            s.nextLine();
            continue;
        }
    }
    
    public static void Init() {
        Console.clearScreen();
        
        String titulo = " SEJA BEM-VINDO(A)! ", linha = "-";
        
        System.out.printf("%s%s%s\n",
                linha.repeat(10), titulo, linha.repeat(10));
        
        System.out.println("Hoje iremos calcular as raízes de uma\n"
                         + "Equação Quadrática! (ax² + bx + c = 0)\n\n"
                         + "Entre com os coeficientes B e C para\n"
                         + "realizar os cálculos... \n");
        System.out.println("Coeficiente A = 1");
        
        System.out.print("Coeficiente B: ");
        double b = s.nextDouble();
        
        System.out.print("Coeficiente C: ");
        double c = s.nextDouble();
        
        s.nextLine(); // Limpar a desgreta do buffer pq se n ninguem sai do programa
        
        e.Calcular(b, c);
    }
}

