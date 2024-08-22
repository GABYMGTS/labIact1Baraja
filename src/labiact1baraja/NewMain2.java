/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labiact1baraja;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mgts
 */
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Baraja baraja = new Baraja();
        
        System.out.println("imprimo barajja 0km");
        
         baraja.mostrarBaraja(); 
        
        System.out.println( "quedan "+baraja.cartasDisponibles() +" cartas disponibles");
        
        baraja.barajar();
        
         System.out.println("imprimo barajja MEZCLADA");
        
         baraja.mostrarBaraja(); 
         
         
         Scanner lectura = new Scanner (System.in);

System.out.println("Ingrese su nombre: ");

String nombre = lectura.next();

System.out.println("ok "+nombre+ ", ¿cuántas cartas querés? ");

int pedidas = lectura.nextInt();

List<Carta> cartasPedidas = baraja.darCartas(pedidas);
        if (!cartasPedidas.isEmpty()) {
            System.out.println("Cartas pedidas:");
            for (Carta carta : cartasPedidas) {
                System.out.println(carta);
            }

 


        
        
        
      
    }}}