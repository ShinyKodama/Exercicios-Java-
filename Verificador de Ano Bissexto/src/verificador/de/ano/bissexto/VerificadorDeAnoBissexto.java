/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificador.de.ano.bissexto;

import java.util.Scanner;

public class VerificadorDeAnoBissexto {

    /*
    Exercício 3: Verificador de Ano Bissexto 
        Escreva um programa em Java que determine se um ano fornecido é um ano bissexto. O 
        programa deve receber um ano como argumento de linha de comando e imprimir true se for 
        um ano bissexto e false caso contrário. 
        Regras para Ano Bissexto: 
        ● Um ano é bissexto se for divisível por 4. 
        ● No entanto, se for divisível por 100, não é um ano bissexto, a menos que... 
        ● ...seja divisível por 400. Neste caso, é um ano bissexto.
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while (true) {
            clearScreen();
            int ano;
        
            System.out.print("Entre com um ano: ");
            ano = s.nextInt();

            if (anoBissexto(ano))
                System.out.printf("O ano %d é bissexto!", ano);
            else
                System.out.printf("O ano %d não é bissexto!", ano);
            
            System.out.print(" Aperte ENTER para voltar! ");
            s.nextLine();
            s.nextLine();
            continue;
        }
    }
    
    public static void clearScreen() {
        System.out.println("\n".repeat(60)); // N tem função de limpar tela nessa joça >:(
    }
    
    public static boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
    }
}
