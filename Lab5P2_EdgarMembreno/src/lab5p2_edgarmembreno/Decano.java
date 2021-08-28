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
public class Decano extends Personas {
    private String pregrado;
    private int id;
    private int edad;
    private String titulo;
    private String maestria;

    public Decano() {
         super();
    }

    public Decano(String pregrado, int id, int edad, String titulo, String maestria, String nombre, String apellido, String user, String pass) {
        super(nombre, apellido, user, pass);
        this.pregrado = pregrado;
        this.id = id;
        this.edad = edad;
        this.titulo = titulo;
        this.maestria = maestria;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMaestria() {
        return maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
    }

    @Override
    public String toString() {
        return super.toString();
    }

  
   
    
}
