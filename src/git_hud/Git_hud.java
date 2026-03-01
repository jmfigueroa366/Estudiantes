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
    
    ArrayList<Nota> notas=new ArrayList<>();
    ArrayList<Asignatura> asignatura=new ArrayList<>();
    static BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    
    
    
}
