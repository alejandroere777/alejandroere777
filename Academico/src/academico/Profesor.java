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
public class Profesor extends Persona{
    private Date fecha_ingreso_cargo;
    private String cargo;
    private Materia[] materia;

    //getters and setters
    //fecga_ingreso_cargo
    public Date getFecha_ingreso_cargo() {
        return fecha_ingreso_cargo;
    }

    public void setFecha_ingreso_cargo(Date fecha_ingreso_cargo) {
        this.fecha_ingreso_cargo = fecha_ingreso_cargo;
    }

    //cargo
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    //materia
    public Materia[] getMateria() {
        return materia;
    }

    public void setMateria(Materia[] materia) {
        this.materia = materia;
    }
    
    
    //constructores
    public Profesor() {
    }

    public Profesor(Date fecha_ingreso_cargo, String cargo, Materia[] materia) {
        this.fecha_ingreso_cargo = fecha_ingreso_cargo;
        this.cargo = cargo;
        this.materia = materia;
    }

    public Profesor(Date fecha_ingreso_cargo, String cargo, Materia[] materia, String nombre, String apellido, String domicilio, Date fecha_nacimiento) {
        super(nombre, apellido, domicilio, fecha_nacimiento);
        this.fecha_ingreso_cargo = fecha_ingreso_cargo;
        this.cargo = cargo;
        this.materia = materia;
    }


    
    //metodo abstracto
    @Override
    void asitencia_clases() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //metodos
    public void mostrar_datosPofesor(){
        System.out.printf("\nFecha de Ingreso: ", fecha_ingreso_cargo);
        System.out.printf("\nCargo: %s", cargo);
        System.out.printf("\nMateria: ", (Materia[])materia);
    }
}
