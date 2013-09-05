/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author Alejandrux
 */
public class Materia {
    
    private String nombre_materia;
    private String regimen;
    private Integer id_materia;
    private ArrayList<Alumno> alumno = new ArrayList();
    
    
    //getters and setters
    //nombre_materia
    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    //regimen
    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    //id_materia
    public Integer getId_materia() {
        return id_materia;
    }

    public void setId_materia(Integer id_materia) {
        this.id_materia = id_materia;
    }

    //alumnos
    public ArrayList<Alumno> getAlumno() {
        System.out.println(alumno);
        return alumno;
    }

    public void setAlumno(ArrayList<Alumno> alumno) {
        this.alumno = alumno;
    }

    
    
    //constructores
    public Materia(){
        
    }

    public Materia(String nombre_materia, String regimen, Integer id_materia, ArrayList<Alumno>alumno) {
        this.nombre_materia = nombre_materia;
        this.regimen = regimen;
        this.id_materia = id_materia;
        this.alumno = alumno;
    }
    
    //metodos
    public void mostrar_DatosMaterias(){
        
        System.out.printf("\n\nNombre de la Materia: %s",nombre_materia);
        System.out.printf("\nRégimen: %s", regimen);
        System.out.printf("\nId de la Materia: %d\n\n", id_materia);
    }

    public void lista_alumnos(ArrayList alumno){
        System.out.printf("\nListado de Alumnos: \n");
        for(Object Alumno: alumno){
            System.out.println(Alumno);
        }
    }
    
    
}
