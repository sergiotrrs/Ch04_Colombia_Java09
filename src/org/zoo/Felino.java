package org.zoo;

public abstract class Felino extends Animal {

    public Felino (String nombreComun, int edad  ){
        super(nombreComun, "Felinus caninus", 0); // Creando la instancia de la clase superior
    }

    /**
     *  Sobreescritura de métodos (Override)
     *
     *  Para que un método sea sobreescrito, este debe tener la misma
     *  firma del método de la clase superior. La sobreescritura permite
     *  personalizar el comportamiento heredado.
     *
     *  @Override: Anotación que indica que el método está sobreescribiendo
     *  el comportamiento de una método de la clase heredada.
     *  Su propósito es hacer una validación en tiempo de
     *  compilación para asegurarse que la subclase está
     *  sobreescribiendo correctamente y coincide
     *  con la firma del método.
     *
     */
   @Override
    public final String comer() {
        return "El felino come y se lame las patas";
    }

    @Override
    public String sonido(){
        return "grrrrr";
    }
}
