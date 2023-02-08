/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Juego.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author MikeG
 */
public class Inicio {
    
    public static Ahorcado crearJuego() {

        Scanner leer = new Scanner(System.in);

        System.out.println("");
        System.out.println("Bienvenido! A jugar al Ahorcado!");
        System.out.println("********************************");

        System.out.println("Ingrese la palabra a adivinar, sin espacios.");
        String palabraUsuario = leer.next();

        System.out.println("Ingrese la cantidad de intentos deseados.");
        int intentos = leer.nextInt();

        String[] palabra = vectorPalabra(palabraUsuario);
        int letrasEncontradas = 0;

        String[] espaciosPalabra = new String[palabra.length];

        for (int i = 0; i < palabra.length; i++) {
            espaciosPalabra[i] = "__";
        }

        String letrasIngresadas = "";
        
        System.out.println("");
        System.out.println("    Que comienze el juego!!");
        System.out.println("********************************");

        return new Ahorcado(palabra, espaciosPalabra, letrasEncontradas, intentos, letrasIngresadas);
    }
    
    public static String[] vectorPalabra(String palabraUsuario) {

        palabraUsuario = palabraUsuario.toUpperCase();
        int n = palabraUsuario.length();
        String[] palabra = new String[n];

        for (int i = 0; i < n; i++) {
            palabra[i] = palabraUsuario.substring(i, (i + 1));
        }

        return palabra;
    }
    
}
