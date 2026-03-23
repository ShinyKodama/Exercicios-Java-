/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordemcrescenteedecrescente;
import java.util.Scanner;
public class OrdemCrescenteEDecrescente {

/*
    Exercício 12: Verificador de Ordem Crescente ou Decrescente
        Crie um programa em Java que receba três valores double (x, y e z) como argumentos de
        linha de comando. O programa deve imprimir true se os valores estiverem estritamente em
        ordem crescente (x < y < z) ou estritamente em ordem decrescente (x > y > z). Caso
        contrário, deve imprimir false.
*/
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("entre o valor de x");
        double valorx = s.nextDouble(); 
        
        System.out.println("digite o valor de y");
        double valory = s.nextDouble();
        
        System.out.println("digite o valor de z");
        double valorz = s.nextDouble();  
        
        String skibidi = "";
        
        if ( valorx < valory && valory < valorz || valorx > valory && valorz > valory) {
             
            skibidi = "verdadeiro";
        
        
        } else {
            skibidi = "falso";
        }
        System.out.printf("%s",skibidi);
        
        System.out.println(" Aperte ENTER para voltar...");
            s.nextLine();
            s.nextLine();

    }   

    /*public static void Escreval(String texto) {
        System.out.println(texto);
    }*/
    
}
