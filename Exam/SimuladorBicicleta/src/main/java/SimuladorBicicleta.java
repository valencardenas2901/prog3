import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class SimuladorBicicleta extends javax.swing.JFrame {
    
   private JButton PDerecho, PIzquierdo;
   private JLabel I2, I1;
    
    
    public SimuladorBicicleta() {
        initComponents();
        this.setTitle("Bicicleta Estatica");
        
        PIzquierdo = new JButton("Pedal Izquierdo");
        PDerecho = new JButton("Pedal Derecho");    
                
        I1 = new JLabel("Indicador 1: 0");
        I2 = new JLabel("Indicador 2: 0");
        

        setLayout(new GridLayout(2, 2));
        add(PIzquierdo);
        add(PDerecho);
        add(I1);
        add(I2);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Modalidad = new javax.swing.JComboBox<>();
        click = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Modalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modalidad", "Automatico", "Manual" }));
        Modalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModalidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(367, Short.MAX_VALUE)
                .addComponent(click, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Modalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(click, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(Modalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModalidadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimuladorBicicleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Modalidad;
    private javax.swing.JLabel click;
    // End of variables declaration//GEN-END:variables

private void encender(){
    
switch (Modalidad.getSelectedIndex()){

    case 0:
        break;
    case 1:
        
        PIzquierdo = false;
        PDerecho = true;
        break;
        
    case 2:
        
        click ==  true;
        
        
        
        for(int i=0; i<)
        break;
        
    
    
}


}
}
