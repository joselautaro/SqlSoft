package Main;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexion {

    Connection conectar = null;
    
    String usuario = "root";
    
    String contrasena = "123456789";
    
    String db = "personal1";
    
    String ip = "localhost";
    
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + db;
    
    //Statement st = null;
    
    //ResultSet rs = null;
    
    public Connection establecerConeccion(){
        
        try{
            
            conectar = DriverManager.getConnection(cadena, usuario, contrasena);
            JOptionPane.showMessageDialog(null, "Se conectó correctamente");
 
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Se producido un error" + e.toString());
        }
        return conectar;
        
        
    }
    
    
}
