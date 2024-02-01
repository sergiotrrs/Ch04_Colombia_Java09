package org.zoo;

import java.util.*;

public class AnimalTest {

    public static void main(String[] args) {

        // instanciar la clase Animal
//        Animal animalGenerico = new Animal("Animal Generico", "Animalus Genericus", 0);
//        Animal animalGenerio2 = new Animal();
//
//        animalGenerico.setNombreComun("Coco");
//        String nombreCientifico = animalGenerico.getNombreCientifico();
//        // Polimorfismo en tiempo de compilación
//        System.out.println( animalGenerico.comer("Croquetas") );
//        System.out.println( animalGenerico.comer("Beef", 1000) );

        Animal michifu = new Gato("Michifu", 2);
        Animal leopardo = new Leopardo(5);

        List<  Animal > arcaNoe = new ArrayList<>();
         arcaNoe.add( michifu );
         arcaNoe.add(leopardo);

        for(Animal animal : arcaNoe){
            System.out.println(  animal.sonido()  );
        }


    }

}
