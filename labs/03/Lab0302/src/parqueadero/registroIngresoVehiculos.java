package parqueadero;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

    class Carro{
    private String placa;
    private String tipo;
    private LocalDateTime fechaHoraIngreso;
    private LocalDateTime fechaHoraSalida;
    private int numero; 

    public Carro(String placa, String tipo, LocalDateTime fechaHoraIngreso) {
        this.placa = placa;
        this.tipo = tipo;
        this.fechaHoraIngreso = fechaHoraIngreso;
        this.numero = numero;
    }

    public void registrarSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }
    
    public String getPlaca(){
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDateTime getFechaHoraIngreso() {
        return fechaHoraIngreso;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public int getNumero() {
        return numero;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFechaHoraIngreso(LocalDateTime fechaHoraIngreso) {
        this.fechaHoraIngreso = fechaHoraIngreso;
    }

    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
     public String toString() {
         int numero = 0;
         numero++;
        return "Vehículo #" + numero + " - Placa: " + placa + " - Tipo: " + tipo + " - Fecha y Hora de Ingreso: " + fechaHoraIngreso;
    }
}
    
    public class registroIngresoVehiculos {
    private static List<Carro> listaVehiculos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Object carro;
    
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            
            public void run() {
                Scanner leer= new Scanner(System.in);
                Timer timer = new Timer();
                
                
                LocalDateTime fechaHoraIngreso = LocalDateTime.now();
                 
                System.out.println("Ingrese la placa");
                String placa = leer.nextLine();
                System.out.println("Ingrese el tipo de vehiculo (automovil o moto)");
                String tipo = leer.nextLine(); 
                
                
                Carro vehiculo = new Carro(placa, tipo, fechaHoraIngreso);
                listaVehiculos.add(vehiculo);

                System.out.println("Vehículo ingresado: " + vehiculo);
                
                    }
        }, 0, 3000);
        
        LocalDateTime fechaHoraSalida = LocalDateTime.now();
            carro.registrarSalida(fechaHoraSalida);
    }
    public static void salida(String placa, String tipo, LocalDateTime fechaHoraIngreso, int numero){
     
       System.out.println("Ingrese la placa del vehiculo");
       
        
    }
    
}
    

