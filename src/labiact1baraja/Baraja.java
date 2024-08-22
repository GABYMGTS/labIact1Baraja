/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labiact1baraja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mgts
 */
public class Baraja {
    //ATRIBUTOS
    
    private List<Carta> cartas;
    private List<Carta> monton;
    
    
    //CONSTRUCTOR
    
    public Baraja() {
        crearBaraja();  //LLAMA AL METODO DE LA CLASE BARAJA
        monton = new ArrayList<>();
    }
    
    private void crearBaraja() {        //NO SE ACCEDE DESDE FUERA
        
        cartas = new ArrayList<>();
        
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        
        
        for (String palo : palos) {
            for (int numero : numeros) {
                cartas.add(new Carta(numero, palo));
            }
        }
    }
    
    public void barajar() {     
        //cambia de posición todas las cartas aleatoriamente
        Collections.shuffle(cartas);
    }
    
    public Carta siguienteCarta() {
        // devuelve la siguiente carta que está en la baraja, 
        //cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
        
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja");
            return null;
        } else {
            Carta siguiente = cartas.remove(0);
            monton.add(siguiente);
            return siguiente;
        }
    }
    
    public int cartasDisponibles() {
        // indica el número de cartas que aún se puede repartir.
        return cartas.size();
    }
    
    public List<Carta> darCartas(int cantidad) {
        //dado un número de cartas que nos pidan, le devolveremos ese número de cartas. 
        //En caso de que haya menos cartas que las pedidas, no devolveremos nada,
        //pero debemos indicárselo al usuario.
        
        List<Carta> cartasPedidas = new ArrayList<>();
        int disponibles = cartasDisponibles();//size
        
        if (disponibles == 0) {
            System.out.println("No hay más cartas en la baraja");
        } else if (cantidad > disponibles) {
            System.out.println("No hay suficientes cartas en la baraja. Se entregarán " + disponibles + " cartas.");
            cartasPedidas.addAll(cartas);
            cartas.clear();
        } else {
            for (int i = 0; i < cantidad; i++) {
                cartasPedidas.add(siguienteCarta());
            }
        }
        
        return cartasPedidas;
    }
    
    public void cartasMonton() {
        //mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
        if (monton.isEmpty()) {
            System.out.println("No ha salido ninguna carta todavía");
        } else {
            System.out.println("Cartas en el montón:");
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }
    }
    
    public void mostrarBaraja() {
        //muestra todas las cartas hasta el final. Es decir, mostrará las cartas que no se han sacado.
        if (cartas.isEmpty()) {
            System.out.println("No hay cartas en la baraja");
        } else {
            System.out.println("Cartas en la baraja:");
            for (Carta carta : cartas) {
                System.out.println(carta);
            }
        }
    }
}
