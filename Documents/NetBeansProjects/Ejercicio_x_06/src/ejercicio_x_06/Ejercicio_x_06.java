/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_x_06;

import Juego.Ahorcado;

/**
 *
 * @author MikeG
 */
public class Ejercicio_x_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ahorcado X = Service.Inicio.crearJuego();
        
        Service.Metodos.juego(X);
        
    }
    
}
