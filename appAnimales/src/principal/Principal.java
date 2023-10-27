/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import logica.*;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animales[] = new Animal[3];
        
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Gato();
        
        animales[0].setEdad(2);
        animales[0].setNombre("Garfierld");
        animales[0].setPeso(7);
        
        animales[1].setEdad(3);
        animales[1].setNombre("Firulais");
        animales[1].setPeso(5);
        
        animales[2].setEdad(5);
        animales[2].setNombre("Manchas");
        animales[2].setPeso(6);
        
        for(int i= 0; i<3; i++){
            animales[i].alimentar();
            System.out.println(animales[i]);
        }
        
        
    }
    
}
