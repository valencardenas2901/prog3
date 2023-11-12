package Vistas;

import Clases.Persona1;
import Clases.Persona2;
import Clases.Persona3;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmPersonas extends javax.swing.JFrame {

    Persona1 p1;
    Persona2 p2;
    Persona3 p3;
    
    boolean respuesta1 = false;
    boolean respuesta2 = false;
    boolean respuesta3 = false;
    
    
    public frmPersonas() {
        initComponents();
        this.setTitle("Valentina Cardenas");
        getContentPane().setBackground(new java.awt.Color(255,255,255));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPersona1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDetenerPersona2 = new javax.swing.JButton();
        btnDetenerPersona1 = new javax.swing.JButton();
        btnDetenerPersona3 = new javax.swing.JButton();
        cbDificultad = new javax.swing.JComboBox<>();
        btnIniciar = new javax.swing.JButton();
        lblPersona2 = new javax.swing.JLabel();
        lblPersona3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        lblPersona1.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Documents\\prog3-main (3)\\prog3-main\\labs\\06\\juego2\\src\\main\\java\\Imagenes\\img2.jpg")); // NOI18N
        lblPersona1.setToolTipText("");

        btnDetenerPersona2.setText("DETENER");
        btnDetenerPersona2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerPersona2ActionPerformed(evt);
            }
        });

        btnDetenerPersona1.setText("DETENER");
        btnDetenerPersona1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerPersona1ActionPerformed(evt);
            }
        });

        btnDetenerPersona3.setText("DETENER");
        btnDetenerPersona3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerPersona3ActionPerformed(evt);
            }
        });

        cbDificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIFICULTAD", "FACIL", "MEDIO", "DIFICIL" }));
        cbDificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDificultadActionPerformed(evt);
            }
        });

        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        lblPersona2.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Documents\\prog3-main (3)\\prog3-main\\labs\\06\\juego2\\src\\main\\java\\Imagenes\\img3.png")); // NOI18N

        lblPersona3.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Documents\\prog3-main (3)\\prog3-main\\labs\\06\\juego2\\src\\main\\java\\Imagenes\\img4.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 2, 48)); // NOI18N
        jLabel1.setText("CASINO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnDetenerPersona1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lblPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(cbDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDetenerPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPersona3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(185, 185, 185))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDetenerPersona3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel2))
                            .addComponent(lblPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPersona2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPersona3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDetenerPersona3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDetenerPersona2)
                        .addComponent(btnDetenerPersona1)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetenerPersona2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerPersona2ActionPerformed
     p2.stop();
    respuesta2 = true;
    comprobarResultado();
    }//GEN-LAST:event_btnDetenerPersona2ActionPerformed

    private void btnDetenerPersona1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerPersona1ActionPerformed
    p1.stop();
    respuesta1 = true;
    comprobarResultado();
    }//GEN-LAST:event_btnDetenerPersona1ActionPerformed

    private void btnDetenerPersona3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerPersona3ActionPerformed
    p3.stop();
    respuesta3 = true;
    comprobarResultado();
    }//GEN-LAST:event_btnDetenerPersona3ActionPerformed

    private void cbDificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDificultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDificultadActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
    int tiempoMilisegundos = 0;
    switch (cbDificultad.getSelectedIndex()){
        case 0: 
            tiempoMilisegundos = 100;
            break;
            case 1: 
            tiempoMilisegundos = 500;
            break;
            case 2: 
            tiempoMilisegundos = 1000;
            break;
            default:
                tiempoMilisegundos = 0;
    }
    p1 = new Persona1(tiempoMilisegundos);
    p2 = new Persona2(tiempoMilisegundos);
    p3 = new Persona3(tiempoMilisegundos);
    respuesta1 = false;
    respuesta2 = false;
    respuesta3 = false;
    btnIniciar.setEnabled(false);
    p1.start();
    p2.start();
    p3.start();
    }//GEN-LAST:event_btnIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPersonas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetenerPersona1;
    private javax.swing.JButton btnDetenerPersona2;
    private javax.swing.JButton btnDetenerPersona3;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JComboBox<String> cbDificultad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel lblPersona1;
    public static javax.swing.JLabel lblPersona2;
    public static javax.swing.JLabel lblPersona3;
    // End of variables declaration//GEN-END:variables

private void comprobarResultado(){
    if(respuesta1 && respuesta2 && respuesta3){
        try{
            Thread.sleep(100);
        }catch(InterruptedException ex){
            Logger.getLogger(frmPersonas.class.getName()).log(Level.SEVERE, null,ex);
        }
        btnIniciar.setEnabled(true);
        if(lblPersona1.getIcon().toString().equals(lblPersona2.getIcon().toString())&& lblPersona1.getIcon().toString().equals(lblPersona3.getIcon().toString())&&lblPersona2.getIcon().toString().equals(lblPersona3.getIcon().toString())){
            JOptionPane.showMessageDialog(null, "Felicitaciones, has ganado!!!");
        }else{
         JOptionPane.showMessageDialog(null, "Vuelve a intentarlo");   
        }
    }
}



}
