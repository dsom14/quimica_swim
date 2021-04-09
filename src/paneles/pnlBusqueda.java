/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dsom1
 */
public class pnlBusqueda extends javax.swing.JPanel
{
        public pnlBusqueda() {
        initComponents();
        Transparente2();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtAoB = new javax.swing.JLabel();
        txtFoD = new javax.swing.JLabel();
        txtRazon = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(554, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Busqueda");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 340, 69));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 395, 63));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/frasco.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setDefaultCapable(false);
        btnBuscar.setFocusCycleRoot(true);
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/frasco (1).png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 70, -1));

        txtAoB.setFont(new java.awt.Font("BankGothic Lt BT", 1, 12)); // NOI18N
        txtAoB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtAoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 440, 40));

        txtFoD.setFont(new java.awt.Font("BankGothic Lt BT", 1, 12)); // NOI18N
        txtFoD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtFoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 440, 40));

        txtRazon.setFont(new java.awt.Font("BankGothic Lt BT", 1, 12)); // NOI18N
        txtRazon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtRazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 440, 40));

        btnBorrar.setBackground(new java.awt.Color(255, 255, 255));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eraser.png"))); // NOI18N
        btnBorrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eraser (1).png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 70, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/f1.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 410));
    }// </editor-fold>//GEN-END:initComponents

    public void Transparente2()
    {
        btnBuscar.setOpaque(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setBorderPainted(false);
        
        btnBorrar.setOpaque(false);
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.setBorderPainted(false);      
        
    }
    
    
    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String compuesto=txtBuscar.getText();
      try 
      {
        Conexion con=new Conexion();
        Connection cn1 = con.conectar();
        String ID_Tipo = null;
        con.conectar();        
        String SQL= "SELECT * FROM COMPUESTO WHERE FORMULA = '"+txtBuscar.getText()+"'";            
        Statement S= cn1.createStatement();
        ResultSet R= S.executeQuery(SQL);                 
          while(R.next())
          {
              ID_Tipo=R.getString(4);                           
          }
          String SQL1="SELECT * FROM TIPO WHERE ID_TIPO= '"+ID_Tipo+"'";
          Statement S1= cn1.createStatement();
          ResultSet R1= S1.executeQuery(SQL1);                   
          while(R1.next())
          {             
              txtAoB.setText(R1.getString(2));
              txtFoD.setText(R1.getString(3));
              txtRazon.setText(R1.getString(4));
          }
      }catch (SQLException ex){
      } 
     
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtBuscar.setText("");
        txtBuscar.requestFocus();
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtAoB;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel txtFoD;
    private javax.swing.JLabel txtRazon;
    // End of variables declaration//GEN-END:variables
}
