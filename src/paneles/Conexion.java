/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dsom1
 */
public class Conexion 
{
     public Connection conectar()
    {
        Connection con=null;
        try
        {
            Class.forName("org.h2.Driver");
            con=DriverManager.getConnection("jdbc:h2:file:C:\\Users\\dsom1\\Desktop\\AcBs\\AciBas","ProyectoQ","");
            
            
        }catch(Exception ex)
        {
          System.out.println("Error" + ex);  
        }
        return con;
    }
    
}
