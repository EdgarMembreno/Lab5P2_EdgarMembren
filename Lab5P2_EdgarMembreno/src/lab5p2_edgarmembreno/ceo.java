/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_edgarmembreno;

/**
 *
 * @author edgarmembreno
 */
public class ceo extends Personas {

    private String pregrado;
    private int id;
    private int experencia;
    private int edad;

    public ceo() {
        super();
    }

    public ceo(String pregrado, int id, int experencia, int edad, String nombre, String apellido, String user, String pass) {
        super(nombre, apellido, user, pass);
        this.pregrado = pregrado;
        this.id = id;
        this.experencia = experencia;
        this.edad = edad;
    }

    

    public String getPregrado() {
        return pregrado;
    }

    public void setPregrado(String pregrado) {
        this.pregrado = pregrado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExperencia() {
        return experencia;
    }

    public void setExperencia(int experencia) {
        this.experencia = experencia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "ceo{" + "pregrado=" + pregrado + ", id=" + id + ", experencia=" + experencia + ", edad=" + edad + '}';
    }

    
    

   
    

}
