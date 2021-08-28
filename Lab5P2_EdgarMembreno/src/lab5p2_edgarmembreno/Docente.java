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
public class Docente extends Personas{
    private String pregrado;
    private String maestria;
    private int alumnos;
    private String clase;
    private String descripcion;

    public Docente() {
         super();
    }

    public Docente(String pregrado, String maestria, int alumnos, String clase, String descripcion, String nombre, String apellido, String user, String pass) {
        super(nombre, apellido, user, pass);
        this.pregrado = pregrado;
        this.maestria = maestria;
        this.alumnos = alumnos;
        this.clase = clase;
        this.descripcion = descripcion;
    }

    public String getPregrado() {
        return pregrado;
    }

    public void setPregrado(String pregrado) {
        this.pregrado = pregrado;
    }

    public String getMaestria() {
        return maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
