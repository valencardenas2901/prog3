import java.util.LinkedList;
import java.util.Scanner;

public class Entrada {
    private static Scanner input= new Scanner (System.in);
    
    public static int readInt(String mss){
        System.out.println(mss);
        return input.nextInt();
    }
    
    public static String readText(String mss){
        System.out.println(mss);
        return input.nextLine();
    }

    static LinkedList<Asignatura> loadFile(String archivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}