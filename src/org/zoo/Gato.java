package org.zoo;

public final class Gato extends Felino{

    private String nombreGato;
    public Gato( String nombreGato, int edad){
        super("Gato", edad);
        this.nombreGato = nombreGato;
    }

    public String getNombreGato() {
        return nombreGato;
    }

    public void setNombreGato(String nombreGato) {
        this.nombreGato = nombreGato;
    }

    @Override
    public String sonido(int nivelSonido) {
        return null;
    }

    @Override
    public String sonido(double frecuencia) {
        final int NIVEL_MAXIMO = 57000;
        return null;
    }

    @Override
    public String sonido() {
        return "Miauuuu";
    }

}
