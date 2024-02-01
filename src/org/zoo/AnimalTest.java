package org.zoo;

public class AnimalTest {

    public static void main(String[] args) {

        // instanciar la clase Animal
        Animal animalGenerico = new Animal("Animal Generico", "Animalus Genericus", 0);
        Animal animalGenerio2 = new Animal()

        animalGenerico.setNombreComun("Coco");
        // Polimorfismo en tiempo de compilación
        System.out.println( animalGenerico.comer("Croquetas") );
        System.out.println( animalGenerico.comer("Beef", 1000) );

    }

}
