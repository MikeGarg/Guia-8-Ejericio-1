/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entidad.Perro;

/**
 *
 * @author MikeG
 */
public class ServiceRazas {

    private Scanner scan;
    private List<Perro> razas;

    public ServiceRazas() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        this.razas = new ArrayList();
    }

    public Perro crearPerro() {
        System.out.println("Ingrese el nombre del Perro:");
        String nombre = scan.next();
        System.out.println("Ingrese la raza de un perro:");
        String raza = scan.next();

        return new Perro(nombre, raza);
    }

    public void ingresarPerros() {
        
        Perro aux = crearPerro();
        razas.add(aux);
        System.out.println("Desea Ingresar otro Perro? (s/n)");
        String seleccion = scan.next().toUpperCase();
        while (!seleccion.equals("S")||!seleccion.equals("N")){
            System.out.println("Ingrese una opción válida! (s/n)");
            seleccion = scan.next().toUpperCase();
        }
        switch (seleccion){
            case "S":
                ingresarPerros();
            case "N":
                break;
        }
    }

    public void mostrarPerros() {
        System.out.println("");
        System.out.println("Los Perros actuales de la Lista son:");

        for (Perro aux : razas) {
            System.out.println(aux);
        }
        System.out.println("");
        System.out.println("Se ingresaron " + razas.size() + " Perros en la Lista");

    }
    
    

}
