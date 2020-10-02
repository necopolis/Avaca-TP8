
package testcolegio;

import java.util.HashSet;

import java.util.Set;

/**
 *
 * @author MArio
 */
public class Alumno {
    //Atributos
    private int legajo;
    private String apellido;
    private String nombre;
    private Set <Materia> listaM;
    //Metodos
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.listaM=new HashSet<>();
    }
    public void agregarMateria(Materia materia){
        listaM.add(materia);
    }
    public int cantidadMaterias(){
    
        return listaM.size();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getListaM() {
        return listaM;
    }

    public void setListaM(Set<Materia> listaM) {
        this.listaM = listaM;
    }
    public void mostrar(){
        for(Materia it: this.getListaM()){
            it.mostrar();
        }
    }
    
}
