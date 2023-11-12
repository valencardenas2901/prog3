package Clases;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class Persona2 extends Thread {
    
    private int tiempo;

    public Persona2(int milisegundos) {
     this.tiempo = milisegundos;
        
    }
    
    public void run(){
        while (true){
            int numero = (int)(Math.random() * (8) +1);
            String ruta = "src\\main\\java\\Imagenes\\"+numero+".png";
            ImageIcon imageIcon = new ImageIcon(ruta);
            Vistas.frmPersonas.lblPersona2.setIcon(imageIcon);
            try{
             Thread.sleep(this.tiempo);
            }catch(InterruptedException ex){
                Logger.getLogger(Persona2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}