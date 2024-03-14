package Persona;


import java.util.*;

/**
 * 
 */
public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    /**
     * @param dni 
     * @param nombre 
     * @param apellidos 
     * @param edad
     */
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }

    /**
     * Modifica el dni de la persona
     * @param dni
     */
    public void setDni(String dni) {
        this.dni=dni;
    }

    /**
     * @return
     */
    public String getDni() {
        return dni;
    }

    /**
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la persona
     * @param nombre
     */
    public void setNombre(String nombre) {
    	this.nombre=nombre;
    }

    /**
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Modifica los apellidos de la persona
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
    	this.apellidos=apellidos;
    }

    /**
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Modifica la edad de la persona
     * @param edad
     */
    public void setEdad(int edad) {
    	this.edad=edad;
    }

}