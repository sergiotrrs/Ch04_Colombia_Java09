package org.zoo;

public class Animal {

    private String nombreComun;
    private String nombreCientifico;
    private double edad;

    public Animal(String nombreComun, String nombreCientifico, double edad) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.edad = edad;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    /**
     *  La sobrecarga de métodos se refiere a la capacidad
     *  de una clase de tener múltiples métodos con el
     *  mismo nombre, pero con diferentes listas de parámetros.
     *
     *  La sobrecarga de método se basa en la firma del método,
     *  que incluye el nombre del método y el tipo, orden
     *  y número de parámetros.
     *
     * @return
     */
    public String comer() {
        return "El animal come";
    }

    /**
     * Se tiene que incluir el alimento
     * @param alimento
     * @return
     */
    public String comer(String alimento) {
        return comer()+ " " +  alimento;
    }

    /**
     * Se verifica si está vivo
     * @param isAlive
     * @return
     */
    public String comer(boolean  isAlive) {
        if( isAlive ) {
            return comer();
        }
        else {
            return "El animal no puede comer";
        }
    }

    // Sobrecarga de método comer, incluir el alimento y gramaje
    public String comer (String alimento, float gramaje){
        float alimentoTotal = gramaje - 50.0f;
        return comer(alimento) + ", come " + gramaje + " gramos." ;
    }



} // Cierre de la clase


