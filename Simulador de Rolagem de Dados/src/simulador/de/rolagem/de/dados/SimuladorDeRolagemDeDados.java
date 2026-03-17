/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulador.de.rolagem.de.dados;

import java.util.Scanner;

public class SimuladorDeRolagemDeDados {
    
    /*
    Exercício 4: Simulador de Rolagem de Dados 
        Desenvolva um programa em Java que simule a rolagem de dados com diferentes números 
        de lados. O programa deve ser capaz de rolar dados de 4, 6, 8, 10, 12 e 20 lados 
        individualmente. O usuário deve especificar o número de lados do dado como um 
        argumento de linha de comando, e o programa deve imprimir o resultado da rolagem. 
    */
    
    
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        while (true) {
            Console.clearScreen();
            String linha = "-", titulo = " SEJA BEM-VINDO(A)! ";
        
            System.out.printf("%s%s%s\n",
                    linha.repeat(10), titulo, linha.repeat(10));

            System.out.println("Temos vários dados, de lados: \n"
                             + "4 lados, 6 lados, 8 lados, 10 lados, 12 lados e 20 lados\n"
                             + "Escolha uma dessas opções...(4, 6, 8, 10, 12, 20)\n");

            System.out.print("Opção escolhida: ");
            int op = s.nextInt();

            Dados d = new Dados(op);

            Console.clearScreen();
            System.out.printf("Resultado da rolagem: %d\n", d.girarDado(op));
            
            System.out.print("Pressione ENTER para voltar...\n");
            s.nextLine(); s.nextLine();
            
            continue;
            
        }
        
    }
    
}
