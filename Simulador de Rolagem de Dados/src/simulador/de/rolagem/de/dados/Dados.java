/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador.de.rolagem.de.dados;

/**
 *
 * @author Lucas
 */
public class Dados {
    public int lados;
    
    public Dados(int l) {
        lados = l;
    }
    
    public int girarDado(int l) {
        return (int) (Math.random() * l) + 1;
    }
    
    
}
