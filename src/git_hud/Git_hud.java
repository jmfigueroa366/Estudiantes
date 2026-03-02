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
        String codigo;
        Double valor;
        int cr;
        
        try {
            
            System.out.println("Ingrese el codigo del estudiante al cual se le asignará la nota: ");    
            codigo=leer.readLine();
            
        } catch (Exception e) {
            System.out.println("Error de tipo " + e);
        }
        
        if (estudiante.isEmpty() && asignatura.isEmpty()) {
            System.out.println("No hay estudiantes o asignaturas a las cuales asignarles nota");
        } else {
        for (Estudiante es :estudiante ) {
            
            if (es.getCodigo().equals(codigo)) {
                
                encontrado=true;
                
                System.out.println("Ingrese la materia de esa nota: ");
                String materia=leer.readLine();
                
                for (Asignatura as : asignatura) {
                    
                    if (materia.equals(as.getNombre())) {
                        
                        m_encontrado=true;
                        
                        try {
                            
                        System.out.println("Ingrese el valor de la nota: ");
                        valor=Double.parseDouble(leer.readLine());
                        
                        } catch (NumberFormatException e) {
                            
                            System.out.println("Error de tipo " + e);
                            
                        }
                        
                        try {
                            
                        System.out.println("Ingrese los creditos de la nota: ");
                        cr=Integer.parseInt(leer.readLine()); 
                        
                        } catch (NumberFormatException e) {
                            System.out.println("Error de tipo " + e);
                        }
                        
                        
                        
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
    }
    
    public static void listarNotas() throws IOException{
        
        if (notas.isEmpty()) {
            System.out.println("No hay registros");
        } else {
        
        for (Nota n2 : notas) {
            
            System.out.println("Codigo studiante: " + n2.getEstudiante().getCodigo());
            System.out.println("Asignatura: " + n2.getAsignatura().getNombre());
            System.out.println("Valor: " + n2.getValor());
            System.out.println("Creditos " + n2.getCreditos());
            System.out.println("=================================");
            
        }
      } 
    }
    
    public static void buscarNotas() throws IOException{
        
        boolean encontrado=false;
        String estudiante = null;
        Double valor = null;
        
        try {
            
            System.out.println("Ingrese el codigo del estudiante a consultar");
            estudiante= leer.readLine();
            
        } catch (Exception e) {
            System.out.println("Error de tipo " + e);
        }
        
        
        try {
            
            System.out.println("Ingrese el valor de la nota a consultar");
            valor=Double.parseDouble(leer.readLine());
            
        } catch (NullPointerException e) {
            System.out.println("Error de tipo " + e);
        }
        
        if (notas.isEmpty()) {
            System.out.println("No hay registros");
        } else {
        
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
    }
    
    public static void actualizarNotas() throws IOException{
        
         
        boolean encontrado=false;
        String asig = null,codigo = null;
        
        try {
            
            System.out.println("Ingrese el codigo del estudiante: ");
            codigo=leer.readLine();
            
        } catch (Exception e) {
            
            System.out.println("Error de tipo " + e);
            
        }
        
        try {
            
            System.out.println("Ingrese la asignatura: ");
            asig=leer.readLine();
            
        } catch (Exception e) {
            System.out.println("Error de tipo " + e);
        }
        
        if (notas.isEmpty()) {
            
            System.out.println("No hay registros");
            
        } else {
        
        
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
    }
    
    public static void eliminarNota() throws IOException{
        
        String codigo = null;
        Double valor = 0.0;
        boolean encontrado=false;
        
        try {
            
            System.out.println("Ingrese el valor de la nota a eliminar");
            valor=Double.parseDouble(leer.readLine());
            
        } catch (NumberFormatException e) {
            System.out.println("Error de tipo " + e);
        }
        
        try {
            
            System.out.println("Ingrese la el nombre de la materia a eliminar ");
            codigo=leer.readLine();
            
        } catch (NumberFormatException e) {
            System.out.println("Error de tipo " + e);
        }
        
        if (notas.isEmpty()) {
            
            System.out.println("No hay registros");
            
        } else {
        
        
        for (int i = 0; i < notas.size(); i++) {
            
            Nota n=notas.get(i);
            
            if (valor.equals(n.getValor()) && n.getAsignatura().getNombre().equals(codigo)) {
                
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
}
