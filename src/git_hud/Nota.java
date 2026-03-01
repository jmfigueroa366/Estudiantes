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
    // atributos temporales hasta que se cree la clase estudiante, luego se cambia//
    private String codigoEstudiante;
    private String nombre;
    private String apellido;
    private int edad;
    private int semestre;
    //
    Asignatura asignatura;
    private double valor;
    private int creditos;

    public Nota() {
    }

    public Nota(String codigoEstudiante, String nombre, String apellido, int edad, int semestre, Asignatura asignatura, double valor, int creditos) {
        this.codigoEstudiante = codigoEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.semestre = semestre;
        this.asignatura = asignatura;
        this.valor = valor;
        this.creditos = creditos;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
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
        return "Nota{" + "codigoEstudiante=" + codigoEstudiante + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", semestre=" + semestre + ", asignatura=" + asignatura + ", valor=" + valor + ", creditos=" + creditos + '}';
    }
    
    
    
    
}
