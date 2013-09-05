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
public abstract class Persona {
    
    private String nombre;
    private String apellido;
    private String domicilio;
    private Date fecha_nacimiento;
    
    
    //getters and setters
    //nombre
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //domicilio
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    //fecha nacimeinto
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    //Constructores
    public Persona() {
    }

    public Persona(String nombre, String apellido, String domicilio, Date fecha_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
        
    
    //metodo abstracto
    abstract void asitencia_clases();
    
    
    //metodos
    public void mostrar_datosPersona(){
        System.out.printf("\n\n\nNombre: %s", nombre);
        System.out.printf("\nApellido: %s", apellido);
        System.out.printf("\nDomicilio: %s", domicilio);
        System.out.printf("\nFecha de Nacimiento: ", fecha_nacimiento);
    }
}
