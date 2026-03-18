/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desigualdade.triangular;
import java.util.Scanner;

/*
    Exercício 6: Desigualdade Triangular 
        Crie um programa em Java que receba três números inteiros positivos como argumentos de 
        linha de comando. O programa deve imprimir true se esses três números puderem ser os 
        comprimentos dos lados de um triângulo (ou seja, a soma de quaisquer dois lados deve ser 
        maior que o terceiro lado). Caso contrário, deve imprimir false.
*/

public class DesigualdadeTriangular {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            clearScreen();
            double l1, l2, l3;
        
            System.out.print("1° Lado: ");
            l1 = s.nextDouble();

            System.out.print("2° Lado: ");
            l2 = s.nextDouble();

            System.out.print("3° Lado: ");
            l3 = s.nextDouble();

            System.out.println("===== RESULTADO =====");
            System.out.println(isTriangle(l1, l2, l3));
            System.out.println("=====================");
            
            System.out.println("Aperte ENTER para voltar...");
            
            s.nextLine();
            s.nextLine();
            continue;
        }        
    }
    
    public static void clearScreen() {
        System.out.println("\n".repeat(60)); // N tem função de limpar tela nessa joça >:(
    }
    
    public static boolean isTriangle(double a, double b, double c) { 
        return a + b > c &&
               b + c > a &&
               c + a > b; 
    }
    
}
