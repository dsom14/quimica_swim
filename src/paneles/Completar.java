/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author dsom1
 */
public class Completar extends javax.swing.JPanel {

    /**
     * Creates new form Completar
     */
    public Completar() {
        initComponents();
        Transparente();
    }
    String PreguntaT=null;
    String CompuestoT1=null;
    String CompuestoT2=null;
    String CompuestoT3=null;
    String CompuestoT4=null;
    int Ninguno=0;
    int Ninguno1=0;
    int Incorrecto=0;
    int iniciar=0;
    int preguntas=1;
    int puntajeC=0;
    int puntajeI=0;
    int contador=0;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        txtPregunta = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        txt5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("BankGothic Lt BT", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("ESCOJA LA RESPUESTA CORRECTA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 510, 40));

        btn1.setBackground(new java.awt.Color(251, 232, 218));
        btn1.setForeground(new java.awt.Color(251, 232, 218));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/atomo.png"))); // NOI18N
        btn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btn1.setBorderPainted(false);
        btn1.setEnabled(false);
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/atomo (1).png"))); // NOI18N
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 70, 70));

        btn2.setBackground(new java.awt.Color(251, 232, 218));
        btn2.setForeground(new java.awt.Color(251, 232, 218));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/atomo.png"))); // NOI18N
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setEnabled(false);
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/atomo (1).png"))); // NOI18N
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 70, 70));

        btn3.setBackground(new java.awt.Color(251, 232, 218));
        btn3.setForeground(new java.awt.Color(251, 232, 218));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/atomo.png"))); // NOI18N
        btn3.setBorder(null);
        btn3.setBorderPainted(false);
        btn3.setEnabled(false);
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/atomo (1).png"))); // NOI18N
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 70, 70));

        btn4.setBackground(new java.awt.Color(251, 232, 218));
        btn4.setForeground(new java.awt.Color(251, 232, 218));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/atomo.png"))); // NOI18N
        btn4.setBorder(null);
        btn4.setBorderPainted(false);
        btn4.setEnabled(false);
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/atomo (1).png"))); // NOI18N
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 70, 70));

        txtPregunta.setFont(new java.awt.Font("BankGothic Lt BT", 1, 24)); // NOI18N
        txtPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPregunta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(txtPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 390, 50));

        txt1.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 180, 30));

        txt2.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 190, 30));

        txt3.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 180, 30));

        txt4.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 190, 30));

        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/gamepad.png"))); // NOI18N
        btnPlay.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/gamepad (1).png"))); // NOI18N
        btnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayMouseClicked(evt);
            }
        });
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        btn5.setBackground(new java.awt.Color(251, 232, 218));
        btn5.setForeground(new java.awt.Color(251, 232, 218));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/atomo.png"))); // NOI18N
        btn5.setBorder(null);
        btn5.setBorderPainted(false);
        btn5.setEnabled(false);
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/atomo (1).png"))); // NOI18N
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 70, 70));

        txt5.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        txt5.setText("NINGUNO");
        jPanel1.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 90, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/f10.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void Transparente() {
        btn1.setOpaque(false);
        btn1.setContentAreaFilled(false);
        btn1.setBorderPainted(false);

        btn2.setOpaque(false);
        btn2.setContentAreaFilled(false);
        btn2.setBorderPainted(false);

        btn3.setOpaque(false);
        btn3.setContentAreaFilled(false);
        btn3.setBorderPainted(false);

        btn4.setOpaque(false);
        btn4.setContentAreaFilled(false);
        btn4.setBorderPainted(false);

        btnPlay.setOpaque(false);
        btnPlay.setContentAreaFilled(false);
        btnPlay.setBorderPainted(false);
    }

    public void AleatorioCompuesto() 
    {
        CompuestoT1=txt1.getText();
        CompuestoT2=txt2.getText();
        CompuestoT3=txt3.getText();
        CompuestoT4=txt4.getText();

        try {
            Conexion con = new Conexion();
            Connection cn1 = con.conectar();
            con.conectar();
            for (int i = 1; i <= 4; i++) {
                Random Aleatorio = new Random();
                int N = Aleatorio.nextInt(122) + 1;
                String SQL = "SELECT FORMULA FROM COMPUESTO WHERE ID_COMPUESTO = '" + N + "'";
                Statement S = cn1.createStatement();
                ResultSet R = S.executeQuery(SQL);
                while (R.next()) {
                    if (i == 1) {
                        txt1.setText(R.getString(1));
                    } else if (i == 2) {
                        txt2.setText(R.getString(1));
                    } else if (i == 3) {
                        txt3.setText(R.getString(1));
                    } else if (i == 4) {
                        txt4.setText(R.getString(1));
                    }
                }
            }
        } catch (SQLException ex) {
        }
    }
    
    public void AleatorioPregunta()
    {
       PreguntaT = txtPregunta.getText();
       Random Aleatorio = new Random();
       int N1 = Aleatorio.nextInt(11)+1;        
       try 
       {
            Conexion con=new Conexion();
            Connection cn1 = con.conectar();        
            con.conectar();        
            String SQL= "SELECT FUERZA FROM TIPO WHERE ID_TIPO = '"+N1+"'";            
            Statement S= cn1.createStatement();
            ResultSet R= S.executeQuery(SQL);
            while(R.next())
            {
                txtPregunta.setText(R.getString(1));             
            }        
      }catch (SQLException ex){
      }
      Ejecutar();
              
    }

    public void RespuestaReto2(String txt) {
        int ID_temporal = 0;
        String Fuerza = null;
        Boolean Correcto = false;
        

        try {
            Conexion con = new Conexion();
            Connection cn1 = con.conectar();
            con.conectar();
            String SQL = "SELECT ID_TIPO FROM COMPUESTO WHERE FORMULA = '"+txt+"'";
            Statement S = cn1.createStatement();
            ResultSet R = S.executeQuery(SQL);
            while (R.next()) {
                ID_temporal = R.getInt(1);
                
            }
            String SQL1 = "SELECT FUERZA FROM TIPO WHERE ID_TIPO = '" + ID_temporal + "'";
            Statement S1 = cn1.createStatement();
            ResultSet R1 = S1.executeQuery(SQL1);
            while (R1.next()) {

                Fuerza = R1.getString(1);
                
                if(Fuerza.equals(PreguntaT)&&Ninguno1==0)
                {
                    puntajeC++;
                    preguntas++;
                     Ninguno1=0;
                }
                else if(Ninguno1==0 &&!Fuerza.equals(PreguntaT))
                {                    
                    Incorrecto++; 
                    puntajeI++;
                    preguntas++;
                     Ninguno1=0;
                }

            }
            

        } catch (SQLException ex) {
            
        }
        if(Incorrecto==4 && Ninguno==1)
        {
            Incorrecto=0;
            Ninguno=0;
            puntajeC++;
            preguntas++;
            
        }
        else if(Ninguno==1)
        {
            Incorrecto++; 
            puntajeI++;
            preguntas++;
            System.out.println("Por aqui pase sexo");
           
                       
        }  
        System.out.println(preguntas);
        
    }
    
    public void Ejecutar()
    {
        if(preguntas==4)
        {
            if(puntajeC>puntajeI)
            {
                JOptionPane.showMessageDialog(null, "Respuestas Correctas : " +puntajeC+"\n Respuestas incorrectas: "+puntajeI+"\n Tu puntaje de respuestas correctas es alto FELICITACIONES");
                puntajeC=0;
                puntajeI=0;
                preguntas=0;
                txtPregunta.setText("");
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                iniciar=1;
                
            }
            if(puntajeC<puntajeI)
            {
                JOptionPane.showMessageDialog(null, "Respuestas Correctas : " +puntajeC+"\n Respuestas incorrectas: "+puntajeI+"\n Tu puntaje de respuestas incorrectas es alto,sigue practicando para que domines el tema.");
                puntajeC=0;
                puntajeI=0;
                preguntas=0;
                txtPregunta.setText(""); 
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                iniciar=1;
            }
            if(puntajeC==puntajeI && puntajeC!=0 && puntajeI!=0)
            {
                JOptionPane.showMessageDialog(null, "Respuestas Correctas : " +puntajeC+"\n Respuestas incorrectas: "+puntajeI+"\n Vas por buen camino pero te falta un poco más de practica.");
                puntajeC=0;
                puntajeI=0;
                preguntas=0;
                txtPregunta.setText(""); 
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                iniciar=1;
            }       
        }
        estadobtn();
    }
    
    public void estadobtn()
    {
        if(iniciar==0)
       {
           btnPlay.setEnabled(false);                     
       }
       if(iniciar==1)
       {
           btnPlay.setEnabled(true);    
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           iniciar=0;
       }
        
    }


    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
          
        AleatorioPregunta();        
        AleatorioCompuesto();
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
                
        AleatorioPregunta();        
        AleatorioCompuesto();
        
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        AleatorioPregunta();        
        AleatorioCompuesto(); 
        
       
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        estadobtn();     
        AleatorioPregunta();        
        AleatorioCompuesto();  
        
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
     AleatorioPregunta();
     AleatorioCompuesto();        
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        AleatorioPregunta();
        AleatorioCompuesto();      
        
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        RespuestaReto2(CompuestoT1);
    }//GEN-LAST:event_btn1MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        RespuestaReto2(CompuestoT2);
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        RespuestaReto2(CompuestoT3);
    }//GEN-LAST:event_btn3MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        RespuestaReto2(CompuestoT4);
    }//GEN-LAST:event_btn4MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        Ninguno=1;        
        RespuestaReto2(CompuestoT1);
        RespuestaReto2(CompuestoT2);
        RespuestaReto2(CompuestoT3);
        RespuestaReto2(CompuestoT4);
        
        RespuestaReto2(txt5.getText());
        Ninguno1=1;
        preguntas=preguntas-8;
        
    }//GEN-LAST:event_btn5MouseClicked

    private void btnPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseClicked
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
    }//GEN-LAST:event_btnPlayMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btnPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txtPregunta;
    // End of variables declaration//GEN-END:variables
}