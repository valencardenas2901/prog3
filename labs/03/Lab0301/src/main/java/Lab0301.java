import java.util.LinkedList;
import java.util.Queue;
import java.io.File;
import java.util.Scanner;


public class Lab0301 {
static LinkedList<Asignatura> Asignaturas_disponibles = new LinkedList<>();
static Queue<Registro>regis= new LinkedList<>();
static Queue<String> codes = new LinkedList<>();

    public static void main(String[] args) {
        registro_estudiante();
        registro_asignatura();
        registro_registro_final();
    }
    
    public static void carga_academica(String archivo) {
        Asignaturas_disponibles = Entrada.loadFile(archivo);
    }
    
    public static boolean registro_estudiante(){
        
        String codigo =Entrada.readText("DATOS ESTUDIANTE");
        if (codigo.equals("-1")) return false;
        if (codes.contains(codigo)) {
            System.out.println(" El codigo " + codigo + " ya ha sido registrado en la carga\n");
            return true;
        }
       
        String nombre= Entrada.readText("Nombre Estudiante: ");
        String correo= Entrada.readText("Correo Estudiante: ");
        int semestre=  Entrada.readInt("Semestre: ");
        Estudiante estud = new Estudiante(codigo, nombre, correo, semestre);
        //crear el registro con el codigo para el estudiante (por ahora)
        //luego agregaremos las asignaturas
        regis.add(new Registro(estud));
        codes.add(codigo);
        
        return true;
    }
    public static void registro_asignaturas(){
        
    }
    public static void reporte_registro_estudiante(){
        
    }

    private static void registro_asignatura() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void registro_registro_final() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
