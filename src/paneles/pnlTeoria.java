/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

/**
 *
 * @author dsom1
 */
public class pnlTeoria extends javax.swing.JPanel {

    /**
     * Creates new form pnlTeoria
     */
    public pnlTeoria() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        pnlPrin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 189, -1, -1));

        pnlPrin.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrin.setLayout(new javax.swing.BoxLayout(pnlPrin, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/portada.png"))); // NOI18N
        pnlPrin.add(jLabel3);

        add(pnlPrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 680, 400));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 14)); // NOI18N
        jButton1.setText("TEORÍA ÁCIDOS/BASES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 260, 30));

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setFont(new java.awt.Font("BankGothic Lt BT", 1, 14)); // NOI18N
        jButton2.setText("FUERZA ÁCIDOS/BASES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 240, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new CambiaPanel(pnlPrin, new pnlFuerza());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CambiaPanel(pnlPrin, new pnlDef());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlPrin;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
