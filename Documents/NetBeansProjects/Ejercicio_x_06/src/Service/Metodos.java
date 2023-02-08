/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Juego.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MikeG
 */
public class Metodos {

    //**************************************************************************Juego Completo
    public static void juego(Ahorcado X) {

        intentos(X);
        longitud(X);

        String letra = ingresarLetra(X);

        encontradas(letra, X);

        cierre(X);

    }

    //**************************************************************************Intentos
    public static void intentos(Ahorcado X) {
        int intentos = X.getIntentos();
        System.out.println("------------------------------");
        System.out.println("Le queda/n " + intentos + " intento/s restante/s");
    }

    //**************************************************************************Longitud de Palabra
    public static void longitud(Ahorcado X) {
        String[] palabra = X.getPalabra();
        int largo = palabra.length;
        System.out.println("Longitud de la palabra: " + largo + " letras");
    }

    //**************************************************************************Ingresar Letra    
    public static String ingresarLetra(Ahorcado X) {

        Scanner leer = new Scanner(System.in);
        String letras = X.getLetrasIngresadas();
        String letra;

        do {
            System.out.println("Ingrese una letra");
            letra = leer.next();
            if (!(letra.length() == 1)) {
                System.out.println("Ingrese solo 1 caracter");
            }
        } while (!(letra.length() == 1));

        letra = letra.toUpperCase();

        if (letras.length() > 0) {
            for (int i = 0; i < letras.length(); i++) {
                if (letra.equals(letras.substring(i, (i + 1)))) {
                    System.out.println("La letra " + letra + " ya fue ingresada - Intente con otra letra");
                    System.out.println("|||");
                    letra = ingresarLetra(X);
                    break;
                }
            }
        }

        letras += letra;
        X.setLetrasIngresadas(letras);

        return letra;
    }

    //**************************************************************************Encuentra Letra en Palabra
    public static void encontradas(String letra, Ahorcado X) {

        String[] palabra = X.getPalabra();
        String[] espaciosPalabra = X.getEspaciosPalabra();
        int letrasEncontradas = X.getLetrasEncontradas();

        boolean buscar = false;

        for (String letraP : palabra) {
            if (!(letra.equals(letraP))) {
                buscar = false;
            } else {
                buscar = true;
                break;
            }
        }

        if (buscar == false) {
            System.out.println("La letra ingresada, NO se encuentra en la palabra");
        } else {
            System.out.println("La letra SI se encuentra en la palabra");
        }

        if (buscar == true) {
            for (int i = 0; i < palabra.length; i++) {
                if (letra.equals(palabra[i])) {

                    espaciosPalabra[i] = " " + letra + " ";
                    letrasEncontradas += 1;
                }
            }
        }
        System.out.print(Arrays.toString(espaciosPalabra));
        System.out.println("");
        System.out.println("");
        System.out.println("Ha encontrado " + letrasEncontradas + " letra/s. Le falta/n " + (palabra.length - letrasEncontradas + "!!"));
        System.out.println("");

        X.setEspaciosPalabra(espaciosPalabra);
        X.setLetrasEncontradas(letrasEncontradas);
    }

//******************************************************************************Cierre
    public static void cierre(Ahorcado X) {
        int intentos = X.getIntentos();
        int letrasEncontradas = X.getLetrasEncontradas();
        String[] palabra = X.getPalabra();

        if (letrasEncontradas == palabra.length) {
            System.out.println("Felicitaciones!! Ha Ganado el Juego!!");
            System.out.println(Arrays.toString(palabra));
        } else if (intentos == 1) {
            System.out.println("Ha Perdido! Se ha quedado sin intentos! Pruebe otra vez!");
        } else {
            intentos -= 1;
            X.setIntentos(intentos);
            juego(X);
        }

    }
    
}
