import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class SimuladorBicicleta extends javax.swing.JFrame {

    private JButton PDerecho, PIzquierdo;
    private JLabel I2, I1, temporizador;
    private Timer timer;
    private int ContadorIz, ContadorDe, segundos, limiteClicks;
    private JTextField limiteClics;

    public SimuladorBicicleta() {
      this.setTitle("Bicicleta Estatica");
      setSize(500, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      PIzquierdo = new JButton("PEDAL IZQUIERDO");
      PDerecho = new JButton("PEDAL DERECHO");

      limiteClics = new JTextField(5);
      temporizador = new JLabel("Tiempo: 0 seg");

      I1 = new JLabel("INDICADOR 1: 0");
      I2 = new JLabel("INDICADOR 2: 0");
      JPanel panelClicks = new JPanel();

      panelClicks.add(new JLabel("lIMITE DE CLICKS: "));
      panelClicks.add(limiteClics);

      setLayout(new GridLayout(4, 2));
      add(PIzquierdo);
      add(PDerecho);
      add(I1);
      add(I2);
      add(temporizador);
      add(panelClicks);

      timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          segundos++;
          temporizador.setText("Tiempo transcurrido: " + segundos + "seg");
          I1.setText("Indicador 1: " + ContadorIz);
          I2.setText("Indicador 2: " + ContadorDe);

          if (limiteClicks > 0 && ContadorIz >= limiteClicks && ContadorDe >= limiteClicks) {
            timer.stop();
            PIzquierdo.setEnabled(false);
            PDerecho.setEnabled(false);
          }
        }
      });
      timer.start();

      PIzquierdo.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

          ContadorIz++;
        }

        PIzquierdo.setVisible(false);
        PDerecho.setVisible(true);

      });

      PDerecho.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          ContadorDe++;
        }
        PDerecho.setVisible(false);
        PIzquierdo.setVisible(true);

      });
    }
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

    }//GEN-LAST:event_CLICKActionPerformed

    public static void main(String args[]) {
            
        SwingUtilities.invokeLater(new Runnable() {
        @Override
            public void run() {
SimuladorBicicleta simulador = new SimuladorBicicleta();
                simulador.setVisible(true);
String input = JOptionPane.showInputDialog(simulador, "Ingrese el # de clicks: ");
try{
simulador.limiteClicks = Integer.parseInt(input);
}catch (NumberFormatException e){
JOptionPane.showMessageDialog(simulador, "Por favor ingrese un numero valido");
            }
}
                });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CLICK;
    private javax.swing.JComboBox<String> Modalidad;
    // End of variables declaration//GEN-END:variables


}
