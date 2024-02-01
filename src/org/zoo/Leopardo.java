package org.zoo;

public class Leopardo extends Felino{
    public Leopardo(int edad) {
        super("Leopardo",edad);
    }

    @Override
    public String sonido(){
        return "RAWR";
    }

    @Override
    public String sonido(int nivelSonido) {
        return null;
    }

    @Override
    public String sonido(double frecuencia) {
        return null;
    }
}