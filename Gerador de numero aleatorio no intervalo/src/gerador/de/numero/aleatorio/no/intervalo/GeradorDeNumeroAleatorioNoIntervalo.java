/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerador.de.numero.aleatorio.no.intervalo;

/*
    Exercício 8: Gerador de Número Aleatório no Intervalo 
        Escreva um programa em Java que receba dois valores inteiros a e b como argumentos de 
        linha de comando. O programa deve gerar e imprimir um número inteiro aleatório que esteja 
        no intervalo fechado entre a e b (inclusive a e b).
*/
import java.util.Scanner;
import java.util.Random;

public class GeradorDeNumeroAleatorioNoIntervalo {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    
    public static void main(String[] args) {
        while (true) {
            cls();
            System.out.println("===== SEJA BEM-VINDO(A ===== ");
            System.out.println("Digite dois valores inteiros, e o programa\n"
                            +  "irá mostrar um número aleatório no intervalo\n"
                            +  "desses dois valores...\n");

            System.out.print("1° valor: ");
            int n1 = sc.nextInt();

            System.out.print("2° valor: ");
            int n2 = sc.nextInt();
            
            int n;
            
            try { 
                n = random.nextInt(n2 - n1 + 1) + n1;
            } 
            catch (Exception e) { 
                continue;
            }
           
            System.out.println("===== NUMERO SORTIDO ===== ");
            System.out.printf("Intervalo entre %d e %d\n", n1, n2);
            System.out.println(n);
            System.out.println("==========================");
            
            System.out.println("Pressione ENTER para voltar...");
            sc.nextLine(); 
            sc.nextLine();
            continue;
        }
        
        
    }
    
    public static void cls() {
        System.out.println("\n".repeat(60));
    }
    
}
