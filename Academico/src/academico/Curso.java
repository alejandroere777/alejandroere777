/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

/**
 *
 * @author Alejandrux
 */
public class Curso {
    
    private String nombre_curso;
    private Integer año;
    private Materia[] materia;
    private Profesor profesor;
    
    //getters and setters
    //nombre_curso
    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    //año
    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    //materias
    public Materia[] getMateria() {
        return materia;
    }

    public void setMateria(Materia[] materia) {
        this.materia = materia;
    }

    //profesor
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    
    //Constructores
    public Curso(){
        
    }

    public Curso(String nombre_curso, Integer año, Materia[] materia, Profesor profesor) {
        this.nombre_curso = nombre_curso;
        this.año = año;
        this.materia = materia;
        this.profesor = profesor;
    }
    
    
    //metodos
    public void mostrar_cursos(){
        
        System.out.printf("\n\nNombre del Curso: %s", nombre_curso);
        System.out.printf("\nAño: %d", año);
   }
    
}
