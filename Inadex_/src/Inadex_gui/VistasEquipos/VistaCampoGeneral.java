/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inadex_gui.VistasEquipos;
import Inadex_gui.VistaMusica;
import java.util.List;
import Modelos.Jugador;
import Modelos.JugadorConPosicion;
import Servicios.Servicios;
/**
 *
 * @author zenca
 */
public class VistaCampoGeneral extends javax.swing.JFrame {
private boolean modoEdicion = false;
private java.util.Map<javax.swing.JLabel, JugadorConPosicion> labelJugadorMap = new java.util.HashMap<>();
private javax.swing.JLabel labelArrastrado = null;
private int offsetX, offsetY;
private Servicios servicios = new Servicios(); // Asegúrate de tener acceso a tu clase Servicios
    /**
     * Creates new form VistaCampoGeneral
     */
    public VistaCampoGeneral() {
        initComponents();
        
    }private void onEditarGuardar() {
    if (!modoEdicion) {
        modoEdicion = true;
        Editar.setText("Guardar");
    } else {
        for (javax.swing.JLabel labelImg : labelJugadorMap.keySet()) {
            JugadorConPosicion jp = labelJugadorMap.get(labelImg);
            javax.swing.JLabel labelNombre = labelNombreMap.get(labelImg);

            int newX = labelImg.getX();
            int newY = labelImg.getY();
            int newNombreX = labelNombre.getX();
            int newNombreY = labelNombre.getY();

            jp.setPosX(newX);
            jp.setPosY(newY);
            jp.setNombreX(newNombreX);
            jp.setNombreY(newNombreY);

            try {
                servicios.actualizarPosicionJugadorCompleta(
                    jp.getId_E(),
                    jp.getJugador().getId(),
                    newX, newY,
                    newNombreX, newNombreY
                );
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        modoEdicion = false;
        Editar.setText("Editar");

        // --- Recargar jugadores desde la base de datos y refrescar pantalla ---
        String nombreEquipo = (String) TeamChanger.getSelectedItem();
        int idEquipo = servicios.getIdEquipoPorNombre(nombreEquipo);
        List<JugadorConPosicion> jugadores = servicios.getJugadoresYPosicionesPorEquipo(idEquipo);
        mostrarJugadoresConPosicion(jugadores, nombreEquipo);
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        TeamChanger = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        Editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 40));

        TeamChanger.setBackground(new java.awt.Color(255, 102, 0));
        TeamChanger.setEditable(true);
        TeamChanger.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TeamChanger.setForeground(new java.awt.Color(255, 255, 255));
        TeamChanger.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TeamChanger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamChangerActionPerformed(evt);
            }
        });
        jPanel1.add(TeamChanger, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 860, 180, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/DL.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/MDMF.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/PR.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 780, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campo (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Banquillo");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Banquillo");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, -1));

        jLabel47.setBackground(new java.awt.Color(255, 255, 51));
        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Banquillo");
        jPanel3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        jPanel3.add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 160, 920));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();        // TODO add your handling code here:
        VistaMusica musica = new VistaMusica();
        musica.playSound("src/resources_audio/OK.wav");
    }//GEN-LAST:event_jButton1ActionPerformed
/* Método duplicado eliminado para evitar error de compilación */
    
    private void TeamChangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamChangerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeamChangerActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
            onEditarGuardar();

    }//GEN-LAST:event_EditarActionPerformed
// Añade este método para que el controlador pueda acceder al ComboBox
public javax.swing.JComboBox<String> getTeamChanger() {
    return TeamChanger;
}

 // Añade este atributo a tu clase
private java.util.List<javax.swing.JLabel> labelsJugadores = new java.util.ArrayList<>();

// Añade este mapa para asociar cada imagen con su label de nombre
private java.util.Map<javax.swing.JLabel, javax.swing.JLabel> labelNombreMap = new java.util.HashMap<>();
// ...existing code...
public void mostrarJugadoresConPosicion(List<JugadorConPosicion> jugadores, String carpeta) {
    // Elimina labels anteriores
    labelJugadorMap.clear();
    labelNombreMap.clear();
    for (javax.swing.JLabel lbl : labelsJugadores) {
        jPanel1.remove(lbl);
    }
    labelsJugadores.clear();

    int width = 150;
    int height = 100;
    int nombreHeight = 24;
    int separacion = -3;

    for (JugadorConPosicion jp : jugadores) {
        Jugador j = jp.getJugador();
        javax.swing.JLabel labelImg = new javax.swing.JLabel();
        String ruta = "/Img/" + carpeta + "/" + j.getId() + ".png";
        java.net.URL imgURL = getClass().getResource(ruta);
        if (imgURL != null) {
            labelImg.setIcon(new javax.swing.ImageIcon(imgURL));
        } else {
            labelImg.setText("?");
        }
        labelImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        // --- Estilo del nombre ---
        javax.swing.JLabel labelNombre = new javax.swing.JLabel(j.getNombreJugador());
        labelNombre.setOpaque(true);
        labelNombre.setBackground(new java.awt.Color(153, 0, 0));
        labelNombre.setForeground(java.awt.Color.WHITE);
        labelNombre.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0), 2));

        // Asocia la imagen con su nombre
        labelJugadorMap.put(labelImg, jp);
        labelNombreMap.put(labelImg, labelNombre);

        // MouseListener para arrastrar o mostrar detalles
        labelImg.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (modoEdicion) {
                    labelArrastrado = labelImg;
                    offsetX = evt.getX();
                    offsetY = evt.getY();
                }
            }
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (modoEdicion) {
                    labelArrastrado = null;
                }
            }
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (!modoEdicion && evt.getClickCount() == 1) {
                    // Solo mostrar detalles si NO estamos en modo edición
                    JugadorConPosicion jp = labelJugadorMap.get(labelImg);
                    Modelos.Jugador jugador = jp.getJugador();
                    java.util.List<Modelos.Tecnica> tecnicas = servicios.getTecnicasPorJugador(jugador.getId());
                    javax.swing.Icon icono = labelImg.getIcon();
                    Inadex_gui.VistaDetalles detalles = new Inadex_gui.VistaDetalles();
                    detalles.setDatosJugador(jugador, tecnicas, icono);
                    detalles.setVisible(true);
                }
            }
        });

        // MouseMotionListener SOLO para arrastrar en modo edición
        labelImg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                if (modoEdicion && labelArrastrado == labelImg) {
                    int newX = labelImg.getX() + evt.getX() - offsetX;
                    int newY = labelImg.getY() + evt.getY() - offsetY;
                    labelImg.setLocation(newX, newY);
                    javax.swing.JLabel labelNombre = labelNombreMap.get(labelImg);
                    labelNombre.setLocation(newX, newY + height + separacion);
                }
            }
        });

        // Posiciona el nombre pegado debajo de la imagen
        int posX = jp.getPosX();
        int posY = jp.getPosY();
        labelImg.setBounds(posX, posY, width, height);
        labelNombre.setBounds(posX, posY + height + separacion, width, nombreHeight);

        jPanel1.add(labelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(posX, posY, width, height));
        jPanel1.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(posX, posY + height + separacion, width, nombreHeight));
        labelsJugadores.add(labelImg);
        labelsJugadores.add(labelNombre);
    }

    // Trae los jugadores al frente
    for (javax.swing.JLabel lbl : labelsJugadores) {
        jPanel1.setComponentZOrder(lbl, 0);
    }
    jPanel1.revalidate();
    jPanel1.repaint();
}
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
            java.util.logging.Logger.getLogger(VistaCampoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCampoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCampoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCampoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCampoGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JComboBox<String> TeamChanger;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
