import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class SimuladorBicicleta extends javax.swing.JFrame {
   
   private JButton PDerecho, PIzquierdo;
   private JLabel I2, I1;
   private Timer timer;
   private int ContadorIz, ContadorDe, segundos; 
   int clicks;
    
    public SimuladorBicicleta() {
        initComponents();
        this.setTitle("Bicicleta Estatica");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PIzquierdo = new JButton("PEDAL IZQUIERDO");
        PDerecho = new JButton("PEDAL DERECHO");    
                
        I1 = new JLabel("INDICADOR 1: 0");
        I2 = new JLabel("INDICADOR 2: 0");
        
       JLabel temporizador = new JLabel("Tiempo: 0 seg");
        
        setLayout(new GridLayout(3, 2));
        add(PIzquierdo);
        add(PDerecho);
        add(I1);
        add(I2);
        add(temporizador);
       
        PIzquierdo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ContadorIz++;
                PIzquierdo.setVisible(false);
                PDerecho.setVisible(true);
                // Actualizar propiedades de la bicicleta y los indicadores si es necesario
            }
        });

        PDerecho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ContadorDe++;
                PDerecho.setVisible(false);
                PIzquierdo.setVisible(true);
                // Actualizar propiedades de la bicicleta y los indicadores si es necesario
            }
        });
    }
    
         /*I1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        calorias();
                 }
    }*/
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Modalidad = new javax.swing.JComboBox<>();
        CLICK = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Modalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modalidad", "Automatico", "Manual" }));
        Modalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModalidadActionPerformed(evt);
            }
        });

        CLICK.setText("CLICKS");
        CLICK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLICKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(CLICK, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Modalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLICK, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModalidadActionPerformed

    private void CLICKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLICKActionPerformed
      Scanner leer = new Scanner(System.in);
        
        System.out.println(" ");
        clicks = leer.nextInt();
    }//GEN-LAST:event_CLICKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            
        SwingUtilities.invokeLater(new Runnable() {
        @Override
            
            public void run() {
                new SimuladorBicicleta().setVisible(true);
            }
                });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CLICK;
    private javax.swing.JComboBox<String> Modalidad;
    // End of variables declaration//GEN-END:variables

private void encender(){
    
switch (Modalidad.getSelectedIndex()){

    case 0: 
        break;
    case 1: 
        break;
    case 2:
        
    for (int i = 0; i<clicks; i++ ){
        PIzquierdo.setVisible(false);
                PDerecho.setVisible(true);
    }
    
}
    }
/*private void calorias(){
    int calorias=0;
    
    calorias= (int) (clicks*0.20);
    
}*/
}
