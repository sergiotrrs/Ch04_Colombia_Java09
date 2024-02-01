package org.zoo;
/**
 *  Las clases abstractas son clases que no se pueden instanciar.
 *  Estas clases se utilizan como modelos(plantillas) para
 *  crear subclases concretas que se puedan instanciar.
 *
 *  una clase abstracta se declara en la firma de la clase
 *  con la palabra reservada "abstract"
 *
 *  La clase abstracta puede contener métodos abstractos y
 *  métodos concretos.
 *
 *  Los métodos abstractos no tienen implementación. La implementación
 *  se debe realizar en las subclases concretas.
 *
 *  Las clases abstractas se recomienda utilizar para
 *  clases que estén estrechamente relacionadas ( is-A )
 */
public abstract class Animal {

    private String nombreComun;
    private String nombreCientifico;
    private double edad;

    public Animal(){
        this("Animal Común", "n/a", 1000);
    }

    public Animal(String nombreComun, String nombreCientifico, double edad) {
        this(2158.0);
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.edad = edad;

    }

    private Animal(int numSerie){
        // TODO agregar el numSerie al animal, ya sea de una DB o usando un atributo estático
        // código que solo será accesible por la misma clase
    }

    private Animal(double serie){
        this( (int)serie  );
    }

//    public Animal createAnimalGeneric(){
//        return new Animal();
//    }

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

    /**
     *  Un método abstracto no tiene implementación, solo
     *  la definción del método.
     *  Termina con punto y coma.
     *
     *  Si tienes un método abstracto, tienes la obligación
     *  de hacer tu clase abstracta.
     */    public abstract String sonido();
    public abstract String sonido(int nivelSonido);
    public abstract String sonido(double frecuencia);


} // Cierre de la clase


