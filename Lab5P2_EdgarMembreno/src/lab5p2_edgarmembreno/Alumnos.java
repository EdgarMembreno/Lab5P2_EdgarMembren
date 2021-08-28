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
public class Alumnos extends Personas{
    private int cuenta;
    private String carrera;
    private int aCarrera;
    private int clases;

    public Alumnos() {
         super();
    }

    public Alumnos(int cuenta, String carrera, int aCarrera, int clases, String nombre, String apellido, String user, String pass) {
        super(nombre, apellido, user, pass);
        this.cuenta = cuenta;
        this.carrera = carrera;
        this.aCarrera = aCarrera;
        this.clases = clases;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getaCarrera() {
        return aCarrera;
    }

    public void setaCarrera(int aCarrera) {
        this.aCarrera = aCarrera;
    }

    public int getClases() {
        return clases;
    }

    public void setClases(int clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "cuenta=" + cuenta + ", carrera=" + carrera + ", aCarrera=" + aCarrera + ", clases=" + clases + '}';
    }

   
           
}
