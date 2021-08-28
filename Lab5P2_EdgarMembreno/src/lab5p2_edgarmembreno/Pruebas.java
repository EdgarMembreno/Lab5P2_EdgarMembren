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
public class Pruebas {
    private String trabajo;
    private String cooperacion;
    private String participacion;
    private String nota;
    private int Evaluacion;

    public Pruebas() {
        
    }

    public Pruebas(String trabajo, String cooperacion, String participacion, String nota, int Evaluacion) {
        this.trabajo = trabajo;
        this.cooperacion = cooperacion;
        this.participacion = participacion;
        this.nota = nota;
        this.Evaluacion = Evaluacion;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getCooperacion() {
        return cooperacion;
    }

    public void setCooperacion(String cooperacion) {
        this.cooperacion = cooperacion;
    }

    public String getParticipacion() {
        return participacion;
    }

    public void setParticipacion(String participacion) {
        this.participacion = participacion;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getEvaluacion() {
        return Evaluacion;
    }

    public void setEvaluacion(int Evaluacion) {
        this.Evaluacion = Evaluacion;
    }

    @Override
    public String toString() {
        return "Pruebas{" + "trabajo=" + trabajo + ", cooperacion=" + cooperacion + ", participacion=" + participacion + ", nota=" + nota + ", Evaluacion=" + Evaluacion + '}';
    }

    

    

    
    
    
}
