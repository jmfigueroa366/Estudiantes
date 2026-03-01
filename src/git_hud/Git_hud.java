/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_hud;

/**
 *
 * @author jesus
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Git_hud {
    private static ArrayList<Asignatura> asignatura = new ArrayList <> ();
    private static ArrayList<Asignatura> asignaturaEstudiante = new ArrayList <> ();
    private static Scanner sc = new Scanner (System.in);
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
    
        @Override
    public String toString() {
        return "Codigo: " + codigo + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Semestre: " semestre;
    }
    
    private static void registrarAsignatura() {
        boolean registrarOtro = true;
        boolean isFind = true;
        
        Asignatura asignaturaEncontrada = new Asignatura ();
        while(registrarOtro) {
            try {
                isFind=false;
                boolean asignaturaNoRegistrada=true;
                System.out.println("¿Desea registrar una asignatura? (S/N)");
                String tipo = sc.nextLine().toUpperCase();
                registrarOtro = tipo.equals("S");
                if(registrarOtro) {
                    System.out.println("Ingrese el codigo de la asignatura que desea registrar: ");
                    String codigo = sc.nextLine();
                    for (Asignatura as: asignatura) {
                        if (codigo.equals(as.codigo)) {
                            isFind=true;
                            asignaturaEncontrada=as;
                            break;
                        }
                    }
                    if(!isFind) {
                        System.out.println("La materia no existe");
                    } else {
                        System.out.println("Materia encontarda, codigo:" + asignaturaEncontrada.codigo + ", nombre: " + asignaturaEncontrada.nombre);
                        System.out.println("¿Esta seguro que desea matricular esta asignatura? (S/N)");
                            String conf = sc.nextLine().toUpperCase();
                            boolean confirmar = conf.equals("S");
                            if (confirmar) {
                                for (Asignatura as: asignaturaEstudiante) {
                                    if (as.codigo.equals(asignaturaEncontrada.codigo)) {
                                        asignaturaNoRegistrada=false;
                                        System.out.println("Asignatura ya matruculada!!!");
                                        break;
                                    }
                                }
                                if (asignaturaNoRegistrada) {
                                    asignaturaEstudiante.add(asignaturaEncontrada);
                                    System.out.println("Asignatura registrada con exito!!!");
                                }
                            }
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        
    }
    

    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
