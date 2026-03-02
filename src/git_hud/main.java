package git_hud;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Main {

    /*jesus figueroa*/
    static ArrayList<String>estudiante=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
    int opcion;
    do{
        mostrarMenu();
        opcion=sc.nextInt();
        sc.nextLine();
        switch(opcion){
            case 1:registrar_estudiante();
            break;
            case 2:
                listar_Estudiante();
                break;
            case 3:
                buscar_estudiantes();
                break;
            case 4:
                actualizar_estudiantes();
                break;
            case 5:
                eliminar_estudiantes();
            case 0:
                    System.out.println("saliendo....");
        break;
        }
    }while(opcion!=0);
    
    }
        static void mostrarMenu() {
        System.out.println("1. Registrar");
        System.out.println("2. Listar");
        System.out.println("3. Buscar");
        System.out.println("4. Actualizar");
        System.out.println("5. Eliminar");
        System.out.println("0. Salir");
    }
        static void registrar_estudiante() {
        System.out.print("Nombre: ");
        estudiante.add(sc.nextLine());
    }

    static void listar_Estudiante() {
        for (String e : estudiante) {
            System.out.println(e);
        }
    }  
    
        static void buscar_estudiantes() {
        System.out.print("Buscar: ");
        String nombre = sc.nextLine();
        if (estudiante.contains(nombre)) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No existe");
        }
    }
            static void  actualizar_estudiantes(){
        System.out.print("Nombre a actualizar: ");
        String viejo = sc.nextLine();

        int index = estudiante.indexOf(viejo);
        if (index != -1) {
            System.out.print("Nuevo nombre: ");
            estudiante.set(index, sc.nextLine());
        }
    }

    static void eliminar_estudiantes() {
        System.out.print("Nombre a eliminar: ");
        estudiante.remove(sc.nextLine());
    }
        
    
}
