import java.util.LinkedList;
import java.util.Queue;


public class Lab0301 {
static Queue<Registro>regis= new LinkedList<>();

    public static void main(String[] args) {
        registro_estudiante();
        registro_asignatura();
        registro_registro_final();
    }
    
    public static void registro_estudiante(){
        String codigo= Entrada.readText("Codigo Estudiante: ");
        String nombre= Entrada.readText("Nombre Estudiante: ");
        String correo= Entrada.readText("Correo Estudiante: ");
        int semestre=  Entrada.readInt("Semestre: ");
        Estudiante estud = new Estudiante(codigo, nombre, correo, semestre);
        //crear el registro con el codigo para el estudiante (por ahora)
        //luego agregaremos las asignaturas
        regis.add(new Registro(estud));
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
