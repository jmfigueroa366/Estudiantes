/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_hud;

/**
 *
 * @author jesus
 */
public class Git_hud {
    private String codigo;
    private String nombre;
    private String apellido;
    private int edad; 
    private int semestre;

    public Git_hud(String codigo, String nombre, String apellido, int edad, int semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.semestre = semestre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    

    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
