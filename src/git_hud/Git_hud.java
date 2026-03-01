/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_hud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author jesus
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Git_hud {
    
    
    static BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
    private static Scanner sc = new Scanner (System.in);
    private static ArrayList<Asignatura> asignatura = new ArrayList <> ();
    static ArrayList<Estudiante> estudiante=new ArrayList<>();
    static ArrayList<Nota> notas=new ArrayList<>();
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
    }
    
    public static void registrarNota() throws IOException{
        
        boolean encontrado=false;
        boolean m_encontrado=false;
        
        System.out.println("Ingrese el codigo del estudiante al cual se le asignará la nota: ");    
        String codigo=leer.readLine();
        
        for (Estudiante es :estudiante ) {
            
            if (es.getCodigo().equals(codigo)) {
                
                encontrado=true;
                
                System.out.println("Ingrese la materia de esa nota: ");
                String materia=leer.readLine();
                
                for (Asignatura as : asignatura) {
                    
                    if (materia.equals(as.getNombre())) {
                        
                        m_encontrado=true;
                        
                        System.out.println("Ingrese el valor de la nota: ");
                        Double valor=Double.parseDouble(leer.readLine());
                        
                        
                        System.out.println("Ingrese los creditos de la nota: ");
                        int cr=Integer.parseInt(leer.readLine());
                        
                        Nota n=new Nota(es,as,valor,cr);
                        
                        notas.add(n);
                        
                    }
                    
                }
                
            }
            
        }
        
        if (!m_encontrado) {
            System.out.println("No se encontró la asignatura ingresada");
        }
        
        if (!encontrado) {
            System.out.println("No se encontro el estudiante ingresado");
        }
    }
    
    public static void listarNotas() throws IOException{
        
        for (Nota n2 : notas) {
            
            System.out.println("Codigo studiante: " + n2.getEstudiante().getCodigo());
            System.out.println("Asignatura: " + n2.getAsignatura().getNombre());
            System.out.println("Valor: " + n2.getValor());
            System.out.println("Creditos " + n2.getCreditos());
            System.out.println("=================================");
            
        }
        
    }
    
    public static void buscarNotas() throws IOException{
        
        boolean encontrado=false;
        
        System.out.println("Ingrese el codigo del estudiante a consultar");
        String estudiante= leer.readLine();
        
        System.out.println("Ingrese el valor de la nota a consultar");
        double valor=Double.parseDouble(leer.readLine());
        
        for (Nota n : notas) {
            
            if (n.getEstudiante().getCodigo().equals(estudiante) && 
                        n.getValor()==valor) {
                
                encontrado=true;
                
                System.out.println(n.toString());
                
            }
            
        }
        
        
        if (!encontrado) {
            System.out.println("No se encontró el estudiante");
        }
        
    }
    
    public static void actualizarNotas() throws IOException{
        
        System.out.println("Ingrese el codigo del estudiante: ");
        String codigo=leer.readLine();
        
        System.out.println("Ingrese la asignatura: ");
        String asig=leer.readLine();
        
        boolean encontrado=false;
        
        for (Nota n : notas) {
            
            if (!(codigo.equals(n.getEstudiante().getCodigo()) &&
                asig.equals(n.getAsignatura().getNombre()))) {
                
                System.out.println("Ingrese el nuevo valor");
                double nvalor=Double.parseDouble(leer.readLine());
                
                n.setValor(nvalor);
                
                encontrado=true;
                System.out.println("Se actualizó la nota");
                break;
            }
            
        }
                
        if (!encontrado) {
            System.out.println("No se encontró el valor ingresado");
        }
        
    }
    
    public static void eliminarNota() throws IOException{
        
        System.out.println("Ingrese el codigo de la nota a eliminar");
        Double valor=Double.parseDouble(leer.readLine());
        
        System.out.println("Ingrese la nota de la materia ");
        String codigo=leer.readLine();
        
        boolean encontrado=false;
        
        for (int i = 0; i < notas.size(); i++) {
            
            Nota n=notas.get(i);
            
            if (valor.equals(n.getValor()) && codigo.equals(n.getAsignatura().getNombre())) {
                
                notas.remove(n);
                
                encontrado=true;
                
                System.out.println("La nota se eliminó correctamente");
                
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("Los valores no coinciden con los registros");
        }
        
    }
}
