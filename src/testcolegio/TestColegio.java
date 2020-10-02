package testcolegio;

import java.util.Set;

/**
 *
 * @author MArio
 */
public class TestColegio {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Ingles 1 de primer año - 0120  //Matematicas de primer año - 0130
        //Laboratorio 1 de primer año - 0140
        Materia m1= new Materia("0120", "Ingles",1);
        Materia m2= new Materia("0130", "Matematica",1);
        Materia m3= new Materia("0140", "Laboratorio",1);
                    //Repetidos especiales
                    //distinto nombre, pero = id
            //Materia m4= new Materia("0120", "Probemos",1);
                     //distinto id = nombre
            //Materia m5= new Materia("0150", "Laboratorio",1);
        Alumno a1=new Alumno(1001, "Lopez", "Martin");
        Alumno a2=new Alumno(1002, "Martinez", "Brenda");
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        a2.agregarMateria(m3);
                //probando ingresar repetidos especiales
        //a2.agregarMateria(m4);
        //a2.agregarMateria(m5);
        System.out.println("La cantidad de materias de "+ a1.getApellido()+" es: "+ a1.cantidadMaterias());
        a1.mostrar();
        System.out.println("---------------------*****-------------------");
        System.out.println("La cantidad de materias de "+ a2.getApellido()+" es: "+ a2.cantidadMaterias());
        a2.mostrar();
    }   
    
}
