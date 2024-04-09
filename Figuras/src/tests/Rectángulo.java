package modelos;


import java.util.*;

/**
 * 
 */
public class Rectángulo {

    private int base;
    private int altura;

    /**
		Constructor por defecto. Base y altura valdran 1.
     */
    public Rectángulo() {
    	this.base=1;
    	this.altura=1;
    }
    
    /*
     * Constructor que recibe la base y altura
     * @param base
     * @param altura
     */
    public Rectángulo(int base, int altura) {
    	this.base=base;
    	this.altura=altura;
    }
    
    public int getBase() {
        // TODO implement here
        return this.base;
    }

   
    public void setBase(int base) {
        this.base=base;
    }

    /**
     * @return
     */
    public int getAltura(){
    	return this.altura;
    }
    public int getArea() {
        // TODO implement here
        return this.base*this.altura;
    }

    /**
     * @param int altura
     */
    public void setAltura(int altura) {
        this.altura=altura;
    }

    /**
     * @param return area
     */

    /**
     * @param return perimetro
     */
    public int CalcularPerimetro() {
        return 2*this.base+2*this.altura;
    }

}