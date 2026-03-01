/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package git_hud;

/**
 *
 * @author alvar
 */
public class Nota {
    private Estudiante estudiante;
    private Asignatura asignatura;
    private double valor;
    private int creditos;

    public Nota() {
    }

    public Nota(Estudiante estudiante, Asignatura asignatura, double valor, int creditos) {
        this.estudiante = estudiante;
        this.asignatura = asignatura;
        this.valor = valor;
        this.creditos = creditos;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Nota{" + "estudiante=" + estudiante + ", asignatura=" + asignatura + ", valor=" + valor + ", creditos=" + creditos + '}';
    }

   
}
