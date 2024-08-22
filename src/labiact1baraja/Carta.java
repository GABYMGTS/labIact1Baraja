/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labiact1baraja;

/**
 *
 * @author mgts
 */
public class Carta {
    
    private int numero;
    private String palo;
    
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public String getPalo() {
        return palo;
    }
    
    @Override
    public String toString() {
        return numero + " de " + palo;
    }
    
}
