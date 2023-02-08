/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author MikeG
 */
public class Ahorcado {

    private String[] palabra;
    private String[] espaciosPalabra;
    private int letrasEncontradas;
    private int intentos;
    private String letrasIngresadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String[] espaciosPalabra, int letrasEncontradas, int intentos, String letrasIngresadas) {
        this.palabra = palabra;
        this.espaciosPalabra = espaciosPalabra;
        this.letrasEncontradas = letrasEncontradas;
        this.intentos = intentos;
        this.letrasIngresadas = letrasIngresadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getEspaciosPalabra() {
        return espaciosPalabra;
    }

    public void setEspaciosPalabra(String[] espaciosPalabra) {
        this.espaciosPalabra = espaciosPalabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getLetrasIngresadas() {
        return letrasIngresadas;
    }

    public void setLetrasIngresadas(String letrasIngresadas) {
        this.letrasIngresadas = letrasIngresadas;
    }
    
    
}
