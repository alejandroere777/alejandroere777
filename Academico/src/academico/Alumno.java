/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

import java.sql.Date;

/**
 *
 * @author Alejandrux
 */
public class Alumno extends Persona {
    
    private Integer matricula;
    private Integer año_ingreso;

    //Getters abd setters
    //matricula
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    //año_ingreso
    public Integer getAño_ingreso() {
        return año_ingreso;
    }

    public void setAño_ingreso(Integer año_ingreso) {
        this.año_ingreso = año_ingreso;
    }
    
    
    //constructires
    public Alumno() {
    }

    public Alumno(Integer matricula, Integer año_ingreso) {
        this.matricula = matricula;
        this.año_ingreso = año_ingreso;
    }

    public Alumno(Integer matricula, Integer año_ingreso, String nombre, String apellido, String domicilio, Date fecha_nacimiento) {
        super(nombre, apellido, domicilio, fecha_nacimiento);
        this.matricula = matricula;
        this.año_ingreso = año_ingreso;
    }
    
    
    
    
    //metodo abstracto
    @Override
    void asitencia_clases() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    //metodos
    public void mostrar_datosAlumno(){
        System.out.printf("\nMatricula: %d", matricula);
        System.out.printf("\nAño de Ingreso: %d", año_ingreso);
    }
    
    
}
