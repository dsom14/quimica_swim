/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.awt.Color;
import paneles.CambiaPanel;
import paneles.pnlBusqueda;
import paneles.pnlReto;
import paneles.pnlTeoria;

/**
 *
 * @author dsom1
 */
public class Aplicacion extends javax.swing.JFrame {

    /**
     * Creates new form Aplicacion
     */
    public Aplicacion() {
        initComponents();
        this.setLocationRelativeTo(null);        
             
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
        jPanel2 = new javax.swing.JPanel();
        btnMenus = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        pnlMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBusqueda = new rsbuttom.RSButtonMetro();
        btnRetos = new rsbuttom.RSButtonMetro();
        btnTeoria = new rsbuttom.RSButtonMetro();
        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 139, 139));

        btnMenus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu.png"))); // NOI18N
        btnMenus.setContentAreaFilled(false);
        btnMenus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenusActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("X");
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenus, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 699, Short.MAX_VALUE)
                .addComponent(btnCerrar))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnCerrar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnMenus, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 60));

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Icono.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("MENU");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(56, 56, 56))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        btnBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        btnBusqueda.setText("BUSQUEDA");
        btnBusqueda.setColorHover(new java.awt.Color(0, 139, 139));
        btnBusqueda.setColorNormal(new java.awt.Color(255, 255, 255));
        btnBusqueda.setColorPressed(new java.awt.Color(0, 153, 255));
        btnBusqueda.setColorTextNormal(new java.awt.Color(0, 0, 0));
        btnBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBusquedaMousePressed(evt);
            }
        });
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        btnRetos.setBackground(new java.awt.Color(255, 255, 255));
        btnRetos.setForeground(new java.awt.Color(0, 0, 0));
        btnRetos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/juego.png"))); // NOI18N
        btnRetos.setText("RETOS");
        btnRetos.setToolTipText("");
        btnRetos.setColorHover(new java.awt.Color(0, 139, 139));
        btnRetos.setColorNormal(new java.awt.Color(255, 255, 255));
        btnRetos.setColorPressed(new java.awt.Color(0, 153, 255));
        btnRetos.setColorTextNormal(new java.awt.Color(0, 0, 0));
        btnRetos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRetos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRetosMousePressed(evt);
            }
        });
        btnRetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetosActionPerformed(evt);
            }
        });

        btnTeoria.setBackground(new java.awt.Color(255, 255, 255));
        btnTeoria.setForeground(new java.awt.Color(0, 0, 0));
        btnTeoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/libro2.png"))); // NOI18N
        btnTeoria.setText("TEORIA");
        btnTeoria.setColorHover(new java.awt.Color(0, 139, 139));
        btnTeoria.setColorNormal(new java.awt.Color(255, 255, 255));
        btnTeoria.setColorPressed(new java.awt.Color(0, 153, 255));
        btnTeoria.setColorTextNormal(new java.awt.Color(0, 0, 0));
        btnTeoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTeoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTeoriaMousePressed(evt);
            }
        });
        btnTeoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnTeoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlMenuLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRetos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTeoria, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRetos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 440));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 670, 440));

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTeoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeoriaActionPerformed
        new CambiaPanel(pnlPrincipal, new pnlTeoria());
        if(this.btnTeoria.isSelected())
        {
            this.btnTeoria.setColorNormal(new Color(0,139,139)); 
            this.btnTeoria.setColorHover(new Color(0,139,139));
            this.btnTeoria.setColorPressed(new Color(0,139,139));
            
            this.btnBusqueda.setColorNormal(new Color(255,255,255)); 
            this.btnBusqueda.setColorHover(new Color(0,153,255));
            this.btnBusqueda.setColorPressed(new Color(255,255,255));
            
            this.btnRetos.setColorNormal(new Color(255,255,255)); 
            this.btnRetos.setColorHover(new Color(0,153,255));
            this.btnRetos.setColorPressed(new Color(255,255,255));
        }
        else
        {
           this.btnTeoria.setColorNormal(new Color(255,255,255));
           this.btnTeoria.setColorHover(new Color(0,153,255));
           this.btnTeoria.setColorPressed(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_btnTeoriaActionPerformed

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        new CambiaPanel(pnlPrincipal, new pnlBusqueda());
        if(this.btnBusqueda.isSelected())
        {
            this.btnTeoria.setColorNormal(new Color(255,255,255));
            this.btnTeoria.setColorHover(new Color(0,153,255));
            this.btnTeoria.setColorPressed(new Color(255,255,255));
            
            this.btnBusqueda.setColorNormal(new Color(0,139,139));
            this.btnBusqueda.setColorHover(new Color(0,139,139));
            this.btnBusqueda.setColorPressed(new Color(0,139,139));
            
            this.btnRetos.setColorNormal(new Color(255,255,255)); 
            this.btnRetos.setColorHover(new Color(0,153,255));
            this.btnRetos.setColorPressed(new Color(255,255,255));
        }
        else
        {
           this.btnBusqueda.setColorNormal(new Color(255,255,255));
           this.btnBusqueda.setColorHover(new Color(0,153,255));
           this.btnBusqueda.setColorPressed(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btnTeoriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTeoriaMousePressed
        this.btnTeoria.setSelected(true);
        this.btnBusqueda.setSelected(false);
        this.btnRetos.setSelected(false);
    }//GEN-LAST:event_btnTeoriaMousePressed

    private void btnBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMousePressed
        this.btnTeoria.setSelected(false);
        this.btnBusqueda.setSelected(true);
        this.btnRetos.setSelected(false);
    }//GEN-LAST:event_btnBusquedaMousePressed

    private void btnRetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetosActionPerformed
        new CambiaPanel(pnlPrincipal, new pnlReto());
        if(this.btnRetos.isSelected())
        {
            this.btnTeoria.setColorNormal(new Color(255,255,255));
            this.btnTeoria.setColorHover(new Color(0,153,255));
            this.btnTeoria.setColorPressed(new Color(255,255,255));
            
            this.btnRetos.setColorNormal(new Color(0,139,139));
            this.btnRetos.setColorHover(new Color(0,139,139));
            this.btnRetos.setColorPressed(new Color(0,139,139));
            
            this.btnBusqueda.setColorNormal(new Color(255,255,255)); 
            this.btnBusqueda.setColorHover(new Color(0,153,255));
            this.btnBusqueda.setColorPressed(new Color(255,255,255));
        }
        else
        {
           this.btnRetos.setColorNormal(new Color(255,255,255));
           this.btnRetos.setColorHover(new Color(0,153,255));
           this.btnRetos.setColorPressed(new Color(255,255,255));
            
        }
    }//GEN-LAST:event_btnRetosActionPerformed

    private void btnRetosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetosMousePressed
        this.btnTeoria.setSelected(false);
        this.btnRetos.setSelected(true); 
        this.btnBusqueda.setSelected(false);
        
    }//GEN-LAST:event_btnRetosMousePressed

    private void btnMenusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenusActionPerformed
        int posicion = this.pnlMenu.getX();       
        if(posicion>-1)
        {
            Animacion.Animacion.mover_izquierda(0, -200, 2, 2, pnlMenu); 
        }
        else
        {
           Animacion.Animacion.mover_derecha(-200, 0, 2, 2, pnlMenu);            
        }      
        
        
         
           
        
               
    }//GEN-LAST:event_btnMenusActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnBusqueda;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMenus;
    private rsbuttom.RSButtonMetro btnRetos;
    private rsbuttom.RSButtonMetro btnTeoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
