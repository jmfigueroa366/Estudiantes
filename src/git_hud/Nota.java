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
    private String codigoAsignatura;
    private double valor;
    //
    private String codigo;
    private String nombre;
    private int creditos;
    private String docente;

    public Nota() {
    }

    public Nota(String codigoEstudiante, String codigoAsignatura, double valor, String codigo, String nombre, int creditos, String docente) {
        this.codigoEstudiante = codigoEstudiante;
        this.codigoAsignatura = codigoAsignatura;
        this.valor = valor;
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.docente = docente;
    }
    
    

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "Nota{" + "codigoEstudiante=" + codigoEstudiante + ", codigoAsignatura=" + codigoAsignatura + ", valor=" + valor + ", codigo=" + codigo + ", nombre=" + nombre + ", creditos=" + creditos + ", docente=" + docente + '}';
    }
    
    
}
