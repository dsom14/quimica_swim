/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;



/**
 *
 * @author dsom1
 */
public class Preguntas extends javax.swing.JPanel {

    /**
     * Creates new form Preguntas
     */
    public Preguntas() 
    {
        initComponents();
        Transparente1(); 
    }
    int ID_Tipo = 0;
    int preguntas=0;
    int puntajeC=0;
    int puntajeI=0;
    int iniciar=0;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtComp = new javax.swing.JTextField();
        btnListo = new javax.swing.JButton();
        txtAB = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        txtRespuesta = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JLabel();
        txtRazon = new javax.swing.JLabel();
        txtRespuesta1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText(" antes que se acabe el tiempo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 520, -1));

        jLabel3.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setText("Escriba los compuestos que se le pide ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 430, -1));

        txtComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompActionPerformed(evt);
            }
        });
        jPanel1.add(txtComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 290, 50));

        btnListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/verificado.png"))); // NOI18N
        btnListo.setEnabled(false);
        btnListo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/vrfc-removebg-preview.png"))); // NOI18N
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });
        jPanel1.add(btnListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 70, 70));

        txtAB.setFont(new java.awt.Font("BankGothic Lt BT", 1, 24)); // NOI18N
        txtAB.setForeground(new java.awt.Color(0, 255, 0));
        txtAB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAB.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(txtAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 360, 30));

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
        jPanel1.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        txtRespuesta.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N
        txtRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 190, 30));

        txtTiempo.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(51, 153, 255));
        txtTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTiempo.setText("00");
        jPanel1.add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 150, 60));

        txtRazon.setFont(new java.awt.Font("BankGothic Lt BT", 1, 14)); // NOI18N
        txtRazon.setForeground(new java.awt.Color(255, 51, 102));
        txtRazon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtRazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 370, 30));

        txtRespuesta1.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        txtRespuesta1.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(txtRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 290, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/f9.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void Transparente1()
    {
        btnListo.setOpaque(false);
        btnListo.setContentAreaFilled(false);
        btnListo.setBorderPainted(false);
        
        btnPlay.setOpaque(false);
        btnPlay.setContentAreaFilled(false);
        btnPlay.setBorderPainted(false);        
    }
    
    public void Ejecutar()
    {
        if(preguntas==3)
        {
            if(puntajeC>puntajeI)
            {
                JOptionPane.showMessageDialog(null, "Respuestas Correctas : " +puntajeC+"\n Respuestas incorrectas: "+puntajeI+"\n Tu puntaje de respuestas correctas es alto FELICITACIONES");
                puntajeC=0;
                puntajeI=0;
                preguntas=0;
                txtAB.setText("");
                txtRazon.setText("");
                txtComp.setText("");
                txtRespuesta1.setText("");
                iniciar=1;
                
            }
            if(puntajeC<puntajeI)
            {
                JOptionPane.showMessageDialog(null, "Respuestas Correctas : " +puntajeC+"\n Respuestas incorrectas: "+puntajeI+"\n Tu puntaje de respuestas incorrectas es alto,sigue practicando para que domines el tema.");
                puntajeC=0;
                puntajeI=0;
                preguntas=0;
                txtAB.setText("");  
                txtRazon.setText("");
                txtComp.setText("");
                txtRespuesta1.setText("");
                iniciar=1;
            }
            if(puntajeC==puntajeI && puntajeC!=0 && puntajeI!=0)
            {
                JOptionPane.showMessageDialog(null, "Respuestas Correctas : " +puntajeC+"\n Respuestas incorrectas: "+puntajeI+"\n Vas por buen camino pero te falta un poco más de practica.");
                puntajeC=0;
                puntajeI=0;
                preguntas=0;
                txtAB.setText("");   
                txtRazon.setText("");
                txtComp.setText("");
                txtRespuesta1.setText("");
                iniciar=1;
            }       
        }
        estadobtn();
    }
    
    public void Aleatorio()
    {
       Random numAleatorio = new Random();
       Random Aleatorio = new Random();       
       int N = Aleatorio.nextInt(11)+1;
       int AF = numAleatorio.nextInt(3-1+1) + 1;
       int AD = numAleatorio.nextInt(6-4+1) + 4;
       int BF = numAleatorio.nextInt(8-7+1) + 7;
       int BD = numAleatorio.nextInt(11-9+1) + 9;
           
       try 
       {
            Conexion con=new Conexion();
            Connection cn1 = con.conectar();        
            con.conectar();        
            String SQL= "SELECT FUERZA FROM TIPO WHERE ID_TIPO = '"+N+"'";            
            Statement S= cn1.createStatement();
            ResultSet R= S.executeQuery(SQL);
            while(R.next())
            {
                txtAB.setText(R.getString(1));                
                
            }
            if(N==1 ||N==2||N==3)
                {
                    String SQL1= "SELECT RAZON FROM TIPO WHERE ID_TIPO = '"+AF+"'";            
                    Statement S1= cn1.createStatement();
                    ResultSet R1= S1.executeQuery(SQL1);
                    while(R1.next())
                    {
                        txtRazon.setText(R1.getString(1)); 
                        ID_Tipo=AF;
                    }                  
                    
                }
                if(N==4 ||N==5||N==6)
                {
                    String SQL2= "SELECT RAZON FROM TIPO WHERE ID_TIPO = '"+AD+"'";            
                    Statement S2= cn1.createStatement();
                    ResultSet R2= S2.executeQuery(SQL2);
                    while(R2.next())
                    {
                        txtRazon.setText(R2.getString(1)); 
                        ID_Tipo=AD;
                    }                  
                    
                }
                if(N==7 ||N==8)
                {
                    String SQL3= "SELECT RAZON FROM TIPO WHERE ID_TIPO = '"+BF+"'";            
                    Statement S3= cn1.createStatement();
                    ResultSet R3= S3.executeQuery(SQL3);
                    while(R3.next())
                    {
                        txtRazon.setText(R3.getString(1));
                        ID_Tipo=BF;
                    }                  
                    
                }
                if(N==9 ||N==10||N==11)
                {
                    String SQL4= "SELECT RAZON FROM TIPO WHERE ID_TIPO = '"+BD+"'";            
                    Statement S4= cn1.createStatement();
                    ResultSet R4= S4.executeQuery(SQL4);
                    while(R4.next())
                    {
                        txtRazon.setText(R4.getString(1));
                        ID_Tipo=BD;
                    }               
                    
                }
                      
        
      }catch (SQLException ex){
      }
                    
    }
    
    public void estadobtn()
    {
        if(iniciar==0)
       {
           btnPlay.setEnabled(false);
           Aleatorio();
           
       }
       if(iniciar==1)
       {
           btnPlay.setEnabled(true);    
           btnListo.setEnabled(false); 
           iniciar=0;
       }        
    }
    
     
   
    private void txtCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompActionPerformed

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
    
      
      int ID_temporal=0;  
      String Fuerza=null;
      Boolean Correcto=false;
      
      try 
      {
        Conexion con=new Conexion();
        Connection cn1 = con.conectar();        
        con.conectar();        
        String SQL= "SELECT ID_TIPO FROM COMPUESTO WHERE FORMULA = '"+txtComp.getText()+"'";            
        Statement S= cn1.createStatement();
        ResultSet R= S.executeQuery(SQL);
        while(R.next())
        {
            
            ID_temporal=R.getInt(1); 
            
            if(R.getInt(1)==ID_Tipo)
            {
                Correcto=true;
                txtRespuesta1.setText("Es Correcto");
                puntajeC++;
                preguntas++;

            }
         
        }
        if(!Correcto)
        {
            txtRespuesta1.setText("Es Incorrecto");
            puntajeI++;
            preguntas++;
        }
          System.out.println("Valor de N: "+ID_Tipo);
          System.out.println("Valor del compuesto: "+ID_temporal);
                          
      }catch (SQLException ex){
      }
      Aleatorio();
      Ejecutar();
      txtComp.setText("");
      
    }//GEN-LAST:event_btnListoActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
     estadobtn();
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseClicked
        btnListo.setEnabled(true);
    }//GEN-LAST:event_btnPlayMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListo;
    private javax.swing.JButton btnPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtAB;
    private javax.swing.JTextField txtComp;
    private javax.swing.JLabel txtRazon;
    private javax.swing.JLabel txtRespuesta;
    private javax.swing.JLabel txtRespuesta1;
    private javax.swing.JLabel txtTiempo;
    // End of variables declaration//GEN-END:variables
}
