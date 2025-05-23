/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inadex_gui;
import Fuentes.Press_Start_2P.Fuentes;
import Inadex_gui.VistaMusica;

/**
 *
 * @author zenca
 */
public class VistaDetalles extends javax.swing.JFrame {
    private Fuentes tipoFuente;  

    /**
     * Creates new form VistaDetalles
     */
    public VistaDetalles() {
        initComponents();
        setLocationRelativeTo(null);  

           tipoFuente = new Fuentes();
    
  //Fuente
    name.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 20));
    name.setForeground(java.awt.Color.WHITE);

    image.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 24));
    image.setForeground(java.awt.Color.WHITE);

    pe.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 24));
    pe.setForeground(java.awt.Color.WHITE);

    pt.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 24));
    pt.setForeground(java.awt.Color.WHITE);

    tiro.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 24));
    tiro.setForeground(java.awt.Color.WHITE);

    fisico.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 24));
    fisico.setForeground(java.awt.Color.WHITE);

    control.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 24));
    control.setForeground(java.awt.Color.WHITE);

    defensa.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 24));
    defensa.setForeground(java.awt.Color.WHITE);

    rapidez.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 24));
    rapidez.setForeground(java.awt.Color.WHITE);

    aguante.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 24));
    aguante.setForeground(java.awt.Color.WHITE);

    valor.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 24));
    valor.setForeground(java.awt.Color.WHITE);

    sm1.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 21));
    sm1.setForeground(java.awt.Color.WHITE);

    sm2.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 21));
    sm2.setForeground(java.awt.Color.WHITE);

    sm3.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 21));
    sm3.setForeground(java.awt.Color.WHITE);

    sm4.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 21));
    sm4.setForeground(java.awt.Color.WHITE);

    jLabel1.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 24));
    jLabel1.setForeground(java.awt.Color.WHITE);

    jLabel2.setFont(tipoFuente.fuente(tipoFuente.RIO, 0, 24));
    jLabel2.setForeground(java.awt.Color.WHITE);
    }
//DatosDeJugadores 
 public void setDatosJugador(Modelos.Jugador jugador, java.util.List<Modelos.Tecnica> tecnicas, javax.swing.Icon icono) {
    name.setText(jugador.getNombreJugador());
    pt.setText(String.valueOf(jugador.getPT()));
    pe.setText(String.valueOf(jugador.getPE()));
    tiro.setText(String.valueOf(jugador.getTiro()));
    aguante.setText(String.valueOf(jugador.getAguante()));
    fisico.setText(String.valueOf(jugador.getFisico()));
    control.setText(String.valueOf(jugador.getControl()));
    defensa.setText(String.valueOf(jugador.getDefensa()));
    rapidez.setText(String.valueOf(jugador.getRapidez()));
    valor.setText(String.valueOf(jugador.getValor()));
    image.setIcon(icono);

    sm1.setText(tecnicas.size() > 0 ? tecnicas.get(0).getNombre() : "");
    sm2.setText(tecnicas.size() > 1 ? tecnicas.get(1).getNombre() : "");
    sm3.setText(tecnicas.size() > 2 ? tecnicas.get(2).getNombre() : "");
    sm4.setText(tecnicas.size() > 3 ? tecnicas.get(3).getNombre() : "");
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        pe = new javax.swing.JLabel();
        pt = new javax.swing.JLabel();
        tiro = new javax.swing.JLabel();
        fisico = new javax.swing.JLabel();
        control = new javax.swing.JLabel();
        defensa = new javax.swing.JLabel();
        rapidez = new javax.swing.JLabel();
        aguante = new javax.swing.JLabel();
        valor = new javax.swing.JLabel();
        sm1 = new javax.swing.JLabel();
        sm2 = new javax.swing.JLabel();
        sm3 = new javax.swing.JLabel();
        sm4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Volver");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 40));
        jPanel2.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 160, 140));

        name.setText("Nombre");
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        pe.setText("pe");
        jPanel2.add(pe, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        pt.setText("pt");
        jPanel2.add(pt, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, -1, -1));

        tiro.setText("Tiro");
        jPanel2.add(tiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        fisico.setText("Fisico");
        jPanel2.add(fisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        control.setText("Control");
        jPanel2.add(control, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, -1));

        defensa.setText("Defensa");
        jPanel2.add(defensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

        rapidez.setText("Rapidez");
        jPanel2.add(rapidez, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, -1, -1));

        aguante.setText("Aguante");
        jPanel2.add(aguante, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, -1, -1));

        valor.setText("Valor");
        jPanel2.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 670, -1, -1));

        sm1.setText("SM1");
        jPanel2.add(sm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        sm2.setText("SM2");
        jPanel2.add(sm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        sm3.setText("SM3");
        jPanel2.add(sm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, -1));

        sm4.setText("SM4");
        jPanel2.add(sm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, -1, -1));

        jLabel1.setText("99");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BackgroundDetails.PNG"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();        // TODO add your handling code here:
        VistaMusica musica = new VistaMusica();
                musica.playSound("src/resources_audio/OK.wav");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDetalles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aguante;
    private javax.swing.JLabel control;
    private javax.swing.JLabel defensa;
    private javax.swing.JLabel fisico;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel pe;
    private javax.swing.JLabel pt;
    private javax.swing.JLabel rapidez;
    private javax.swing.JLabel sm1;
    private javax.swing.JLabel sm2;
    private javax.swing.JLabel sm3;
    private javax.swing.JLabel sm4;
    private javax.swing.JLabel tiro;
    private javax.swing.JLabel valor;
    // End of variables declaration//GEN-END:variables
}
