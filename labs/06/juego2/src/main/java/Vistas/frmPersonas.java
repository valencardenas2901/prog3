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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cbDificultad = new javax.swing.JComboBox<>();
        btnIniciar = new javax.swing.JButton();
        lblPersona2 = new javax.swing.JLabel();
        lblPersona3 = new javax.swing.JLabel();

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

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Onyx", 2, 48)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("CASINO\n");
        jScrollPane1.setViewportView(jTextArea1);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetenerPersona1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDetenerPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(cbDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDetenerPersona3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblPersona3)))
                                .addGap(67, 67, 67)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblPersona3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
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
            tiempoMilisegundos = 0;
            break;
            case 1: 
            tiempoMilisegundos = 100;
            break;
            case 2: 
            tiempoMilisegundos = 500;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
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
        if(lblPersona1.getIcon().toString().equals(lblPersona2.getIcon().toString())&& lblPersona1.getIcon().toString().equals(lblPersona3.getIcon().toString())){
            JOptionPane.showMessageDialog(null, "Felicitaciones, has ganado!!!");
        }else{
         JOptionPane.showMessageDialog(null, "Vuelve a intentarlo");   
        }
    }
}



}
