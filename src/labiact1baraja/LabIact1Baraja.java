/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labiact1baraja;

import java.util.List;

/**
 *
 * @author mgts
 */
public class LabIact1Baraja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Baraja baraja = new Baraja();
        
        baraja.barajar();
        System.out.println("Carta siguiente: " + baraja.siguienteCarta());
        
        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());
        
        List<Carta> cartasPedidas = baraja.darCartas(5);
        if (!cartasPedidas.isEmpty()) {
            System.out.println("Cartas pedidas:");
            for (Carta carta : cartasPedidas) {
                System.out.println(carta);
            }
        }
        
        baraja.cartasMonton();
        baraja.mostrarBaraja();  
    }
        
        
        
        
        
    }
    

