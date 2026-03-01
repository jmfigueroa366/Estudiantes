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
public class Git_hud {
    
    static ArrayList<Nota> notas=new ArrayList<>();
    static ArrayList<Asignatura> asignaturas=new ArrayList<>();
    static BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
    }
    
    public static void registrarNota() throws IOException{
        
        System.out.println("Ingrese el estudiante al cual se le asignará la nota: ");    
        String codigo=leer.readLine();
        //luego se busca el estudainte para asignarle la nota
        
        System.out.println("Ingrese la materia de esa nota: ");
        String materia=leer.readLine();
        //aqui se busca la asignatura para asignarle la materia
        
        System.out.println("Ingrese el valor de la nota: ");
        String valor=leer.readLine();
        
        System.out.println("Ingrese los creditos de la nota: ");
        String creditos=leer.readLine();
        
        //se enviara la nota al arrayList en este punto
     
    }
    
    public static void listarNotas() throws IOException{
        
        for (Nota n2 : notas) {
            
            System.out.println("Codigo studiante: " + n2.getCodigoEstudiante());
            System.out.println("Asignatura: " + n2.getAsignatura());
            System.out.println("Valor: " + n2.getValor());
            System.out.println("Creditos " + n2.getCreditos());
            System.out.println("=================================");
            
        }
        
    }
    
    public static void buscarNotas(String c,double c2) throws IOException{
        
        boolean encontrado=false;
        boolean nexiste=false;
        
        //aqui va un bucle que buscara el estudiante al que se le quiere consultar la nota
        for (Nota n : notas) {
            
            //aqui va un bucle con el que se buscara la nota en las notas del estudiante
            
        }
        
        if (!encontrado) {
            System.out.println("No se encontró el estudiante");
        }
        
        if (!nexiste) {
            System.out.println("El estudiante no posee esa nota");
        }
        
    }
    
    public static void actualizarNotas() throws IOException{
        
        System.out.println("Ingrese el codigo del estudiante: ");
        String codigo=leer.readLine();
        
        System.out.println("Ingrese la asignatura: ");
        String asig=leer.readLine();
        
        boolean encontrado=false;
        
        for (Nota n : notas) {
            
            if (!(codigo.equals(n.getCodigoEstudiante()) &&
                asig.equals(n.getAsignatura()))) {
                
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
