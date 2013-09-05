/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transacciones;

import academico.Alumno;
import academico.Materia;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author Alejandrux
 */
public class InscribirAlumnos {
    
    public InscribirAlumnos(){
        
    }
            
    
    public void inscribir(){
        
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Materia materia1 = new Materia();
        ArrayList<Alumno> alumnos = new ArrayList();

        //cargamos alumnos
        alumno1.setNombre("Alejandro");
        alumno1.setApellido("Ramos");
        alumno1.setAño_ingreso(2007);
        alumno1.setDomicilio("Caseros Norte");
        alumno1.setMatricula(779);
        
        alumno1.mostrar_datosPersona();
        alumno1.mostrar_datosAlumno();

        alumno2.setNombre("Victor");
        alumno2.setApellido("Olas");
        alumno2.setAño_ingreso(2009);
        alumno2.setDomicilio("NoSeDondeVive");
        alumno2.setMatricula(888);
        
        alumno2.mostrar_datosPersona();
        alumno2.mostrar_datosAlumno();
        
        
        //cargamos materias y le asignamos alumnos      
        materia1.setNombre_materia("Programacion II");
        materia1.setRegimen("Cuatrimestral");
        materia1.setId_materia(1020);
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        
        materia1.setAlumno(alumnos);
        
        materia1.mostrar_DatosMaterias();
        
        materia1.lista_alumnos(alumnos);
        
        
    }
    
    
}
