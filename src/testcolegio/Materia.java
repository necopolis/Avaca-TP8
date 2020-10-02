package testcolegio;

/**
 *
 * @author MArio
 */
public class Materia {
    //Atributos
    private String idMateria;
    private String nombre;
    private int anio;
    
    //Metodos
    public Materia(String idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }
    /*Si no modifico el equal en este ejemplo y como lo han dispuesto
       igualmente funciona pero se da porque justo los 2 punteros estan en el mismo objeto
        pero si pongo objetos distintos pero el id de la materia es igual es ingresado,
        por esa razon hay que modificar equals para que el id de la materia sea el
        el parametro a controlar y no solo el objeto
    */
    
    @Override
    public boolean equals(Object obj){
        if((obj instanceof Materia)&& !(obj==null)){
            Materia  aux=(Materia) obj;
            return this.idMateria.equalsIgnoreCase(idMateria);
        }
        else{
            return false;
        }
    }
    @Override
    public int hashCode(){
        return idMateria.hashCode();
    }
    
    public void mostrar(){
        System.out.println("--------------------------------****----------------------------------");
        System.out.println("Id materia: "+ this.idMateria);
        System.out.println("Materia: "+this.nombre);
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
        
}
