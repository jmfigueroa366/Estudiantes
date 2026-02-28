/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package git_hud;

/**
 *
 * @author alvar
 */
public class Asignatura {
    
    private String codigo;
    private String nombre;
    private int creditos;
    private String docente;

    public Asignatura() {
    }

    public Asignatura(String codigo, String nombre, int creditos, String docente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.docente = docente;
    }
}
